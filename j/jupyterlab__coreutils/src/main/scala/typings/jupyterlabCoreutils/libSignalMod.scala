package typings.jupyterlabCoreutils

import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSignalMod {
  
  @JSImport("@jupyterlab/coreutils/lib/signal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def signalToPromise[T, U](signal: ISignal[T, U]): js.Promise[js.Tuple2[T, U]] = ^.asInstanceOf[js.Dynamic].applyDynamic("signalToPromise")(signal.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Tuple2[T, U]]]
  inline def signalToPromise[T, U](signal: ISignal[T, U], timeout: Double): js.Promise[js.Tuple2[T, U]] = (^.asInstanceOf[js.Dynamic].applyDynamic("signalToPromise")(signal.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[T, U]]]
}
