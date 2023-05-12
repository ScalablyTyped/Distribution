package typings.hashWasm

import typings.hashWasm.distLibUtilMod.IDataType
import typings.hashWasm.distLibWasminterfaceMod.IHasher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibMd5Mod {
  
  @JSImport("hash-wasm/dist/lib/md5", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createMD5(): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMD5")().asInstanceOf[js.Promise[IHasher]]
  
  inline def md5(data: IDataType): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("md5")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
}
