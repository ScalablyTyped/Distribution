package typings.hashWasm

import typings.hashWasm.distLibUtilMod.IDataType
import typings.hashWasm.distLibWasminterfaceMod.IHasher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibWhirlpoolMod {
  
  @JSImport("hash-wasm/dist/lib/whirlpool", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createWhirlpool(): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createWhirlpool")().asInstanceOf[js.Promise[IHasher]]
  
  inline def whirlpool(data: IDataType): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("whirlpool")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
}
