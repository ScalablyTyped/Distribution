package typings.jsonexport

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMod {
  
  /**
    * Main declare function that converts json to csv
    *
    * @param json - object or array to convert
    * @param options - csv options
    * @param callback(err, csv) - Callback declare function
    *      if error, returning error in call back.
    *      if csv is created successfully, returning csv output to callback.
    */
  inline def apply(): scala.Nothing = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[scala.Nothing]
  inline def apply(json: js.Array[js.Object]): js.Promise[String] = ^.asInstanceOf[js.Dynamic].apply(json.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def apply(json: js.Array[js.Object], cb: js.Function2[/* err */ js.Error, /* csv */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(json.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(json: js.Array[js.Object], userOptions: UserOptionsWithHandlers): js.Promise[String] = (^.asInstanceOf[js.Dynamic].apply(json.asInstanceOf[js.Any], userOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def apply(
    json: js.Array[js.Object],
    userOptions: UserOptionsWithHandlers,
    cb: js.Function2[/* err */ js.Error, /* csv */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(json.asInstanceOf[js.Any], userOptions.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(json: js.Object): js.Promise[String] = ^.asInstanceOf[js.Dynamic].apply(json.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def apply(json: js.Object, cb: js.Function2[/* err */ js.Error, /* csv */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(json.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(json: js.Object, userOptions: UserOptionsWithHandlers): js.Promise[String] = (^.asInstanceOf[js.Dynamic].apply(json.asInstanceOf[js.Any], userOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def apply(
    json: js.Object,
    userOptions: UserOptionsWithHandlers,
    cb: js.Function2[/* err */ js.Error, /* csv */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(json.asInstanceOf[js.Any], userOptions.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(userOptions: UserOptions): scala.Nothing = ^.asInstanceOf[js.Dynamic].apply(userOptions.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  
  @JSImport("jsonexport/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A function to export the `type`
    * @param value value is of type `key`
    * For instance:
    * ```
    * // Correct
    * Number: (value: number) => value.toFixed(2),
    * // Incorrect, will error
    * Number: (value: Date) => value.toLocaleDateString(),
    * ```
    * @param index the index in the {parent} object
    * @param parent the parent object
    */
  type TypeHandlerFunction = js.Function3[/* value */ Any, /* index */ String, /* parent */ js.Object | js.Array[js.Object], Any]
  
  /** A key map of constructors used to match by instance to create a value using the defined function */
  type TypeHandlers = StringDictionary[TypeHandlerFunction]
  
  /**
    * @note This options should maybe be within the UserOptions interface
    * However, a check make impossible to accept handlers and other options (not in the DEFAULT_OPTIONS) when the return is a Transform
    * - The check: [lib/index.js#L56](https://github.com/kaue/jsonexport/blob/f486a71432d6ea6ab321554a2dd43418c107b418/lib/index.js#L56)
    * - The `DEFAULT_OPTIONS`: [lib/index.js#L22](https://github.com/kaue/jsonexport/blob/f486a71432d6ea6ab321554a2dd43418c107b418/lib/index.js#L22)
    */
  trait UserHandlers extends StObject {
    
    /** Try filling top rows first for unpopular columns, defaults to `false` */
    var fillTopRow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Use this to customize all Date in the CSV file
      * @deprecated Use typeHandlers
      * @note Others specific handlers have been remove in 3.0.0 but this one remained by mistake (https://github.com/kaue/jsonexport/pull/74)
      */
    var handleDate: js.UndefOr[js.Function2[/* value */ js.Date, /* item */ String, Any]] = js.undefined
    
    /**
      * Post-process headers after they are calculated with delimiters
      * @example
      * ```
      * mapHeaders: (header) => header.replace(/foo\./, '')
      * ```
      */
    var mapHeaders: js.UndefOr[js.Function1[/* header */ String, String]] = js.undefined
    
    /** A key map of constructors used to match by instance to create a value using the defined function */
    var typeHandlers: js.UndefOr[TypeHandlers] = js.undefined
  }
  object UserHandlers {
    
    inline def apply(): UserHandlers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserHandlers]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UserHandlers] (val x: Self) extends AnyVal {
      
      inline def setFillTopRow(value: Boolean): Self = StObject.set(x, "fillTopRow", value.asInstanceOf[js.Any])
      
      inline def setFillTopRowUndefined: Self = StObject.set(x, "fillTopRow", js.undefined)
      
      inline def setHandleDate(value: (/* value */ js.Date, /* item */ String) => Any): Self = StObject.set(x, "handleDate", js.Any.fromFunction2(value))
      
      inline def setHandleDateUndefined: Self = StObject.set(x, "handleDate", js.undefined)
      
      inline def setMapHeaders(value: /* header */ String => String): Self = StObject.set(x, "mapHeaders", js.Any.fromFunction1(value))
      
      inline def setMapHeadersUndefined: Self = StObject.set(x, "mapHeaders", js.undefined)
      
      inline def setTypeHandlers(value: TypeHandlers): Self = StObject.set(x, "typeHandlers", value.asInstanceOf[js.Any])
      
      inline def setTypeHandlersUndefined: Self = StObject.set(x, "typeHandlers", js.undefined)
    }
  }
  
  trait UserOptions extends StObject {
    
    /** This is used to output primitive arrays in a single column, defaults to `;` */
    var arrayPathString: js.UndefOr[String] = js.undefined
    
    /** Will be used instead of `false` */
    var booleanFalseString: js.UndefOr[String] = js.undefined
    
    /** Will be used instead of `true` */
    var booleanTrueString: js.UndefOr[String] = js.undefined
    
    /** Replace the OS default EOL */
    var endOfLine: js.UndefOr[String] = js.undefined
    
    /** Set this option if don’t want to have empty cells in case of an object with multiple nested items (array prop), defaults to false */
    var fillGaps: js.UndefOr[Boolean] = js.undefined
    
    /** Set this option to true to wrap every data item and header in the textDelimiter, defaults to `false` */
    var forceTextDelimiter: js.UndefOr[Boolean] = js.undefined
    
    /** Used to create the propriety path, defaults to `.` */
    var headerPathString: js.UndefOr[String] = js.undefined
    
    /** Used to set a custom header order, defaults to [] */
    var headers: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Set this option to `false` to hide the CSV headers */
    var includeHeaders: js.UndefOr[Boolean] = js.undefined
    
    /** Every header will have the `mainPathItem` as the base */
    var mainPathItem: js.UndefOr[String] = js.undefined
    
    /** Used to set a custom header text, defaults to [] */
    var rename: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Change the file row delimiter
      * - Defaults to `,` (cvs format).
      * - Use `\t` for xls format.
      * - Use `;` for (windows excel .csv format)
      */
    var rowDelimiter: js.UndefOr[String] = js.undefined
    
    /** The character used to escape the text content if needed, defaults to `"` */
    var textDelimiter: js.UndefOr[String] = js.undefined
    
    /** If you want to display a custom value for undefined strings, use this option, defaults to ` ` */
    var undefinedString: js.UndefOr[String] = js.undefined
    
    /** Set this option to false to create a horizontal output for JSON Objects, headers in the first row, values in the second */
    var verticalOutput: js.UndefOr[Boolean] = js.undefined
  }
  object UserOptions {
    
    inline def apply(): UserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UserOptions] (val x: Self) extends AnyVal {
      
      inline def setArrayPathString(value: String): Self = StObject.set(x, "arrayPathString", value.asInstanceOf[js.Any])
      
      inline def setArrayPathStringUndefined: Self = StObject.set(x, "arrayPathString", js.undefined)
      
      inline def setBooleanFalseString(value: String): Self = StObject.set(x, "booleanFalseString", value.asInstanceOf[js.Any])
      
      inline def setBooleanFalseStringUndefined: Self = StObject.set(x, "booleanFalseString", js.undefined)
      
      inline def setBooleanTrueString(value: String): Self = StObject.set(x, "booleanTrueString", value.asInstanceOf[js.Any])
      
      inline def setBooleanTrueStringUndefined: Self = StObject.set(x, "booleanTrueString", js.undefined)
      
      inline def setEndOfLine(value: String): Self = StObject.set(x, "endOfLine", value.asInstanceOf[js.Any])
      
      inline def setEndOfLineUndefined: Self = StObject.set(x, "endOfLine", js.undefined)
      
      inline def setFillGaps(value: Boolean): Self = StObject.set(x, "fillGaps", value.asInstanceOf[js.Any])
      
      inline def setFillGapsUndefined: Self = StObject.set(x, "fillGaps", js.undefined)
      
      inline def setForceTextDelimiter(value: Boolean): Self = StObject.set(x, "forceTextDelimiter", value.asInstanceOf[js.Any])
      
      inline def setForceTextDelimiterUndefined: Self = StObject.set(x, "forceTextDelimiter", js.undefined)
      
      inline def setHeaderPathString(value: String): Self = StObject.set(x, "headerPathString", value.asInstanceOf[js.Any])
      
      inline def setHeaderPathStringUndefined: Self = StObject.set(x, "headerPathString", js.undefined)
      
      inline def setHeaders(value: js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setIncludeHeaders(value: Boolean): Self = StObject.set(x, "includeHeaders", value.asInstanceOf[js.Any])
      
      inline def setIncludeHeadersUndefined: Self = StObject.set(x, "includeHeaders", js.undefined)
      
      inline def setMainPathItem(value: String): Self = StObject.set(x, "mainPathItem", value.asInstanceOf[js.Any])
      
      inline def setMainPathItemUndefined: Self = StObject.set(x, "mainPathItem", js.undefined)
      
      inline def setRename(value: js.Array[String]): Self = StObject.set(x, "rename", value.asInstanceOf[js.Any])
      
      inline def setRenameUndefined: Self = StObject.set(x, "rename", js.undefined)
      
      inline def setRenameVarargs(value: String*): Self = StObject.set(x, "rename", js.Array(value*))
      
      inline def setRowDelimiter(value: String): Self = StObject.set(x, "rowDelimiter", value.asInstanceOf[js.Any])
      
      inline def setRowDelimiterUndefined: Self = StObject.set(x, "rowDelimiter", js.undefined)
      
      inline def setTextDelimiter(value: String): Self = StObject.set(x, "textDelimiter", value.asInstanceOf[js.Any])
      
      inline def setTextDelimiterUndefined: Self = StObject.set(x, "textDelimiter", js.undefined)
      
      inline def setUndefinedString(value: String): Self = StObject.set(x, "undefinedString", value.asInstanceOf[js.Any])
      
      inline def setUndefinedStringUndefined: Self = StObject.set(x, "undefinedString", js.undefined)
      
      inline def setVerticalOutput(value: Boolean): Self = StObject.set(x, "verticalOutput", value.asInstanceOf[js.Any])
      
      inline def setVerticalOutputUndefined: Self = StObject.set(x, "verticalOutput", js.undefined)
    }
  }
  
  trait UserOptionsWithHandlers
    extends StObject
       with UserHandlers
       with UserOptions
  object UserOptionsWithHandlers {
    
    inline def apply(): UserOptionsWithHandlers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserOptionsWithHandlers]
    }
  }
}
