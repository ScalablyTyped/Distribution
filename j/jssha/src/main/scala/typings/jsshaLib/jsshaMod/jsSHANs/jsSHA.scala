package typings
package jsshaLib.jsshaMod.jsSHANs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait jsSHA
  extends /**
         * jsSHA is the workhorse of the library.  Instantiate it with the string to
         * be hashed as the parameter
         *
         * @param {string} variant The desired SHA variant (SHA-1, SHA-224, SHA-256,
         *   SHA-384, or SHA-512)
         * @param {string} inputFormat The format of srcString: HEX, TEXT, B64, or BYTES
         * @param {{encoding: (string|undefined), numRounds: (string|undefined)}=}
         *   options Optional values
         */
org.scalablytyped.runtime.Instantiable2[/* variant */ java.lang.String, /* inputFormat */ java.lang.String, jsSHA]
     with /**
         * jsSHA is the workhorse of the library.  Instantiate it with the string to
         * be hashed as the parameter
         *
         * @param {string} variant The desired SHA variant (SHA-1, SHA-224, SHA-256,
         *   SHA-384, or SHA-512)
         * @param {string} inputFormat The format of srcString: HEX, TEXT, B64, or BYTES
         * @param {{encoding: (string|undefined), numRounds: (string|undefined)}=}
         *   options Optional values
         */
org.scalablytyped.runtime.Instantiable3[
      /* variant */ java.lang.String, 
      /* inputFormat */ java.lang.String, 
      /* options */ Options, 
      jsSHA
    ] {
  /**
  		 * Returns the the HMAC in the specified format using the key given by
  		 * a previous setHMACKey call.
  		 *
  		 * @param {string} format The desired output formatting
  		 *   (B64, HEX, or BYTES)
  		 * @param {{outputUpper : (boolean|undefined), b64Pad : (string|undefined)}=}
  		 *   outputFormatOpts associative array of output formatting options
  		 * @return {string} The string representation of the hash in the format
  		 *   specified
  		 */
  def getHMAC(format: java.lang.String): java.lang.String = js.native
  /**
  		 * Returns the the HMAC in the specified format using the key given by
  		 * a previous setHMACKey call.
  		 *
  		 * @param {string} format The desired output formatting
  		 *   (B64, HEX, or BYTES)
  		 * @param {{outputUpper : (boolean|undefined), b64Pad : (string|undefined)}=}
  		 *   outputFormatOpts associative array of output formatting options
  		 * @return {string} The string representation of the hash in the format
  		 *   specified
  		 */
  def getHMAC(format: java.lang.String, outputFormatOpts: OutputFormatOptions): java.lang.String = js.native
  /**
  		 * Returns the desired SHA hash of the string specified at instantiation
  		 * using the specified parameters
  		 *
  		 * @param {string} format The desired output formatting (B64, HEX, or BYTES)
  		 * @param {{outputUpper : (boolean|undefined), b64Pad : (string|undefined)}=}
  		 *   outputFormatOpts Hash list of output formatting options
  		 * @return {string} The string representation of the hash in the format
  		 *   specified
  		 */
  def getHash(format: java.lang.String): java.lang.String = js.native
  /**
  		 * Returns the desired SHA hash of the string specified at instantiation
  		 * using the specified parameters
  		 *
  		 * @param {string} format The desired output formatting (B64, HEX, or BYTES)
  		 * @param {{outputUpper : (boolean|undefined), b64Pad : (string|undefined)}=}
  		 *   outputFormatOpts Hash list of output formatting options
  		 * @return {string} The string representation of the hash in the format
  		 *   specified
  		 */
  def getHash(format: java.lang.String, outputFormatOpts: OutputFormatOptions): java.lang.String = js.native
  /**
  		 * Sets the HMAC key for an eventual getHMAC call.  Must be called
  		 * immediately after jsSHA object instantiation
  		 *
  		 * @param {string} key The key used to calculate the HMAC
  		 * @param {string} inputFormat The format of key, HEX, TEXT, B64, or BYTES
  		 * @param {{encoding : (string|undefined)}=} encodingOpts Associative array
  		 *   of input format options
  		 */
  def setHMACKey(key: java.lang.String, inputFormat: java.lang.String): scala.Unit = js.native
  /**
  		 * Sets the HMAC key for an eventual getHMAC call.  Must be called
  		 * immediately after jsSHA object instantiation
  		 *
  		 * @param {string} key The key used to calculate the HMAC
  		 * @param {string} inputFormat The format of key, HEX, TEXT, B64, or BYTES
  		 * @param {{encoding : (string|undefined)}=} encodingOpts Associative array
  		 *   of input format options
  		 */
  def setHMACKey(key: java.lang.String, inputFormat: java.lang.String, encodingOpts: EncodingOptions): scala.Unit = js.native
  /**
  		 * Takes strString and hashes as many blocks as possible.  Stores the
  		 * rest for either a future update or getHash call.
  		 *
  		 * @param {string} srcString The string to be hashed
  		 */
  def update(srcString: java.lang.String): scala.Unit = js.native
}

