package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLiaCountrySettings extends StObject {
  
  /**
    * The settings for the About page.
    */
  var about: js.UndefOr[SchemaLiaAboutPageSettings] = js.undefined
  
  /**
    * CLDR country code (e.g. &quot;US&quot;).
    */
  var country: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the &quot;Merchant hosted local storefront&quot; feature.
    */
  var hostedLocalStorefrontActive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * LIA inventory verification settings.
    */
  var inventory: js.UndefOr[SchemaLiaInventorySettings] = js.undefined
  
  /**
    * LIA &quot;On Display To Order&quot; settings.
    */
  var onDisplayToOrder: js.UndefOr[SchemaLiaOnDisplayToOrderSettings] = js.undefined
  
  /**
    * The POS data provider linked with this country.
    */
  var posDataProvider: js.UndefOr[SchemaLiaPosDataProvider] = js.undefined
  
  /**
    * The status of the &quot;Store pickup&quot; feature.
    */
  var storePickupActive: js.UndefOr[Boolean] = js.undefined
}
object SchemaLiaCountrySettings {
  
  @scala.inline
  def apply(): SchemaLiaCountrySettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiaCountrySettings]
  }
  
  @scala.inline
  implicit class SchemaLiaCountrySettingsMutableBuilder[Self <: SchemaLiaCountrySettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbout(value: SchemaLiaAboutPageSettings): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    @scala.inline
    def setHostedLocalStorefrontActive(value: Boolean): Self = StObject.set(x, "hostedLocalStorefrontActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostedLocalStorefrontActiveUndefined: Self = StObject.set(x, "hostedLocalStorefrontActive", js.undefined)
    
    @scala.inline
    def setInventory(value: SchemaLiaInventorySettings): Self = StObject.set(x, "inventory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInventoryUndefined: Self = StObject.set(x, "inventory", js.undefined)
    
    @scala.inline
    def setOnDisplayToOrder(value: SchemaLiaOnDisplayToOrderSettings): Self = StObject.set(x, "onDisplayToOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDisplayToOrderUndefined: Self = StObject.set(x, "onDisplayToOrder", js.undefined)
    
    @scala.inline
    def setPosDataProvider(value: SchemaLiaPosDataProvider): Self = StObject.set(x, "posDataProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosDataProviderUndefined: Self = StObject.set(x, "posDataProvider", js.undefined)
    
    @scala.inline
    def setStorePickupActive(value: Boolean): Self = StObject.set(x, "storePickupActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorePickupActiveUndefined: Self = StObject.set(x, "storePickupActive", js.undefined)
  }
}
