package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterMenuMessages extends js.Object {
  var additionalOperator: js.UndefOr[java.lang.String] = js.undefined
  var additionalValue: js.UndefOr[java.lang.String] = js.undefined
  var and: js.UndefOr[java.lang.String] = js.undefined
  var clear: js.UndefOr[java.lang.String] = js.undefined
  var filter: js.UndefOr[java.lang.String] = js.undefined
  var info: js.UndefOr[java.lang.String] = js.undefined
  var isFalse: js.UndefOr[java.lang.String] = js.undefined
  var isTrue: js.UndefOr[java.lang.String] = js.undefined
  var logic: js.UndefOr[java.lang.String] = js.undefined
  var or: js.UndefOr[java.lang.String] = js.undefined
  var selectValue: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object FilterMenuMessages {
  @scala.inline
  def apply(
    additionalOperator: java.lang.String = null,
    additionalValue: java.lang.String = null,
    and: java.lang.String = null,
    clear: java.lang.String = null,
    filter: java.lang.String = null,
    info: java.lang.String = null,
    isFalse: java.lang.String = null,
    isTrue: java.lang.String = null,
    logic: java.lang.String = null,
    or: java.lang.String = null,
    selectValue: java.lang.String = null,
    title: java.lang.String = null
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

