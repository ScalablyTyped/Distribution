package typings.hashWasm

import typings.hashWasm.distLibWasminterfaceMod.IWASMInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibLockedCreateMod {
  
  @JSImport("hash-wasm/dist/lib/lockedCreate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(mutex: typings.hashWasm.distLibMutexMod.default, binary: Any, hashLength: Double): js.Promise[IWASMInterface] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(mutex.asInstanceOf[js.Any], binary.asInstanceOf[js.Any], hashLength.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IWASMInterface]]
}
