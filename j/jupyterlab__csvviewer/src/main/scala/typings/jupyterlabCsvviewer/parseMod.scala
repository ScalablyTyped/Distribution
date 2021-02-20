package typings.jupyterlabCsvviewer

import typings.jupyterlabCsvviewer.parseMod.IParser.IOptions
import typings.jupyterlabCsvviewer.parseMod.IParser.IResults
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseMod {
  
  @JSImport("@jupyterlab/csvviewer/lib/parse", "parseDSV")
  @js.native
  def parseDSV(options: IOptions): IResults = js.native
  
  @JSImport("@jupyterlab/csvviewer/lib/parse", "parseDSVNoQuotes")
  @js.native
  def parseDSVNoQuotes(options: IOptions): IResults = js.native
  
  object IParser {
    
    /**
      * The options for a parser.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * Whether to return column offsets in the offsets array.
        *
        * #### Notes
        * If false, the returned offsets array contains just the row offsets. If
        * true, the returned offsets array contains all column offsets for each
        * column in the rows (i.e., it has nrows*ncols entries). Individual rows
        * will have empty columns added or extra columns merged into the last
        * column if they do not have exactly ncols columns.
        */
      var columnOffsets: Boolean = js.native
      
      /**
        * The data to parse.
        */
      var data: String = js.native
      
      /**
        * The delimiter to use. Defaults to ','.
        */
      var delimiter: js.UndefOr[String] = js.native
      
      /**
        * Maximum number of rows to parse.
        *
        * If this is not given, parsing proceeds to the end of the data.
        */
      var maxRows: js.UndefOr[Double] = js.native
      
      /**
        * Number of columns in each row to parse.
        *
        * #### Notes
        * If this is not given, the ncols defaults to the number of columns in the
        * first row.
        */
      var ncols: js.UndefOr[Double] = js.native
      
      /**
        * The quote character for quoting fields. Defaults to the double quote (").
        *
        * #### Notes
        * As specified in [RFC 4180](https://tools.ietf.org/html/rfc4180), quotes
        * are escaped in a quoted field by doubling them (for example, "a""b" is the field
        * a"b).
        */
      var quote: js.UndefOr[String] = js.native
      
      /**
        * The row delimiter to use. Defaults to '\r\n'.
        */
      var rowDelimiter: js.UndefOr[String] = js.native
      
      /**
        * The starting index in the string for processing. Defaults to 0. This
        * index should be the first character of a new row. This must be less than
        * data.length.
        */
      var startIndex: js.UndefOr[Double] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(columnOffsets: Boolean, data: String): IOptions = {
        val __obj = js.Dynamic.literal(columnOffsets = columnOffsets.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setColumnOffsets(value: Boolean): Self = StObject.set(x, "columnOffsets", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
        
        @scala.inline
        def setMaxRows(value: Double): Self = StObject.set(x, "maxRows", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxRowsUndefined: Self = StObject.set(x, "maxRows", js.undefined)
        
        @scala.inline
        def setNcols(value: Double): Self = StObject.set(x, "ncols", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNcolsUndefined: Self = StObject.set(x, "ncols", js.undefined)
        
        @scala.inline
        def setQuote(value: String): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
        
        @scala.inline
        def setRowDelimiter(value: String): Self = StObject.set(x, "rowDelimiter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRowDelimiterUndefined: Self = StObject.set(x, "rowDelimiter", js.undefined)
        
        @scala.inline
        def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
      }
    }
    
    /**
      * The results from a parser.
      */
    @js.native
    trait IResults extends StObject {
      
      /**
        * The number of columns parsed, or 0 if only row offsets are returned.
        */
      var ncols: Double = js.native
      
      /**
        * The number of rows parsed.
        */
      var nrows: Double = js.native
      
      /**
        * The index offsets into the data string for the rows or data items.
        *
        * #### Notes
        * If the columnOffsets argument to the parser is false, the offsets array
        * will be an array of length nrows, where `offsets[r]` is the index of the
        * first character of row r.
        *
        * If the columnOffsets argument to the parser is true, the offsets array
        * will be an array of length `nrows*ncols`, where `offsets[r*ncols + c]` is
        * the index of the first character of the item in row r, column c.
        */
      var offsets: js.Array[Double] = js.native
    }
    object IResults {
      
      @scala.inline
      def apply(ncols: Double, nrows: Double, offsets: js.Array[Double]): IResults = {
        val __obj = js.Dynamic.literal(ncols = ncols.asInstanceOf[js.Any], nrows = nrows.asInstanceOf[js.Any], offsets = offsets.asInstanceOf[js.Any])
        __obj.asInstanceOf[IResults]
      }
      
      @scala.inline
      implicit class IResultsMutableBuilder[Self <: IResults] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setNcols(value: Double): Self = StObject.set(x, "ncols", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNrows(value: Double): Self = StObject.set(x, "nrows", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOffsets(value: js.Array[Double]): Self = StObject.set(x, "offsets", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOffsetsVarargs(value: Double*): Self = StObject.set(x, "offsets", js.Array(value :_*))
      }
    }
  }
  type IParser = js.Function1[/* options */ IOptions, IResults]
}
