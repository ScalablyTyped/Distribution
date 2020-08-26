package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpreadsheetExcel extends js.Object {
  var fileName: js.UndefOr[String] = js.native
  var forceProxy: js.UndefOr[Boolean] = js.native
  var proxyURL: js.UndefOr[String] = js.native
}

object SpreadsheetExcel {
  @scala.inline
  def apply(): SpreadsheetExcel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpreadsheetExcel]
  }
  @scala.inline
  implicit class SpreadsheetExcelOps[Self <: SpreadsheetExcel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
    @scala.inline
    def setForceProxy(value: Boolean): Self = this.set("forceProxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceProxy: Self = this.set("forceProxy", js.undefined)
    @scala.inline
    def setProxyURL(value: String): Self = this.set("proxyURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxyURL: Self = this.set("proxyURL", js.undefined)
  }
  
}

