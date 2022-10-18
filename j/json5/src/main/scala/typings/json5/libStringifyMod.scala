package typings.json5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStringifyMod {
  
  /**
    * Converts a JavaScript value to a JSON5 string.
    * @param value The value to convert to a JSON5 string.
    * @param replacer A function that alters the behavior of the stringification
    * process. If this value is null or not provided, all properties of the object
    * are included in the resulting JSON5 string.
    * @param space A String or Number object that's used to insert white space into
    * the output JSON5 string for readability purposes. If this is a Number, it
    * indicates the number of space characters to use as white space; this number
    * is capped at 10 (if it is greater, the value is just 10). Values less than 1
    * indicate that no space should be used. If this is a String, the string (or
    * the first 10 characters of the string, if it's longer than that) is used as
    * white space. If this parameter is not provided (or is null), no white space
    * is used. If white space is used, trailing commas will be used in objects and
    * arrays.
    * @returns The JSON5 string converted from the JavaScript value.
    */
  inline def apply(value: Any): String = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[String]
  /**
    * Converts a JavaScript value to a JSON5 string.
    * @param value The value to convert to a JSON5 string.
    * @param options An object specifying options.
    * @returns The JSON5 string converted from the JavaScript value.
    */
  inline def apply(value: Any, options: StringifyOptions): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  /**
    * Converts a JavaScript value to a JSON5 string.
    * @param value The value to convert to a JSON5 string.
    * @param replacer An array of String and Number objects that serve as a
    * allowlist for selecting/filtering the properties of the value object to be
    * included in the JSON5 string. If this value is null or not provided, all
    * properties of the object are included in the resulting JSON5 string.
    * @param space A String or Number object that's used to insert white space into
    * the output JSON5 string for readability purposes. If this is a Number, it
    * indicates the number of space characters to use as white space; this number
    * is capped at 10 (if it is greater, the value is just 10). Values less than 1
    * indicate that no space should be used. If this is a String, the string (or
    * the first 10 characters of the string, if it's longer than that) is used as
    * white space. If this parameter is not provided (or is null), no white space
    * is used. If white space is used, trailing commas will be used in objects and
    * arrays.
    * @returns The JSON5 string converted from the JavaScript value.
    */
  inline def apply(value: Any, replacer: js.Array[Double | String]): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(value: Any, replacer: js.Array[String | Double], space: String): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(value: Any, replacer: js.Array[String | Double], space: Double): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(value: Any, replacer: js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any]): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(
    value: Any,
    replacer: js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any],
    space: String
  ): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(
    value: Any,
    replacer: js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any],
    space: Double
  ): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(value: Any, replacer: Null, space: String): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(value: Any, replacer: Null, space: Double): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(value: Any, replacer: Unit, space: String): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(value: Any, replacer: Unit, space: Double): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("json5/lib/stringify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait StringifyOptions extends StObject {
    
    /**
      * A String representing the quote character to use when serializing
      * strings.
      */
    var quote: js.UndefOr[String | Null] = js.undefined
    
    /**
      * A function that alters the behavior of the stringification process, or an
      * array of String and Number objects that serve as a allowlist for
      * selecting/filtering the properties of the value object to be included in
      * the JSON5 string. If this value is null or not provided, all properties
      * of the object are included in the resulting JSON5 string.
      */
    var replacer: js.UndefOr[
        (js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any]) | (js.Array[String | Double]) | Null
      ] = js.undefined
    
    /**
      * A String or Number object that's used to insert white space into the
      * output JSON5 string for readability purposes. If this is a Number, it
      * indicates the number of space characters to use as white space; this
      * number is capped at 10 (if it is greater, the value is just 10). Values
      * less than 1 indicate that no space should be used. If this is a String,
      * the string (or the first 10 characters of the string, if it's longer than
      * that) is used as white space. If this parameter is not provided (or is
      * null), no white space is used. If white space is used, trailing commas
      * will be used in objects and arrays.
      */
    var space: js.UndefOr[String | Double | Null] = js.undefined
  }
  object StringifyOptions {
    
    inline def apply(): StringifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StringifyOptions]
    }
    
    extension [Self <: StringifyOptions](x: Self) {
      
      inline def setQuote(value: String): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
      
      inline def setQuoteNull: Self = StObject.set(x, "quote", null)
      
      inline def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
      
      inline def setReplacer(
        value: (js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any]) | (js.Array[String | Double])
      ): Self = StObject.set(x, "replacer", value.asInstanceOf[js.Any])
      
      inline def setReplacerNull: Self = StObject.set(x, "replacer", null)
      
      inline def setReplacerUndefined: Self = StObject.set(x, "replacer", js.undefined)
      
      inline def setReplacerVarargs(value: (String | Double)*): Self = StObject.set(x, "replacer", js.Array(value*))
      
      inline def setSpace(value: String | Double): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      inline def setSpaceNull: Self = StObject.set(x, "space", null)
      
      inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
    }
  }
}
