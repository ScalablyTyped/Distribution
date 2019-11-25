package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitterPane extends js.Object {
  var collapsed: js.UndefOr[Boolean] = js.undefined
  var collapsedSize: js.UndefOr[String] = js.undefined
  var collapsible: js.UndefOr[Boolean] = js.undefined
  var contentUrl: js.UndefOr[String] = js.undefined
  var max: js.UndefOr[String] = js.undefined
  var min: js.UndefOr[String] = js.undefined
  var resizable: js.UndefOr[Boolean] = js.undefined
  var scrollable: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[String] = js.undefined
}

object SplitterPane {
  @scala.inline
  def apply(
    collapsed: js.UndefOr[Boolean] = js.undefined,
    collapsedSize: String = null,
    collapsible: js.UndefOr[Boolean] = js.undefined,
    contentUrl: String = null,
    max: String = null,
    min: String = null,
    resizable: js.UndefOr[Boolean] = js.undefined,
    scrollable: js.UndefOr[Boolean] = js.undefined,
    size: String = null
  ): SplitterPane = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.asInstanceOf[js.Any])
    if (collapsedSize != null) __obj.updateDynamic("collapsedSize")(collapsedSize.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsible)) __obj.updateDynamic("collapsible")(collapsible.asInstanceOf[js.Any])
    if (contentUrl != null) __obj.updateDynamic("contentUrl")(contentUrl.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollable)) __obj.updateDynamic("scrollable")(scrollable.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplitterPane]
  }
}

