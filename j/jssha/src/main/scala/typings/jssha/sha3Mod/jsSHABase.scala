package typings.jssha.sha3Mod

import typings.jssha.anon.B64Pad
import typings.jssha.anon.OutputLen
import typings.jssha.anon.OutputLenNumber
import typings.jssha.anon.OutputUpper
import typings.jssha.anon.ShakeLen
import typings.jssha.anon.`13`
import typings.jssha.jsshaNumbers.`-1`
import typings.jssha.jsshaNumbers.`1`
import typings.jssha.jsshaStrings.ARRAYBUFFER
import typings.jssha.jsshaStrings.B64
import typings.jssha.jsshaStrings.BYTES
import typings.jssha.jsshaStrings.HEX
import typings.jssha.jsshaStrings.TEXT
import typings.jssha.jsshaStrings.UINT8ARRAY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait jsSHABase[StateT, VariantT] extends StObject {
  
  /* protected */ val HMACSupported: Boolean = js.native
  
  /**
    * Internal function that returns the "raw" HMAC
    */
  /* protected */ def _getHMAC(): js.Array[Double] = js.native
  
  /**
    * Internal function that sets the MAC key.
    *
    * @param key The packed MAC key to use
    */
  /* protected */ def _setHMACKey(key: packedValue): Unit = js.native
  
  /* protected */ val bigEndianMod: `-1` | `1` = js.native
  
  /* protected */ def converterFunc(input: Any, existingBin: js.Array[Double], existingBinLen: Double): packedValue = js.native
  
  /* protected */ def finalizeFunc(
    remainder: js.Array[Double],
    remainderBinLen: Double,
    processedBinLen: Double,
    H: StateT,
    outputLen: Double
  ): js.Array[Double] = js.native
  
  @JSName("getHMAC")
  def getHMAC_ARRAYBUFFER(format: ARRAYBUFFER): js.typedarray.ArrayBuffer = js.native
  @JSName("getHMAC")
  def getHMAC_B64(format: B64): String = js.native
  @JSName("getHMAC")
  def getHMAC_B64(format: B64, options: typings.jssha.anon.`1`): String = js.native
  @JSName("getHMAC")
  def getHMAC_BYTES(format: BYTES): String = js.native
  /**
    * Returns the the HMAC in the specified format using the key given by a previous `setHMACKey` call.
    *
    * @param format The desired output formatting.
    * @param options Hashmap of extra outputs options.
    * @returns The HMAC in the format specified.
    */
  @JSName("getHMAC")
  def getHMAC_HEX(format: HEX): String = js.native
  @JSName("getHMAC")
  def getHMAC_HEX(format: HEX, options: OutputUpper): String = js.native
  @JSName("getHMAC")
  def getHMAC_UINT8ARRAY(format: UINT8ARRAY): js.typedarray.Uint8Array = js.native
  
  @JSName("getHash")
  def getHash_ARRAYBUFFER(format: ARRAYBUFFER): js.typedarray.ArrayBuffer = js.native
  @JSName("getHash")
  def getHash_ARRAYBUFFER(format: ARRAYBUFFER, options: ShakeLen): js.typedarray.ArrayBuffer = js.native
  @JSName("getHash")
  def getHash_B64(format: B64): String = js.native
  @JSName("getHash")
  def getHash_B64(format: B64, options: B64Pad): String = js.native
  @JSName("getHash")
  def getHash_BYTES(format: BYTES): String = js.native
  @JSName("getHash")
  def getHash_BYTES(format: BYTES, options: ShakeLen): String = js.native
  /**
    * Returns the desired SHA hash of the input fed in via `update` calls.
    *
    * @param format The desired output formatting
    * @param options Hashmap of output formatting options. `outputLen` must be specified for variable length hashes.
    *   `outputLen` replaces the now deprecated `shakeLen` key.
    * @returns The hash in the format specified.
    */
  @JSName("getHash")
  def getHash_HEX(format: HEX): String = js.native
  @JSName("getHash")
  def getHash_HEX(format: HEX, options: OutputLen): String = js.native
  @JSName("getHash")
  def getHash_UINT8ARRAY(format: UINT8ARRAY): js.typedarray.Uint8Array = js.native
  @JSName("getHash")
  def getHash_UINT8ARRAY(format: UINT8ARRAY, options: ShakeLen): js.typedarray.Uint8Array = js.native
  
  /* protected */ val getMAC: (js.Function1[/* options */ OutputLenNumber, js.Array[Double]]) | Null = js.native
  
  /* protected */ val inputFormat: FormatType = js.native
  
  /* protected */ var intermediateState: StateT = js.native
  
  /* protected */ val isVariableLen: Boolean = js.native
  
  /* protected */ var keyWithIPad: js.Array[Double] = js.native
  
  /* protected */ var keyWithOPad: js.Array[Double] = js.native
  
  /* protected */ var macKeySet: Boolean = js.native
  
  /* protected */ def newStateFunc(variant: VariantT): StateT = js.native
  
  /* protected */ val numRounds: Double = js.native
  
  /* protected */ val outputBinLen: Double = js.native
  
  /* protected */ var processedLen: Double = js.native
  
  /* protected */ var remainder: js.Array[Double] = js.native
  
  /* protected */ var remainderLen: Double = js.native
  
  /* protected */ def roundFunc(block: js.Array[Double], H: StateT): StateT = js.native
  
  def setHMACKey(key: String, inputFormat: B64 | HEX | BYTES): Unit = js.native
  @JSName("setHMACKey")
  def setHMACKey_ARRAYBUFFER(key: js.typedarray.ArrayBuffer, inputFormat: ARRAYBUFFER): Unit = js.native
  /**
    * Sets the HMAC key for an eventual `getHMAC` call.  Must be called immediately after jsSHA object instantiation.
    *
    * @param key The key used to calculate the HMAC
    * @param inputFormat The format of key.
    * @param options Hashmap of extra input options.
    */
  @JSName("setHMACKey")
  def setHMACKey_TEXT(key: String, inputFormat: TEXT): Unit = js.native
  @JSName("setHMACKey")
  def setHMACKey_TEXT(key: String, inputFormat: TEXT, options: `13`): Unit = js.native
  @JSName("setHMACKey")
  def setHMACKey_UINT8ARRAY(key: js.typedarray.Uint8Array, inputFormat: UINT8ARRAY): Unit = js.native
  
  /**
    * @param variant The desired SHA variant.
    * @param inputFormat The input format to be used in future `update` calls.
    * @param options Hashmap of extra input options.
    */
  /* protected */ val shaVariant: VariantT = js.native
  
  /* protected */ def stateCloneFunc(state: StateT): StateT = js.native
  
  /**
    * Hashes as many blocks as possible.  Stores the rest for either a future update or getHash call.
    *
    * @param srcString The input to be hashed.
    */
  def update(srcString: String): Unit = js.native
  def update(srcString: js.typedarray.ArrayBuffer): Unit = js.native
  def update(srcString: js.typedarray.Uint8Array): Unit = js.native
  
  /* protected */ var updateCalled: Boolean = js.native
  
  /* protected */ val utfType: EncodingType = js.native
  
  /* protected */ val variantBlockSize: Double = js.native
}
