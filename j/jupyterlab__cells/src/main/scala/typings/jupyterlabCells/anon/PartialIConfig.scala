package typings.jupyterlabCells.anon

import typings.jupyterlabCells.jupyterlabCellsStrings.bounded
import typings.jupyterlabCells.jupyterlabCellsStrings.off
import typings.jupyterlabCells.jupyterlabCellsStrings.on
import typings.jupyterlabCells.jupyterlabCellsStrings.wordWrapColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@jupyterlab/codeeditor.@jupyterlab/codeeditor.CodeEditor.IConfig> */
@js.native
trait PartialIConfig extends js.Object {
  
  var autoClosingBrackets: js.UndefOr[Boolean] = js.native
  
  var codeFolding: js.UndefOr[Boolean] = js.native
  
  var fontFamily: js.UndefOr[String | Null] = js.native
  
  var fontSize: js.UndefOr[Double | Null] = js.native
  
  var handlePaste: js.UndefOr[Boolean] = js.native
  
  var insertSpaces: js.UndefOr[Boolean] = js.native
  
  var lineHeight: js.UndefOr[Double | Null] = js.native
  
  var lineNumbers: js.UndefOr[Boolean] = js.native
  
  var lineWrap: js.UndefOr[off | on | wordWrapColumn | bounded] = js.native
  
  var matchBrackets: js.UndefOr[Boolean] = js.native
  
  var readOnly: js.UndefOr[Boolean] = js.native
  
  var rulers: js.UndefOr[js.Array[Double]] = js.native
  
  var tabSize: js.UndefOr[Double] = js.native
  
  var wordWrapColumn: js.UndefOr[Double] = js.native
}
object PartialIConfig {
  
  @scala.inline
  def apply(): PartialIConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIConfig]
  }
  
  @scala.inline
  implicit class PartialIConfigOps[Self <: PartialIConfig] (val x: Self) extends AnyVal {
    
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
    def deleteAutoClosingBrackets: Self = this.set("autoClosingBrackets", js.undefined)
    
    @scala.inline
    def setCodeFolding(value: Boolean): Self = this.set("codeFolding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodeFolding: Self = this.set("codeFolding", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    
    @scala.inline
    def setFontFamilyNull: Self = this.set("fontFamily", null)
    
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setFontSizeNull: Self = this.set("fontSize", null)
    
    @scala.inline
    def setHandlePaste(value: Boolean): Self = this.set("handlePaste", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandlePaste: Self = this.set("handlePaste", js.undefined)
    
    @scala.inline
    def setInsertSpaces(value: Boolean): Self = this.set("insertSpaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertSpaces: Self = this.set("insertSpaces", js.undefined)
    
    @scala.inline
    def setLineHeight(value: Double): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineHeight: Self = this.set("lineHeight", js.undefined)
    
    @scala.inline
    def setLineHeightNull: Self = this.set("lineHeight", null)
    
    @scala.inline
    def setLineNumbers(value: Boolean): Self = this.set("lineNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineNumbers: Self = this.set("lineNumbers", js.undefined)
    
    @scala.inline
    def setLineWrap(value: off | on | wordWrapColumn | bounded): Self = this.set("lineWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineWrap: Self = this.set("lineWrap", js.undefined)
    
    @scala.inline
    def setMatchBrackets(value: Boolean): Self = this.set("matchBrackets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchBrackets: Self = this.set("matchBrackets", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setRulersVarargs(value: Double*): Self = this.set("rulers", js.Array(value :_*))
    
    @scala.inline
    def setRulers(value: js.Array[Double]): Self = this.set("rulers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRulers: Self = this.set("rulers", js.undefined)
    
    @scala.inline
    def setTabSize(value: Double): Self = this.set("tabSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabSize: Self = this.set("tabSize", js.undefined)
    
    @scala.inline
    def setWordWrapColumn(value: Double): Self = this.set("wordWrapColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWordWrapColumn: Self = this.set("wordWrapColumn", js.undefined)
  }
}
