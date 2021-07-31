package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShippingSettings extends StObject {
  
  /** The ID of the account to which these account shipping settings belong. Ignored upon update, always present in get request responses. */
  var accountId: js.UndefOr[String] = js.undefined
  
  /** A list of postal code groups that can be referred to in `services`. Optional. */
  var postalCodeGroups: js.UndefOr[js.Array[PostalCodeGroup]] = js.undefined
  
  /** The target account's list of services. Optional. */
  var services: js.UndefOr[js.Array[Service]] = js.undefined
}
object ShippingSettings {
  
  @scala.inline
  def apply(): ShippingSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShippingSettings]
  }
  
  @scala.inline
  implicit class ShippingSettingsMutableBuilder[Self <: ShippingSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setPostalCodeGroups(value: js.Array[PostalCodeGroup]): Self = StObject.set(x, "postalCodeGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCodeGroupsUndefined: Self = StObject.set(x, "postalCodeGroups", js.undefined)
    
    @scala.inline
    def setPostalCodeGroupsVarargs(value: PostalCodeGroup*): Self = StObject.set(x, "postalCodeGroups", js.Array(value :_*))
    
    @scala.inline
    def setServices(value: js.Array[Service]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    @scala.inline
    def setServicesVarargs(value: Service*): Self = StObject.set(x, "services", js.Array(value :_*))
  }
}
