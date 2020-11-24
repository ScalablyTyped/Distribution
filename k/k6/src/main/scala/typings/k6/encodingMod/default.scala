package typings.k6.encodingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The encoding module provides base64 encoding/decoding.
  * https://k6.io/docs/javascript-api/k6-encoding
  */
@JSImport("k6/encoding", JSImport.Default)
@js.native
object default extends js.Object {
  
  /**
    * Base64 decode a string.
    * https://k6.io/docs/javascript-api/k6-encoding/b64decode-input-encoding
    * @param input - Base64 encoded string.
    * @param encoding - Base64 variant.
    * @returns Decoded string.
    * @example
    * encoding.b64decode(str)
    * encoding.b64decode(str, 'rawstd')
    */
  def b64decode(input: String): String = js.native
  def b64decode(input: String, encoding: Base64Variant): String = js.native
  
  /**
    * Base64 decode a string.
    * https://k6.io/docs/javascript-api/k6-encoding/b64decode-input-encoding
    * @param input - Base64 encoded string.
    * @param encoding - Base64 variant.
    * @returns Decoded string.
    * @example
    * encoding.b64encode(str)
    * encoding.b64encode(str, 'rawstd')
    */
  def b64encode(input: String): String = js.native
  def b64encode(input: String, encoding: Base64Variant): String = js.native
}
