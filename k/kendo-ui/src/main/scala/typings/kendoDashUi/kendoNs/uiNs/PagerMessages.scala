package typings.kendoDashUi.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagerMessages extends js.Object {
  var allPages: js.UndefOr[String] = js.undefined
  var display: js.UndefOr[String] = js.undefined
  var empty: js.UndefOr[String] = js.undefined
  var first: js.UndefOr[String] = js.undefined
  var itemsPerPage: js.UndefOr[String] = js.undefined
  var last: js.UndefOr[String] = js.undefined
  var next: js.UndefOr[String] = js.undefined
  var of: js.UndefOr[String] = js.undefined
  var page: js.UndefOr[String] = js.undefined
  var previous: js.UndefOr[String] = js.undefined
  var refresh: js.UndefOr[String] = js.undefined
}

object PagerMessages {
  @scala.inline
  def apply(
    allPages: String = null,
    display: String = null,
    empty: String = null,
    first: String = null,
    itemsPerPage: String = null,
    last: String = null,
    next: String = null,
    of: String = null,
    page: String = null,
    previous: String = null,
    refresh: String = null
  ): PagerMessages = {
    val __obj = js.Dynamic.literal()
    if (allPages != null) __obj.updateDynamic("allPages")(allPages)
    if (display != null) __obj.updateDynamic("display")(display)
    if (empty != null) __obj.updateDynamic("empty")(empty)
    if (first != null) __obj.updateDynamic("first")(first)
    if (itemsPerPage != null) __obj.updateDynamic("itemsPerPage")(itemsPerPage)
    if (last != null) __obj.updateDynamic("last")(last)
    if (next != null) __obj.updateDynamic("next")(next)
    if (of != null) __obj.updateDynamic("of")(of)
    if (page != null) __obj.updateDynamic("page")(page)
    if (previous != null) __obj.updateDynamic("previous")(previous)
    if (refresh != null) __obj.updateDynamic("refresh")(refresh)
    __obj.asInstanceOf[PagerMessages]
  }
}

