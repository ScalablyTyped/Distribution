package typings.googleapis.securitycenterV1Mod.securitycenterV1

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
    * State change of the asset between the points in time.
    */
  var stateChange: js.UndefOr[String] = js.native
}

object SchemaListAssetsResult {
  @scala.inline
  def apply(asset: SchemaAsset = null, stateChange: String = null): SchemaListAssetsResult = {
    val __obj = js.Dynamic.literal()
    if (asset != null) __obj.updateDynamic("asset")(asset.asInstanceOf[js.Any])
    if (stateChange != null) __obj.updateDynamic("stateChange")(stateChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListAssetsResult]
  }
}

