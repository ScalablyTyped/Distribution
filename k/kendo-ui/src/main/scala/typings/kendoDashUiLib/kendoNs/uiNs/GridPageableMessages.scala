package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridPageableMessages extends js.Object {
  var display: js.UndefOr[java.lang.String] = js.undefined
  var empty: js.UndefOr[java.lang.String] = js.undefined
  var first: js.UndefOr[java.lang.String] = js.undefined
  var itemsPerPage: js.UndefOr[java.lang.String] = js.undefined
  var last: js.UndefOr[java.lang.String] = js.undefined
  var morePages: js.UndefOr[java.lang.String] = js.undefined
  var next: js.UndefOr[java.lang.String] = js.undefined
  var of: js.UndefOr[java.lang.String] = js.undefined
  var page: js.UndefOr[java.lang.String] = js.undefined
  var previous: js.UndefOr[java.lang.String] = js.undefined
  var refresh: js.UndefOr[java.lang.String] = js.undefined
}

object GridPageableMessages {
  @scala.inline
  def apply(
    display: java.lang.String = null,
    empty: java.lang.String = null,
    first: java.lang.String = null,
    itemsPerPage: java.lang.String = null,
    last: java.lang.String = null,
    morePages: java.lang.String = null,
    next: java.lang.String = null,
    of: java.lang.String = null,
    page: java.lang.String = null,
    previous: java.lang.String = null,
    refresh: java.lang.String = null
  ): GridPageableMessages = {
    val __obj = js.Dynamic.literal()
    if (display != null) __obj.updateDynamic("display")(display)
    if (empty != null) __obj.updateDynamic("empty")(empty)
    if (first != null) __obj.updateDynamic("first")(first)
    if (itemsPerPage != null) __obj.updateDynamic("itemsPerPage")(itemsPerPage)
    if (last != null) __obj.updateDynamic("last")(last)
    if (morePages != null) __obj.updateDynamic("morePages")(morePages)
    if (next != null) __obj.updateDynamic("next")(next)
    if (of != null) __obj.updateDynamic("of")(of)
    if (page != null) __obj.updateDynamic("page")(page)
    if (previous != null) __obj.updateDynamic("previous")(previous)
    if (refresh != null) __obj.updateDynamic("refresh")(refresh)
    __obj.asInstanceOf[GridPageableMessages]
  }
}

