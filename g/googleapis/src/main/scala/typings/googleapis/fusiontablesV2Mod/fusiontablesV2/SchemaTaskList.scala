package typings.googleapis.fusiontablesV2Mod.fusiontablesV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a list of tasks for a table.
  */
@js.native
trait SchemaTaskList extends js.Object {
  /**
    * List of all requested tasks.
    */
  var items: js.UndefOr[js.Array[SchemaTask]] = js.native
  /**
    * Type of the resource. This is always &quot;fusiontables#taskList&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Token used to access the next page of this result. No token is displayed
    * if there are no more pages left.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Total number of tasks for the table.
    */
  var totalItems: js.UndefOr[Double] = js.native
}

object SchemaTaskList {
  @scala.inline
  def apply(
    items: js.Array[SchemaTask] = null,
    kind: String = null,
    nextPageToken: String = null,
    totalItems: js.UndefOr[Double] = js.undefined
  ): SchemaTaskList = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(totalItems)) __obj.updateDynamic("totalItems")(totalItems.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTaskList]
  }
}

