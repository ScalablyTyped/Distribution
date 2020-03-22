package typings.jupyterlabNotebook

import typings.jupyterlabNotebook.jupyterlabNotebookStrings.bounded
import typings.jupyterlabNotebook.jupyterlabNotebookStrings.off
import typings.jupyterlabNotebook.jupyterlabNotebookStrings.on
import typings.jupyterlabNotebook.jupyterlabNotebookStrings.wordWrapColumn
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
    fontSize: Int | Double = null,
    insertSpaces: js.UndefOr[Boolean] = js.undefined,
    lineHeight: Int | Double = null,
    lineNumbers: js.UndefOr[Boolean] = js.undefined,
    lineWrap: off | on | wordWrapColumn | bounded = null,
    matchBrackets: js.UndefOr[Boolean] = js.undefined,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    rulers: js.Array[Double] = null,
    tabSize: Int | Double = null,
    wordWrapColumn: Int | Double = null
  ): PartialIConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoClosingBrackets)) __obj.updateDynamic("autoClosingBrackets")(autoClosingBrackets.asInstanceOf[js.Any])
    if (!js.isUndefined(codeFolding)) __obj.updateDynamic("codeFolding")(codeFolding.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (!js.isUndefined(insertSpaces)) __obj.updateDynamic("insertSpaces")(insertSpaces.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(lineNumbers)) __obj.updateDynamic("lineNumbers")(lineNumbers.asInstanceOf[js.Any])
    if (lineWrap != null) __obj.updateDynamic("lineWrap")(lineWrap.asInstanceOf[js.Any])
    if (!js.isUndefined(matchBrackets)) __obj.updateDynamic("matchBrackets")(matchBrackets.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (rulers != null) __obj.updateDynamic("rulers")(rulers.asInstanceOf[js.Any])
    if (tabSize != null) __obj.updateDynamic("tabSize")(tabSize.asInstanceOf[js.Any])
    if (wordWrapColumn != null) __obj.updateDynamic("wordWrapColumn")(wordWrapColumn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialIConfig]
  }
}

