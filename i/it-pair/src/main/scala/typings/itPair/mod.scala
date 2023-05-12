package typings.itPair

import typings.itStreamTypes.mod.Duplex
import typings.itStreamTypes.mod.Source
import typings.std.AsyncGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("it-pair", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pair[T](): Duplex[AsyncGenerator[T, Any, Any], Source[T], js.Promise[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("pair")().asInstanceOf[Duplex[AsyncGenerator[T, Any, Any], Source[T], js.Promise[Unit]]]
}
