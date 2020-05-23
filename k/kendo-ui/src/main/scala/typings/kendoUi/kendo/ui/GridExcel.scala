package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridExcel extends js.Object {
  var allPages: js.UndefOr[Boolean] = js.undefined
  var fileName: js.UndefOr[String] = js.undefined
  var filterable: js.UndefOr[Boolean] = js.undefined
  var forceProxy: js.UndefOr[Boolean] = js.undefined
  var proxyURL: js.UndefOr[String] = js.undefined
}

object GridExcel {
  @scala.inline
  def apply(
    allPages: js.UndefOr[Boolean] = js.undefined,
    fileName: String = null,
    filterable: js.UndefOr[Boolean] = js.undefined,
    forceProxy: js.UndefOr[Boolean] = js.undefined,
    proxyURL: String = null
  ): GridExcel = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allPages)) __obj.updateDynamic("allPages")(allPages.get.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (!js.isUndefined(filterable)) __obj.updateDynamic("filterable")(filterable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceProxy)) __obj.updateDynamic("forceProxy")(forceProxy.get.asInstanceOf[js.Any])
    if (proxyURL != null) __obj.updateDynamic("proxyURL")(proxyURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridExcel]
  }
}

