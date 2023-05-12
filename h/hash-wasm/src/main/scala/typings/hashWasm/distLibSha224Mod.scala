package typings.hashWasm

import typings.hashWasm.distLibUtilMod.IDataType
import typings.hashWasm.distLibWasminterfaceMod.IHasher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibSha224Mod {
  
  @JSImport("hash-wasm/dist/lib/sha224", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createSHA224(): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSHA224")().asInstanceOf[js.Promise[IHasher]]
  
  inline def sha224(data: IDataType): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sha224")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
}
