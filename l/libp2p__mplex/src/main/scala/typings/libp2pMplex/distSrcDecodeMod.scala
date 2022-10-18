package typings.libp2pMplex

import typings.itStreamTypes.mod.Source
import typings.libp2pMplex.distSrcMessageTypesMod.Message
import typings.std.AsyncGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDecodeMod {
  
  @JSImport("@libp2p/mplex/dist/src/decode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(source: Source[js.typedarray.Uint8Array]): AsyncGenerator[js.Array[Message], Unit, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(source.asInstanceOf[js.Any]).asInstanceOf[AsyncGenerator[js.Array[Message], Unit, Any]]
}
