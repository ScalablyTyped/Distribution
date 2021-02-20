package typings.jupyterlabServices.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Displayid extends StObject {
  
  var display_id: js.UndefOr[String] = js.native
}
object Displayid {
  
  @scala.inline
  def apply(): Displayid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Displayid]
  }
  
  @scala.inline
  implicit class DisplayidMutableBuilder[Self <: Displayid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplay_id(value: String): Self = StObject.set(x, "display_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplay_idUndefined: Self = StObject.set(x, "display_id", js.undefined)
  }
}
