package typings.jstree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSTreeGetJsonOptions extends js.Object {
  /**
    * return flat JSON instead of nested
    */
  var flat: js.UndefOr[Boolean] = js.undefined
  /**
    * do not include A attributes
    */
  var no_a_attr: js.UndefOr[Boolean] = js.undefined
  /**
    * do not include children
    */
  var no_children: js.UndefOr[Boolean] = js.undefined
  /**
    * do not include node data
    */
  var no_data: js.UndefOr[Boolean] = js.undefined
  /**
    * do not return ID
    */
  var no_id: js.UndefOr[Boolean] = js.undefined
  /**
    * do not include LI attributes
    */
  var no_li_attr: js.UndefOr[Boolean] = js.undefined
  /**
    * do not return state information
    */
  var no_state: js.UndefOr[Boolean] = js.undefined
}

object JSTreeGetJsonOptions {
  @scala.inline
  def apply(
    flat: js.UndefOr[Boolean] = js.undefined,
    no_a_attr: js.UndefOr[Boolean] = js.undefined,
    no_children: js.UndefOr[Boolean] = js.undefined,
    no_data: js.UndefOr[Boolean] = js.undefined,
    no_id: js.UndefOr[Boolean] = js.undefined,
    no_li_attr: js.UndefOr[Boolean] = js.undefined,
    no_state: js.UndefOr[Boolean] = js.undefined
  ): JSTreeGetJsonOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(flat)) __obj.updateDynamic("flat")(flat)
    if (!js.isUndefined(no_a_attr)) __obj.updateDynamic("no_a_attr")(no_a_attr)
    if (!js.isUndefined(no_children)) __obj.updateDynamic("no_children")(no_children)
    if (!js.isUndefined(no_data)) __obj.updateDynamic("no_data")(no_data)
    if (!js.isUndefined(no_id)) __obj.updateDynamic("no_id")(no_id)
    if (!js.isUndefined(no_li_attr)) __obj.updateDynamic("no_li_attr")(no_li_attr)
    if (!js.isUndefined(no_state)) __obj.updateDynamic("no_state")(no_state)
    __obj.asInstanceOf[JSTreeGetJsonOptions]
  }
}

