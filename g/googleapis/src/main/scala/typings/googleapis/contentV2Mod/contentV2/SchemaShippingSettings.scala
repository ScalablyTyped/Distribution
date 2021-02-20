package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The merchant account&#39;s shipping settings. All methods except
  * getsupportedcarriers and getsupportedholidays require the admin role.
  */
@js.native
trait SchemaShippingSettings extends StObject {
  
  /**
    * The ID of the account to which these account shipping settings belong.
    * Ignored upon update, always present in get request responses.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * A list of postal code groups that can be referred to in services.
    * Optional.
    */
  var postalCodeGroups: js.UndefOr[js.Array[SchemaPostalCodeGroup]] = js.native
  
  /**
    * The target account&#39;s list of services. Optional.
    */
  var services: js.UndefOr[js.Array[SchemaService]] = js.native
}
object SchemaShippingSettings {
  
  @scala.inline
  def apply(): SchemaShippingSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShippingSettings]
  }
  
  @scala.inline
  implicit class SchemaShippingSettingsMutableBuilder[Self <: SchemaShippingSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setPostalCodeGroups(value: js.Array[SchemaPostalCodeGroup]): Self = StObject.set(x, "postalCodeGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCodeGroupsUndefined: Self = StObject.set(x, "postalCodeGroups", js.undefined)
    
    @scala.inline
    def setPostalCodeGroupsVarargs(value: SchemaPostalCodeGroup*): Self = StObject.set(x, "postalCodeGroups", js.Array(value :_*))
    
    @scala.inline
    def setServices(value: js.Array[SchemaService]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    @scala.inline
    def setServicesVarargs(value: SchemaService*): Self = StObject.set(x, "services", js.Array(value :_*))
  }
}
