package typings.json5

import typings.json5.libStringifyMod.StringifyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("json5", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse[T](text: String): T = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def parse[T](text: String, reviver: js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any])).asInstanceOf[T]
  
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
  inline def stringify(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  /**
    * Converts a JavaScript value to a JSON5 string.
    * @param value The value to convert to a JSON5 string.
    * @param options An object specifying options.
    * @returns The JSON5 string converted from the JavaScript value.
    */
  inline def stringify(value: Any, options: StringifyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
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
  inline def stringify(value: Any, replacer: js.Array[Double | String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: js.Array[String | Double], space: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: js.Array[String | Double], space: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(
    value: Any,
    replacer: js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any],
    space: String
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(
    value: Any,
    replacer: js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any],
    space: Double
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: Null, space: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: Null, space: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: Unit, space: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: Unit, space: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
}
