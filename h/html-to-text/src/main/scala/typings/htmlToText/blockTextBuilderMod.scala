package typings.htmlToText

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blockTextBuilderMod {
  
  trait AddInlineOptions extends StObject {
    
    var noWordTransform: js.UndefOr[Boolean] = js.undefined
  }
  object AddInlineOptions {
    
    inline def apply(): AddInlineOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddInlineOptions]
    }
    
    extension [Self <: AddInlineOptions](x: Self) {
      
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
    def addInline(str: String, noWordTransform: Boolean): Unit = js.native
    
    /**
      * Add a line break into currently built block.
      */
    def addLineBreak(): Unit = js.native
    
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
    def closeBlock(trailingLineBreaks: Double): Unit = js.native
    def closeBlock(trailingLineBreaks: Double, blockTransform: BlockTransformer): Unit = js.native
    def closeBlock(trailingLineBreaks: Unit, blockTransform: BlockTransformer): Unit = js.native
    
    /**
      * Finalize currently built table and add the rendered text to the parent block.
      */
    def closeTable(): Unit = js.native
    def closeTable(closeTableOptions: CloseTableOptions): Unit = js.native
    def closeTable(colSpacing: Double): Unit = js.native
    def closeTable(colSpacing: Double, rowSpacing: Double): Unit = js.native
    def closeTable(colSpacing: Double, rowSpacing: Double, leadingLineBreaks: Double): Unit = js.native
    def closeTable(colSpacing: Double, rowSpacing: Double, leadingLineBreaks: Double, trailingLineBreaks: Double): Unit = js.native
    def closeTable(colSpacing: Double, rowSpacing: Double, leadingLineBreaks: Unit, trailingLineBreaks: Double): Unit = js.native
    def closeTable(colSpacing: Double, rowSpacing: Unit, leadingLineBreaks: Double): Unit = js.native
    def closeTable(colSpacing: Double, rowSpacing: Unit, leadingLineBreaks: Double, trailingLineBreaks: Double): Unit = js.native
    def closeTable(colSpacing: Double, rowSpacing: Unit, leadingLineBreaks: Unit, trailingLineBreaks: Double): Unit = js.native
    def closeTable(colSpacing: Unit, rowSpacing: Double): Unit = js.native
    def closeTable(colSpacing: Unit, rowSpacing: Double, leadingLineBreaks: Double): Unit = js.native
    def closeTable(colSpacing: Unit, rowSpacing: Double, leadingLineBreaks: Double, trailingLineBreaks: Double): Unit = js.native
    def closeTable(colSpacing: Unit, rowSpacing: Double, leadingLineBreaks: Unit, trailingLineBreaks: Double): Unit = js.native
    def closeTable(colSpacing: Unit, rowSpacing: Unit, leadingLineBreaks: Double): Unit = js.native
    def closeTable(colSpacing: Unit, rowSpacing: Unit, leadingLineBreaks: Double, trailingLineBreaks: Double): Unit = js.native
    def closeTable(colSpacing: Unit, rowSpacing: Unit, leadingLineBreaks: Unit, trailingLineBreaks: Double): Unit = js.native
    
    /**
      * Finalize currently built table cell and add it to parent table row's cells.
      */
    def closeTableCell(): Unit = js.native
    def closeTableCell(closeTableCellOptions: CloseTableCellOptions): Unit = js.native
    def closeTableCell(colspan: Double): Unit = js.native
    def closeTableCell(colspan: Double, rowspan: Double): Unit = js.native
    def closeTableCell(colspan: Unit, rowspan: Double): Unit = js.native
    
    /**
      * Finalize currently built table row and add it to parent table's rows.
      */
    def closeTableRow(): Unit = js.native
    
    /**
      * Start building a new block.
      */
    def openBlock(): Unit = js.native
    def openBlock(leadingLineBreaks: Double): Unit = js.native
    def openBlock(leadingLineBreaks: Double, reservedLineLength: Double): Unit = js.native
    def openBlock(leadingLineBreaks: Double, reservedLineLength: Double, isPre: Boolean): Unit = js.native
    def openBlock(leadingLineBreaks: Double, reservedLineLength: Unit, isPre: Boolean): Unit = js.native
    def openBlock(leadingLineBreaks: Unit, reservedLineLength: Double): Unit = js.native
    def openBlock(leadingLineBreaks: Unit, reservedLineLength: Double, isPre: Boolean): Unit = js.native
    def openBlock(leadingLineBreaks: Unit, reservedLineLength: Unit, isPre: Boolean): Unit = js.native
    def openBlock(openBlockOptions: OpenBlockOptions): Unit = js.native
    
    /**
      * Start building a table.
      */
    def openTable(): Unit = js.native
    
    /**
      * Start building a table cell.
      */
    def openTableCell(): Unit = js.native
    def openTableCell(maxColumnWidth: Double): Unit = js.native
    def openTableCell(openTableCellOptions: OpenTableCellOptions): Unit = js.native
    
    /**
      * Start building a table row.
      */
    def openTableRow(): Unit = js.native
    
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
    
    extension [Self <: CloseBlockOptions](x: Self) {
      
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
    
    extension [Self <: CloseTableCellOptions](x: Self) {
      
      inline def setColspan(value: Double): Self = StObject.set(x, "colspan", value.asInstanceOf[js.Any])
      
      inline def setColspanUndefined: Self = StObject.set(x, "colspan", js.undefined)
      
      inline def setRowspan(value: Double): Self = StObject.set(x, "rowspan", value.asInstanceOf[js.Any])
      
      inline def setRowspanUndefined: Self = StObject.set(x, "rowspan", js.undefined)
    }
  }
  
  trait CloseTableOptions extends StObject {
    
    var colSpacing: js.UndefOr[Double] = js.undefined
    
    var leadingLineBreaks: js.UndefOr[Double] = js.undefined
    
    var rowSpacing: js.UndefOr[Double] = js.undefined
    
    var trailingLineBreaks: js.UndefOr[Double] = js.undefined
  }
  object CloseTableOptions {
    
    inline def apply(): CloseTableOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CloseTableOptions]
    }
    
    extension [Self <: CloseTableOptions](x: Self) {
      
      inline def setColSpacing(value: Double): Self = StObject.set(x, "colSpacing", value.asInstanceOf[js.Any])
      
      inline def setColSpacingUndefined: Self = StObject.set(x, "colSpacing", js.undefined)
      
      inline def setLeadingLineBreaks(value: Double): Self = StObject.set(x, "leadingLineBreaks", value.asInstanceOf[js.Any])
      
      inline def setLeadingLineBreaksUndefined: Self = StObject.set(x, "leadingLineBreaks", js.undefined)
      
      inline def setRowSpacing(value: Double): Self = StObject.set(x, "rowSpacing", value.asInstanceOf[js.Any])
      
      inline def setRowSpacingUndefined: Self = StObject.set(x, "rowSpacing", js.undefined)
      
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
    
    extension [Self <: OpenBlockOptions](x: Self) {
      
      inline def setIsPre(value: Boolean): Self = StObject.set(x, "isPre", value.asInstanceOf[js.Any])
      
      inline def setIsPreUndefined: Self = StObject.set(x, "isPre", js.undefined)
      
      inline def setLeadingLineBreaks(value: Double): Self = StObject.set(x, "leadingLineBreaks", value.asInstanceOf[js.Any])
      
      inline def setLeadingLineBreaksUndefined: Self = StObject.set(x, "leadingLineBreaks", js.undefined)
      
      inline def setReservedLineLength(value: Double): Self = StObject.set(x, "reservedLineLength", value.asInstanceOf[js.Any])
      
      inline def setReservedLineLengthUndefined: Self = StObject.set(x, "reservedLineLength", js.undefined)
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
    
    extension [Self <: OpenTableCellOptions](x: Self) {
      
      inline def setMaxColumnWidth(value: Double): Self = StObject.set(x, "maxColumnWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxColumnWidthUndefined: Self = StObject.set(x, "maxColumnWidth", js.undefined)
    }
  }
}
