package typings.hashWasm

import typings.hashWasm.distLibUtilMod.IDataType
import typings.hashWasm.distLibWasminterfaceMod.IHasher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibXxhash32Mod {
  
  @JSImport("hash-wasm/dist/lib/xxhash32", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createXXHash32(): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createXXHash32")().asInstanceOf[js.Promise[IHasher]]
  inline def createXXHash32(seed: Double): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createXXHash32")(seed.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IHasher]]
  
  inline def xxhash32(data: IDataType): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("xxhash32")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def xxhash32(data: IDataType, seed: Double): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("xxhash32")(data.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
