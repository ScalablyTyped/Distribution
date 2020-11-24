package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InAppProduct extends js.Object {
  
  /** Default language of the localized data, as defined by BCP-47. e.g. "en-US". */
  var defaultLanguage: js.UndefOr[String] = js.native
  
  /** Default price. Cannot be zero, as in-app products are never free. Always in the developer's Checkout merchant currency. */
  var defaultPrice: js.UndefOr[Price] = js.native
  
  /**
    * Grace period of the subscription, specified in ISO 8601 format. Allows developers to give their subscribers a grace period when the payment for the new recurrence period is
    * declined. Acceptable values are P0D (zero days), P3D (three days), P7D (seven days), P14D (14 days), and P30D (30 days).
    */
  var gracePeriod: js.UndefOr[String] = js.native
  
  /** List of localized title and description data. Map key is the language of the localized data, as defined by BCP-47, e.g. "en-US". */
  var listings: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.androidpublisher.gapi.client.androidpublisher.InAppProductListing}
    */ typings.maximMazurokGapiClientAndroidpublisher.maximMazurokGapiClientAndroidpublisherStrings.InAppProduct with TopLevel[js.Any]
  ] = js.native
  
  /** Package name of the parent app. */
  var packageName: js.UndefOr[String] = js.native
  
  /** Prices per buyer region. None of these can be zero, as in-app products are never free. Map key is region code, as defined by ISO 3166-2. */
  var prices: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.androidpublisher.gapi.client.androidpublisher.Price}
    */ typings.maximMazurokGapiClientAndroidpublisher.maximMazurokGapiClientAndroidpublisherStrings.InAppProduct with TopLevel[js.Any]
  ] = js.native
  
  /** The type of the product, e.g. a recurring subscription. */
  var purchaseType: js.UndefOr[String] = js.native
  
  /** Stock-keeping-unit (SKU) of the product, unique within an app. */
  var sku: js.UndefOr[String] = js.native
  
  /** The status of the product, e.g. whether it's active. */
  var status: js.UndefOr[String] = js.native
  
  /** Subscription period, specified in ISO 8601 format. Acceptable values are P1W (one week), P1M (one month), P3M (three months), P6M (six months), and P1Y (one year). */
  var subscriptionPeriod: js.UndefOr[String] = js.native
  
  /** Trial period, specified in ISO 8601 format. Acceptable values are anything between P7D (seven days) and P999D (999 days). */
  var trialPeriod: js.UndefOr[String] = js.native
}
object InAppProduct {
  
  @scala.inline
  def apply(): InAppProduct = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InAppProduct]
  }
  
  @scala.inline
  implicit class InAppProductOps[Self <: InAppProduct] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDefaultLanguage(value: String): Self = this.set("defaultLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultLanguage: Self = this.set("defaultLanguage", js.undefined)
    
    @scala.inline
    def setDefaultPrice(value: Price): Self = this.set("defaultPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultPrice: Self = this.set("defaultPrice", js.undefined)
    
    @scala.inline
    def setGracePeriod(value: String): Self = this.set("gracePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGracePeriod: Self = this.set("gracePeriod", js.undefined)
    
    @scala.inline
    def setListings(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.androidpublisher.gapi.client.androidpublisher.InAppProductListing}
      */ typings.maximMazurokGapiClientAndroidpublisher.maximMazurokGapiClientAndroidpublisherStrings.InAppProduct with TopLevel[js.Any]
    ): Self = this.set("listings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListings: Self = this.set("listings", js.undefined)
    
    @scala.inline
    def setPackageName(value: String): Self = this.set("packageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageName: Self = this.set("packageName", js.undefined)
    
    @scala.inline
    def setPrices(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.androidpublisher.gapi.client.androidpublisher.Price}
      */ typings.maximMazurokGapiClientAndroidpublisher.maximMazurokGapiClientAndroidpublisherStrings.InAppProduct with TopLevel[js.Any]
    ): Self = this.set("prices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrices: Self = this.set("prices", js.undefined)
    
    @scala.inline
    def setPurchaseType(value: String): Self = this.set("purchaseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePurchaseType: Self = this.set("purchaseType", js.undefined)
    
    @scala.inline
    def setSku(value: String): Self = this.set("sku", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSku: Self = this.set("sku", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setSubscriptionPeriod(value: String): Self = this.set("subscriptionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscriptionPeriod: Self = this.set("subscriptionPeriod", js.undefined)
    
    @scala.inline
    def setTrialPeriod(value: String): Self = this.set("trialPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrialPeriod: Self = this.set("trialPeriod", js.undefined)
  }
}
