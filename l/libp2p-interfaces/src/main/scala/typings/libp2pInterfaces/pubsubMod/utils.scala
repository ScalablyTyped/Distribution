package typings.libp2pInterfaces.pubsubMod

import typings.std.Set
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libp2p-interfaces/src/pubsub", "utils")
@js.native
object utils extends js.Object {
  
  def anyMatch(a: js.Array[_], b: js.Array[_]): Boolean = js.native
  def anyMatch(a: js.Array[_], b: Set[_]): Boolean = js.native
  def anyMatch(a: Set[_], b: js.Array[_]): Boolean = js.native
  def anyMatch(a: Set[_], b: Set[_]): Boolean = js.native
  
  def ensureArray(maybeArray: js.Any): js.Array[_] = js.native
  
  def msgId(from: String, seqno: Uint8Array): Uint8Array = js.native
  
  def noSignMsgId(data: Uint8Array): Uint8Array = js.native
  
  def normalizeInRpcMessage(message: js.Any, peerId: String): js.Any = js.native
  
  def normalizeOutRpcMessage(message: js.Any): js.Any = js.native
  
  def randomSeqno(): Uint8Array = js.native
}
