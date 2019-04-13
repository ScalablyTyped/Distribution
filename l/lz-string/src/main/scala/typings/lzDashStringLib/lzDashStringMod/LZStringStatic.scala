package typings
package lzDashStringLib.lzDashStringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * LZ-based compression algorithm for JavaScript.
  */
trait LZStringStatic extends js.Object {
  /**
    * Compresses input string producing an instance of an "invalid" UTF-16 string.
    * Such string could be stored in localStorage only on webkit
    * browsers (tested on Android, Chrome, Safari).
    *
    * @param uncompressed A string which should be compressed.
    */
  def compress(uncompressed: java.lang.String): java.lang.String
  /**
    * Compresses input string producing an instance of a ASCII UTF-16 string,
    * which represents the original string encoded in Base64.
    * The result can be safely transported outside the browser with a
    * guarantee that none of the characters produced need to be URL-encoded.
    *
    * @param uncompressed A string which should be compressed.
    */
  def compressToBase64(uncompressed: java.lang.String): java.lang.String
  /**
    * produces ASCII strings representing the original string encoded in Base64 with a few
    * tweaks to make these URI safe. Hence, you can send them to the server without thinking
    * about URL encoding them. This saves bandwidth and CPU
    *
    * @param uncompressed A string which should be compressed.
    */
  def compressToEncodedURIComponent(uncompressed: java.lang.String): java.lang.String
  /**
    * Compresses input string producing an instance of a "valid" UTF-16 string,
    * in the sense that all browsers can store them safely.
    *
    * @param uncompressed A string which should be compressed.
    */
  def compressToUTF16(uncompressed: java.lang.String): java.lang.String
  /**
    * produces an uint8Array
    *
    * @param uncompressed A string which should be compressed.
    */
  def compressToUint8Array(uncompressed: java.lang.String): stdLib.Uint8Array
  /**
    * Decompresses "invalid" input string created by the method compress().
    *
    * @param compressed A string obtained from a call to compress().
    */
  def decompress(compressed: java.lang.String): java.lang.String
  /**
    * Decompresses ASCII UTF-16 input string created by the method compressToBase64().
    *
    * @param compressed A string obtained from a call to compressToBase64().
    */
  def decompressFromBase64(compressed: java.lang.String): java.lang.String
  /**
    * Decompresses "valid" input string created by the method compressToEncodedURIComponent().
    *
    * @param compressed A string obtained from a call to compressToEncodedURIComponent().
    */
  def decompressFromEncodedURIComponent(compressed: java.lang.String): java.lang.String
  /**
    * Decompresses "valid" input string created by the method compressToUTF16().
    *
    * @param compressed A string obtained from a call to compressToUTF16().
    */
  def decompressFromUTF16(compressed: java.lang.String): java.lang.String
  /**
    * Decompresses "valid" array created by the method compressToUint8Array().
    *
    * @param compressed A string obtained from a call to compressToUint8Array().
    */
  def decompressFromUint8Array(compressed: stdLib.Uint8Array): java.lang.String
}

object LZStringStatic {
  @scala.inline
  def apply(
    compress: java.lang.String => java.lang.String,
    compressToBase64: java.lang.String => java.lang.String,
    compressToEncodedURIComponent: java.lang.String => java.lang.String,
    compressToUTF16: java.lang.String => java.lang.String,
    compressToUint8Array: java.lang.String => stdLib.Uint8Array,
    decompress: java.lang.String => java.lang.String,
    decompressFromBase64: java.lang.String => java.lang.String,
    decompressFromEncodedURIComponent: java.lang.String => java.lang.String,
    decompressFromUTF16: java.lang.String => java.lang.String,
    decompressFromUint8Array: stdLib.Uint8Array => java.lang.String
  ): LZStringStatic = {
    val __obj = js.Dynamic.literal(compress = js.Any.fromFunction1(compress), compressToBase64 = js.Any.fromFunction1(compressToBase64), compressToEncodedURIComponent = js.Any.fromFunction1(compressToEncodedURIComponent), compressToUTF16 = js.Any.fromFunction1(compressToUTF16), compressToUint8Array = js.Any.fromFunction1(compressToUint8Array), decompress = js.Any.fromFunction1(decompress), decompressFromBase64 = js.Any.fromFunction1(decompressFromBase64), decompressFromEncodedURIComponent = js.Any.fromFunction1(decompressFromEncodedURIComponent), decompressFromUTF16 = js.Any.fromFunction1(decompressFromUTF16), decompressFromUint8Array = js.Any.fromFunction1(decompressFromUint8Array))
  
    __obj.asInstanceOf[LZStringStatic]
  }
}

