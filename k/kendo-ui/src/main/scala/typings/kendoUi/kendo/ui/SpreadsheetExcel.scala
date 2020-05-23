package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetExcel extends js.Object {
  var fileName: js.UndefOr[String] = js.undefined
  var forceProxy: js.UndefOr[Boolean] = js.undefined
  var proxyURL: js.UndefOr[String] = js.undefined
}

object SpreadsheetExcel {
  @scala.inline
  def apply(fileName: String = null, forceProxy: js.UndefOr[Boolean] = js.undefined, proxyURL: String = null): SpreadsheetExcel = {
    val __obj = js.Dynamic.literal()
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (!js.isUndefined(forceProxy)) __obj.updateDynamic("forceProxy")(forceProxy.get.asInstanceOf[js.Any])
    if (proxyURL != null) __obj.updateDynamic("proxyURL")(proxyURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpreadsheetExcel]
  }
}

