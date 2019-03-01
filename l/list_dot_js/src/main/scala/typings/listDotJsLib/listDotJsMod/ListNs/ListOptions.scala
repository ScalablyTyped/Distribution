package typings
package listDotJsLib.listDotJsMod.ListNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListOptions extends js.Object {
  var i: js.UndefOr[scala.Double] = js.undefined
  var indexAsync: js.UndefOr[scala.Boolean] = js.undefined
  var item: js.UndefOr[java.lang.String] = js.undefined
  var listClass: js.UndefOr[java.lang.String] = js.undefined
  var page: js.UndefOr[scala.Double] = js.undefined
  var pagination: js.UndefOr[scala.Boolean] = js.undefined
  var searchClass: js.UndefOr[java.lang.String] = js.undefined
  var sortClass: js.UndefOr[java.lang.String] = js.undefined
  var valueNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object ListOptions {
  @scala.inline
  def apply(
    i: scala.Int | scala.Double = null,
    indexAsync: js.UndefOr[scala.Boolean] = js.undefined,
    item: java.lang.String = null,
    listClass: java.lang.String = null,
    page: scala.Int | scala.Double = null,
    pagination: js.UndefOr[scala.Boolean] = js.undefined,
    searchClass: java.lang.String = null,
    sortClass: java.lang.String = null,
    valueNames: js.Array[java.lang.String] = null
  ): ListOptions = {
    val __obj = js.Dynamic.literal()
    if (i != null) __obj.updateDynamic("i")(i.asInstanceOf[js.Any])
    if (!js.isUndefined(indexAsync)) __obj.updateDynamic("indexAsync")(indexAsync)
    if (item != null) __obj.updateDynamic("item")(item)
    if (listClass != null) __obj.updateDynamic("listClass")(listClass)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (!js.isUndefined(pagination)) __obj.updateDynamic("pagination")(pagination)
    if (searchClass != null) __obj.updateDynamic("searchClass")(searchClass)
    if (sortClass != null) __obj.updateDynamic("sortClass")(sortClass)
    if (valueNames != null) __obj.updateDynamic("valueNames")(valueNames)
    __obj.asInstanceOf[ListOptions]
  }
}

