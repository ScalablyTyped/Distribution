package typings.jitsiMeet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterfaceMobileDynamicLink extends StObject {
  
  var APN: js.UndefOr[String] = js.undefined
  
  var APP_CODE: js.UndefOr[String] = js.undefined
  
  var CUSTOM_DOMAIN: js.UndefOr[Any] = js.undefined
  
  var IBI: js.UndefOr[String] = js.undefined
  
  var ISI: js.UndefOr[String] = js.undefined
}
object InterfaceMobileDynamicLink {
  
  inline def apply(): InterfaceMobileDynamicLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InterfaceMobileDynamicLink]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InterfaceMobileDynamicLink] (val x: Self) extends AnyVal {
    
    inline def setAPN(value: String): Self = StObject.set(x, "APN", value.asInstanceOf[js.Any])
    
    inline def setAPNUndefined: Self = StObject.set(x, "APN", js.undefined)
    
    inline def setAPP_CODE(value: String): Self = StObject.set(x, "APP_CODE", value.asInstanceOf[js.Any])
    
    inline def setAPP_CODEUndefined: Self = StObject.set(x, "APP_CODE", js.undefined)
    
    inline def setCUSTOM_DOMAIN(value: Any): Self = StObject.set(x, "CUSTOM_DOMAIN", value.asInstanceOf[js.Any])
    
    inline def setCUSTOM_DOMAINUndefined: Self = StObject.set(x, "CUSTOM_DOMAIN", js.undefined)
    
    inline def setIBI(value: String): Self = StObject.set(x, "IBI", value.asInstanceOf[js.Any])
    
    inline def setIBIUndefined: Self = StObject.set(x, "IBI", js.undefined)
    
    inline def setISI(value: String): Self = StObject.set(x, "ISI", value.asInstanceOf[js.Any])
    
    inline def setISIUndefined: Self = StObject.set(x, "ISI", js.undefined)
  }
}
