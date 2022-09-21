package typings.kdbxweb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object KeyEncryptorKdf {
  
  @JSImport("kdbxweb", "KeyEncryptorKdf")
  @js.native
  val ^ : js.Any = js.native
  
  inline def encrypt(key: js.typedarray.ArrayBuffer, kdfParams: typings.kdbxweb.varDictionaryMod.VarDictionary): js.Promise[js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(key.asInstanceOf[js.Any], kdfParams.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
}
