package typings.hashWasm

import typings.hashWasm.distLibUtilMod.IDataType
import typings.hashWasm.distLibWasminterfaceMod.IHasher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibMd4Mod {
  
  @JSImport("hash-wasm/dist/lib/md4", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createMD4(): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMD4")().asInstanceOf[js.Promise[IHasher]]
  
  inline def md4(data: IDataType): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("md4")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
}
