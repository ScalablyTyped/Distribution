package typings.ipfsCli.anon

import typings.cids.mod.^
import typings.std.AsyncGenerator
import typings.std.AsyncIterable
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bootstrap extends StObject {
  
  var add: js.Any = js.native
  
  var addAll: js.Any = js.native
  
  var bitswap: Unwant = js.native
  
  var block: js.Any = js.native
  
  var bootstrap: List = js.native
  
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
  
  var dag: js.Any = js.native
  
  def dns(domain: String): js.Promise[String] = js.native
  def dns(
    domain: String,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_dns.DNSSettings */ js.Any
  ): js.Promise[String] = js.native
  
  var files: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_files.MFS */ js.Any = js.native
  
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
  
  def isOnline(): Boolean = js.native
  
  var key: Export = js.native
  
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
  
  var `object`: js.Any = js.native
  
  var pin: js.Any = js.native
  
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
  
  def start(): js.Promise[AddAll] = js.native
  
  var stats: Bw = js.native
  
  def stop(): Unit = js.native
  
  var swarm: Disconnect = js.native
  
  def version(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_version.Version */ js.Any
  ] = js.native
  def version(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.AbortOptions */ js.Any
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_version.Version */ js.Any
  ] = js.native
}
