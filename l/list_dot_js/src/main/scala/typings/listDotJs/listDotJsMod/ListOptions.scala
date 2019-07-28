package typings.listDotJs.listDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListOptions extends js.Object {
  var i: js.UndefOr[Double] = js.undefined
  var indexAsync: js.UndefOr[Boolean] = js.undefined
  var item: js.UndefOr[String] = js.undefined
  var listClass: js.UndefOr[String] = js.undefined
  var page: js.UndefOr[Double] = js.undefined
  var pagination: js.UndefOr[Boolean] = js.undefined
  var searchClass: js.UndefOr[String] = js.undefined
  var sortClass: js.UndefOr[String] = js.undefined
  var valueNames: js.UndefOr[js.Array[String]] = js.undefined
}

object ListOptions {
  @scala.inline
  def apply(
    i: Int | Double = null,
    indexAsync: js.UndefOr[Boolean] = js.undefined,
    item: String = null,
    listClass: String = null,
    page: Int | Double = null,
    pagination: js.UndefOr[Boolean] = js.undefined,
    searchClass: String = null,
    sortClass: String = null,
    valueNames: js.Array[String] = null
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

