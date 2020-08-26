package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLiaCountrySettings extends js.Object {
  /**
    * The settings for the About page.
    */
  var about: js.UndefOr[SchemaLiaAboutPageSettings] = js.native
  /**
    * CLDR country code (e.g. &quot;US&quot;).
    */
  var country: js.UndefOr[String] = js.native
  /**
    * The status of the &quot;Merchant hosted local storefront&quot; feature.
    */
  var hostedLocalStorefrontActive: js.UndefOr[Boolean] = js.native
  /**
    * LIA inventory verification settings.
    */
  var inventory: js.UndefOr[SchemaLiaInventorySettings] = js.native
  /**
    * LIA &quot;On Display To Order&quot; settings.
    */
  var onDisplayToOrder: js.UndefOr[SchemaLiaOnDisplayToOrderSettings] = js.native
  /**
    * The POS data provider linked with this country.
    */
  var posDataProvider: js.UndefOr[SchemaLiaPosDataProvider] = js.native
  /**
    * The status of the &quot;Store pickup&quot; feature.
    */
  var storePickupActive: js.UndefOr[Boolean] = js.native
}

object SchemaLiaCountrySettings {
  @scala.inline
  def apply(): SchemaLiaCountrySettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiaCountrySettings]
  }
  @scala.inline
  implicit class SchemaLiaCountrySettingsOps[Self <: SchemaLiaCountrySettings] (val x: Self) extends AnyVal {
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
    def setAbout(value: SchemaLiaAboutPageSettings): Self = this.set("about", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbout: Self = this.set("about", js.undefined)
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    @scala.inline
    def setHostedLocalStorefrontActive(value: Boolean): Self = this.set("hostedLocalStorefrontActive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostedLocalStorefrontActive: Self = this.set("hostedLocalStorefrontActive", js.undefined)
    @scala.inline
    def setInventory(value: SchemaLiaInventorySettings): Self = this.set("inventory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInventory: Self = this.set("inventory", js.undefined)
    @scala.inline
    def setOnDisplayToOrder(value: SchemaLiaOnDisplayToOrderSettings): Self = this.set("onDisplayToOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDisplayToOrder: Self = this.set("onDisplayToOrder", js.undefined)
    @scala.inline
    def setPosDataProvider(value: SchemaLiaPosDataProvider): Self = this.set("posDataProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosDataProvider: Self = this.set("posDataProvider", js.undefined)
    @scala.inline
    def setStorePickupActive(value: Boolean): Self = this.set("storePickupActive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorePickupActive: Self = this.set("storePickupActive", js.undefined)
  }
  
}

