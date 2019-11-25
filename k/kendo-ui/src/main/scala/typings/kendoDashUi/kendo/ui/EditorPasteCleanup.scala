package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorPasteCleanup extends js.Object {
  var all: js.UndefOr[Boolean] = js.undefined
  var css: js.UndefOr[Boolean] = js.undefined
  var custom: js.UndefOr[js.Function] = js.undefined
  var keepNewLines: js.UndefOr[Boolean] = js.undefined
  var msAllFormatting: js.UndefOr[Boolean] = js.undefined
  var msConvertLists: js.UndefOr[Boolean] = js.undefined
  var msTags: js.UndefOr[Boolean] = js.undefined
  var none: js.UndefOr[Boolean] = js.undefined
  var span: js.UndefOr[Boolean] = js.undefined
}

object EditorPasteCleanup {
  @scala.inline
  def apply(
    all: js.UndefOr[Boolean] = js.undefined,
    css: js.UndefOr[Boolean] = js.undefined,
    custom: js.Function = null,
    keepNewLines: js.UndefOr[Boolean] = js.undefined,
    msAllFormatting: js.UndefOr[Boolean] = js.undefined,
    msConvertLists: js.UndefOr[Boolean] = js.undefined,
    msTags: js.UndefOr[Boolean] = js.undefined,
    none: js.UndefOr[Boolean] = js.undefined,
    span: js.UndefOr[Boolean] = js.undefined
  ): EditorPasteCleanup = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all.asInstanceOf[js.Any])
    if (!js.isUndefined(css)) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (custom != null) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (!js.isUndefined(keepNewLines)) __obj.updateDynamic("keepNewLines")(keepNewLines.asInstanceOf[js.Any])
    if (!js.isUndefined(msAllFormatting)) __obj.updateDynamic("msAllFormatting")(msAllFormatting.asInstanceOf[js.Any])
    if (!js.isUndefined(msConvertLists)) __obj.updateDynamic("msConvertLists")(msConvertLists.asInstanceOf[js.Any])
    if (!js.isUndefined(msTags)) __obj.updateDynamic("msTags")(msTags.asInstanceOf[js.Any])
    if (!js.isUndefined(none)) __obj.updateDynamic("none")(none.asInstanceOf[js.Any])
    if (!js.isUndefined(span)) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorPasteCleanup]
  }
}

