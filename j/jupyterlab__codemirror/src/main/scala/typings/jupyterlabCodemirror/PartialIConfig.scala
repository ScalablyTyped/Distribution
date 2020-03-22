package typings.jupyterlabCodemirror

import typings.codemirror.mod.StyleActiveLine
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.bounded
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.off
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.on
import typings.jupyterlabCodemirror.jupyterlabCodemirrorStrings.wordWrapColumn
import typings.jupyterlabCodemirror.modeMod.Mode.IMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@jupyterlab/codemirror.@jupyterlab/codemirror/lib/editor.CodeMirrorEditor.IConfig> */
trait PartialIConfig extends js.Object {
  var autoClosingBrackets: js.UndefOr[Boolean] = js.undefined
  var codeFolding: js.UndefOr[Boolean] = js.undefined
  var coverGutterNextToScrollbar: js.UndefOr[Boolean] = js.undefined
  var dragDrop: js.UndefOr[Boolean] = js.undefined
  var electricChars: js.UndefOr[Boolean] = js.undefined
  var extraKeys: js.UndefOr[js.Any] = js.undefined
  var fixedGutter: js.UndefOr[Boolean] = js.undefined
  var foldGutter: js.UndefOr[Boolean] = js.undefined
  var fontFamily: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[Double] = js.undefined
  var gutters: js.UndefOr[js.Array[String]] = js.undefined
  var insertSpaces: js.UndefOr[Boolean] = js.undefined
  var keyMap: js.UndefOr[String] = js.undefined
  var lineHeight: js.UndefOr[Double] = js.undefined
  var lineNumbers: js.UndefOr[Boolean] = js.undefined
  var lineSeparator: js.UndefOr[String] = js.undefined
  var lineWiseCopyCut: js.UndefOr[Boolean] = js.undefined
  var lineWrap: js.UndefOr[off | on | wordWrapColumn | bounded] = js.undefined
  var matchBrackets: js.UndefOr[Boolean] = js.undefined
  var mode: js.UndefOr[String | IMode] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var rulers: js.UndefOr[js.Array[Double]] = js.undefined
  var scrollPastEnd: js.UndefOr[Boolean] = js.undefined
  var scrollbarStyle: js.UndefOr[String] = js.undefined
  var selectionPointer: js.UndefOr[Boolean | String] = js.undefined
  var showCursorWhenSelecting: js.UndefOr[Boolean] = js.undefined
  var smartIndent: js.UndefOr[Boolean] = js.undefined
  var styleActiveLine: js.UndefOr[Boolean | StyleActiveLine] = js.undefined
  var styleSelectedText: js.UndefOr[Boolean] = js.undefined
  var tabSize: js.UndefOr[Double] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
  var wordWrapColumn: js.UndefOr[Double] = js.undefined
}

