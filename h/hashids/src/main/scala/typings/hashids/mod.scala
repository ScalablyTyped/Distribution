package typings.hashids

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hashids", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with Hashids {
    def this(salt: String) = this()
    def this(salt: String, minHashLength: Double) = this()
    def this(salt: String, minHashLength: Double, alphabet: String) = this()
    def this(salt: String, minHashLength: Unit, alphabet: String) = this()
  }
  
  @js.native
  trait Hashids extends StObject {
    
    /* private */ var alphabet: js.Array[String] = js.native
    
    def decode(hash: String): js.Array[Double] = js.native
    
    def decodeHex(hash: String): String = js.native
    
    def encode(arg: js.Array[Double]): String = js.native
    def encode(args: Double*): String = js.native
    def encode(arg: Double): String = js.native
    
    def encodeHex(str: String): String = js.native
    
    /* private */ var errorAlphabetLength: String = js.native
    
    /* private */ var errorAlphabetSpace: String = js.native
    
    /* private */ var guardDiv: Double = js.native
    
    def hash(input: Double, alphabet: String): String = js.native
    
    /* private */ var minAlphabetLength: Double = js.native
    
    /* private */ var minHashLength: Double = js.native
    
    /* private */ var salt: String = js.native
    
    /* private */ var sepDiv: Double = js.native
    
    /* private */ var seps: String = js.native
    
    def unhash(input: js.Array[String], alphabet: String): Double = js.native
    
    /* private */ var version: String = js.native
  }
}
