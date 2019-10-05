package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFViewerDplProcessingRead extends js.Object {
  var dataType: js.UndefOr[String] = js.undefined
  var pageField: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object PDFViewerDplProcessingRead {
  @scala.inline
  def apply(dataType: String = null, pageField: String = null, `type`: String = null, url: String = null): PDFViewerDplProcessingRead = {
    val __obj = js.Dynamic.literal()
    if (dataType != null) __obj.updateDynamic("dataType")(dataType)
    if (pageField != null) __obj.updateDynamic("pageField")(pageField)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[PDFViewerDplProcessingRead]
  }
}

