package typings.jsonDashEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONEditorObjectOptions extends js.Object {
  /**
    * If set to true, the editor will start collapsed
    */
  var collapsed: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to true, the collapse button will be hidden
    */
  var disable_collapse: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to true, the Edit JSON button will be hidden
    */
  var disable_edit_json: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to true, the Edit Properties button will be hidden
    */
  var disable_properties: js.UndefOr[Boolean] = js.undefined
}

object JSONEditorObjectOptions {
  @scala.inline
  def apply(
    collapsed: js.UndefOr[Boolean] = js.undefined,
    disable_collapse: js.UndefOr[Boolean] = js.undefined,
    disable_edit_json: js.UndefOr[Boolean] = js.undefined,
    disable_properties: js.UndefOr[Boolean] = js.undefined
  ): JSONEditorObjectOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed)
    if (!js.isUndefined(disable_collapse)) __obj.updateDynamic("disable_collapse")(disable_collapse)
    if (!js.isUndefined(disable_edit_json)) __obj.updateDynamic("disable_edit_json")(disable_edit_json)
    if (!js.isUndefined(disable_properties)) __obj.updateDynamic("disable_properties")(disable_properties)
    __obj.asInstanceOf[JSONEditorObjectOptions]
  }
}

