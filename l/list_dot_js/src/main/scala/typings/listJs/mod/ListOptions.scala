package typings.listJs.mod

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
    i: js.UndefOr[Double] = js.undefined,
    indexAsync: js.UndefOr[Boolean] = js.undefined,
    item: String = null,
    listClass: String = null,
    page: js.UndefOr[Double] = js.undefined,
    pagination: js.UndefOr[Boolean] = js.undefined,
    searchClass: String = null,
    sortClass: String = null,
    valueNames: js.Array[String] = null
  ): ListOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(i)) __obj.updateDynamic("i")(i.get.asInstanceOf[js.Any])
    if (!js.isUndefined(indexAsync)) __obj.updateDynamic("indexAsync")(indexAsync.get.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (listClass != null) __obj.updateDynamic("listClass")(listClass.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pagination)) __obj.updateDynamic("pagination")(pagination.get.asInstanceOf[js.Any])
    if (searchClass != null) __obj.updateDynamic("searchClass")(searchClass.asInstanceOf[js.Any])
    if (sortClass != null) __obj.updateDynamic("sortClass")(sortClass.asInstanceOf[js.Any])
    if (valueNames != null) __obj.updateDynamic("valueNames")(valueNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOptions]
  }
}

