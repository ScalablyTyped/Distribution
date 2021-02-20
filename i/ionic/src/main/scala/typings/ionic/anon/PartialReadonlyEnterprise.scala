package typings.ionic.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Readonly<ionic.ionic/definitions.EnterpriseProjectIntegration>> */
@js.native
trait PartialReadonlyEnterprise extends StObject {
  
  var appId: js.UndefOr[String] = js.native
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var keyId: js.UndefOr[Double] = js.native
  
  var orgId: js.UndefOr[String] = js.native
  
  var productKey: js.UndefOr[String] = js.native
  
  var registries: js.UndefOr[js.Array[String]] = js.native
  
  var root: js.UndefOr[String] = js.native
}
object PartialReadonlyEnterprise {
  
  @scala.inline
  def apply(): PartialReadonlyEnterprise = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialReadonlyEnterprise]
  }
  
  @scala.inline
  implicit class PartialReadonlyEnterpriseMutableBuilder[Self <: PartialReadonlyEnterprise] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
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
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
