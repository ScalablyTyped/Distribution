package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnterpriseProjectIntegration extends ProjectIntegration {
  
  var appId: js.UndefOr[String] = js.native
  
  var keyId: js.UndefOr[Double] = js.native
  
  var orgId: js.UndefOr[String] = js.native
  
  var productKey: js.UndefOr[String] = js.native
  
  var registries: js.UndefOr[js.Array[String]] = js.native
}
object EnterpriseProjectIntegration {
  
  @scala.inline
  def apply(): EnterpriseProjectIntegration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnterpriseProjectIntegration]
  }
  
  @scala.inline
  implicit class EnterpriseProjectIntegrationMutableBuilder[Self <: EnterpriseProjectIntegration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    @scala.inline
    def setKeyId(value: Double): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyIdUndefined: Self = StObject.set(x, "keyId", js.undefined)
    
    @scala.inline
    def setOrgId(value: String): Self = StObject.set(x, "orgId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrgIdUndefined: Self = StObject.set(x, "orgId", js.undefined)
    
    @scala.inline
    def setProductKey(value: String): Self = StObject.set(x, "productKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductKeyUndefined: Self = StObject.set(x, "productKey", js.undefined)
    
    @scala.inline
    def setRegistries(value: js.Array[String]): Self = StObject.set(x, "registries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistriesUndefined: Self = StObject.set(x, "registries", js.undefined)
    
    @scala.inline
    def setRegistriesVarargs(value: String*): Self = StObject.set(x, "registries", js.Array(value :_*))
  }
}
