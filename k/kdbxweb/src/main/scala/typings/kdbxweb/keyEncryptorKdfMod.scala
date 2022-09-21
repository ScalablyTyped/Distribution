package typings.kdbxweb

import typings.kdbxweb.varDictionaryMod.VarDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keyEncryptorKdfMod {
  
  @JSImport("kdbxweb/dist/types/crypto/key-encryptor-kdf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def encrypt(key: js.typedarray.ArrayBuffer, kdfParams: VarDictionary): js.Promise[js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(key.asInstanceOf[js.Any], kdfParams.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
}
