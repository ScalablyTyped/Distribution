package typings.materialTextfield.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICONEVENT extends StObject {
  
  var ICON_EVENT: String = js.native
  
  var ICON_ROLE: String = js.native
}
object ICONEVENT {
  
  @scala.inline
  def apply(ICON_EVENT: String, ICON_ROLE: String): ICONEVENT = {
    val __obj = js.Dynamic.literal(ICON_EVENT = ICON_EVENT.asInstanceOf[js.Any], ICON_ROLE = ICON_ROLE.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICONEVENT]
  }
  
  @scala.inline
  implicit class ICONEVENTMutableBuilder[Self <: ICONEVENT] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setICON_EVENT(value: String): Self = StObject.set(x, "ICON_EVENT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setICON_ROLE(value: String): Self = StObject.set(x, "ICON_ROLE", value.asInstanceOf[js.Any])
  }
}
