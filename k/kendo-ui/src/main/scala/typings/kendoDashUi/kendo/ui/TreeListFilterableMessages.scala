package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListFilterableMessages extends js.Object {
  var and: js.UndefOr[String] = js.undefined
  var clear: js.UndefOr[String] = js.undefined
  var filter: js.UndefOr[String] = js.undefined
  var info: js.UndefOr[String] = js.undefined
  var isFalse: js.UndefOr[String] = js.undefined
  var isTrue: js.UndefOr[String] = js.undefined
  var or: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object TreeListFilterableMessages {
  @scala.inline
  def apply(
    and: String = null,
    clear: String = null,
    filter: String = null,
    info: String = null,
    isFalse: String = null,
    isTrue: String = null,
    or: String = null,
    title: String = null
  ): TreeListFilterableMessages = {
    val __obj = js.Dynamic.literal()
    if (and != null) __obj.updateDynamic("and")(and)
    if (clear != null) __obj.updateDynamic("clear")(clear)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (info != null) __obj.updateDynamic("info")(info)
    if (isFalse != null) __obj.updateDynamic("isFalse")(isFalse)
    if (isTrue != null) __obj.updateDynamic("isTrue")(isTrue)
    if (or != null) __obj.updateDynamic("or")(or)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[TreeListFilterableMessages]
  }
}

