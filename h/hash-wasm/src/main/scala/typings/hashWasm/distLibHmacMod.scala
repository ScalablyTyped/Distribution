package typings.hashWasm

import typings.hashWasm.distLibUtilMod.IDataType
import typings.hashWasm.distLibWasminterfaceMod.IHasher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibHmacMod {
  
  @JSImport("hash-wasm/dist/lib/hmac", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createHMAC(hash: js.Promise[IHasher], key: IDataType): js.Promise[IHasher] = (^.asInstanceOf[js.Dynamic].applyDynamic("createHMAC")(hash.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IHasher]]
}
