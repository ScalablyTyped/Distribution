package typings.jitsiMeet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigHosts extends StObject {
  
  var anonymousdomain: js.UndefOr[String] = js.undefined
  
  var authdomain: js.UndefOr[String] = js.undefined
  
  var call_control: js.UndefOr[String] = js.undefined
  
  var domain: js.UndefOr[String] = js.undefined
  
  var focus: js.UndefOr[String] = js.undefined
  
  var muc: js.UndefOr[String] = js.undefined
}
object ConfigHosts {
  
  inline def apply(): ConfigHosts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigHosts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfigHosts] (val x: Self) extends AnyVal {
    
    inline def setAnonymousdomain(value: String): Self = StObject.set(x, "anonymousdomain", value.asInstanceOf[js.Any])
    
    inline def setAnonymousdomainUndefined: Self = StObject.set(x, "anonymousdomain", js.undefined)
    
    inline def setAuthdomain(value: String): Self = StObject.set(x, "authdomain", value.asInstanceOf[js.Any])
    
    inline def setAuthdomainUndefined: Self = StObject.set(x, "authdomain", js.undefined)
    
    inline def setCall_control(value: String): Self = StObject.set(x, "call_control", value.asInstanceOf[js.Any])
    
    inline def setCall_controlUndefined: Self = StObject.set(x, "call_control", js.undefined)
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setFocus(value: String): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    inline def setMuc(value: String): Self = StObject.set(x, "muc", value.asInstanceOf[js.Any])
    
    inline def setMucUndefined: Self = StObject.set(x, "muc", js.undefined)
  }
}
