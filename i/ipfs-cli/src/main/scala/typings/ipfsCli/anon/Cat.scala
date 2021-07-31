package typings.ipfsCli.anon

import typings.cids.mod.^
import typings.std.AsyncGenerator
import typings.std.AsyncIterable
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cat extends StObject {
  
  def add(
    input: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_add.Source */ js.Any
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_add-all.UnixFSEntry */ js.Any
  ] = js.native
  def add(
    input: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_add.Source */ js.Any,
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
  
  var bitswap: Wantlist = js.native
  
  var block: Put = js.native
  
  var bootstrap: Clear = js.native
  
  def cat(path: String): AsyncIterable[Uint8Array] = js.native
  def cat(
    path: String,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_cat.CatOptions */ js.Any
  ): AsyncIterable[Uint8Array] = js.native
  def cat(path: ^): AsyncIterable[Uint8Array] = js.native
  def cat(
    path: ^,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_cat.CatOptions */ js.Any
  ): AsyncIterable[Uint8Array] = js.native
  
  def commands(): js.Promise[js.Any] = js.native
  def commands(options: js.Object): js.Promise[js.Any] = js.native
  
  var config: GetAll = js.native
  
  var dag: Resolve = js.native
  
  var dht: Provide = js.native
  
  var diag: Cmds = js.native
  
  var dns: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface.APIWithExtraOptions<(domain : string, options : imported_dns.DNSSettings & imported_utils.AbortOptions | undefined): Promise<string>, imported_src.HttpOptions> */ js.Any = js.native
  
  var files: Chmod = js.native
  
  def get(path: String): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.File */ js.Any
  ] = js.native
  def get(
    path: String,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_get.GetOptions */ js.Any
  ): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.File */ js.Any
  ] = js.native
  def get(path: ^): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.File */ js.Any
  ] = js.native
  def get(
    path: ^,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_get.GetOptions */ js.Any
  ): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.File */ js.Any
  ] = js.native
  
  def getEndpointConfig(): Apipath = js.native
  
  def id(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_id.PeerId */ js.Any
  ] = js.native
  def id(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.AbortOptions */ js.Any
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_id.PeerId */ js.Any
  ] = js.native
  
  var key: Gen = js.native
  
  var log: Level = js.native
  
  def ls(path: js.Any): AsyncGenerator[Cid, Unit, js.Any] = js.native
  def ls(path: js.Any, options: js.Object): AsyncGenerator[Cid, Unit, js.Any] = js.native
  
  def mount(): js.Promise[js.Any] = js.native
  def mount(options: js.Object): js.Promise[js.Any] = js.native
  
  var name: Pubsub = js.native
  
  var `object`: Links = js.native
  
  var pin: Rm = js.native
  
  def ping(peerId: js.Any): AsyncGenerator[js.Any, Unit, js.Any] = js.native
  def ping(peerId: js.Any, options: js.Object): AsyncGenerator[js.Any, Unit, js.Any] = js.native
  
  var pubsub: Peers = js.native
  
  def refs(args: js.Any): AsyncGenerator[js.Any, Unit, js.Any] = js.native
  def refs(args: js.Any, options: js.Object): AsyncGenerator[js.Any, Unit, js.Any] = js.native
  @JSName("refs")
  var refs_Original: Call = js.native
  
  var repo: Version = js.native
  
  def resolve(path: String): js.Promise[String] = js.native
  def resolve(
    path: String,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_resolve.ResolveSettings */ js.Any
  ): js.Promise[String] = js.native
  
  def shutdown(): js.Promise[Unit] = js.native
  def shutdown(options: js.Object): js.Promise[Unit] = js.native
  
  var stats: Repo = js.native
  
  def stop(): js.Promise[Unit] = js.native
  def stop(options: js.Object): js.Promise[Unit] = js.native
  
  var swarm: LocalAddrs = js.native
  
  def version(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_version.Version */ js.Any
  ] = js.native
  def version(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.AbortOptions */ js.Any
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_version.Version */ js.Any
  ] = js.native
}
