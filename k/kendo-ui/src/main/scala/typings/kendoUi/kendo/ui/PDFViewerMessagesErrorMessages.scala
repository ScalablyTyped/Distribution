package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFViewerMessagesErrorMessages extends js.Object {
  var notFound: js.UndefOr[String] = js.native
  var notSupported: js.UndefOr[String] = js.native
  var parseError: js.UndefOr[String] = js.native
}

object PDFViewerMessagesErrorMessages {
  @scala.inline
  def apply(): PDFViewerMessagesErrorMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFViewerMessagesErrorMessages]
  }
  @scala.inline
  implicit class PDFViewerMessagesErrorMessagesOps[Self <: PDFViewerMessagesErrorMessages] (val x: Self) extends AnyVal {
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
    def setNotFound(value: String): Self = this.set("notFound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotFound: Self = this.set("notFound", js.undefined)
    @scala.inline
    def setNotSupported(value: String): Self = this.set("notSupported", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotSupported: Self = this.set("notSupported", js.undefined)
    @scala.inline
    def setParseError(value: String): Self = this.set("parseError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParseError: Self = this.set("parseError", js.undefined)
  }
  
}

