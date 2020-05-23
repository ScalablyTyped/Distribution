package typings.jupyterlabCodeeditor.anon

import typings.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.bounded
import typings.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.off
import typings.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.on
import typings.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.wordWrapColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@jupyterlab/codeeditor.@jupyterlab/codeeditor.CodeEditor.IConfig> */
trait PartialIConfig extends js.Object {
  var autoClosingBrackets: js.UndefOr[Boolean] = js.undefined
  var codeFolding: js.UndefOr[Boolean] = js.undefined
  var fontFamily: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[Double] = js.undefined
  var insertSpaces: js.UndefOr[Boolean] = js.undefined
  var lineHeight: js.UndefOr[Double] = js.undefined
  var lineNumbers: js.UndefOr[Boolean] = js.undefined
  var lineWrap: js.UndefOr[off | on | wordWrapColumn | bounded] = js.undefined
  var matchBrackets: js.UndefOr[Boolean] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var rulers: js.UndefOr[js.Array[Double]] = js.undefined
  var tabSize: js.UndefOr[Double] = js.undefined
  var wordWrapColumn: js.UndefOr[Double] = js.undefined
}

object PartialIConfig {
  @scala.inline
  def apply(
    autoClosingBrackets: js.UndefOr[Boolean] = js.undefined,
    codeFolding: js.UndefOr[Boolean] = js.undefined,
    fontFamily: String = null,
    fontSize: js.UndefOr[Double] = js.undefined,
    insertSpaces: js.UndefOr[Boolean] = js.undefined,
    lineHeight: js.UndefOr[Double] = js.undefined,
    lineNumbers: js.UndefOr[Boolean] = js.undefined,
    lineWrap: off | on | wordWrapColumn | bounded = null,
    matchBrackets: js.UndefOr[Boolean] = js.undefined,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    rulers: js.Array[Double] = null,
    tabSize: js.UndefOr[Double] = js.undefined,
    wordWrapColumn: js.UndefOr[Double] = js.undefined
  ): PartialIConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoClosingBrackets)) __obj.updateDynamic("autoClosingBrackets")(autoClosingBrackets.get.asInstanceOf[js.Any])
    if (!js.isUndefined(codeFolding)) __obj.updateDynamic("codeFolding")(codeFolding.get.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (!js.isUndefined(fontSize)) __obj.updateDynamic("fontSize")(fontSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(insertSpaces)) __obj.updateDynamic("insertSpaces")(insertSpaces.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lineHeight)) __obj.updateDynamic("lineHeight")(lineHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lineNumbers)) __obj.updateDynamic("lineNumbers")(lineNumbers.get.asInstanceOf[js.Any])
    if (lineWrap != null) __obj.updateDynamic("lineWrap")(lineWrap.asInstanceOf[js.Any])
    if (!js.isUndefined(matchBrackets)) __obj.updateDynamic("matchBrackets")(matchBrackets.get.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.get.asInstanceOf[js.Any])
    if (rulers != null) __obj.updateDynamic("rulers")(rulers.asInstanceOf[js.Any])
    if (!js.isUndefined(tabSize)) __obj.updateDynamic("tabSize")(tabSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wordWrapColumn)) __obj.updateDynamic("wordWrapColumn")(wordWrapColumn.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialIConfig]
  }
}

