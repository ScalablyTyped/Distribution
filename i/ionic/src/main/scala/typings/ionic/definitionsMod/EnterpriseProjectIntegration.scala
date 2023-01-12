package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterpriseProjectIntegration
  extends StObject
     with ProjectIntegration {
  
  var appId: js.UndefOr[String] = js.undefined
  
  var keyId: js.UndefOr[Double] = js.undefined
  
  var orgId: js.UndefOr[String] = js.undefined
  
  var productKey: js.UndefOr[String] = js.undefined
  
  var registries: js.UndefOr[js.Array[String]] = js.undefined
}
object EnterpriseProjectIntegration {
  
  inline def apply(): EnterpriseProjectIntegration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnterpriseProjectIntegration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnterpriseProjectIntegration] (val x: Self) extends AnyVal {
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    inline def setKeyId(value: Double): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "keyId", js.undefined)
    
    inline def setOrgId(value: String): Self = StObject.set(x, "orgId", value.asInstanceOf[js.Any])
    
    inline def setOrgIdUndefined: Self = StObject.set(x, "orgId", js.undefined)
    
    inline def setProductKey(value: String): Self = StObject.set(x, "productKey", value.asInstanceOf[js.Any])
    
    inline def setProductKeyUndefined: Self = StObject.set(x, "productKey", js.undefined)
    
    inline def setRegistries(value: js.Array[String]): Self = StObject.set(x, "registries", value.asInstanceOf[js.Any])
    
    inline def setRegistriesUndefined: Self = StObject.set(x, "registries", js.undefined)
    
    inline def setRegistriesVarargs(value: String*): Self = StObject.set(x, "registries", js.Array(value*))
  }
}
