package typings
package griddleDashReactLib.griddleDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GriddlePageProperties extends js.Object {
  var currentPage: js.UndefOr[scala.Double] = js.undefined
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  var recordCount: js.UndefOr[scala.Double] = js.undefined
}

object GriddlePageProperties {
  @scala.inline
  def apply(
    currentPage: scala.Int | scala.Double = null,
    pageSize: scala.Int | scala.Double = null,
    recordCount: scala.Int | scala.Double = null
  ): GriddlePageProperties = {
    val __obj = js.Dynamic.literal()
    if (currentPage != null) __obj.updateDynamic("currentPage")(currentPage.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (recordCount != null) __obj.updateDynamic("recordCount")(recordCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[GriddlePageProperties]
  }
}

