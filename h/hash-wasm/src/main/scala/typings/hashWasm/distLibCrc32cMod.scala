package typings.hashWasm

import typings.hashWasm.distLibUtilMod.IDataType
import typings.hashWasm.distLibWasminterfaceMod.IHasher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCrc32cMod {
  
  @JSImport("hash-wasm/dist/lib/crc32c", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def crc32c(data: IDataType): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("crc32c")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def createCRC32C(): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createCRC32C")().asInstanceOf[js.Promise[IHasher]]
}
