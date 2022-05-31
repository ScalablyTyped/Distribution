package typings.jupyterlabNotebook

import typings.jupyterlabNotebook.jupyterlabNotebookStrings.bounded
import typings.jupyterlabNotebook.jupyterlabNotebookStrings.off
import typings.jupyterlabNotebook.jupyterlabNotebookStrings.on
import typings.jupyterlabNotebook.jupyterlabNotebookStrings.wordWrapColumn
import typings.jupyterlabNotebook.widgetMod.Notebook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Anchor extends StObject {
    
    var anchor: Double
    
    var head: Double
  }
  object Anchor {
    
    inline def apply(anchor: Double, head: Double): Anchor = {
      val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any])
      __obj.asInstanceOf[Anchor]
    }
    
    extension [Self <: Anchor](x: Self) {
      
      inline def setAnchor(value: Double): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setHead(value: Double): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
    }
  }
  
  trait Cell extends StObject {
    
    var cell: typings.jupyterlabCells.mod.Cell
    
    var notebook: Notebook
  }
  object Cell {
    
    inline def apply(cell: typings.jupyterlabCells.mod.Cell, notebook: Notebook): Cell = {
      val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], notebook = notebook.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cell]
    }
    
    extension [Self <: Cell](x: Self) {
      
      inline def setCell(value: typings.jupyterlabCells.mod.Cell): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      inline def setNotebook(value: Notebook): Self = StObject.set(x, "notebook", value.asInstanceOf[js.Any])
    }
  }
  
  trait Head extends StObject {
    
    var anchor: Null
    
    var head: Null
  }
  object Head {
    
    inline def apply(anchor: Null, head: Null): Head = {
      val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any])
      __obj.asInstanceOf[Head]
    }
    
    extension [Self <: Head](x: Self) {
      
      inline def setAnchor(value: Null): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setHead(value: Null): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@jupyterlab/codeeditor.@jupyterlab/codeeditor.CodeEditor.IConfig> */
  trait PartialIConfig extends StObject {
    
    var autoClosingBrackets: js.UndefOr[Boolean] = js.undefined
    
    var codeFolding: js.UndefOr[Boolean] = js.undefined
    
    var fontFamily: js.UndefOr[String | Null] = js.undefined
    
    var fontSize: js.UndefOr[Double | Null] = js.undefined
    
    var handlePaste: js.UndefOr[Boolean] = js.undefined
    
    var insertSpaces: js.UndefOr[Boolean] = js.undefined
    
    var lineHeight: js.UndefOr[Double | Null] = js.undefined
    
    var lineNumbers: js.UndefOr[Boolean] = js.undefined
    
    var lineWrap: js.UndefOr[off | on | wordWrapColumn | bounded] = js.undefined
    
    var matchBrackets: js.UndefOr[Boolean] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var rulers: js.UndefOr[js.Array[Double]] = js.undefined
    
    var tabSize: js.UndefOr[Double] = js.undefined
    
    var wordWrapColumn: js.UndefOr[Double] = js.undefined
  }
  object PartialIConfig {
    
    inline def apply(): PartialIConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialIConfig]
    }
    
    extension [Self <: PartialIConfig](x: Self) {
      
      inline def setAutoClosingBrackets(value: Boolean): Self = StObject.set(x, "autoClosingBrackets", value.asInstanceOf[js.Any])
      
      inline def setAutoClosingBracketsUndefined: Self = StObject.set(x, "autoClosingBrackets", js.undefined)
      
      inline def setCodeFolding(value: Boolean): Self = StObject.set(x, "codeFolding", value.asInstanceOf[js.Any])
      
      inline def setCodeFoldingUndefined: Self = StObject.set(x, "codeFolding", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyNull: Self = StObject.set(x, "fontFamily", null)
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeNull: Self = StObject.set(x, "fontSize", null)
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setHandlePaste(value: Boolean): Self = StObject.set(x, "handlePaste", value.asInstanceOf[js.Any])
      
      inline def setHandlePasteUndefined: Self = StObject.set(x, "handlePaste", js.undefined)
      
      inline def setInsertSpaces(value: Boolean): Self = StObject.set(x, "insertSpaces", value.asInstanceOf[js.Any])
      
      inline def setInsertSpacesUndefined: Self = StObject.set(x, "insertSpaces", js.undefined)
      
      inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setLineHeightNull: Self = StObject.set(x, "lineHeight", null)
      
      inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      inline def setLineNumbers(value: Boolean): Self = StObject.set(x, "lineNumbers", value.asInstanceOf[js.Any])
      
      inline def setLineNumbersUndefined: Self = StObject.set(x, "lineNumbers", js.undefined)
      
      inline def setLineWrap(value: off | on | wordWrapColumn | bounded): Self = StObject.set(x, "lineWrap", value.asInstanceOf[js.Any])
      
      inline def setLineWrapUndefined: Self = StObject.set(x, "lineWrap", js.undefined)
      
      inline def setMatchBrackets(value: Boolean): Self = StObject.set(x, "matchBrackets", value.asInstanceOf[js.Any])
      
      inline def setMatchBracketsUndefined: Self = StObject.set(x, "matchBrackets", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRulers(value: js.Array[Double]): Self = StObject.set(x, "rulers", value.asInstanceOf[js.Any])
      
      inline def setRulersUndefined: Self = StObject.set(x, "rulers", js.undefined)
      
      inline def setRulersVarargs(value: Double*): Self = StObject.set(x, "rulers", js.Array(value :_*))
      
      inline def setTabSize(value: Double): Self = StObject.set(x, "tabSize", value.asInstanceOf[js.Any])
      
      inline def setTabSizeUndefined: Self = StObject.set(x, "tabSize", js.undefined)
      
      inline def setWordWrapColumn(value: Double): Self = StObject.set(x, "wordWrapColumn", value.asInstanceOf[js.Any])
      
      inline def setWordWrapColumnUndefined: Self = StObject.set(x, "wordWrapColumn", js.undefined)
    }
  }
}
