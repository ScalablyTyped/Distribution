package typings.itPair

import typings.itStreamTypes.mod.Duplex
import typings.itStreamTypes.mod.Source
import typings.std.AsyncGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDuplexMod {
  
  @JSImport("it-pair/dist/src/duplex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def duplexPair[T](): js.Tuple2[
    Duplex[AsyncGenerator[T, Any, Any], Source[T], js.Promise[Unit]], 
    Duplex[AsyncGenerator[T, Any, Any], Source[T], js.Promise[Unit]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("duplexPair")().asInstanceOf[js.Tuple2[
    Duplex[AsyncGenerator[T, Any, Any], Source[T], js.Promise[Unit]], 
    Duplex[AsyncGenerator[T, Any, Any], Source[T], js.Promise[Unit]]
  ]]
}
