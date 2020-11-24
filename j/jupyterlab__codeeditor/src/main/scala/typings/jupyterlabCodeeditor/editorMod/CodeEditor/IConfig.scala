package typings.jupyterlabCodeeditor.editorMod.CodeEditor

import typings.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.bounded
import typings.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.off
import typings.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.on
import typings.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.wordWrapColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The configuration options for an editor.
  */
@js.native
trait IConfig extends js.Object {
  
  /**
    * Whether to automatically close brackets after opening them.
    */
  var autoClosingBrackets: Boolean = js.native
  
  /**
    * Wheter to allow code folding
    */
  var codeFolding: Boolean = js.native
  
  /**
    * User preferred font family for text editors.
    */
  var fontFamily: String | Null = js.native
  
  /**
    * User preferred size in pixel of the font used in text editors.
    */
  var fontSize: Double | Null = js.native
  
  /**
    * Whether the editor should handle paste events.
    */
  var handlePaste: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to insert spaces when pressing Tab.
    */
  var insertSpaces: Boolean = js.native
  
  /**
    * User preferred text line height, as a multiplier of font size.
    */
  var lineHeight: Double | Null = js.native
  
  /**
    * Whether line numbers should be displayed.
    */
  var lineNumbers: Boolean = js.native
  
  /**
    * Control the line wrapping of the editor. Possible values are:
    * - "off", lines will never wrap.
    * - "on", lines will wrap at the viewport border.
    * - "wordWrapColumn", lines will wrap at `wordWrapColumn`.
    * - "bounded", lines will wrap at minimum between viewport width and wordWrapColumn.
    */
  var lineWrap: off | on | wordWrapColumn | bounded = js.native
  
  /**
    * Whether to highlight matching brackets when one of them is selected.
    */
  var matchBrackets: Boolean = js.native
  
  /**
    * Whether the editor is read-only.
    */
  var readOnly: Boolean = js.native
  
  /**
    * Column index at which rulers should be added.
    */
  var rulers: js.Array[Double] = js.native
  
  /**
    * The number of spaces a tab is equal to.
    */
  var tabSize: Double = js.native
  
  /**
    * The column where to break text line.
    */
  var wordWrapColumn: Double = js.native
}
object IConfig {
  
  @scala.inline
  def apply(
    autoClosingBrackets: Boolean,
    codeFolding: Boolean,
    insertSpaces: Boolean,
    lineNumbers: Boolean,
    lineWrap: off | on | wordWrapColumn | bounded,
    matchBrackets: Boolean,
    readOnly: Boolean,
    rulers: js.Array[Double],
    tabSize: Double,
    wordWrapColumn: Double
  ): IConfig = {
    val __obj = js.Dynamic.literal(autoClosingBrackets = autoClosingBrackets.asInstanceOf[js.Any], codeFolding = codeFolding.asInstanceOf[js.Any], insertSpaces = insertSpaces.asInstanceOf[js.Any], lineNumbers = lineNumbers.asInstanceOf[js.Any], lineWrap = lineWrap.asInstanceOf[js.Any], matchBrackets = matchBrackets.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], rulers = rulers.asInstanceOf[js.Any], tabSize = tabSize.asInstanceOf[js.Any], wordWrapColumn = wordWrapColumn.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConfig]
  }
  
  @scala.inline
  implicit class IConfigOps[Self <: IConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoClosingBrackets(value: Boolean): Self = this.set("autoClosingBrackets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeFolding(value: Boolean): Self = this.set("codeFolding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertSpaces(value: Boolean): Self = this.set("insertSpaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineNumbers(value: Boolean): Self = this.set("lineNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineWrap(value: off | on | wordWrapColumn | bounded): Self = this.set("lineWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchBrackets(value: Boolean): Self = this.set("matchBrackets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulersVarargs(value: Double*): Self = this.set("rulers", js.Array(value :_*))
    
    @scala.inline
    def setRulers(value: js.Array[Double]): Self = this.set("rulers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabSize(value: Double): Self = this.set("tabSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordWrapColumn(value: Double): Self = this.set("wordWrapColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamilyNull: Self = this.set("fontFamily", null)
    
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeNull: Self = this.set("fontSize", null)
    
    @scala.inline
    def setHandlePaste(value: Boolean): Self = this.set("handlePaste", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandlePaste: Self = this.set("handlePaste", js.undefined)
    
    @scala.inline
    def setLineHeight(value: Double): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineHeightNull: Self = this.set("lineHeight", null)
  }
}
