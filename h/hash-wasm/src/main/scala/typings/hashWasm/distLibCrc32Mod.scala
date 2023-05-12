package typings.hashWasm

import typings.hashWasm.distLibUtilMod.IDataType
import typings.hashWasm.distLibWasminterfaceMod.IHasher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCrc32Mod {
  
  @JSImport("hash-wasm/dist/lib/crc32", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def crc32(data: IDataType): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("crc32")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def createCRC32(): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createCRC32")().asInstanceOf[js.Promise[IHasher]]
}
