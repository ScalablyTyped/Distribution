package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiaCountrySettings extends StObject {
  
  /** The settings for the About page. */
  var about: js.UndefOr[LiaAboutPageSettings] = js.undefined
  
  /** Required. CLDR country code (e.g. "US"). */
  var country: js.UndefOr[String] = js.undefined
  
  /** The status of the "Merchant hosted local storefront" feature. */
  var hostedLocalStorefrontActive: js.UndefOr[Boolean] = js.undefined
  
  /** LIA inventory verification settings. */
  var inventory: js.UndefOr[LiaInventorySettings] = js.undefined
  
  /** LIA "On Display To Order" settings. */
  var onDisplayToOrder: js.UndefOr[LiaOnDisplayToOrderSettings] = js.undefined
  
  /** The POS data provider linked with this country. */
  var posDataProvider: js.UndefOr[LiaPosDataProvider] = js.undefined
  
  /** The status of the "Store pickup" feature. */
  var storePickupActive: js.UndefOr[Boolean] = js.undefined
}
object LiaCountrySettings {
  
  inline def apply(): LiaCountrySettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiaCountrySettings]
  }
  
  extension [Self <: LiaCountrySettings](x: Self) {
    
    inline def setAbout(value: LiaAboutPageSettings): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
    
    inline def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setHostedLocalStorefrontActive(value: Boolean): Self = StObject.set(x, "hostedLocalStorefrontActive", value.asInstanceOf[js.Any])
    
    inline def setHostedLocalStorefrontActiveUndefined: Self = StObject.set(x, "hostedLocalStorefrontActive", js.undefined)
    
    inline def setInventory(value: LiaInventorySettings): Self = StObject.set(x, "inventory", value.asInstanceOf[js.Any])
    
    inline def setInventoryUndefined: Self = StObject.set(x, "inventory", js.undefined)
    
    inline def setOnDisplayToOrder(value: LiaOnDisplayToOrderSettings): Self = StObject.set(x, "onDisplayToOrder", value.asInstanceOf[js.Any])
    
    inline def setOnDisplayToOrderUndefined: Self = StObject.set(x, "onDisplayToOrder", js.undefined)
    
    inline def setPosDataProvider(value: LiaPosDataProvider): Self = StObject.set(x, "posDataProvider", value.asInstanceOf[js.Any])
    
    inline def setPosDataProviderUndefined: Self = StObject.set(x, "posDataProvider", js.undefined)
    
    inline def setStorePickupActive(value: Boolean): Self = StObject.set(x, "storePickupActive", value.asInstanceOf[js.Any])
    
    inline def setStorePickupActiveUndefined: Self = StObject.set(x, "storePickupActive", js.undefined)
  }
}
