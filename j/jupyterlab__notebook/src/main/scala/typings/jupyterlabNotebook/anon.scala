package typings.jupyterlabNotebook

import typings.jupyterlabNotebook.jupyterlabNotebookStrings.bounded
import typings.jupyterlabNotebook.jupyterlabNotebookStrings.off
import typings.jupyterlabNotebook.jupyterlabNotebookStrings.on
import typings.jupyterlabNotebook.jupyterlabNotebookStrings.wordWrapColumn
import typings.jupyterlabNotebook.widgetMod.Notebook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Anchor extends StObject {
    
    var anchor: Double = js.native
    
    var head: Double = js.native
  }
  object Anchor {
    
    @scala.inline
    def apply(anchor: Double, head: Double): Anchor = {
      val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any])
      __obj.asInstanceOf[Anchor]
    }
    
    @scala.inline
    implicit class AnchorMutableBuilder[Self <: Anchor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchor(value: Double): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHead(value: Double): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Cell extends StObject {
    
    var cell: typings.jupyterlabCells.mod.Cell = js.native
    
    var notebook: Notebook = js.native
  }
  object Cell {
    
    @scala.inline
    def apply(cell: typings.jupyterlabCells.mod.Cell, notebook: Notebook): Cell = {
      val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], notebook = notebook.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cell]
    }
    
    @scala.inline
    implicit class CellMutableBuilder[Self <: Cell] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCell(value: typings.jupyterlabCells.mod.Cell): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotebook(value: Notebook): Self = StObject.set(x, "notebook", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Head extends StObject {
    
    var anchor: Null = js.native
    
    var head: Null = js.native
  }
  object Head {
    
    @scala.inline
    def apply(anchor: Null, head: Null): Head = {
      val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any])
      __obj.asInstanceOf[Head]
    }
    
    @scala.inline
    implicit class HeadMutableBuilder[Self <: Head] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchor(value: Null): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHead(value: Null): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@jupyterlab/codeeditor.@jupyterlab/codeeditor.CodeEditor.IConfig> */
  @js.native
  trait PartialIConfig extends StObject {
    
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
    implicit class PartialIConfigMutableBuilder[Self <: PartialIConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoClosingBrackets(value: Boolean): Self = StObject.set(x, "autoClosingBrackets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoClosingBracketsUndefined: Self = StObject.set(x, "autoClosingBrackets", js.undefined)
      
      @scala.inline
      def setCodeFolding(value: Boolean): Self = StObject.set(x, "codeFolding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeFoldingUndefined: Self = StObject.set(x, "codeFolding", js.undefined)
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyNull: Self = StObject.set(x, "fontFamily", null)
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeNull: Self = StObject.set(x, "fontSize", null)
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setHandlePaste(value: Boolean): Self = StObject.set(x, "handlePaste", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandlePasteUndefined: Self = StObject.set(x, "handlePaste", js.undefined)
      
      @scala.inline
      def setInsertSpaces(value: Boolean): Self = StObject.set(x, "insertSpaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsertSpacesUndefined: Self = StObject.set(x, "insertSpaces", js.undefined)
      
      @scala.inline
      def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeightNull: Self = StObject.set(x, "lineHeight", null)
      
      @scala.inline
      def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      @scala.inline
      def setLineNumbers(value: Boolean): Self = StObject.set(x, "lineNumbers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineNumbersUndefined: Self = StObject.set(x, "lineNumbers", js.undefined)
      
      @scala.inline
      def setLineWrap(value: off | on | wordWrapColumn | bounded): Self = StObject.set(x, "lineWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineWrapUndefined: Self = StObject.set(x, "lineWrap", js.undefined)
      
      @scala.inline
      def setMatchBrackets(value: Boolean): Self = StObject.set(x, "matchBrackets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchBracketsUndefined: Self = StObject.set(x, "matchBrackets", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setRulers(value: js.Array[Double]): Self = StObject.set(x, "rulers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulersUndefined: Self = StObject.set(x, "rulers", js.undefined)
      
      @scala.inline
      def setRulersVarargs(value: Double*): Self = StObject.set(x, "rulers", js.Array(value :_*))
      
      @scala.inline
      def setTabSize(value: Double): Self = StObject.set(x, "tabSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabSizeUndefined: Self = StObject.set(x, "tabSize", js.undefined)
      
      @scala.inline
      def setWordWrapColumn(value: Double): Self = StObject.set(x, "wordWrapColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWordWrapColumnUndefined: Self = StObject.set(x, "wordWrapColumn", js.undefined)
    }
  }
}
