package typings.griddleReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GriddlePageProperties extends js.Object {
  var currentPage: js.UndefOr[Double] = js.undefined
  var pageSize: js.UndefOr[Double] = js.undefined
  var recordCount: js.UndefOr[Double] = js.undefined
}

object GriddlePageProperties {
  @scala.inline
  def apply(
    currentPage: js.UndefOr[Double] = js.undefined,
    pageSize: js.UndefOr[Double] = js.undefined,
    recordCount: js.UndefOr[Double] = js.undefined
  ): GriddlePageProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(currentPage)) __obj.updateDynamic("currentPage")(currentPage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(recordCount)) __obj.updateDynamic("recordCount")(recordCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GriddlePageProperties]
  }
}

