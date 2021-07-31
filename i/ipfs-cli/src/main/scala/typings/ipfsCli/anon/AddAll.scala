package typings.ipfsCli.anon

import typings.cids.mod.^
import typings.std.AsyncGenerator
import typings.std.AsyncIterable
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddAll extends StObject {
  
  def add(
    source: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.FileInput */ js.Any
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_add-all.UnixFSEntry */ js.Any
  ] = js.native
  def add(
    source: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.FileInput */ js.Any,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_add.AddOptions */ js.Any
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_add-all.UnixFSEntry */ js.Any
  ] = js.native
  
  def addAll(
    source: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.Source */ js.Any
  ): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_add-all.UnixFSEntry */ js.Any
  ] = js.native
  def addAll(
    source: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.Source */ js.Any,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_add-all.AddAllOptions */ js.Any
  ): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_add-all.UnixFSEntry */ js.Any
  ] = js.native
  
  var bitswap: Stat = js.native
  
  var block: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_components.Block */ js.Any = js.native
  
  var bootstrap: Add = js.native
  
  def cat(ipfsPath: String): AsyncIterable[Uint8Array] = js.native
  def cat(
    ipfsPath: String,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_cat.CatOptions */ js.Any
  ): AsyncIterable[Uint8Array] = js.native
  def cat(ipfsPath: ^): AsyncIterable[Uint8Array] = js.native
  def cat(
    ipfsPath: ^,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_cat.CatOptions */ js.Any
  ): AsyncIterable[Uint8Array] = js.native
  
  var config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_config.Config */ js.Any = js.native
  
  var dag: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_components.DAG */ js.Any = js.native
  
  var dht: FindPeer | FindProvs = js.native
  
  def dns(domain: String): js.Promise[String] = js.native
  def dns(
    domain: String,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_dns.DNSSettings */ js.Any
  ): js.Promise[String] = js.native
  
  var files: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_files.MFS */ js.Any
  ] = js.native
  
  def get(ipfsPath: String): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.File */ js.Any
  ] = js.native
  def get(
    ipfsPath: String,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_get.GetOptions */ js.Any
  ): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.File */ js.Any
  ] = js.native
  def get(ipfsPath: ^): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.File */ js.Any
  ] = js.native
  def get(
    ipfsPath: ^,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_get.GetOptions */ js.Any
  ): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.File */ js.Any
  ] = js.native
  
  def id(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_id.PeerId */ js.Any
  ] = js.native
  def id(
    _options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.AbortOptions */ js.Any
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_id.PeerId */ js.Any
  ] = js.native
  
  def init(): js.Promise[scala.Nothing] = js.native
  
  var ipld: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof imported_components */ js.Any = js.native
  
  def isOnline(): Boolean = js.native
  
  var key: Export = js.native
  
  var libp2p: js.Any = js.native
  
  def ls(ipfsPath: String): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.File */ js.Any
  ] = js.native
  def ls(
    ipfsPath: String,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_ls.LSOptions */ js.Any
  ): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.File */ js.Any
  ] = js.native
  def ls(ipfsPath: ^): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.File */ js.Any
  ] = js.native
  def ls(
    ipfsPath: ^,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_ls.LSOptions */ js.Any
  ): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.File */ js.Any
  ] = js.native
  
  var name: Publish = js.native
  
  var `object`: Get = js.native
  
  var pin: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_components.Pin */ js.Any = js.native
  
  def ping(peerId: typings.peerId.mod.^): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_ping.Pong */ js.Any
  ] = js.native
  def ping(
    peerId: typings.peerId.mod.^,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_ping.PingSettings */ js.Any
  ): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_ping.Pong */ js.Any
  ] = js.native
  
  var pubsub: Ls = js.native
  
  def refs(): AsyncGenerator[RefAny, Unit, js.Any] = js.native
  def refs(ipfsPath: js.Any): AsyncGenerator[RefAny, Unit, js.Any] = js.native
  def refs(ipfsPath: js.Any, options: js.Any): AsyncGenerator[RefAny, Unit, js.Any] = js.native
  def refs(ipfsPath: Unit, options: js.Any): AsyncGenerator[RefAny, Unit, js.Any] = js.native
  @JSName("refs")
  var refs_Original: (js.Function2[
    /* ipfsPath */ js.UndefOr[js.Any], 
    /* options */ js.UndefOr[js.Any], 
    AsyncGenerator[RefAny, Unit, js.Any]
  ]) & Local = js.native
  
  var repo: Gc = js.native
  
  def resolve(path: String): js.Promise[String] = js.native
  def resolve(
    path: String,
    opts: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_resolve.ResolveSettings */ js.Any
  ): js.Promise[String] = js.native
  
  def start(): js.Object = js.native
  
  var stats: Bitswap = js.native
  
  def stop(
    _options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.AbortOptions */ js.Any
  ): js.Promise[Unit] = js.native
  
  var swarm: Connect = js.native
  
  def version(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_version.Version */ js.Any
  ] = js.native
  def version(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.AbortOptions */ js.Any
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_version.Version */ js.Any
  ] = js.native
}
