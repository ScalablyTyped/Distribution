package typings.ionic.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Readonly<ionic.ionic/definitions.EnterpriseProjectIntegration>> */
trait PartialReadonlyEnterprise extends StObject {
  
  var appId: js.UndefOr[String] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var keyId: js.UndefOr[Double] = js.undefined
  
  var orgId: js.UndefOr[String] = js.undefined
  
  var productKey: js.UndefOr[String] = js.undefined
  
  var registries: js.UndefOr[js.Array[String]] = js.undefined
  
  var root: js.UndefOr[String] = js.undefined
}
object PartialReadonlyEnterprise {
  
  inline def apply(): PartialReadonlyEnterprise = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialReadonlyEnterprise]
  }
  
  extension [Self <: PartialReadonlyEnterprise](x: Self) {
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setKeyId(value: Double): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "keyId", js.undefined)
    
    inline def setOrgId(value: String): Self = StObject.set(x, "orgId", value.asInstanceOf[js.Any])
    
    inline def setOrgIdUndefined: Self = StObject.set(x, "orgId", js.undefined)
    
    inline def setProductKey(value: String): Self = StObject.set(x, "productKey", value.asInstanceOf[js.Any])
    
    inline def setProductKeyUndefined: Self = StObject.set(x, "productKey", js.undefined)
    
    inline def setRegistries(value: js.Array[String]): Self = StObject.set(x, "registries", value.asInstanceOf[js.Any])
    
    inline def setRegistriesUndefined: Self = StObject.set(x, "registries", js.undefined)
    
    inline def setRegistriesVarargs(value: String*): Self = StObject.set(x, "registries", js.Array(value*))
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
