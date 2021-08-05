package typings.jsonexport

import typings.node.streamMod.Transform
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Main declare function that converts json to csv
    *
    * @param json - object or array to convert
    * @param options - csv options
    * @param callback(err, csv) - Callback declare function
    *      if error, returning error in call back.
    *      if csv is created successfully, returning csv output to callback.
    */
  inline def apply(): Transform = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Transform]
  inline def apply(json: js.Array[js.Object]): js.Promise[String] = ^.asInstanceOf[js.Dynamic].apply(json.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def apply(json: js.Array[js.Object], cb: js.Function2[/* err */ Error, /* csv */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(json.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(json: js.Array[js.Object], userOptions: UserOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].apply(json.asInstanceOf[js.Any], userOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def apply(
    json: js.Array[js.Object],
    userOptions: UserOptions,
    cb: js.Function2[/* err */ Error, /* csv */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(json.asInstanceOf[js.Any], userOptions.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(json: js.Object): js.Promise[String] = ^.asInstanceOf[js.Dynamic].apply(json.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def apply(json: js.Object, cb: js.Function2[/* err */ Error, /* csv */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(json.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(json: js.Object, userOptions: UserOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].apply(json.asInstanceOf[js.Any], userOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def apply(
    json: js.Object,
    userOptions: UserOptions,
    cb: js.Function2[/* err */ Error, /* csv */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(json.asInstanceOf[js.Any], userOptions.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(userOptions: UserOptions): Transform = ^.asInstanceOf[js.Dynamic].apply(userOptions.asInstanceOf[js.Any]).asInstanceOf[Transform]
  
  @JSImport("jsonexport", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait UserOptions extends StObject {
    
    var arrayPathString: js.UndefOr[String] = js.undefined
    
    var booleanFalseString: js.UndefOr[String] = js.undefined
    
    var booleanTrueString: js.UndefOr[String] = js.undefined
    
    var endOfLine: js.UndefOr[String] = js.undefined
    
    var fillGaps: js.UndefOr[Boolean] = js.undefined
    
    var forceTextDelimiter: js.UndefOr[Boolean] = js.undefined
    
    var headerPathString: js.UndefOr[String] = js.undefined
    
    var headers: js.UndefOr[js.Array[String]] = js.undefined
    
    var includeHeaders: js.UndefOr[Boolean] = js.undefined
    
    var mainPathItem: js.UndefOr[String] = js.undefined
    
    var rename: js.UndefOr[js.Array[String]] = js.undefined
    
    var rowDelimiter: js.UndefOr[String] = js.undefined
    
    var textDelimiter: js.UndefOr[String] = js.undefined
    
    var undefinedString: js.UndefOr[String] = js.undefined
    
    var verticalOutput: js.UndefOr[Boolean] = js.undefined
  }
  object UserOptions {
    
    inline def apply(): UserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserOptions]
    }
    
    extension [Self <: UserOptions](x: Self) {
      
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
      
      inline def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      inline def setIncludeHeaders(value: Boolean): Self = StObject.set(x, "includeHeaders", value.asInstanceOf[js.Any])
      
      inline def setIncludeHeadersUndefined: Self = StObject.set(x, "includeHeaders", js.undefined)
      
      inline def setMainPathItem(value: String): Self = StObject.set(x, "mainPathItem", value.asInstanceOf[js.Any])
      
      inline def setMainPathItemUndefined: Self = StObject.set(x, "mainPathItem", js.undefined)
      
      inline def setRename(value: js.Array[String]): Self = StObject.set(x, "rename", value.asInstanceOf[js.Any])
      
      inline def setRenameUndefined: Self = StObject.set(x, "rename", js.undefined)
      
      inline def setRenameVarargs(value: String*): Self = StObject.set(x, "rename", js.Array(value :_*))
      
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
}
