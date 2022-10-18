package typings.itPair

import typings.itStreamTypes.mod.Duplex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object duplexMod {
  
  @JSImport("it-pair/duplex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def duplexPair[T](): js.Tuple2[Duplex[T, T, js.Promise[Unit]], Duplex[T, T, js.Promise[Unit]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("duplexPair")().asInstanceOf[js.Tuple2[Duplex[T, T, js.Promise[Unit]], Duplex[T, T, js.Promise[Unit]]]]
}
