package typings.jsplumb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropOptions extends StObject {
  
  var hoverClass: String = js.native
}
object DropOptions {
  
  @scala.inline
  def apply(hoverClass: String): DropOptions = {
    val __obj = js.Dynamic.literal(hoverClass = hoverClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropOptions]
  }
  
  @scala.inline
  implicit class DropOptionsMutableBuilder[Self <: DropOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHoverClass(value: String): Self = StObject.set(x, "hoverClass", value.asInstanceOf[js.Any])
  }
}
