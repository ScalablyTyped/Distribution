package typings.jupyterlabCsvviewer

import typings.jupyterlabCsvviewer.jupyterlabCsvviewerStrings.Carriagereturn
import typings.jupyterlabCsvviewer.jupyterlabCsvviewerStrings.CarriagereturnLinefeed
import typings.jupyterlabCsvviewer.jupyterlabCsvviewerStrings.Linefeed
import typings.jupyterlabCsvviewer.modelMod.DSVModel.IOptions
import typings.luminoDatagrid.mod.DataModel
import typings.luminoDisposable.mod.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelMod {
  
  @JSImport("@jupyterlab/csvviewer/lib/model", "DSVModel")
  @js.native
  class DSVModel protected ()
    extends DataModel
       with IDisposable {
    /**
      * Create a data model with static CSV data.
      *
      * @param options - The options for initializing the data model.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _columnCount: js.Any = js.native
    
    /**
      * The column offset cache, starting with row _columnOffsetsStartingRow
      *
      * #### Notes
      * The index of the first character in the data string for row r, column c is
      * _columnOffsets[(r-this._columnOffsetsStartingRow)*numColumns+c]
      */
    /* private */ var _columnOffsets: js.Any = js.native
    
    /**
      * The row that _columnOffsets[0] represents.
      */
    /* private */ var _columnOffsetsStartingRow: js.Any = js.native
    
    /**
      * Compute the row offsets and initialize the column offset cache.
      *
      * @param endRow - The last row to parse, from the start of the data (first
      * row is row 1).
      *
      * #### Notes
      * This method supports parsing the data incrementally by calling it with
      * incrementally higher endRow. Rows that have already been parsed will not be
      * parsed again.
      */
    /* private */ var _computeRowOffsets: js.Any = js.native
    
    /* private */ var _data: js.Any = js.native
    
    /* private */ var _delayedParse: js.Any = js.native
    
    /* private */ var _delimiter: js.Any = js.native
    
    /* private */ var _doneParsing: js.Any = js.native
    
    /**
      * Get the parsed string field for a row and column.
      *
      * @param row - The row number of the data item.
      * @param column - The column number of the data item.
      * @returns The parsed string for the data item.
      */
    /* private */ var _getField: js.Any = js.native
    
    /**
      * Get the index in the data string for the first character of a row and
      * column.
      *
      * @param row - The row of the data item.
      * @param column - The column of the data item.
      * @returns - The index into the data string where the data item starts.
      */
    /* private */ var _getOffsetIndex: js.Any = js.native
    
    /**
      * The header strings.
      */
    /* private */ var _header: js.Any = js.native
    
    /**
      * The number of rows to parse initially before doing a delayed parse of the
      * entire data.
      */
    /* private */ var _initialRows: js.Any = js.native
    
    /* private */ var _isDisposed: js.Any = js.native
    
    /**
      * The maximum number of rows to parse when there is a cache miss.
      */
    /* private */ var _maxCacheGet: js.Any = js.native
    
    /**
      * Parse the data string asynchronously.
      *
      * #### Notes
      * It can take several seconds to parse a several hundred megabyte string, so
      * we parse the first 500 rows to get something up on the screen, then we
      * parse the full data string asynchronously.
      */
    /* private */ var _parseAsync: js.Any = js.native
    
    /* private */ var _parser: js.Any = js.native
    
    /* private */ var _quote: js.Any = js.native
    
    /* private */ var _quoteEscaped: js.Any = js.native
    
    /* private */ var _ready: js.Any = js.native
    
    /**
      * Reset the parser state.
      */
    /* private */ var _resetParser: js.Any = js.native
    
    /* private */ var _rowCount: js.Any = js.native
    
    /* private */ var _rowDelimiter: js.Any = js.native
    
    /**
      * The index for the start of each row.
      */
    /* private */ var _rowOffsets: js.Any = js.native
    
    /* private */ var _startedParsing: js.Any = js.native
    
    /**
      * Dispose of the resources held by the object.
      *
      * #### Notes
      * If the object's `dispose` method is called more than once, all
      * calls made after the first will be a no-op.
      *
      * #### Undefined Behavior
      * It is undefined behavior to use any functionality of the object
      * after it has been disposed unless otherwise explicitly noted.
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    /**
      * Whether this model has been disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MDSVModel: Boolean = js.native
    
    /**
      * A promise that resolves when the model has parsed all of its data.
      */
    def ready: js.Promise[Unit] = js.native
  }
  object DSVModel {
    
    /**
      * An options object for initializing a delimiter-separated data model.
      */
    trait IOptions extends StObject {
      
      /**
        * The data source for the data model.
        */
      var data: String
      
      /**
        * The field delimiter, such as ',' or '\t'.
        *
        * #### Notes
        * The field delimiter must be a single character.
        */
      var delimiter: String
      
      /**
        * Whether the data has a one-row header.
        */
      var header: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The maximum number of initial rows to parse before doing a asynchronous
        * full parse of the data. This should be greater than 0.
        */
      var initialRows: js.UndefOr[Double] = js.undefined
      
      /**
        * Quote character.
        *
        * #### Notes
        * Quotes are escaped by repeating them, as in RFC 4180. The quote must be a
        * single character.
        */
      var quote: js.UndefOr[String] = js.undefined
      
      /**
        * Whether to use the parser that can handle quoted delimiters.
        *
        * #### Notes
        * Setting this to false uses a much faster parser, but assumes there are
        * not any field or row delimiters that are quoted in fields. If this is not
        * set, it defaults to true if any quotes are found in the data, and false
        * otherwise.
        */
      var quoteParser: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Row delimiter.
        *
        * #### Notes
        * Any carriage return or newline character that is not a delimiter should
        * be in a quoted field, regardless of the row delimiter setting.
        */
      var rowDelimiter: js.UndefOr[CarriagereturnLinefeed | Carriagereturn | Linefeed] = js.undefined
    }
    object IOptions {
      
      inline def apply(data: String, delimiter: String): IOptions = {
        val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], delimiter = delimiter.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
        
        inline def setHeader(value: Boolean): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
        
        inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
        
        inline def setInitialRows(value: Double): Self = StObject.set(x, "initialRows", value.asInstanceOf[js.Any])
        
        inline def setInitialRowsUndefined: Self = StObject.set(x, "initialRows", js.undefined)
        
        inline def setQuote(value: String): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
        
        inline def setQuoteParser(value: Boolean): Self = StObject.set(x, "quoteParser", value.asInstanceOf[js.Any])
        
        inline def setQuoteParserUndefined: Self = StObject.set(x, "quoteParser", js.undefined)
        
        inline def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
        
        inline def setRowDelimiter(value: CarriagereturnLinefeed | Carriagereturn | Linefeed): Self = StObject.set(x, "rowDelimiter", value.asInstanceOf[js.Any])
        
        inline def setRowDelimiterUndefined: Self = StObject.set(x, "rowDelimiter", js.undefined)
      }
    }
  }
}
