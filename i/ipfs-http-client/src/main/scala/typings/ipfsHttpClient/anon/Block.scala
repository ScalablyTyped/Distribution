package typings.ipfsHttpClient.anon

import typings.cids.mod.^
import typings.ipfsHttpClient.interfaceMod.APIWithExtraOptions
import typings.ipfsHttpClient.interfaceMod.WithExtendedOptions
import typings.ipfsHttpClient.mod.HttpOptions
import typings.std.AsyncGenerator
import typings.std.AsyncIterable
import typings.std.Parameters
import typings.std.ReturnType
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Block extends StObject {
  
  def add(
    input: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_add.Source */ js.Any
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_add-all.UnixFSEntry */ js.Any
  ] = js.native
  def add(
    input: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_add.Source */ js.Any,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_add.AddOptions */ js.Any) & HttpOptions
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
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_add-all.AddAllOptions */ js.Any) & HttpOptions
  ): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_add-all.UnixFSEntry */ js.Any
  ] = js.native
  
  var bitswap: Stat = js.native
  
  var block: Get = js.native
  
  var bootstrap: Add = js.native
  
  def cat(path: String): AsyncIterable[Uint8Array] = js.native
  def cat(
    path: String,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_cat.CatOptions */ js.Any) & HttpOptions
  ): AsyncIterable[Uint8Array] = js.native
  def cat(path: ^): AsyncIterable[Uint8Array] = js.native
  def cat(
    path: ^,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_cat.CatOptions */ js.Any) & HttpOptions
  ): AsyncIterable[Uint8Array] = js.native
  
  def commands(): js.Promise[js.Any] = js.native
  def commands(options: js.Object): js.Promise[js.Any] = js.native
  
  var config: GetAll = js.native
  
  var dag: Put = js.native
  
  var dht: FindPeer = js.native
  
  var diag: Cmds = js.native
  
  def dns(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type WithExtendedOptions<Parameters<API>, Extra> is not an array type */ args: WithExtendedOptions[
      Parameters[
        js.Function2[
          /* domain */ String, 
          /* options */ js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_dns.DNSSettings */ js.Any
          ], 
          js.Promise[String]
        ]
      ], 
      HttpOptions
    ]
  ): ReturnType[
    js.Function2[
      /* domain */ String, 
      /* options */ js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_dns.DNSSettings */ js.Any
      ], 
      js.Promise[String]
    ]
  ] = js.native
  @JSName("dns")
  var dns_Original: APIWithExtraOptions[
    js.Function2[
      /* domain */ String, 
      /* options */ js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_dns.DNSSettings */ js.Any
      ], 
      js.Promise[String]
    ], 
    HttpOptions
  ] = js.native
  
  var files: Chmod = js.native
  
  def get(path: String): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.File */ js.Any
  ] = js.native
  def get(
    path: String,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_get.GetOptions */ js.Any) & HttpOptions
  ): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.File */ js.Any
  ] = js.native
  def get(path: ^): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.File */ js.Any
  ] = js.native
  def get(
    path: ^,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_get.GetOptions */ js.Any) & HttpOptions
  ): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.File */ js.Any
  ] = js.native
  
  def getEndpointConfig(): Apipath = js.native
  
  def id(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_id.PeerId */ js.Any
  ] = js.native
  def id(
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.AbortOptions */ js.Any) & HttpOptions
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_id.PeerId */ js.Any
  ] = js.native
  
  var key: Gen = js.native
  
  var log: Level = js.native
  
  def ls(path: js.Any): AsyncGenerator[Cid, Unit, js.Any] = js.native
  def ls(path: js.Any, options: js.Object): AsyncGenerator[Cid, Unit, js.Any] = js.native
  
  def mount(): js.Promise[js.Any] = js.native
  def mount(options: js.Object): js.Promise[js.Any] = js.native
  
  var name: Publish = js.native
  
  var `object`: Data = js.native
  
  var pin: AddAll = js.native
  
  def ping(peerId: js.Any): AsyncGenerator[js.Any, Unit, js.Any] = js.native
  def ping(peerId: js.Any, options: js.Object): AsyncGenerator[js.Any, Unit, js.Any] = js.native
  
  var pubsub: Ls = js.native
  
  def refs(args: js.Any): AsyncGenerator[js.Any, Unit, js.Any] = js.native
  def refs(args: js.Any, options: js.Object): AsyncGenerator[js.Any, Unit, js.Any] = js.native
  @JSName("refs")
  var refs_Original: Call = js.native
  
  var repo: Gc = js.native
  
  def resolve(path: String): js.Promise[String] = js.native
  def resolve(
    path: String,
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_resolve.ResolveSettings */ js.Any) & HttpOptions
  ): js.Promise[String] = js.native
  
  def shutdown(): js.Promise[Unit] = js.native
  def shutdown(options: js.Object): js.Promise[Unit] = js.native
  
  var stats: Bitswap = js.native
  
  def stop(): js.Promise[Unit] = js.native
  def stop(options: js.Object): js.Promise[Unit] = js.native
  
  var swarm: Connect = js.native
  
  def version(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_version.Version */ js.Any
  ] = js.native
  def version(
    options: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.AbortOptions */ js.Any) & HttpOptions
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_version.Version */ js.Any
  ] = js.native
}
