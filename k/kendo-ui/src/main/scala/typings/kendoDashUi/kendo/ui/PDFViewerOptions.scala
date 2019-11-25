package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFViewerOptions extends js.Object {
  var defaultPageSize: js.UndefOr[PDFViewerDefaultPageSize] = js.undefined
  var dplProcessing: js.UndefOr[PDFViewerDplProcessing] = js.undefined
  var error: js.UndefOr[js.Function1[/* e */ PDFViewerErrorEvent, Unit]] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var messages: js.UndefOr[PDFViewerMessages] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var open: js.UndefOr[js.Function1[/* e */ PDFViewerOpenEvent, Unit]] = js.undefined
  var page: js.UndefOr[Double] = js.undefined
  var pdfjsProcessing: js.UndefOr[PDFViewerPdfjsProcessing] = js.undefined
  var render: js.UndefOr[js.Function1[/* e */ PDFViewerRenderEvent, Unit]] = js.undefined
  var toolbar: js.UndefOr[Boolean | PDFViewerToolbar] = js.undefined
  var view: js.UndefOr[PDFViewerView] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
}

object PDFViewerOptions {
  @scala.inline
  def apply(
    defaultPageSize: PDFViewerDefaultPageSize = null,
    dplProcessing: PDFViewerDplProcessing = null,
    error: /* e */ PDFViewerErrorEvent => Unit = null,
    height: Double | String = null,
    messages: PDFViewerMessages = null,
    name: String = null,
    open: /* e */ PDFViewerOpenEvent => Unit = null,
    page: Int | Double = null,
    pdfjsProcessing: PDFViewerPdfjsProcessing = null,
    render: /* e */ PDFViewerRenderEvent => Unit = null,
    toolbar: Boolean | PDFViewerToolbar = null,
    view: PDFViewerView = null,
    width: Double | String = null
  ): PDFViewerOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultPageSize != null) __obj.updateDynamic("defaultPageSize")(defaultPageSize.asInstanceOf[js.Any])
    if (dplProcessing != null) __obj.updateDynamic("dplProcessing")(dplProcessing.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1(open))
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (pdfjsProcessing != null) __obj.updateDynamic("pdfjsProcessing")(pdfjsProcessing.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFViewerOptions]
  }
}

