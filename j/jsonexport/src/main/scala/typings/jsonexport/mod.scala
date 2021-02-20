package typings.jsonexport

import typings.node.streamMod.Transform
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  @JSImport("jsonexport", JSImport.Namespace)
  @js.native
  def apply(): Transform = js.native
  @JSImport("jsonexport", JSImport.Namespace)
  @js.native
  def apply(json: js.Array[js.Object]): js.Promise[String] = js.native
  @JSImport("jsonexport", JSImport.Namespace)
  @js.native
  def apply(json: js.Array[js.Object], cb: js.Function2[/* err */ Error, /* csv */ String, Unit]): Unit = js.native
  @JSImport("jsonexport", JSImport.Namespace)
  @js.native
  def apply(json: js.Array[js.Object], userOptions: UserOptions): js.Promise[String] = js.native
  @JSImport("jsonexport", JSImport.Namespace)
  @js.native
  def apply(
    json: js.Array[js.Object],
    userOptions: UserOptions,
    cb: js.Function2[/* err */ Error, /* csv */ String, Unit]
  ): Unit = js.native
  @JSImport("jsonexport", JSImport.Namespace)
  @js.native
  def apply(json: js.Object): js.Promise[String] = js.native
  @JSImport("jsonexport", JSImport.Namespace)
  @js.native
  def apply(json: js.Object, cb: js.Function2[/* err */ Error, /* csv */ String, Unit]): Unit = js.native
  @JSImport("jsonexport", JSImport.Namespace)
  @js.native
  def apply(json: js.Object, userOptions: UserOptions): js.Promise[String] = js.native
  @JSImport("jsonexport", JSImport.Namespace)
  @js.native
  def apply(
    json: js.Object,
    userOptions: UserOptions,
    cb: js.Function2[/* err */ Error, /* csv */ String, Unit]
  ): Unit = js.native
  @JSImport("jsonexport", JSImport.Namespace)
  @js.native
  def apply(userOptions: UserOptions): Transform = js.native
  
  @js.native
  trait UserOptions extends StObject {
    
    var arrayPathString: js.UndefOr[String] = js.native
    
    var booleanFalseString: js.UndefOr[String] = js.native
    
    var booleanTrueString: js.UndefOr[String] = js.native
    
    var endOfLine: js.UndefOr[String] = js.native
    
    var fillGaps: js.UndefOr[Boolean] = js.native
    
    var forceTextDelimiter: js.UndefOr[Boolean] = js.native
    
    var headerPathString: js.UndefOr[String] = js.native
    
    var headers: js.UndefOr[js.Array[String]] = js.native
    
    var includeHeaders: js.UndefOr[Boolean] = js.native
    
    var mainPathItem: js.UndefOr[String] = js.native
    
    var rename: js.UndefOr[js.Array[String]] = js.native
    
    var rowDelimiter: js.UndefOr[String] = js.native
    
    var textDelimiter: js.UndefOr[String] = js.native
    
    var undefinedString: js.UndefOr[String] = js.native
    
    var verticalOutput: js.UndefOr[Boolean] = js.native
  }
  object UserOptions {
    
    @scala.inline
    def apply(): UserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserOptions]
    }
    
    @scala.inline
    implicit class UserOptionsMutableBuilder[Self <: UserOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrayPathString(value: String): Self = StObject.set(x, "arrayPathString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrayPathStringUndefined: Self = StObject.set(x, "arrayPathString", js.undefined)
      
      @scala.inline
      def setBooleanFalseString(value: String): Self = StObject.set(x, "booleanFalseString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBooleanFalseStringUndefined: Self = StObject.set(x, "booleanFalseString", js.undefined)
      
      @scala.inline
      def setBooleanTrueString(value: String): Self = StObject.set(x, "booleanTrueString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBooleanTrueStringUndefined: Self = StObject.set(x, "booleanTrueString", js.undefined)
      
      @scala.inline
      def setEndOfLine(value: String): Self = StObject.set(x, "endOfLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndOfLineUndefined: Self = StObject.set(x, "endOfLine", js.undefined)
      
      @scala.inline
      def setFillGaps(value: Boolean): Self = StObject.set(x, "fillGaps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillGapsUndefined: Self = StObject.set(x, "fillGaps", js.undefined)
      
      @scala.inline
      def setForceTextDelimiter(value: Boolean): Self = StObject.set(x, "forceTextDelimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceTextDelimiterUndefined: Self = StObject.set(x, "forceTextDelimiter", js.undefined)
      
      @scala.inline
      def setHeaderPathString(value: String): Self = StObject.set(x, "headerPathString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderPathStringUndefined: Self = StObject.set(x, "headerPathString", js.undefined)
      
      @scala.inline
      def setHeaders(value: js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      @scala.inline
      def setIncludeHeaders(value: Boolean): Self = StObject.set(x, "includeHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeHeadersUndefined: Self = StObject.set(x, "includeHeaders", js.undefined)
      
      @scala.inline
      def setMainPathItem(value: String): Self = StObject.set(x, "mainPathItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMainPathItemUndefined: Self = StObject.set(x, "mainPathItem", js.undefined)
      
      @scala.inline
      def setRename(value: js.Array[String]): Self = StObject.set(x, "rename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenameUndefined: Self = StObject.set(x, "rename", js.undefined)
      
      @scala.inline
      def setRenameVarargs(value: String*): Self = StObject.set(x, "rename", js.Array(value :_*))
      
      @scala.inline
      def setRowDelimiter(value: String): Self = StObject.set(x, "rowDelimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowDelimiterUndefined: Self = StObject.set(x, "rowDelimiter", js.undefined)
      
      @scala.inline
      def setTextDelimiter(value: String): Self = StObject.set(x, "textDelimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextDelimiterUndefined: Self = StObject.set(x, "textDelimiter", js.undefined)
      
      @scala.inline
      def setUndefinedString(value: String): Self = StObject.set(x, "undefinedString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUndefinedStringUndefined: Self = StObject.set(x, "undefinedString", js.undefined)
      
      @scala.inline
      def setVerticalOutput(value: Boolean): Self = StObject.set(x, "verticalOutput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalOutputUndefined: Self = StObject.set(x, "verticalOutput", js.undefined)
    }
  }
}
