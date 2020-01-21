package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridFilterableMessages extends js.Object {
  var and: js.UndefOr[String] = js.undefined
  var cancel: js.UndefOr[String] = js.undefined
  var checkAll: js.UndefOr[String] = js.undefined
  var clear: js.UndefOr[String] = js.undefined
  var filter: js.UndefOr[String] = js.undefined
  var info: js.UndefOr[String] = js.undefined
  var isFalse: js.UndefOr[String] = js.undefined
  var isTrue: js.UndefOr[String] = js.undefined
  var operator: js.UndefOr[String] = js.undefined
  var or: js.UndefOr[String] = js.undefined
  var search: js.UndefOr[String] = js.undefined
  var selectValue: js.UndefOr[String] = js.undefined
  var selectedItemsFormat: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object GridFilterableMessages {
  @scala.inline
  def apply(
    and: String = null,
    cancel: String = null,
    checkAll: String = null,
    clear: String = null,
    filter: String = null,
    info: String = null,
    isFalse: String = null,
    isTrue: String = null,
    operator: String = null,
    or: String = null,
    search: String = null,
    selectValue: String = null,
    selectedItemsFormat: String = null,
    title: String = null,
    value: String = null
  ): GridFilterableMessages = {
    val __obj = js.Dynamic.literal()
    if (and != null) __obj.updateDynamic("and")(and.asInstanceOf[js.Any])
    if (cancel != null) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (checkAll != null) __obj.updateDynamic("checkAll")(checkAll.asInstanceOf[js.Any])
    if (clear != null) __obj.updateDynamic("clear")(clear.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (isFalse != null) __obj.updateDynamic("isFalse")(isFalse.asInstanceOf[js.Any])
    if (isTrue != null) __obj.updateDynamic("isTrue")(isTrue.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (or != null) __obj.updateDynamic("or")(or.asInstanceOf[js.Any])
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    if (selectValue != null) __obj.updateDynamic("selectValue")(selectValue.asInstanceOf[js.Any])
    if (selectedItemsFormat != null) __obj.updateDynamic("selectedItemsFormat")(selectedItemsFormat.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridFilterableMessages]
  }
}

