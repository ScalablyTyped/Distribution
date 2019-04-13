package typings
package jsshaLib.jsshaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hasher[InputT] extends js.Object {
  def getHMAC(format: ArrayBufferDataFormat): stdLib.ArrayBuffer = js.native
  def getHMAC(format: ArrayBufferDataFormat, outputFormatOpts: OutputFormatOptions): stdLib.ArrayBuffer = js.native
  /**
    * Returns the the HMAC in the specified format using the key given by
    * a previous setHMACKey call.
    *
    * @param format - The desired output formatting.
    * @returns The string representation of the hash in the format
    *   specified
    */
  def getHMAC(format: StringDataFormat): java.lang.String = js.native
  def getHMAC(format: StringDataFormat, outputFormatOpts: OutputFormatOptions): java.lang.String = js.native
  def getHash(format: ArrayBufferDataFormat): stdLib.ArrayBuffer = js.native
  def getHash(format: ArrayBufferDataFormat, outputFormatOpts: OutputFormatOptions): stdLib.ArrayBuffer = js.native
  /**
    * Returns the desired SHA hash of the string specified at instantiation
    * using the specified parameters
    *
    * @expose
    * @param format - The desired output formatting.
    * @returns The string representation of the hash
    *   in the format specified.
    */
  def getHash(format: StringDataFormat): java.lang.String = js.native
  def getHash(format: StringDataFormat, outputFormatOpts: OutputFormatOptions): java.lang.String = js.native
  /**
    * Sets the HMAC key for an eventual getHMAC call.  Must be called
    * immediately after jsSHA object instantiation
    *
    * @param key - The key used to calculate the HMAC.
    * @param inputFormat - The format of key.
    */
  def setHMACKey(key: java.lang.String, inputFormat: StringDataFormat): scala.Unit = js.native
  def setHMACKey(key: java.lang.String, inputFormat: StringDataFormat, encodingOpts: EncodingOptions): scala.Unit = js.native
  def setHMACKey(key: stdLib.ArrayBuffer, inputFormat: ArrayBufferDataFormat): scala.Unit = js.native
  def setHMACKey(key: stdLib.ArrayBuffer, inputFormat: ArrayBufferDataFormat, encodingOpts: EncodingOptions): scala.Unit = js.native
  /**
    * Takes strString and hashes as many blocks as possible.  Stores the
    * rest for either a future update or getHash call.
    *
    * @param srcString - The string to be hashed
    */
  def update(srcString: InputT): scala.Unit = js.native
}

