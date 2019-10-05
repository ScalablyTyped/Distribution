package typings.kendoDashUi.kendo.ui

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
    if (!js.isUndefined(allPages)) __obj.updateDynamic("allPages")(allPages)
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    if (!js.isUndefined(filterable)) __obj.updateDynamic("filterable")(filterable)
    if (!js.isUndefined(forceProxy)) __obj.updateDynamic("forceProxy")(forceProxy)
    if (proxyURL != null) __obj.updateDynamic("proxyURL")(proxyURL)
    __obj.asInstanceOf[GridExcel]
  }
}

