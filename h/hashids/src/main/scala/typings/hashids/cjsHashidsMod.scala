package typings.hashids

import typings.hashids.cjsUtilMod.NumberLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsHashidsMod {
  
  @JSImport("hashids/cjs/hashids", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Hashids {
    def this(salt: String) = this()
    def this(salt: String, minLength: Double) = this()
    def this(salt: Unit, minLength: Double) = this()
    def this(salt: String, minLength: Double, alphabet: String) = this()
    def this(salt: String, minLength: Unit, alphabet: String) = this()
    def this(salt: Unit, minLength: Double, alphabet: String) = this()
    def this(salt: Unit, minLength: Unit, alphabet: String) = this()
    def this(salt: String, minLength: Double, alphabet: String, seps: String) = this()
    def this(salt: String, minLength: Double, alphabet: Unit, seps: String) = this()
    def this(salt: String, minLength: Unit, alphabet: String, seps: String) = this()
    def this(salt: String, minLength: Unit, alphabet: Unit, seps: String) = this()
    def this(salt: Unit, minLength: Double, alphabet: String, seps: String) = this()
    def this(salt: Unit, minLength: Double, alphabet: Unit, seps: String) = this()
    def this(salt: Unit, minLength: Unit, alphabet: String, seps: String) = this()
    def this(salt: Unit, minLength: Unit, alphabet: Unit, seps: String) = this()
  }
  
  @js.native
  trait Hashids extends StObject {
    
    /* private */ var _decode: Any = js.native
    
    /* private */ var _encode: Any = js.native
    
    /* private */ var allowedCharsRegExp: Any = js.native
    
    /* private */ var alphabet: Any = js.native
    
    def decode(id: String): js.Array[NumberLike] = js.native
    
    def decodeHex(id: String): String = js.native
    
    def encode(numbers: (NumberLike | String)*): String = js.native
    def encode(numbers: String): String = js.native
    def encode(numbers: js.Array[NumberLike | String]): String = js.native
    
    def encodeHex(inputHex: String): String = js.native
    /**
      * @description Splits a hex string into groups of 12-digit hexadecimal numbers,
      * then prefixes each with '1' and encodes the resulting array of numbers
      *
      * Encoding '00000000000f00000000000f000f' would be the equivalent of:
      * Hashids.encode([0x100000000000f, 0x100000000000f, 0x1000f])
      *
      * This means that if your environment supports BigInts,
      * you will get different (shorter) results if you provide
      * a BigInt representation of your hex and use `encode` directly, e.g.:
      * Hashids.encode(BigInt(`0x${hex}`))
      *
      * To decode such a representation back to a hex string, use the following snippet:
      * Hashids.decode(id)[0].toString(16)
      */
    def encodeHex(inputHex: js.BigInt): String = js.native
    
    /* private */ var guards: Any = js.native
    
    /* private */ var guardsRegExp: Any = js.native
    
    def isValidId(id: String): Boolean = js.native
    
    /* private */ var minLength: Any = js.native
    
    /* private */ var salt: Any = js.native
    
    /* private */ var seps: Any = js.native
    
    /* private */ var sepsRegExp: Any = js.native
  }
}
