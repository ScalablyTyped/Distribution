package typings.googleapis.contentV2Mod.contentV2

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
  def apply(
    about: SchemaLiaAboutPageSettings = null,
    country: String = null,
    hostedLocalStorefrontActive: js.UndefOr[Boolean] = js.undefined,
    inventory: SchemaLiaInventorySettings = null,
    onDisplayToOrder: SchemaLiaOnDisplayToOrderSettings = null,
    posDataProvider: SchemaLiaPosDataProvider = null,
    storePickupActive: js.UndefOr[Boolean] = js.undefined
  ): SchemaLiaCountrySettings = {
    val __obj = js.Dynamic.literal()
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (!js.isUndefined(hostedLocalStorefrontActive)) __obj.updateDynamic("hostedLocalStorefrontActive")(hostedLocalStorefrontActive.asInstanceOf[js.Any])
    if (inventory != null) __obj.updateDynamic("inventory")(inventory.asInstanceOf[js.Any])
    if (onDisplayToOrder != null) __obj.updateDynamic("onDisplayToOrder")(onDisplayToOrder.asInstanceOf[js.Any])
    if (posDataProvider != null) __obj.updateDynamic("posDataProvider")(posDataProvider.asInstanceOf[js.Any])
    if (!js.isUndefined(storePickupActive)) __obj.updateDynamic("storePickupActive")(storePickupActive.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLiaCountrySettings]
  }
}