object PartialIConfig {
  @scala.inline
  def apply(
    autoClosingBrackets: js.UndefOr[Boolean] = js.undefined,
    codeFolding: js.UndefOr[Boolean] = js.undefined,
    coverGutterNextToScrollbar: js.UndefOr[Boolean] = js.undefined,
    dragDrop: js.UndefOr[Boolean] = js.undefined,
    electricChars: js.UndefOr[Boolean] = js.undefined,
    extraKeys: js.Any = null,
    fixedGutter: js.UndefOr[Boolean] = js.undefined,
    foldGutter: js.UndefOr[Boolean] = js.undefined,
    fontFamily: String = null,
    fontSize: Int | Double = null,
    gutters: js.Array[String] = null,
    insertSpaces: js.UndefOr[Boolean] = js.undefined,
    keyMap: String = null,
    lineHeight: Int | Double = null,
    lineNumbers: js.UndefOr[Boolean] = js.undefined,
    lineSeparator: String = null,
    lineWiseCopyCut: js.UndefOr[Boolean] = js.undefined,
    lineWrap: off | on | wordWrapColumn | bounded = null,
    matchBrackets: js.UndefOr[Boolean] = js.undefined,
    mode: String | IMode = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    rulers: js.Array[Double] = null,
    scrollPastEnd: js.UndefOr[Boolean] = js.undefined,
    scrollbarStyle: String = null,
    selectionPointer: Boolean | String = null,
    showCursorWhenSelecting: js.UndefOr[Boolean] = js.undefined,
    smartIndent: js.UndefOr[Boolean] = js.undefined,
    styleActiveLine: Boolean | StyleActiveLine = null,
    styleSelectedText: js.UndefOr[Boolean] = js.undefined,
    tabSize: Int | Double = null,
    theme: String = null,
    wordWrapColumn: Int | Double = null
  ): PartialIConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoClosingBrackets)) __obj.updateDynamic("autoClosingBrackets")(autoClosingBrackets.asInstanceOf[js.Any])
    if (!js.isUndefined(codeFolding)) __obj.updateDynamic("codeFolding")(codeFolding.asInstanceOf[js.Any])
    if (!js.isUndefined(coverGutterNextToScrollbar)) __obj.updateDynamic("coverGutterNextToScrollbar")(coverGutterNextToScrollbar.asInstanceOf[js.Any])
    if (!js.isUndefined(dragDrop)) __obj.updateDynamic("dragDrop")(dragDrop.asInstanceOf[js.Any])
    if (!js.isUndefined(electricChars)) __obj.updateDynamic("electricChars")(electricChars.asInstanceOf[js.Any])
    if (extraKeys != null) __obj.updateDynamic("extraKeys")(extraKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedGutter)) __obj.updateDynamic("fixedGutter")(fixedGutter.asInstanceOf[js.Any])
    if (!js.isUndefined(foldGutter)) __obj.updateDynamic("foldGutter")(foldGutter.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (gutters != null) __obj.updateDynamic("gutters")(gutters.asInstanceOf[js.Any])
    if (!js.isUndefined(insertSpaces)) __obj.updateDynamic("insertSpaces")(insertSpaces.asInstanceOf[js.Any])
    if (keyMap != null) __obj.updateDynamic("keyMap")(keyMap.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(lineNumbers)) __obj.updateDynamic("lineNumbers")(lineNumbers.asInstanceOf[js.Any])
    if (lineSeparator != null) __obj.updateDynamic("lineSeparator")(lineSeparator.asInstanceOf[js.Any])
    if (!js.isUndefined(lineWiseCopyCut)) __obj.updateDynamic("lineWiseCopyCut")(lineWiseCopyCut.asInstanceOf[js.Any])
    if (lineWrap != null) __obj.updateDynamic("lineWrap")(lineWrap.asInstanceOf[js.Any])
    if (!js.isUndefined(matchBrackets)) __obj.updateDynamic("matchBrackets")(matchBrackets.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (rulers != null) __obj.updateDynamic("rulers")(rulers.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollPastEnd)) __obj.updateDynamic("scrollPastEnd")(scrollPastEnd.asInstanceOf[js.Any])
    if (scrollbarStyle != null) __obj.updateDynamic("scrollbarStyle")(scrollbarStyle.asInstanceOf[js.Any])
    if (selectionPointer != null) __obj.updateDynamic("selectionPointer")(selectionPointer.asInstanceOf[js.Any])
    if (!js.isUndefined(showCursorWhenSelecting)) __obj.updateDynamic("showCursorWhenSelecting")(showCursorWhenSelecting.asInstanceOf[js.Any])
    if (!js.isUndefined(smartIndent)) __obj.updateDynamic("smartIndent")(smartIndent.asInstanceOf[js.Any])
    if (styleActiveLine != null) __obj.updateDynamic("styleActiveLine")(styleActiveLine.asInstanceOf[js.Any])
    if (!js.isUndefined(styleSelectedText)) __obj.updateDynamic("styleSelectedText")(styleSelectedText.asInstanceOf[js.Any])
    if (tabSize != null) __obj.updateDynamic("tabSize")(tabSize.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (wordWrapColumn != null) __obj.updateDynamic("wordWrapColumn")(wordWrapColumn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialIConfig]
  }
}

