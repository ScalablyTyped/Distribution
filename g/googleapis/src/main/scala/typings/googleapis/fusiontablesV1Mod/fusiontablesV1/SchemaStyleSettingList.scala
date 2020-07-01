package typings.googleapis.fusiontablesV1Mod.fusiontablesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a list of styles for a given table.
  */
@js.native
trait SchemaStyleSettingList extends js.Object {
  /**
    * All requested style settings.
    */
  var items: js.UndefOr[js.Array[SchemaStyleSetting]] = js.native
  /**
    * Type name: in this case, a list of style settings.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Token used to access the next page of this result. No token is displayed
    * if there are no more pages left.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Total number of styles for the table.
    */
  var totalItems: js.UndefOr[Double] = js.native
}

object SchemaStyleSettingList {
  @scala.inline
  def apply(
    items: js.Array[SchemaStyleSetting] = null,
    kind: String = null,
    nextPageToken: String = null,
    totalItems: js.UndefOr[Double] = js.undefined
  ): SchemaStyleSettingList = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(totalItems)) __obj.updateDynamic("totalItems")(totalItems.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaStyleSettingList]
  }
}

