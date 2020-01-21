package typings.googleapis.polyV1Mod.polyV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Data about the user&#39;s asset.
  */
@js.native
trait SchemaUserAsset extends js.Object {
  /**
    * An Asset.
    */
  var asset: js.UndefOr[SchemaAsset] = js.native
}

object SchemaUserAsset {
  @scala.inline
  def apply(asset: SchemaAsset = null): SchemaUserAsset = {
    val __obj = js.Dynamic.literal()
    if (asset != null) __obj.updateDynamic("asset")(asset.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUserAsset]
  }
}

