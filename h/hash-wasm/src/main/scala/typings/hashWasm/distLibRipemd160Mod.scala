package typings.hashWasm

import typings.hashWasm.distLibUtilMod.IDataType
import typings.hashWasm.distLibWasminterfaceMod.IHasher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibRipemd160Mod {
  
  @JSImport("hash-wasm/dist/lib/ripemd160", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createRIPEMD160(): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRIPEMD160")().asInstanceOf[js.Promise[IHasher]]
  
  inline def ripemd160(data: IDataType): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("ripemd160")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
}
