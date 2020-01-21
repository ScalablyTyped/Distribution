package typings.googleapis.digitalassetlinksV1Mod.digitalassetlinksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Uniquely identifies an asset.  A digital asset is an identifiable and
  * addressable online entity that typically provides some service or content.
  * Examples of assets are websites, Android apps, Twitter feeds, and Plus
  * Pages.
  */
@js.native
trait SchemaAsset extends js.Object {
  /**
    * Set if this is an Android App asset.
    */
  var androidApp: js.UndefOr[SchemaAndroidAppAsset] = js.native
  /**
    * Set if this is a web asset.
    */
  var web: js.UndefOr[SchemaWebAsset] = js.native
}

object SchemaAsset {
  @scala.inline
  def apply(androidApp: SchemaAndroidAppAsset = null, web: SchemaWebAsset = null): SchemaAsset = {
    val __obj = js.Dynamic.literal()
    if (androidApp != null) __obj.updateDynamic("androidApp")(androidApp.asInstanceOf[js.Any])
    if (web != null) __obj.updateDynamic("web")(web.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAsset]
  }
}

