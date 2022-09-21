package typings.kdbxweb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protectedValueMod {
  
  @JSImport("kdbxweb/dist/types/crypto/protected-value", "ProtectedValue")
  @js.native
  open class ProtectedValue protected () extends StObject {
    def this(value: js.typedarray.ArrayBuffer, salt: js.typedarray.ArrayBuffer) = this()
    
    def byteLength: Double = js.native
    
    def getBinary(): js.typedarray.Uint8Array = js.native
    
    def getHash(): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    def getText(): String = js.native
    
    def includes(str: String): Boolean = js.native
    
    val salt: js.typedarray.Uint8Array = js.native
    
    def setSalt(newSalt: js.typedarray.ArrayBuffer): Unit = js.native
    
    def toBase64(): String = js.native
    
    val value: js.typedarray.Uint8Array = js.native
  }
  /* static members */
  object ProtectedValue {
    
    @JSImport("kdbxweb/dist/types/crypto/protected-value", "ProtectedValue")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromBase64(base64: String): ProtectedValue = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64")(base64.asInstanceOf[js.Any]).asInstanceOf[ProtectedValue]
    
    /**
      * Keep in mind that you're passing the ownership of this array, the contents will be destroyed
      */
    inline def fromBinary(binary: js.typedarray.ArrayBuffer): ProtectedValue = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(binary.asInstanceOf[js.Any]).asInstanceOf[ProtectedValue]
    
    inline def fromString(str: String): ProtectedValue = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any]).asInstanceOf[ProtectedValue]
  }
}
