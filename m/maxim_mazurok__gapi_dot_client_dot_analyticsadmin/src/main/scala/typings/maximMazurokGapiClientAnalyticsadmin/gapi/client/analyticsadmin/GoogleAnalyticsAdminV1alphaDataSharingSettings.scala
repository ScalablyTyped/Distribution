package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaDataSharingSettings extends StObject {
  
  /** Output only. Resource name. Format: accounts/{account}/dataSharingSettings Example: "accounts/1000/dataSharingSettings" */
  var name: js.UndefOr[String] = js.undefined
  
  /** Allows any of Google sales to access the data in order to suggest configuration changes to improve results. */
  var sharingWithGoogleAnySalesEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Allows Google sales teams that are assigned to the customer to access the data in order to suggest configuration changes to improve results. Sales team restrictions still apply when
    * enabled.
    */
  var sharingWithGoogleAssignedSalesEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Allows Google to use the data to improve other Google products or services. */
  var sharingWithGoogleProductsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Allows Google support to access the data in order to help troubleshoot issues. */
  var sharingWithGoogleSupportEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Allows Google to share the data anonymously in aggregate form with others. */
  var sharingWithOthersEnabled: js.UndefOr[Boolean] = js.undefined
}
object GoogleAnalyticsAdminV1alphaDataSharingSettings {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaDataSharingSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaDataSharingSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleAnalyticsAdminV1alphaDataSharingSettings] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSharingWithGoogleAnySalesEnabled(value: Boolean): Self = StObject.set(x, "sharingWithGoogleAnySalesEnabled", value.asInstanceOf[js.Any])
    
    inline def setSharingWithGoogleAnySalesEnabledUndefined: Self = StObject.set(x, "sharingWithGoogleAnySalesEnabled", js.undefined)
    
    inline def setSharingWithGoogleAssignedSalesEnabled(value: Boolean): Self = StObject.set(x, "sharingWithGoogleAssignedSalesEnabled", value.asInstanceOf[js.Any])
    
    inline def setSharingWithGoogleAssignedSalesEnabledUndefined: Self = StObject.set(x, "sharingWithGoogleAssignedSalesEnabled", js.undefined)
    
    inline def setSharingWithGoogleProductsEnabled(value: Boolean): Self = StObject.set(x, "sharingWithGoogleProductsEnabled", value.asInstanceOf[js.Any])
    
    inline def setSharingWithGoogleProductsEnabledUndefined: Self = StObject.set(x, "sharingWithGoogleProductsEnabled", js.undefined)
    
    inline def setSharingWithGoogleSupportEnabled(value: Boolean): Self = StObject.set(x, "sharingWithGoogleSupportEnabled", value.asInstanceOf[js.Any])
    
    inline def setSharingWithGoogleSupportEnabledUndefined: Self = StObject.set(x, "sharingWithGoogleSupportEnabled", js.undefined)
    
    inline def setSharingWithOthersEnabled(value: Boolean): Self = StObject.set(x, "sharingWithOthersEnabled", value.asInstanceOf[js.Any])
    
    inline def setSharingWithOthersEnabledUndefined: Self = StObject.set(x, "sharingWithOthersEnabled", js.undefined)
  }
}
