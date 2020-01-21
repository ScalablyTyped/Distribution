package typings.kendoUi.kendo.ui

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
    if (and != null) __obj.updateDynamic("and")(and.asInstanceOf[js.Any])
    if (clear != null) __obj.updateDynamic("clear")(clear.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (isFalse != null) __obj.updateDynamic("isFalse")(isFalse.asInstanceOf[js.Any])
    if (isTrue != null) __obj.updateDynamic("isTrue")(isTrue.asInstanceOf[js.Any])
    if (or != null) __obj.updateDynamic("or")(or.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeListFilterableMessages]
  }
}

