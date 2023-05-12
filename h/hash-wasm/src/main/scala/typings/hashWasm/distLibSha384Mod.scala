package typings.hashWasm

import typings.hashWasm.distLibUtilMod.IDataType
import typings.hashWasm.distLibWasminterfaceMod.IHasher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibSha384Mod {
  
  @JSImport("hash-wasm/dist/lib/sha384", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createSHA384(): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSHA384")().asInstanceOf[js.Promise[IHasher]]
  
  inline def sha384(data: IDataType): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sha384")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
}
