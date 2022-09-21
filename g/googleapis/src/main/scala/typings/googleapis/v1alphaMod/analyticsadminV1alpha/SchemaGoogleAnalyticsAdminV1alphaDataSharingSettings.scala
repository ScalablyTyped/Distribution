package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaDataSharingSettings extends StObject {
  
  /**
    * Output only. Resource name. Format: accounts/{account\}/dataSharingSettings Example: "accounts/1000/dataSharingSettings"
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Allows any of Google sales to access the data in order to suggest configuration changes to improve results.
    */
  var sharingWithGoogleAnySalesEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Allows Google sales teams that are assigned to the customer to access the data in order to suggest configuration changes to improve results. Sales team restrictions still apply when enabled.
    */
  var sharingWithGoogleAssignedSalesEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Allows Google to use the data to improve other Google products or services.
    */
  var sharingWithGoogleProductsEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Allows Google support to access the data in order to help troubleshoot issues.
    */
  var sharingWithGoogleSupportEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Allows Google to share the data anonymously in aggregate form with others.
    */
  var sharingWithOthersEnabled: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaDataSharingSettings {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaDataSharingSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaDataSharingSettings]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaDataSharingSettings](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSharingWithGoogleAnySalesEnabled(value: Boolean): Self = StObject.set(x, "sharingWithGoogleAnySalesEnabled", value.asInstanceOf[js.Any])
    
    inline def setSharingWithGoogleAnySalesEnabledNull: Self = StObject.set(x, "sharingWithGoogleAnySalesEnabled", null)
    
    inline def setSharingWithGoogleAnySalesEnabledUndefined: Self = StObject.set(x, "sharingWithGoogleAnySalesEnabled", js.undefined)
    
    inline def setSharingWithGoogleAssignedSalesEnabled(value: Boolean): Self = StObject.set(x, "sharingWithGoogleAssignedSalesEnabled", value.asInstanceOf[js.Any])
    
    inline def setSharingWithGoogleAssignedSalesEnabledNull: Self = StObject.set(x, "sharingWithGoogleAssignedSalesEnabled", null)
    
    inline def setSharingWithGoogleAssignedSalesEnabledUndefined: Self = StObject.set(x, "sharingWithGoogleAssignedSalesEnabled", js.undefined)
    
    inline def setSharingWithGoogleProductsEnabled(value: Boolean): Self = StObject.set(x, "sharingWithGoogleProductsEnabled", value.asInstanceOf[js.Any])
    
    inline def setSharingWithGoogleProductsEnabledNull: Self = StObject.set(x, "sharingWithGoogleProductsEnabled", null)
    
    inline def setSharingWithGoogleProductsEnabledUndefined: Self = StObject.set(x, "sharingWithGoogleProductsEnabled", js.undefined)
    
    inline def setSharingWithGoogleSupportEnabled(value: Boolean): Self = StObject.set(x, "sharingWithGoogleSupportEnabled", value.asInstanceOf[js.Any])
    
    inline def setSharingWithGoogleSupportEnabledNull: Self = StObject.set(x, "sharingWithGoogleSupportEnabled", null)
    
    inline def setSharingWithGoogleSupportEnabledUndefined: Self = StObject.set(x, "sharingWithGoogleSupportEnabled", js.undefined)
    
    inline def setSharingWithOthersEnabled(value: Boolean): Self = StObject.set(x, "sharingWithOthersEnabled", value.asInstanceOf[js.Any])
    
    inline def setSharingWithOthersEnabledNull: Self = StObject.set(x, "sharingWithOthersEnabled", null)
    
    inline def setSharingWithOthersEnabledUndefined: Self = StObject.set(x, "sharingWithOthersEnabled", js.undefined)
  }
}
