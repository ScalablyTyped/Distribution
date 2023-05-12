package typings.hashWasm

import typings.hashWasm.distLibUtilMod.IDataType
import typings.hashWasm.distLibWasminterfaceMod.IHasher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibSm3Mod {
  
  @JSImport("hash-wasm/dist/lib/sm3", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createSM3(): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSM3")().asInstanceOf[js.Promise[IHasher]]
  
  inline def sm3(data: IDataType): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sm3")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
}
