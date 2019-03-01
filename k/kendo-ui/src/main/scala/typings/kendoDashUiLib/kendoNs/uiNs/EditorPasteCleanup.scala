package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorPasteCleanup extends js.Object {
  var all: js.UndefOr[scala.Boolean] = js.undefined
  var css: js.UndefOr[scala.Boolean] = js.undefined
  var custom: js.UndefOr[js.Function] = js.undefined
  var keepNewLines: js.UndefOr[scala.Boolean] = js.undefined
  var msAllFormatting: js.UndefOr[scala.Boolean] = js.undefined
  var msConvertLists: js.UndefOr[scala.Boolean] = js.undefined
  var msTags: js.UndefOr[scala.Boolean] = js.undefined
  var none: js.UndefOr[scala.Boolean] = js.undefined
  var span: js.UndefOr[scala.Boolean] = js.undefined
}

object EditorPasteCleanup {
  @scala.inline
  def apply(
    all: js.UndefOr[scala.Boolean] = js.undefined,
    css: js.UndefOr[scala.Boolean] = js.undefined,
    custom: js.Function = null,
    keepNewLines: js.UndefOr[scala.Boolean] = js.undefined,
    msAllFormatting: js.UndefOr[scala.Boolean] = js.undefined,
    msConvertLists: js.UndefOr[scala.Boolean] = js.undefined,
    msTags: js.UndefOr[scala.Boolean] = js.undefined,
    none: js.UndefOr[scala.Boolean] = js.undefined,
    span: js.UndefOr[scala.Boolean] = js.undefined
  ): EditorPasteCleanup = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all)
    if (!js.isUndefined(css)) __obj.updateDynamic("css")(css)
    if (custom != null) __obj.updateDynamic("custom")(custom)
    if (!js.isUndefined(keepNewLines)) __obj.updateDynamic("keepNewLines")(keepNewLines)
    if (!js.isUndefined(msAllFormatting)) __obj.updateDynamic("msAllFormatting")(msAllFormatting)
    if (!js.isUndefined(msConvertLists)) __obj.updateDynamic("msConvertLists")(msConvertLists)
    if (!js.isUndefined(msTags)) __obj.updateDynamic("msTags")(msTags)
    if (!js.isUndefined(none)) __obj.updateDynamic("none")(none)
    if (!js.isUndefined(span)) __obj.updateDynamic("span")(span)
    __obj.asInstanceOf[EditorPasteCleanup]
  }
}

