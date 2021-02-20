package typings.maskedinput

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryStatic extends StObject {
  
  var mask: MaskedInputStatic = js.native
}
object JQueryStatic {
  
  @scala.inline
  def apply(mask: MaskedInputStatic): JQueryStatic = {
    val __obj = js.Dynamic.literal(mask = mask.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  @scala.inline
  implicit class JQueryStaticMutableBuilder[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMask(value: MaskedInputStatic): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
  }
}
