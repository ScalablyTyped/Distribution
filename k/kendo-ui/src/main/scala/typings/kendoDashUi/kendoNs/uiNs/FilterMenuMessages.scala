package typings.kendoDashUi.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterMenuMessages extends js.Object {
  var additionalOperator: js.UndefOr[String] = js.undefined
  var additionalValue: js.UndefOr[String] = js.undefined
  var and: js.UndefOr[String] = js.undefined
  var clear: js.UndefOr[String] = js.undefined
  var filter: js.UndefOr[String] = js.undefined
  var info: js.UndefOr[String] = js.undefined
  var isFalse: js.UndefOr[String] = js.undefined
  var isTrue: js.UndefOr[String] = js.undefined
  var logic: js.UndefOr[String] = js.undefined
  var or: js.UndefOr[String] = js.undefined
  var selectValue: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object FilterMenuMessages {
  @scala.inline
  def apply(
    additionalOperator: String = null,
    additionalValue: String = null,
    and: String = null,
    clear: String = null,
    filter: String = null,
    info: String = null,
    isFalse: String = null,
    isTrue: String = null,
    logic: String = null,
    or: String = null,
    selectValue: String = null,
    title: String = null
  ): FilterMenuMessages = {
    val __obj = js.Dynamic.literal()
    if (additionalOperator != null) __obj.updateDynamic("additionalOperator")(additionalOperator)
    if (additionalValue != null) __obj.updateDynamic("additionalValue")(additionalValue)
    if (and != null) __obj.updateDynamic("and")(and)
    if (clear != null) __obj.updateDynamic("clear")(clear)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (info != null) __obj.updateDynamic("info")(info)
    if (isFalse != null) __obj.updateDynamic("isFalse")(isFalse)
    if (isTrue != null) __obj.updateDynamic("isTrue")(isTrue)
    if (logic != null) __obj.updateDynamic("logic")(logic)
    if (or != null) __obj.updateDynamic("or")(or)
    if (selectValue != null) __obj.updateDynamic("selectValue")(selectValue)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[FilterMenuMessages]
  }
}

