package typings.kdbxweb

import typings.kdbxweb.distTypesUtilsInt64Mod.Int64
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCryptoHmacBlockTransformMod {
  
  @JSImport("kdbxweb/dist/types/crypto/hmac-block-transform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decrypt(data: js.typedarray.ArrayBuffer, key: js.typedarray.ArrayBuffer): js.Promise[js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
  
  inline def encrypt(data: js.typedarray.ArrayBuffer, key: js.typedarray.ArrayBuffer): js.Promise[js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
  
  inline def getHmacKey(key: js.typedarray.ArrayBuffer, blockIndex: Int64): js.Promise[js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHmacKey")(key.asInstanceOf[js.Any], blockIndex.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
}
