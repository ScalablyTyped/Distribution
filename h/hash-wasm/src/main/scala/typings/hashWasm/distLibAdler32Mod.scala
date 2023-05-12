package typings.hashWasm

import typings.hashWasm.distLibUtilMod.IDataType
import typings.hashWasm.distLibWasminterfaceMod.IHasher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibAdler32Mod {
  
  @JSImport("hash-wasm/dist/lib/adler32", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adler32(data: IDataType): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("adler32")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def createAdler32(): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAdler32")().asInstanceOf[js.Promise[IHasher]]
}
