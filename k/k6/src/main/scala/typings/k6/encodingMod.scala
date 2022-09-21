package typings.k6

import typings.k6.k6Strings.s
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object encodingMod {
  
  @JSImport("k6/encoding", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The encoding module provides base64 encoding/decoding.
    * https://k6.io/docs/javascript-api/k6-encoding/
    */
  object default {
    
    @JSImport("k6/encoding", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Base64 decode a string.
      * https://k6.io/docs/javascript-api/k6-encoding/b64decode-input-encoding-format/
      * @param input - The string to base64 decode.
      * @param encoding - Base64 variant.
      * @returns The base64 decoded version of the input string in either string or ArrayBuffer format, depending on the `format` parameter.
      * @example
      * encoding.b64decode(str)
      * encoding.b64decode(str, 'rawstd')
      * const decBuffer = encoding.b64decode(str, 'rawurl')
      * let decBin = new Uint8Array(decBuffer);
      */
    inline def b64decode(input: String): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("b64decode")(input.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
    inline def b64decode(input: String, encoding: Base64Variant): js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("b64decode")(input.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBuffer]
    
    /**
      * Base64 decode a string.
      * https://k6.io/docs/javascript-api/k6-encoding/b64decode-input-encoding-format/
      * @param input - The string to base64 decode.
      * @param encoding - Base64 variant.
      * @param format - If 's' return the data as a string, otherwise an ArrayBuffer object .
      * @returns The base64 decoded version of the input string in either string or ArrayBuffer format, depending on the `format` parameter.
      * @example
      * encoding.b64decode(str)
      * encoding.b64decode(str, 'rawstd')
      * const decodedString = encoding.b64decode(str, 'rawurl', 's')
      */
    inline def b64decode_s(input: String, encoding: Base64Variant, format: s): String = (^.asInstanceOf[js.Dynamic].applyDynamic("b64decode")(input.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Base64 decode a string.
      * https://k6.io/docs/javascript-api/k6-encoding/b64decode-input-encoding/
      * @param input - Base64 encoded string or ArrayBuffer object.
      * @param encoding - Base64 variant.
      * @returns Decoded string.
      * @example
      * encoding.b64encode(str)
      * encoding.b64encode(str, 'rawstd')
      */
    inline def b64encode(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("b64encode")(input.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def b64encode(input: String, encoding: Base64Variant): String = (^.asInstanceOf[js.Dynamic].applyDynamic("b64encode")(input.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def b64encode(input: js.typedarray.ArrayBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("b64encode")(input.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def b64encode(input: js.typedarray.ArrayBuffer, encoding: Base64Variant): String = (^.asInstanceOf[js.Dynamic].applyDynamic("b64encode")(input.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  inline def b64decode(input: String): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("b64decode")(input.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
  inline def b64decode(input: String, encoding: Base64Variant): js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("b64decode")(input.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBuffer]
  
  inline def b64decode_s(input: String, encoding: Base64Variant, format: s): String = (^.asInstanceOf[js.Dynamic].applyDynamic("b64decode")(input.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def b64encode(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("b64encode")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def b64encode(input: String, encoding: Base64Variant): String = (^.asInstanceOf[js.Dynamic].applyDynamic("b64encode")(input.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def b64encode(input: js.typedarray.ArrayBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("b64encode")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def b64encode(input: js.typedarray.ArrayBuffer, encoding: Base64Variant): String = (^.asInstanceOf[js.Dynamic].applyDynamic("b64encode")(input.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.k6.k6Strings.std
    - typings.k6.k6Strings.rawstd
    - typings.k6.k6Strings.url
    - typings.k6.k6Strings.rawurl
  */
  trait Base64Variant extends StObject
  object Base64Variant {
    
    inline def rawstd: typings.k6.k6Strings.rawstd = "rawstd".asInstanceOf[typings.k6.k6Strings.rawstd]
    
    inline def rawurl: typings.k6.k6Strings.rawurl = "rawurl".asInstanceOf[typings.k6.k6Strings.rawurl]
    
    inline def std: typings.k6.k6Strings.std = "std".asInstanceOf[typings.k6.k6Strings.std]
    
    inline def url: typings.k6.k6Strings.url = "url".asInstanceOf[typings.k6.k6Strings.url]
  }
}
