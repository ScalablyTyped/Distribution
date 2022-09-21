package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InAppProduct extends StObject {
  
  /** Default language of the localized data, as defined by BCP-47. e.g. "en-US". */
  var defaultLanguage: js.UndefOr[String] = js.undefined
  
  /** Default price. Cannot be zero, as in-app products are never free. Always in the developer's Checkout merchant currency. */
  var defaultPrice: js.UndefOr[Price] = js.undefined
  
  /**
    * Grace period of the subscription, specified in ISO 8601 format. Allows developers to give their subscribers a grace period when the payment for the new recurrence period is
    * declined. Acceptable values are P0D (zero days), P3D (three days), P7D (seven days), P14D (14 days), and P30D (30 days).
    */
  var gracePeriod: js.UndefOr[String] = js.undefined
  
  /** List of localized title and description data. Map key is the language of the localized data, as defined by BCP-47, e.g. "en-US". */
  var listings: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.androidpublisher.gapi.client.androidpublisher.InAppProductListing}
    */ typings.maximMazurokGapiClientAndroidpublisher.maximMazurokGapiClientAndroidpublisherStrings.InAppProduct & TopLevel[Any]
  ] = js.undefined
  
  /** Details about taxes and legal compliance. Only applicable to managed products. */
  var managedProductTaxesAndComplianceSettings: js.UndefOr[ManagedProductTaxAndComplianceSettings] = js.undefined
  
  /** Package name of the parent app. */
  var packageName: js.UndefOr[String] = js.undefined
  
  /** Prices per buyer region. None of these can be zero, as in-app products are never free. Map key is region code, as defined by ISO 3166-2. */
  var prices: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.androidpublisher.gapi.client.androidpublisher.Price}
    */ typings.maximMazurokGapiClientAndroidpublisher.maximMazurokGapiClientAndroidpublisherStrings.InAppProduct & TopLevel[Any]
  ] = js.undefined
  
  /** The type of the product, e.g. a recurring subscription. */
  var purchaseType: js.UndefOr[String] = js.undefined
  
  /** Stock-keeping-unit (SKU) of the product, unique within an app. */
  var sku: js.UndefOr[String] = js.undefined
  
  /** The status of the product, e.g. whether it's active. */
  var status: js.UndefOr[String] = js.undefined
  
  /** Subscription period, specified in ISO 8601 format. Acceptable values are P1W (one week), P1M (one month), P3M (three months), P6M (six months), and P1Y (one year). */
  var subscriptionPeriod: js.UndefOr[String] = js.undefined
  
  /** Details about taxes and legal compliance. Only applicable to subscription products. */
  var subscriptionTaxesAndComplianceSettings: js.UndefOr[SubscriptionTaxAndComplianceSettings] = js.undefined
  
  /** Trial period, specified in ISO 8601 format. Acceptable values are anything between P7D (seven days) and P999D (999 days). */
  var trialPeriod: js.UndefOr[String] = js.undefined
}
object InAppProduct {
  
  inline def apply(): InAppProduct = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InAppProduct]
  }
  
  extension [Self <: InAppProduct](x: Self) {
    
    inline def setDefaultLanguage(value: String): Self = StObject.set(x, "defaultLanguage", value.asInstanceOf[js.Any])
    
    inline def setDefaultLanguageUndefined: Self = StObject.set(x, "defaultLanguage", js.undefined)
    
    inline def setDefaultPrice(value: Price): Self = StObject.set(x, "defaultPrice", value.asInstanceOf[js.Any])
    
    inline def setDefaultPriceUndefined: Self = StObject.set(x, "defaultPrice", js.undefined)
    
    inline def setGracePeriod(value: String): Self = StObject.set(x, "gracePeriod", value.asInstanceOf[js.Any])
    
    inline def setGracePeriodUndefined: Self = StObject.set(x, "gracePeriod", js.undefined)
    
    inline def setListings(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.androidpublisher.gapi.client.androidpublisher.InAppProductListing}
      */ typings.maximMazurokGapiClientAndroidpublisher.maximMazurokGapiClientAndroidpublisherStrings.InAppProduct & TopLevel[Any]
    ): Self = StObject.set(x, "listings", value.asInstanceOf[js.Any])
    
    inline def setListingsUndefined: Self = StObject.set(x, "listings", js.undefined)
    
    inline def setManagedProductTaxesAndComplianceSettings(value: ManagedProductTaxAndComplianceSettings): Self = StObject.set(x, "managedProductTaxesAndComplianceSettings", value.asInstanceOf[js.Any])
    
    inline def setManagedProductTaxesAndComplianceSettingsUndefined: Self = StObject.set(x, "managedProductTaxesAndComplianceSettings", js.undefined)
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setPrices(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.androidpublisher.gapi.client.androidpublisher.Price}
      */ typings.maximMazurokGapiClientAndroidpublisher.maximMazurokGapiClientAndroidpublisherStrings.InAppProduct & TopLevel[Any]
    ): Self = StObject.set(x, "prices", value.asInstanceOf[js.Any])
    
    inline def setPricesUndefined: Self = StObject.set(x, "prices", js.undefined)
    
    inline def setPurchaseType(value: String): Self = StObject.set(x, "purchaseType", value.asInstanceOf[js.Any])
    
    inline def setPurchaseTypeUndefined: Self = StObject.set(x, "purchaseType", js.undefined)
    
    inline def setSku(value: String): Self = StObject.set(x, "sku", value.asInstanceOf[js.Any])
    
    inline def setSkuUndefined: Self = StObject.set(x, "sku", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSubscriptionPeriod(value: String): Self = StObject.set(x, "subscriptionPeriod", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionPeriodUndefined: Self = StObject.set(x, "subscriptionPeriod", js.undefined)
    
    inline def setSubscriptionTaxesAndComplianceSettings(value: SubscriptionTaxAndComplianceSettings): Self = StObject.set(x, "subscriptionTaxesAndComplianceSettings", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionTaxesAndComplianceSettingsUndefined: Self = StObject.set(x, "subscriptionTaxesAndComplianceSettings", js.undefined)
    
    inline def setTrialPeriod(value: String): Self = StObject.set(x, "trialPeriod", value.asInstanceOf[js.Any])
    
    inline def setTrialPeriodUndefined: Self = StObject.set(x, "trialPeriod", js.undefined)
  }
}
