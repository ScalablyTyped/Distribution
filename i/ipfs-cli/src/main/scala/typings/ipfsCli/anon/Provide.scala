package typings.ipfsCli.anon

import typings.cids.mod.^
import typings.std.AsyncIterable
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Provide extends StObject {
  
  def findPeer(peerId: ^): js.Promise[Addrs] = js.native
  def findPeer(
    peerId: ^,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.AbortOptions */ js.Any
  ): js.Promise[Addrs] = js.native
  def findPeer(peerId: typings.peerId.mod.^): js.Promise[Addrs] = js.native
  def findPeer(
    peerId: typings.peerId.mod.^,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.AbortOptions */ js.Any
  ): js.Promise[Addrs] = js.native
  
  def findProvs(cid: ^): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_dht.PeerInfo */ js.Any
  ] = js.native
  def findProvs(
    cid: ^,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_dht.FindProvsOptions */ js.Any
  ): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_dht.PeerInfo */ js.Any
  ] = js.native
  
  def get(key: String): js.Promise[Uint8Array] = js.native
  def get(
    key: String,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.AbortOptions */ js.Any
  ): js.Promise[Uint8Array] = js.native
  def get(key: Uint8Array): js.Promise[Uint8Array] = js.native
  def get(
    key: Uint8Array,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.AbortOptions */ js.Any
  ): js.Promise[Uint8Array] = js.native
  
  def provide(cids: js.Array[^]): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_dht.QueryEvent */ js.Any
  ] = js.native
  def provide(
    cids: js.Array[^],
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_dht.ProvideOptions */ js.Any
  ): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_dht.QueryEvent */ js.Any
  ] = js.native
  def provide(cids: ^): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_dht.QueryEvent */ js.Any
  ] = js.native
  def provide(
    cids: ^,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_dht.ProvideOptions */ js.Any
  ): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_dht.QueryEvent */ js.Any
  ] = js.native
  
  def put(key: Uint8Array, value: Uint8Array): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_dht.QueryEvent */ js.Any
  ] = js.native
  def put(
    key: Uint8Array,
    value: Uint8Array,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.AbortOptions */ js.Any
  ): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_dht.QueryEvent */ js.Any
  ] = js.native
  
  def query(peerId: String): AsyncIterable[Id] = js.native
  def query(
    peerId: String,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.AbortOptions */ js.Any
  ): AsyncIterable[Id] = js.native
  def query(peerId: typings.peerId.mod.^): AsyncIterable[Id] = js.native
  def query(
    peerId: typings.peerId.mod.^,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.AbortOptions */ js.Any
  ): AsyncIterable[Id] = js.native
}
