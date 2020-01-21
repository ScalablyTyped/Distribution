package typings.googleapis.fusiontablesV1Mod.fusiontablesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a list of columns in a table.
  */
@js.native
trait SchemaColumnList extends js.Object {
  /**
    * List of all requested columns.
    */
  var items: js.UndefOr[js.Array[SchemaColumn]] = js.native
  /**
    * Type name: a list of all columns.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Token used to access the next page of this result. No token is displayed
    * if there are no more pages left.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Total number of columns for the table.
    */
  var totalItems: js.UndefOr[Double] = js.native
}

object SchemaColumnList {
  @scala.inline
  def apply(
    items: js.Array[SchemaColumn] = null,
    kind: String = null,
    nextPageToken: String = null,
    totalItems: Int | Double = null
  ): SchemaColumnList = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaColumnList]
  }
}

