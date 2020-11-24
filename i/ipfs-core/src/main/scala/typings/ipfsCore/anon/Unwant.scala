package typings.ipfsCore.anon

import typings.cids.mod.^
import typings.ipfsCore.srcUtilsMod.AbortOptions
import typings.ipfsCore.statMod.BitswapStats
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Unwant extends js.Object {
  
  def stat(): js.Promise[BitswapStats] = js.native
  def stat(_options: AbortOptions): js.Promise[BitswapStats] = js.native
  
  def unwant(cids: js.Array[^]): js.Promise[Unit] = js.native
  def unwant(cids: js.Array[^], options: AbortOptions): js.Promise[Unit] = js.native
  def unwant(cids: ^): js.Promise[Unit] = js.native
  def unwant(cids: ^, options: AbortOptions): js.Promise[Unit] = js.native
  
  def wantlist(): js.Promise[js.Array[^]] = js.native
  def wantlist(options: AbortOptions): js.Promise[js.Array[^]] = js.native
  
  def wantlistForPeer(peerId: String): js.Promise[js.Array[^]] = js.native
  def wantlistForPeer(peerId: String, options: AbortOptions): js.Promise[js.Array[^]] = js.native
  def wantlistForPeer(peerId: ^): js.Promise[js.Array[^]] = js.native
  def wantlistForPeer(peerId: ^, options: AbortOptions): js.Promise[js.Array[^]] = js.native
  def wantlistForPeer(peerId: typings.peerId.mod.^): js.Promise[js.Array[^]] = js.native
  def wantlistForPeer(peerId: typings.peerId.mod.^, options: AbortOptions): js.Promise[js.Array[^]] = js.native
  def wantlistForPeer(peerId: Uint8Array): js.Promise[js.Array[^]] = js.native
  def wantlistForPeer(peerId: Uint8Array, options: AbortOptions): js.Promise[js.Array[^]] = js.native
}
