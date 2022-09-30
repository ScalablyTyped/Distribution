package typings.jssha

import typings.jssha.anon.B64Pad
import typings.jssha.anon.OutputLen
import typings.jssha.anon.OutputLenNumber
import typings.jssha.anon.OutputUpper
import typings.jssha.anon.ShakeLen
import typings.jssha.anon.`9`
import typings.jssha.jsshaInts.`-1`
import typings.jssha.jsshaInts.`1`
import typings.jssha.jsshaStrings.ARRAYBUFFER
import typings.jssha.jsshaStrings.B64
import typings.jssha.jsshaStrings.BYTES
import typings.jssha.jsshaStrings.HEX
import typings.jssha.jsshaStrings.TEXT
import typings.jssha.jsshaStrings.UINT8ARRAY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sha256Mod {
  
  @JSImport("jssha/dist/sha256", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with jsSHA {
    def this(variant: VariantType, inputFormat: TEXT) = this()
    def this(variant: VariantType, inputFormat: FormatNoTextType) = this()
    def this(variant: VariantType, inputFormat: TEXT, options: FixedLengthOptionsEncodingType) = this()
    def this(variant: VariantType, inputFormat: FormatNoTextType, options: FixedLengthOptionsNoEncodingType) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jssha.jsshaStrings.UTF8
    - typings.jssha.jsshaStrings.UTF16BE
    - typings.jssha.jsshaStrings.UTF16LE
  */
  trait EncodingType extends StObject
  object EncodingType {
    
    inline def UTF16BE: typings.jssha.jsshaStrings.UTF16BE = "UTF16BE".asInstanceOf[typings.jssha.jsshaStrings.UTF16BE]
    
    inline def UTF16LE: typings.jssha.jsshaStrings.UTF16LE = "UTF16LE".asInstanceOf[typings.jssha.jsshaStrings.UTF16LE]
    
    inline def UTF8: typings.jssha.jsshaStrings.UTF8 = "UTF8".asInstanceOf[typings.jssha.jsshaStrings.UTF8]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jssha.anon.`7`
    - typings.jssha.anon.`8`
  */
  trait FixedLengthOptionsEncodingType extends StObject
  object FixedLengthOptionsEncodingType {
    
    inline def `7`(): typings.jssha.anon.`7` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.jssha.anon.`7`]
    }
    
    inline def `8`(): typings.jssha.anon.`8` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.jssha.anon.`8`]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jssha.anon.`6`
    - typings.jssha.anon.NumRounds
  */
  trait FixedLengthOptionsNoEncodingType extends StObject
  object FixedLengthOptionsNoEncodingType {
    
    inline def `6`(): typings.jssha.anon.`6` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.jssha.anon.`6`]
    }
    
    inline def NumRounds(): typings.jssha.anon.NumRounds = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.jssha.anon.NumRounds]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jssha.jsshaStrings.HEX
    - typings.jssha.jsshaStrings.B64
    - typings.jssha.jsshaStrings.BYTES
    - typings.jssha.jsshaStrings.ARRAYBUFFER
    - typings.jssha.jsshaStrings.UINT8ARRAY
  */
  trait FormatNoTextType extends StObject
  object FormatNoTextType {
    
    inline def ARRAYBUFFER: typings.jssha.jsshaStrings.ARRAYBUFFER = "ARRAYBUFFER".asInstanceOf[typings.jssha.jsshaStrings.ARRAYBUFFER]
    
    inline def B64: typings.jssha.jsshaStrings.B64 = "B64".asInstanceOf[typings.jssha.jsshaStrings.B64]
    
    inline def BYTES: typings.jssha.jsshaStrings.BYTES = "BYTES".asInstanceOf[typings.jssha.jsshaStrings.BYTES]
    
    inline def HEX: typings.jssha.jsshaStrings.HEX = "HEX".asInstanceOf[typings.jssha.jsshaStrings.HEX]
    
    inline def UINT8ARRAY: typings.jssha.jsshaStrings.UINT8ARRAY = "UINT8ARRAY".asInstanceOf[typings.jssha.jsshaStrings.UINT8ARRAY]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jssha.jsshaStrings.TEXT
    - typings.jssha.jsshaStrings.HEX
    - typings.jssha.jsshaStrings.B64
    - typings.jssha.jsshaStrings.BYTES
    - typings.jssha.jsshaStrings.ARRAYBUFFER
    - typings.jssha.jsshaStrings.UINT8ARRAY
  */
  trait FormatType extends StObject
  object FormatType {
    
    inline def ARRAYBUFFER: typings.jssha.jsshaStrings.ARRAYBUFFER = "ARRAYBUFFER".asInstanceOf[typings.jssha.jsshaStrings.ARRAYBUFFER]
    
    inline def B64: typings.jssha.jsshaStrings.B64 = "B64".asInstanceOf[typings.jssha.jsshaStrings.B64]
    
    inline def BYTES: typings.jssha.jsshaStrings.BYTES = "BYTES".asInstanceOf[typings.jssha.jsshaStrings.BYTES]
    
    inline def HEX: typings.jssha.jsshaStrings.HEX = "HEX".asInstanceOf[typings.jssha.jsshaStrings.HEX]
    
    inline def TEXT: typings.jssha.jsshaStrings.TEXT = "TEXT".asInstanceOf[typings.jssha.jsshaStrings.TEXT]
    
    inline def UINT8ARRAY: typings.jssha.jsshaStrings.UINT8ARRAY = "UINT8ARRAY".asInstanceOf[typings.jssha.jsshaStrings.UINT8ARRAY]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jssha.anon.EncodingFormatValue
    - typings.jssha.anon.Format
    - typings.jssha.anon.Value
    - typings.jssha.anon.FormatValue
  */
  trait GenericInputType extends StObject
  object GenericInputType {
    
    inline def EncodingFormatValue(value: String): typings.jssha.anon.EncodingFormatValue = {
      val __obj = js.Dynamic.literal(format = "TEXT", value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jssha.anon.EncodingFormatValue]
    }
    
    inline def Format(format: B64 | HEX | BYTES, value: String): typings.jssha.anon.Format = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jssha.anon.Format]
    }
    
    inline def FormatValue(value: js.typedarray.Uint8Array): typings.jssha.anon.FormatValue = {
      val __obj = js.Dynamic.literal(format = "UINT8ARRAY", value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jssha.anon.FormatValue]
    }
    
    inline def Value(value: js.typedarray.ArrayBuffer): typings.jssha.anon.Value = {
      val __obj = js.Dynamic.literal(format = "ARRAYBUFFER", value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jssha.anon.Value]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jssha.jsshaStrings.`SHA-224`
    - typings.jssha.jsshaStrings.`SHA-256`
  */
  trait VariantType extends StObject
  object VariantType {
    
    inline def `SHA-224`: typings.jssha.jsshaStrings.`SHA-224` = "SHA-224".asInstanceOf[typings.jssha.jsshaStrings.`SHA-224`]
    
    inline def `SHA-256`: typings.jssha.jsshaStrings.`SHA-256` = "SHA-256".asInstanceOf[typings.jssha.jsshaStrings.`SHA-256`]
  }
  
  @js.native
  trait jsSHA
    extends StObject
       with jsSHABase[js.Array[Double], VariantType] {
    
    def finalizeFunc(remainder: js.Array[Double], remainderBinLen: Double, processedBinLen: Double, H: js.Array[Double]): js.Array[Double] = js.native
    
    @JSName("getMAC")
    def getMAC_MjsSHA(): js.Array[Double] = js.native
  }
  
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
    def setHMACKey_TEXT(key: String, inputFormat: TEXT, options: `9`): Unit = js.native
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
  
  trait packedValue extends StObject {
    
    var binLen: Double
    
    var value: js.Array[Double]
  }
  object packedValue {
    
    inline def apply(binLen: Double, value: js.Array[Double]): packedValue = {
      val __obj = js.Dynamic.literal(binLen = binLen.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[packedValue]
    }
    
    extension [Self <: packedValue](x: Self) {
      
      inline def setBinLen(value: Double): Self = StObject.set(x, "binLen", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Array[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueVarargs(value: Double*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
}
