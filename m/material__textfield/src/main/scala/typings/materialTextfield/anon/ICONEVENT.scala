package typings.materialTextfield.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICONEVENT extends StObject {
  
  var ICON_EVENT: String
  
  var ICON_ROLE: String
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
