package typings.hiBase32

import typings.std.ArrayBuffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hi-base32", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  var decode: Decode_ = js.native
  
  def encode(input: Input): String = js.native
  def encode(input: Input, asciiOnly: Boolean): String = js.native
  
  @js.native
  trait Decode_ extends js.Object {
    
    /**
      * Decode base32 string and return string
      *
      * @param base32Str The base32 string you want to decode.
      * @param ascciOnly decode as ASCII or decode as UTF-8 string. Default is false.
      */
    def apply(base32Str: String): String = js.native
    def apply(base32Str: String, asciiOnly: Boolean): String = js.native
    
    /**
      * Decode base32 string and return byte array
      *
      * @param base32Str The base32 string you want to decode.
      */
    def asBytes(base32Str: String): js.Array[Double] = js.native
  }
  
  type Input = String | js.Array[Double] | ArrayBuffer | Uint8Array
}
