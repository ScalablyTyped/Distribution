package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitterPane extends js.Object {
  var collapsed: js.UndefOr[scala.Boolean] = js.undefined
  var collapsedSize: js.UndefOr[java.lang.String] = js.undefined
  var collapsible: js.UndefOr[scala.Boolean] = js.undefined
  var contentUrl: js.UndefOr[java.lang.String] = js.undefined
  var max: js.UndefOr[java.lang.String] = js.undefined
  var min: js.UndefOr[java.lang.String] = js.undefined
  var resizable: js.UndefOr[scala.Boolean] = js.undefined
  var scrollable: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[java.lang.String] = js.undefined
}

object SplitterPane {
  @scala.inline
  def apply(
    collapsed: js.UndefOr[scala.Boolean] = js.undefined,
    collapsedSize: java.lang.String = null,
    collapsible: js.UndefOr[scala.Boolean] = js.undefined,
    contentUrl: java.lang.String = null,
    max: java.lang.String = null,
    min: java.lang.String = null,
    resizable: js.UndefOr[scala.Boolean] = js.undefined,
    scrollable: js.UndefOr[scala.Boolean] = js.undefined,
    size: java.lang.String = null
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

