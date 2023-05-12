package typings.hashWasm

import typings.hashWasm.distLibUtilMod.IDataType
import typings.hashWasm.distLibWasminterfaceMod.IHasher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibSha256Mod {
  
  @JSImport("hash-wasm/dist/lib/sha256", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createSHA256(): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSHA256")().asInstanceOf[js.Promise[IHasher]]
  
  inline def sha256(data: IDataType): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sha256")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
}
