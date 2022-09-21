package typings.jqueryFormatdatetime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* Inlined std.Partial<{  monthNames :std.Array<string>,   monthNamesShort :std.Array<string>,   dayNames :std.Array<string>,   dayNamesShort :std.Array<string>,   ampmNames :std.Array<string>, getSuffix (num : number): string,   attribute :string,   formatAttribute :string,   utc :boolean}> */
  trait Options extends StObject {
    
    var ampmNames: js.UndefOr[js.Array[String]] = js.undefined
    
    var attribute: js.UndefOr[String] = js.undefined
    
    var dayNames: js.UndefOr[js.Array[String]] = js.undefined
    
    var dayNamesShort: js.UndefOr[js.Array[String]] = js.undefined
    
    var formatAttribute: js.UndefOr[String] = js.undefined
    
    var getSuffix: js.UndefOr[js.Function1[/* num */ Double, String]] = js.undefined
    
    var monthNames: js.UndefOr[js.Array[String]] = js.undefined
    
    var monthNamesShort: js.UndefOr[js.Array[String]] = js.undefined
    
    var utc: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAmpmNames(value: js.Array[String]): Self = StObject.set(x, "ampmNames", value.asInstanceOf[js.Any])
      
      inline def setAmpmNamesUndefined: Self = StObject.set(x, "ampmNames", js.undefined)
      
      inline def setAmpmNamesVarargs(value: String*): Self = StObject.set(x, "ampmNames", js.Array(value*))
      
      inline def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
      
      inline def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
      
      inline def setDayNames(value: js.Array[String]): Self = StObject.set(x, "dayNames", value.asInstanceOf[js.Any])
      
      inline def setDayNamesShort(value: js.Array[String]): Self = StObject.set(x, "dayNamesShort", value.asInstanceOf[js.Any])
      
      inline def setDayNamesShortUndefined: Self = StObject.set(x, "dayNamesShort", js.undefined)
      
      inline def setDayNamesShortVarargs(value: String*): Self = StObject.set(x, "dayNamesShort", js.Array(value*))
      
      inline def setDayNamesUndefined: Self = StObject.set(x, "dayNames", js.undefined)
      
      inline def setDayNamesVarargs(value: String*): Self = StObject.set(x, "dayNames", js.Array(value*))
      
      inline def setFormatAttribute(value: String): Self = StObject.set(x, "formatAttribute", value.asInstanceOf[js.Any])
      
      inline def setFormatAttributeUndefined: Self = StObject.set(x, "formatAttribute", js.undefined)
      
      inline def setGetSuffix(value: /* num */ Double => String): Self = StObject.set(x, "getSuffix", js.Any.fromFunction1(value))
      
      inline def setGetSuffixUndefined: Self = StObject.set(x, "getSuffix", js.undefined)
      
      inline def setMonthNames(value: js.Array[String]): Self = StObject.set(x, "monthNames", value.asInstanceOf[js.Any])
      
      inline def setMonthNamesShort(value: js.Array[String]): Self = StObject.set(x, "monthNamesShort", value.asInstanceOf[js.Any])
      
      inline def setMonthNamesShortUndefined: Self = StObject.set(x, "monthNamesShort", js.undefined)
      
      inline def setMonthNamesShortVarargs(value: String*): Self = StObject.set(x, "monthNamesShort", js.Array(value*))
      
      inline def setMonthNamesUndefined: Self = StObject.set(x, "monthNames", js.undefined)
      
      inline def setMonthNamesVarargs(value: String*): Self = StObject.set(x, "monthNames", js.Array(value*))
      
      inline def setUtc(value: Boolean): Self = StObject.set(x, "utc", value.asInstanceOf[js.Any])
      
      inline def setUtcUndefined: Self = StObject.set(x, "utc", js.undefined)
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
      
      def formatDateTime(format: String, date: js.Date): String = js.native
      def formatDateTime(format: String, date: js.Date, options: Options): String = js.native
    }
  }
}
