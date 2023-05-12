package typings.libp2pMplex

import typings.itStreamTypes.mod.Source
import typings.libp2pMplex.distSrcMessageTypesMod.Message
import typings.std.AsyncGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcEncodeMod {
  
  @JSImport("@libp2p/mplex/dist/src/encode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def encode(source: Source[js.Array[Message]]): AsyncGenerator[js.typedarray.Uint8Array, Unit, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(source.asInstanceOf[js.Any]).asInstanceOf[AsyncGenerator[js.typedarray.Uint8Array, Unit, Unit]]
  inline def encode(source: Source[js.Array[Message]], minSendBytes: Double): AsyncGenerator[js.typedarray.Uint8Array, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(source.asInstanceOf[js.Any], minSendBytes.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[js.typedarray.Uint8Array, Unit, Unit]]
}
