package typings.ipfsHttpClient.anon

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindPeer extends StObject {
  
  def findPeer(peerId: PeerId): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.QueryEvent */ Any
  ] = js.native
  def findPeer(peerId: PeerId, options: AbortOptions & HTTPClientExtraOptions): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.QueryEvent */ Any
  ] = js.native
  
  def findProvs(cid: CID[Any, Double, Double, Version]): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.QueryEvent */ Any
  ] = js.native
  def findProvs(cid: CID[Any, Double, Double, Version], options: AbortOptions & HTTPClientExtraOptions): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.QueryEvent */ Any
  ] = js.native
  
  def get(key: String): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.QueryEvent */ Any
  ] = js.native
  def get(key: String, options: AbortOptions & HTTPClientExtraOptions): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.QueryEvent */ Any
  ] = js.native
  def get(key: js.typedarray.Uint8Array): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.QueryEvent */ Any
  ] = js.native
  def get(key: js.typedarray.Uint8Array, options: AbortOptions & HTTPClientExtraOptions): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.QueryEvent */ Any
  ] = js.native
  
  def provide(cids: CID[Any, Double, Double, Version]): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.QueryEvent */ Any
  ] = js.native
  def provide(
    cids: CID[Any, Double, Double, Version],
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.DHTProvideOptions */ Any) & HTTPClientExtraOptions
  ): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.QueryEvent */ Any
  ] = js.native
  
  def put(key: String, value: js.typedarray.Uint8Array): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.QueryEvent */ Any
  ] = js.native
  def put(key: String, value: js.typedarray.Uint8Array, options: AbortOptions & HTTPClientExtraOptions): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.QueryEvent */ Any
  ] = js.native
  def put(key: js.typedarray.Uint8Array, value: js.typedarray.Uint8Array): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.QueryEvent */ Any
  ] = js.native
  def put(
    key: js.typedarray.Uint8Array,
    value: js.typedarray.Uint8Array,
    options: AbortOptions & HTTPClientExtraOptions
  ): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.QueryEvent */ Any
  ] = js.native
  
  def query(peerId: PeerId): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.QueryEvent */ Any
  ] = js.native
  def query(peerId: PeerId, options: AbortOptions & HTTPClientExtraOptions): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.QueryEvent */ Any
  ] = js.native
  def query(peerId: CID[Any, Double, Double, Version]): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.QueryEvent */ Any
  ] = js.native
  def query(peerId: CID[Any, Double, Double, Version], options: AbortOptions & HTTPClientExtraOptions): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.QueryEvent */ Any
  ] = js.native
}
