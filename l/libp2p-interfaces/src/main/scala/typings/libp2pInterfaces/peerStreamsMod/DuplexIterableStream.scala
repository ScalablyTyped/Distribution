package typings.libp2pInterfaces.peerStreamsMod

import typings.std.AsyncIterator
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DuplexIterableStream extends js.Object {
  
  def sink(source: Uint8Array): js.Promise[Uint8Array] = js.native
  @JSName("sink")
  var sink_Original: Sink = js.native
  
  def source(): AsyncIterator[Uint8Array, _, js.UndefOr[scala.Nothing]] = js.native
}
