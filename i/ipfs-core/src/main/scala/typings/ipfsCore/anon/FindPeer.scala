package typings.ipfsCore.anon

import typings.cids.mod.^
import typings.ipfsCore.dhtMod.FindProvsOptions
import typings.ipfsCore.dhtMod.PeerInfo
import typings.ipfsCore.dhtMod.ProvideOptions
import typings.ipfsCore.dhtMod.QueryEvent
import typings.ipfsCore.srcUtilsMod.AbortOptions
import typings.std.AsyncIterable
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindPeer extends js.Object {
  
  def findPeer(peerId: ^): js.Promise[Addrs] = js.native
  def findPeer(peerId: ^, options: AbortOptions): js.Promise[Addrs] = js.native
  def findPeer(peerId: typings.peerId.mod.^): js.Promise[Addrs] = js.native
  def findPeer(peerId: typings.peerId.mod.^, options: AbortOptions): js.Promise[Addrs] = js.native
  
  def findProvs(cid: ^): AsyncIterable[PeerInfo] = js.native
  def findProvs(cid: ^, options: FindProvsOptions with AbortOptions): AsyncIterable[PeerInfo] = js.native
  
  def get(key: String): js.Promise[Uint8Array] = js.native
  def get(key: String, options: AbortOptions): js.Promise[Uint8Array] = js.native
  def get(key: Uint8Array): js.Promise[Uint8Array] = js.native
  def get(key: Uint8Array, options: AbortOptions): js.Promise[Uint8Array] = js.native
  
  def provide(cids: js.Array[^]): AsyncIterable[QueryEvent] = js.native
  def provide(cids: js.Array[^], options: ProvideOptions with AbortOptions): AsyncIterable[QueryEvent] = js.native
  def provide(cids: ^): AsyncIterable[QueryEvent] = js.native
  def provide(cids: ^, options: ProvideOptions with AbortOptions): AsyncIterable[QueryEvent] = js.native
  
  def put(key: Uint8Array, value: Uint8Array): AsyncIterable[QueryEvent] = js.native
  def put(key: Uint8Array, value: Uint8Array, options: AbortOptions): AsyncIterable[QueryEvent] = js.native
  
  def query(peerId: String): AsyncIterable[Id] = js.native
  def query(peerId: String, options: AbortOptions): AsyncIterable[Id] = js.native
  def query(peerId: typings.peerId.mod.^): AsyncIterable[Id] = js.native
  def query(peerId: typings.peerId.mod.^, options: AbortOptions): AsyncIterable[Id] = js.native
}
