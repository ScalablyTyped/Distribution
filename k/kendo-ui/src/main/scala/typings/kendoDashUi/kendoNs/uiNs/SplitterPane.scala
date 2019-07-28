package typings.kendoDashUi.kendoNs.uiNs

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
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed)
    if (collapsedSize != null) __obj.updateDynamic("collapsedSize")(collapsedSize)
    if (!js.isUndefined(collapsible)) __obj.updateDynamic("collapsible")(collapsible)
    if (contentUrl != null) __obj.updateDynamic("contentUrl")(contentUrl)
    if (max != null) __obj.updateDynamic("max")(max)
    if (min != null) __obj.updateDynamic("min")(min)
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable)
    if (!js.isUndefined(scrollable)) __obj.updateDynamic("scrollable")(scrollable)
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[SplitterPane]
  }
}

