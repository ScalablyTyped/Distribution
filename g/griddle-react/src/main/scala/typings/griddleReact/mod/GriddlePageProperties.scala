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
  def apply(currentPage: Int | Double = null, pageSize: Int | Double = null, recordCount: Int | Double = null): GriddlePageProperties = {
    val __obj = js.Dynamic.literal()
    if (currentPage != null) __obj.updateDynamic("currentPage")(currentPage.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (recordCount != null) __obj.updateDynamic("recordCount")(recordCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[GriddlePageProperties]
  }
}

