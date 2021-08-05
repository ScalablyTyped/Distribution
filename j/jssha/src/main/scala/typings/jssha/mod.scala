package typings.jssha

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Shortcut
import typings.jssha.jsshaStrings.ARRAYBUFFER
import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("jssha", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with Hasher[String] {
    /**
      * Create a Hasher object.
      *
      * @param variant - The desired SHA variant (SHA-1, SHA-224, SHA-256,
      *   SHA-384, SHA-512, SHA3-224, SHA3-256, SHA3-384, SHA3-512, SHAKE128, or SHAKE256).
      * @param inputFormat The format of srcString.
      */
    def this(variant: String, inputFormat: StringDataFormat) = this()
    def this(variant: String, inputFormat: StringDataFormat, options: Options) = this()
  }
  @JSImport("jssha", JSImport.Namespace)
  @js.native
  val ^ : js.Object & jsSHA = js.native
  
  type ArrayBufferDataFormat = ARRAYBUFFER
  
  trait EncodingOptions extends StObject {
    
    var encoding: js.UndefOr[String] = js.undefined
  }
  object EncodingOptions {
    
    inline def apply(): EncodingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncodingOptions]
    }
    
    extension [Self <: EncodingOptions](x: Self) {
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    }
  }
  
  @js.native
  trait Hasher[InputT] extends StObject {
    
    def getHMAC(format: ArrayBufferDataFormat): ArrayBuffer = js.native
    def getHMAC(format: ArrayBufferDataFormat, outputFormatOpts: OutputFormatOptions): ArrayBuffer = js.native
    /**
      * Returns the the HMAC in the specified format using the key given by
      * a previous setHMACKey call.
      *
      * @param format - The desired output formatting.
      * @returns The string representation of the hash in the format
      *   specified
      */
    def getHMAC(format: StringDataFormat): String = js.native
    def getHMAC(format: StringDataFormat, outputFormatOpts: OutputFormatOptions): String = js.native
    
    def getHash(format: ArrayBufferDataFormat): ArrayBuffer = js.native
    def getHash(format: ArrayBufferDataFormat, outputFormatOpts: OutputFormatOptions): ArrayBuffer = js.native
    /**
      * Returns the desired SHA hash of the string specified at instantiation
      * using the specified parameters
      *
      * @expose
      * @param format - The desired output formatting.
      * @returns The string representation of the hash
      *   in the format specified.
      */
    def getHash(format: StringDataFormat): String = js.native
    def getHash(format: StringDataFormat, outputFormatOpts: OutputFormatOptions): String = js.native
    
    /**
      * Sets the HMAC key for an eventual getHMAC call.  Must be called
      * immediately after jsSHA object instantiation
      *
      * @param key - The key used to calculate the HMAC.
      * @param inputFormat - The format of key.
      */
    def setHMACKey(key: String, inputFormat: StringDataFormat): Unit = js.native
    def setHMACKey(key: String, inputFormat: StringDataFormat, encodingOpts: EncodingOptions): Unit = js.native
    def setHMACKey(key: ArrayBuffer, inputFormat: ArrayBufferDataFormat): Unit = js.native
    def setHMACKey(key: ArrayBuffer, inputFormat: ArrayBufferDataFormat, encodingOpts: EncodingOptions): Unit = js.native
    
    /**
      * Takes strString and hashes as many blocks as possible.  Stores the
      * rest for either a future update or getHash call.
      *
      * @param srcString - The string to be hashed
      */
    def update(srcString: InputT): Unit = js.native
  }
  
  trait Options
    extends StObject
       with EncodingOptions {
    
    var numRounds: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setNumRounds(value: Double): Self = StObject.set(x, "numRounds", value.asInstanceOf[js.Any])
      
      inline def setNumRoundsUndefined: Self = StObject.set(x, "numRounds", js.undefined)
    }
  }
  
  trait OutputFormatOptions extends StObject {
    
    var b64Pad: js.UndefOr[String] = js.undefined
    
    var outputUpper: js.UndefOr[Boolean] = js.undefined
    
    var shakeLen: js.UndefOr[Double] = js.undefined
  }
  object OutputFormatOptions {
    
    inline def apply(): OutputFormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OutputFormatOptions]
    }
    
    extension [Self <: OutputFormatOptions](x: Self) {
      
      inline def setB64Pad(value: String): Self = StObject.set(x, "b64Pad", value.asInstanceOf[js.Any])
      
      inline def setB64PadUndefined: Self = StObject.set(x, "b64Pad", js.undefined)
      
      inline def setOutputUpper(value: Boolean): Self = StObject.set(x, "outputUpper", value.asInstanceOf[js.Any])
      
      inline def setOutputUpperUndefined: Self = StObject.set(x, "outputUpper", js.undefined)
      
      inline def setShakeLen(value: Double): Self = StObject.set(x, "shakeLen", value.asInstanceOf[js.Any])
      
      inline def setShakeLenUndefined: Self = StObject.set(x, "shakeLen", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jssha.jsshaStrings.HEX
    - typings.jssha.jsshaStrings.TEXT
    - typings.jssha.jsshaStrings.B64
    - typings.jssha.jsshaStrings.BYTES
  */
  trait StringDataFormat extends StObject
  object StringDataFormat {
    
    inline def B64: typings.jssha.jsshaStrings.B64 = "B64".asInstanceOf[typings.jssha.jsshaStrings.B64]
    
    inline def BYTES: typings.jssha.jsshaStrings.BYTES = "BYTES".asInstanceOf[typings.jssha.jsshaStrings.BYTES]
    
    inline def HEX: typings.jssha.jsshaStrings.HEX = "HEX".asInstanceOf[typings.jssha.jsshaStrings.HEX]
    
    inline def TEXT: typings.jssha.jsshaStrings.TEXT = "TEXT".asInstanceOf[typings.jssha.jsshaStrings.TEXT]
  }
  
  type _To = js.Object & jsSHA
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & jsSHA = ^
  
  @js.native
  trait jsSHA
    extends StObject
       with /**
    * Create a Hasher object.
    *
    * @param variant - The desired SHA variant (SHA-1, SHA-224, SHA-256,
    *   SHA-384, SHA-512, SHA3-224, SHA3-256, SHA3-384, SHA3-512, SHAKE128, or SHAKE256).
    * @param inputFormat The format of srcString.
    */
  Instantiable2[
          /* variant */ String, 
          (/* inputFormat */ ArrayBufferDataFormat) | (/* inputFormat */ StringDataFormat), 
          Hasher[ArrayBuffer | String]
        ]
       with Instantiable3[
          /* variant */ String, 
          (/* inputFormat */ ArrayBufferDataFormat) | (/* inputFormat */ StringDataFormat), 
          /* options */ Options, 
          Hasher[ArrayBuffer | String]
        ]
}
