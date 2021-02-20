package typings.jqueryFormatdatetime

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* Inlined std.Partial<{  monthNames :std.Array<string>,   monthNamesShort :std.Array<string>,   dayNames :std.Array<string>,   dayNamesShort :std.Array<string>,   ampmNames :std.Array<string>, getSuffix (num : number): string,   attribute :string,   formatAttribute :string,   utc :boolean}> */
  @js.native
  trait Options extends StObject {
    
    var ampmNames: js.UndefOr[js.Array[String]] = js.native
    
    var attribute: js.UndefOr[String] = js.native
    
    var dayNames: js.UndefOr[js.Array[String]] = js.native
    
    var dayNamesShort: js.UndefOr[js.Array[String]] = js.native
    
    var formatAttribute: js.UndefOr[String] = js.native
    
    var getSuffix: js.UndefOr[js.Function1[/* num */ Double, String]] = js.native
    
    var monthNames: js.UndefOr[js.Array[String]] = js.native
    
    var monthNamesShort: js.UndefOr[js.Array[String]] = js.native
    
    var utc: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmpmNames(value: js.Array[String]): Self = StObject.set(x, "ampmNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmpmNamesUndefined: Self = StObject.set(x, "ampmNames", js.undefined)
      
      @scala.inline
      def setAmpmNamesVarargs(value: String*): Self = StObject.set(x, "ampmNames", js.Array(value :_*))
      
      @scala.inline
      def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
      
      @scala.inline
      def setDayNames(value: js.Array[String]): Self = StObject.set(x, "dayNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayNamesShort(value: js.Array[String]): Self = StObject.set(x, "dayNamesShort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayNamesShortUndefined: Self = StObject.set(x, "dayNamesShort", js.undefined)
      
      @scala.inline
      def setDayNamesShortVarargs(value: String*): Self = StObject.set(x, "dayNamesShort", js.Array(value :_*))
      
      @scala.inline
      def setDayNamesUndefined: Self = StObject.set(x, "dayNames", js.undefined)
      
      @scala.inline
      def setDayNamesVarargs(value: String*): Self = StObject.set(x, "dayNames", js.Array(value :_*))
      
      @scala.inline
      def setFormatAttribute(value: String): Self = StObject.set(x, "formatAttribute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatAttributeUndefined: Self = StObject.set(x, "formatAttribute", js.undefined)
      
      @scala.inline
      def setGetSuffix(value: /* num */ Double => String): Self = StObject.set(x, "getSuffix", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetSuffixUndefined: Self = StObject.set(x, "getSuffix", js.undefined)
      
      @scala.inline
      def setMonthNames(value: js.Array[String]): Self = StObject.set(x, "monthNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthNamesShort(value: js.Array[String]): Self = StObject.set(x, "monthNamesShort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthNamesShortUndefined: Self = StObject.set(x, "monthNamesShort", js.undefined)
      
      @scala.inline
      def setMonthNamesShortVarargs(value: String*): Self = StObject.set(x, "monthNamesShort", js.Array(value :_*))
      
      @scala.inline
      def setMonthNamesUndefined: Self = StObject.set(x, "monthNames", js.undefined)
      
      @scala.inline
      def setMonthNamesVarargs(value: String*): Self = StObject.set(x, "monthNames", js.Array(value :_*))
      
      @scala.inline
      def setUtc(value: Boolean): Self = StObject.set(x, "utc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtcUndefined: Self = StObject.set(x, "utc", js.undefined)
    }
  }
  
  object global {
    
    @js.native
    trait JQuery extends StObject {
      
      def formatDateTime(format: String): JQuery = js.native
      def formatDateTime(format: String, options: Options): JQuery = js.native
    }
    
    @js.native
    trait JQueryStatic extends StObject {
      
      def formatDateTime(format: String, date: Date): String = js.native
      def formatDateTime(format: String, date: Date, options: Options): String = js.native
    }
  }
}
