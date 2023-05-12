package typings.htmlToText

import typings.htmlToText.anon.Formatters
import typings.htmlToText.anon.Prefix
import typings.htmlToText.anon.TrailingLineBreaks
import typings.htmlToText.htmlToTextStrings.left
import typings.htmlToText.htmlToTextStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBlockTextBuilderMod {
  
  trait AddInlineOptions extends StObject {
    
    var noWordTransform: js.UndefOr[Boolean] = js.undefined
  }
  object AddInlineOptions {
    
    inline def apply(): AddInlineOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddInlineOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AddInlineOptions] (val x: Self) extends AnyVal {
      
      inline def setNoWordTransform(value: Boolean): Self = StObject.set(x, "noWordTransform", value.asInstanceOf[js.Any])
      
      inline def setNoWordTransformUndefined: Self = StObject.set(x, "noWordTransform", js.undefined)
    }
  }
  
  @js.native
  trait BlockTextBuilder extends StObject {
    
    /**
      * Add a node inline into the currently built block.
      */
    def addInline(str: String): Unit = js.native
    def addInline(str: String, addInlineOptions: AddInlineOptions): Unit = js.native
    
    /**
      * Add a line break into currently built block.
      */
    def addLineBreak(): Unit = js.native
    
    /**
      * Add a string inline into the currently built block.
      *
      * Use this for markup elements that don't have to adhere to text layout rules.
      */
    def addLiteral(str: String): Unit = js.native
    
    /**
      * Allow to break line in case directly following text will not fit.
      */
    def addWordBreakOpportunity(): Unit = js.native
    
    /**
      * Finalize currently built block, add it's content to the parent block.
      *
      * A function to transform the block text before adding to the parent block.
      * This happens after word wrap and should be used in combination with reserved line length
      * in order to keep line lengths correct.
      * Used for whole block markup.
      */
    def closeBlock(): Unit = js.native
    def closeBlock(closeBlockOptions: CloseBlockOptions): Unit = js.native
    
    /**
      * Finalize currently built list, add it's content to the parent block.
      */
    def closeList(param0: TrailingLineBreaks): Unit = js.native
    
    /**
      * Finalize currently built list item, add it's content to the parent list.
      */
    def closeListItem(): Unit = js.native
    
    /**
      * Finalize currently built table and add the rendered text to the parent block.
      */
    def closeTable(): Unit = js.native
    def closeTable(closeTableOptions: CloseTableOptions): Unit = js.native
    
    /**
      * Finalize currently built table cell and add it to parent table row's cells.
      */
    def closeTableCell(): Unit = js.native
    def closeTableCell(closeTableCellOptions: CloseTableCellOptions): Unit = js.native
    
    /**
      * Finalize currently built table row and add it to parent table's rows.
      */
    def closeTableRow(): Unit = js.native
    
    /**
      * Start building a new block.
      */
    def openBlock(): Unit = js.native
    def openBlock(openBlockOptions: OpenBlockOptions): Unit = js.native
    
    /**
      * Start building a new list.
      */
    def openList(): Unit = js.native
    def openList(openListOptions: OpenListOptions): Unit = js.native
    
    /**
      * Start building a new list item.
      */
    def openListItem(param0: Prefix): Unit = js.native
    
    /**
      * Start building a table.
      */
    def openTable(): Unit = js.native
    
    /**
      * Start building a table cell.
      */
    def openTableCell(): Unit = js.native
    def openTableCell(openTableCellOptions: OpenTableCellOptions): Unit = js.native
    
    /**
      * Start building a table row.
      */
    def openTableRow(): Unit = js.native
    
    /**
      * Speciallized access to formatters, including default ones.  It is recommended to
      * use the css style selectors.  If formatting depends on actual content, this
      * provides access to user and default formatters.  Setting of options is left up
      * to the caller.  See the test driver for sample usage.
      */
    var options: Formatters = js.native
    
    /**
      * Remove a function from the word transformations stack.
      */
    def popWordTransform(): js.UndefOr[js.Function1[/* str */ String, String]] = js.native
    
    /**
      * Put a word-by-word transform function onto the transformations stack.
      *
      * Mainly used for uppercasing. Can be bypassed to add unformatted text such as URLs.
      *
      * Word transformations applied before wrapping.
      */
    def pushWordTransform(wordTransform: js.Function1[/* str */ String, String]): Unit = js.native
    
    /**
      * Ignore wordwrap option in followup inline additions and disable automatic wrapping.
      */
    def startNoWrap(): Unit = js.native
    
    /**
      * Return automatic wrapping to behavior defined by options.
      */
    def stopNoWrap(): Unit = js.native
  }
  
  type BlockTransformer = js.Function1[/* str */ String, String]
  
  trait CloseBlockOptions extends StObject {
    
    var blockTransform: js.UndefOr[BlockTransformer] = js.undefined
    
    var trailingLineBreaks: js.UndefOr[Double] = js.undefined
  }
  object CloseBlockOptions {
    
    inline def apply(): CloseBlockOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CloseBlockOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CloseBlockOptions] (val x: Self) extends AnyVal {
      
      inline def setBlockTransform(value: /* str */ String => String): Self = StObject.set(x, "blockTransform", js.Any.fromFunction1(value))
      
      inline def setBlockTransformUndefined: Self = StObject.set(x, "blockTransform", js.undefined)
      
      inline def setTrailingLineBreaks(value: Double): Self = StObject.set(x, "trailingLineBreaks", value.asInstanceOf[js.Any])
      
      inline def setTrailingLineBreaksUndefined: Self = StObject.set(x, "trailingLineBreaks", js.undefined)
    }
  }
  
  trait CloseTableCellOptions extends StObject {
    
    var colspan: js.UndefOr[Double] = js.undefined
    
    var rowspan: js.UndefOr[Double] = js.undefined
  }
  object CloseTableCellOptions {
    
    inline def apply(): CloseTableCellOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CloseTableCellOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CloseTableCellOptions] (val x: Self) extends AnyVal {
      
      inline def setColspan(value: Double): Self = StObject.set(x, "colspan", value.asInstanceOf[js.Any])
      
      inline def setColspanUndefined: Self = StObject.set(x, "colspan", js.undefined)
      
      inline def setRowspan(value: Double): Self = StObject.set(x, "rowspan", value.asInstanceOf[js.Any])
      
      inline def setRowspanUndefined: Self = StObject.set(x, "rowspan", js.undefined)
    }
  }
  
  trait CloseTableOptions extends StObject {
    
    var leadingLineBreaks: js.UndefOr[Double] = js.undefined
    
    def tableToString(cells: js.Array[js.Array[TablePrinterCell]]): String
    @JSName("tableToString")
    var tableToString_Original: TablePrinter
    
    var trailingLineBreaks: js.UndefOr[Double] = js.undefined
  }
  object CloseTableOptions {
    
    inline def apply(tableToString: /* cells */ js.Array[js.Array[TablePrinterCell]] => String): CloseTableOptions = {
      val __obj = js.Dynamic.literal(tableToString = js.Any.fromFunction1(tableToString))
      __obj.asInstanceOf[CloseTableOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CloseTableOptions] (val x: Self) extends AnyVal {
      
      inline def setLeadingLineBreaks(value: Double): Self = StObject.set(x, "leadingLineBreaks", value.asInstanceOf[js.Any])
      
      inline def setLeadingLineBreaksUndefined: Self = StObject.set(x, "leadingLineBreaks", js.undefined)
      
      inline def setTableToString(value: /* cells */ js.Array[js.Array[TablePrinterCell]] => String): Self = StObject.set(x, "tableToString", js.Any.fromFunction1(value))
      
      inline def setTrailingLineBreaks(value: Double): Self = StObject.set(x, "trailingLineBreaks", value.asInstanceOf[js.Any])
      
      inline def setTrailingLineBreaksUndefined: Self = StObject.set(x, "trailingLineBreaks", js.undefined)
    }
  }
  
  trait OpenBlockOptions extends StObject {
    
    var isPre: js.UndefOr[Boolean] = js.undefined
    
    var leadingLineBreaks: js.UndefOr[Double] = js.undefined
    
    var reservedLineLength: js.UndefOr[Double] = js.undefined
  }
  object OpenBlockOptions {
    
    inline def apply(): OpenBlockOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenBlockOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OpenBlockOptions] (val x: Self) extends AnyVal {
      
      inline def setIsPre(value: Boolean): Self = StObject.set(x, "isPre", value.asInstanceOf[js.Any])
      
      inline def setIsPreUndefined: Self = StObject.set(x, "isPre", js.undefined)
      
      inline def setLeadingLineBreaks(value: Double): Self = StObject.set(x, "leadingLineBreaks", value.asInstanceOf[js.Any])
      
      inline def setLeadingLineBreaksUndefined: Self = StObject.set(x, "leadingLineBreaks", js.undefined)
      
      inline def setReservedLineLength(value: Double): Self = StObject.set(x, "reservedLineLength", value.asInstanceOf[js.Any])
      
      inline def setReservedLineLengthUndefined: Self = StObject.set(x, "reservedLineLength", js.undefined)
    }
  }
  
  trait OpenListOptions extends StObject {
    
    var interRowLineBreaks: js.UndefOr[Double] = js.undefined
    
    var leadingLineBreaks: js.UndefOr[Double] = js.undefined
    
    var maxPrefixLength: js.UndefOr[Double] = js.undefined
    
    var prefixAlign: js.UndefOr[left | right] = js.undefined
  }
  object OpenListOptions {
    
    inline def apply(): OpenListOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenListOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OpenListOptions] (val x: Self) extends AnyVal {
      
      inline def setInterRowLineBreaks(value: Double): Self = StObject.set(x, "interRowLineBreaks", value.asInstanceOf[js.Any])
      
      inline def setInterRowLineBreaksUndefined: Self = StObject.set(x, "interRowLineBreaks", js.undefined)
      
      inline def setLeadingLineBreaks(value: Double): Self = StObject.set(x, "leadingLineBreaks", value.asInstanceOf[js.Any])
      
      inline def setLeadingLineBreaksUndefined: Self = StObject.set(x, "leadingLineBreaks", js.undefined)
      
      inline def setMaxPrefixLength(value: Double): Self = StObject.set(x, "maxPrefixLength", value.asInstanceOf[js.Any])
      
      inline def setMaxPrefixLengthUndefined: Self = StObject.set(x, "maxPrefixLength", js.undefined)
      
      inline def setPrefixAlign(value: left | right): Self = StObject.set(x, "prefixAlign", value.asInstanceOf[js.Any])
      
      inline def setPrefixAlignUndefined: Self = StObject.set(x, "prefixAlign", js.undefined)
    }
  }
  
  trait OpenTableCellOptions extends StObject {
    
    var maxColumnWidth: js.UndefOr[Double] = js.undefined
  }
  object OpenTableCellOptions {
    
    inline def apply(): OpenTableCellOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenTableCellOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OpenTableCellOptions] (val x: Self) extends AnyVal {
      
      inline def setMaxColumnWidth(value: Double): Self = StObject.set(x, "maxColumnWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxColumnWidthUndefined: Self = StObject.set(x, "maxColumnWidth", js.undefined)
    }
  }
  
  type TablePrinter = js.Function1[/* cells */ js.Array[js.Array[TablePrinterCell]], String]
  
  trait TablePrinterCell extends StObject {
    
    var colspan: Double
    
    var rowspan: Double
    
    var text: String
  }
  object TablePrinterCell {
    
    inline def apply(colspan: Double, rowspan: Double, text: String): TablePrinterCell = {
      val __obj = js.Dynamic.literal(colspan = colspan.asInstanceOf[js.Any], rowspan = rowspan.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[TablePrinterCell]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TablePrinterCell] (val x: Self) extends AnyVal {
      
      inline def setColspan(value: Double): Self = StObject.set(x, "colspan", value.asInstanceOf[js.Any])
      
      inline def setRowspan(value: Double): Self = StObject.set(x, "rowspan", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
