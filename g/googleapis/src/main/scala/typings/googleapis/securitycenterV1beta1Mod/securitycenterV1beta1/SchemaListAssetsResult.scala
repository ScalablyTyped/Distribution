package typings.googleapis.securitycenterV1beta1Mod.securitycenterV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result containing the Asset and its State.
  */
@js.native
trait SchemaListAssetsResult extends js.Object {
  /**
    * Asset matching the search request.
    */
  var asset: js.UndefOr[SchemaAsset] = js.native
  /**
    * State of the asset.
    */
  var state: js.UndefOr[String] = js.native
}

object SchemaListAssetsResult {
  @scala.inline
  def apply(asset: SchemaAsset = null, state: String = null): SchemaListAssetsResult = {
    val __obj = js.Dynamic.literal()
    if (asset != null) __obj.updateDynamic("asset")(asset.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListAssetsResult]
  }
}

