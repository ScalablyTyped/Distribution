package typings.itPair

import typings.itStreamTypes.mod.Duplex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("it-pair", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pair[T](): Duplex[T, T, js.Promise[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("pair")().asInstanceOf[Duplex[T, T, js.Promise[Unit]]]
}
