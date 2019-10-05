package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFViewerMessagesErrorMessages extends js.Object {
  var notFound: js.UndefOr[String] = js.undefined
  var notSupported: js.UndefOr[String] = js.undefined
  var parseError: js.UndefOr[String] = js.undefined
}

object PDFViewerMessagesErrorMessages {
  @scala.inline
  def apply(notFound: String = null, notSupported: String = null, parseError: String = null): PDFViewerMessagesErrorMessages = {
    val __obj = js.Dynamic.literal()
    if (notFound != null) __obj.updateDynamic("notFound")(notFound)
    if (notSupported != null) __obj.updateDynamic("notSupported")(notSupported)
    if (parseError != null) __obj.updateDynamic("parseError")(parseError)
    __obj.asInstanceOf[PDFViewerMessagesErrorMessages]
  }
}

