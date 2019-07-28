package typings.kendoDashUi.kendoNs.uiNs

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
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    if (!js.isUndefined(forceProxy)) __obj.updateDynamic("forceProxy")(forceProxy)
    if (proxyURL != null) __obj.updateDynamic("proxyURL")(proxyURL)
    __obj.asInstanceOf[SpreadsheetExcel]
  }
}

