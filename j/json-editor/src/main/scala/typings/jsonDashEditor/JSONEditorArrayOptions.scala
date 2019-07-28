package typings.jsonDashEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONEditorArrayOptions extends js.Object {
  /**
    * If set to true, the editor will start collapsed
    */
  var collapsed: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to true, the "add row" button will be hidden
    */
  var disable_array_add: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to true, all of the "delete" buttons will be hidden
    */
  var disable_array_delete: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to true, just the "delete all rows" button will be hidden
    */
  var disable_array_delete_all_rows: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to true, just the "delete last row" buttons will be hidden
    */
  var disable_array_delete_last_row: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to true, the "move up/down" buttons will be hidden
    */
  var disable_array_reorder: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to true, the collapse button will be hidden
    */
  var disable_collapse: js.UndefOr[Boolean] = js.undefined
}

object JSONEditorArrayOptions {
  @scala.inline
  def apply(
    collapsed: js.UndefOr[Boolean] = js.undefined,
    disable_array_add: js.UndefOr[Boolean] = js.undefined,
    disable_array_delete: js.UndefOr[Boolean] = js.undefined,
    disable_array_delete_all_rows: js.UndefOr[Boolean] = js.undefined,
    disable_array_delete_last_row: js.UndefOr[Boolean] = js.undefined,
    disable_array_reorder: js.UndefOr[Boolean] = js.undefined,
    disable_collapse: js.UndefOr[Boolean] = js.undefined
  ): JSONEditorArrayOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed)
    if (!js.isUndefined(disable_array_add)) __obj.updateDynamic("disable_array_add")(disable_array_add)
    if (!js.isUndefined(disable_array_delete)) __obj.updateDynamic("disable_array_delete")(disable_array_delete)
    if (!js.isUndefined(disable_array_delete_all_rows)) __obj.updateDynamic("disable_array_delete_all_rows")(disable_array_delete_all_rows)
    if (!js.isUndefined(disable_array_delete_last_row)) __obj.updateDynamic("disable_array_delete_last_row")(disable_array_delete_last_row)
    if (!js.isUndefined(disable_array_reorder)) __obj.updateDynamic("disable_array_reorder")(disable_array_reorder)
    if (!js.isUndefined(disable_collapse)) __obj.updateDynamic("disable_collapse")(disable_collapse)
    __obj.asInstanceOf[JSONEditorArrayOptions]
  }
}

