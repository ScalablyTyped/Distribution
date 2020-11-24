package typings.ipfsCore.startMod

import typings.ipfsCore.addAllMod.AddAllOptions
import typings.ipfsCore.addAllMod.UnixFSEntry
import typings.ipfsCore.addMod.AddOptions
import typings.ipfsCore.anon.AddAll
import typings.ipfsCore.anon.ApiManager
import typings.ipfsCore.anon.BlockBlockService
import typings.ipfsCore.anon.Bootstrap
import typings.ipfsCore.anon.Cat
import typings.ipfsCore.anon.FindProvs
import typings.ipfsCore.anon.Format
import typings.ipfsCore.anon.IpldName
import typings.ipfsCore.anon.IpldPreload
import typings.ipfsCore.anon.Libp2p
import typings.ipfsCore.anon.Libp2pAny
import typings.ipfsCore.anon.Libp2pPeerId
import typings.ipfsCore.anon.Ls
import typings.ipfsCore.anon.MfsPreload
import typings.ipfsCore.anon.Profiles
import typings.ipfsCore.anon.Ref
import typings.ipfsCore.anon.RepoAny
import typings.ipfsCore.anon.Resolve
import typings.ipfsCore.anon.Typeofbitswap
import typings.ipfsCore.anon.Typeofblock
import typings.ipfsCore.anon.Typeofbootstrap
import typings.ipfsCore.anon.Typeofdag
import typings.ipfsCore.anon.Typeofkey
import typings.ipfsCore.anon.Typeofname
import typings.ipfsCore.anon.Typeofobject
import typings.ipfsCore.anon.Typeofpin
import typings.ipfsCore.anon.Typeofrepo
import typings.ipfsCore.anon.Typeofstats
import typings.ipfsCore.anon.Typeofswarm
import typings.ipfsCore.anon.`0`
import typings.ipfsCore.catMod.CatOptions
import typings.ipfsCore.componentsLsMod.LSOptions
import typings.ipfsCore.componentsVersionMod.Version
import typings.ipfsCore.dagGetMod.GetOptions
import typings.ipfsCore.dnsMod.DNSSettings
import typings.ipfsCore.filesMod.MFS
import typings.ipfsCore.nameResolveMod.ResolveSettings
import typings.ipfsCore.pingMod.PingFailure
import typings.ipfsCore.pingMod.PingSettings
import typings.ipfsCore.pingMod.Pong
import typings.ipfsCore.pingMod.StatusUpdate
import typings.ipfsCore.srcUtilsMod.AbortOptions
import typings.ipfsCore.srcUtilsMod.Directory
import typings.ipfsCore.srcUtilsMod.File
import typings.std.AsyncGenerator
import typings.std.AsyncIterable
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPLD extends js.Object {
  
  val ___Users_alex_Documents_Workspaces_ipfs_js_ipfs_release_packages_ipfs_core_src_components_index_ : js.Any = js.native
  
  def add(hasAddAll: AddAll): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.FileInput */ /* source */ js.Any, 
    /* options */ js.UndefOr[AddOptions with AbortOptions], 
    js.Promise[UnixFSEntry]
  ] = js.native
  
  def addAll(hasBlockGcLockPreloadPinOptions: typings.ipfsCore.anon.Preload): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.Source */ /* source */ js.Any, 
    /* options */ js.UndefOr[AddAllOptions with AbortOptions], 
    AsyncIterable[UnixFSEntry]
  ] = js.native
  @JSName("addAll")
  var addAll_Original: js.Function1[
    /* hasBlockGcLockPreloadPinOptions */ typings.ipfsCore.anon.Preload, 
    js.Function2[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.Source */ /* source */ _, 
      /* options */ js.UndefOr[AddAllOptions with AbortOptions], 
      AsyncIterable[UnixFSEntry]
    ]
  ] = js.native
  
  @JSName("add")
  var add_Original: js.Function1[
    /* hasAddAll */ AddAll, 
    js.Function2[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.FileInput */ /* source */ _, 
      /* options */ js.UndefOr[AddOptions with AbortOptions], 
      js.Promise[UnixFSEntry]
    ]
  ] = js.native
  
  val bitswap: Typeofbitswap = js.native
  
  val block: Typeofblock = js.native
  
  val bootstrap: Typeofbootstrap = js.native
  
  def cat(hasIpldPreload: IpldPreload): js.Function2[
    /* ipfsPath */ String | typings.cids.mod.^ , 
    /* options */ js.UndefOr[CatOptions with AbortOptions], 
    AsyncIterable[Uint8Array]
  ] = js.native
  @JSName("cat")
  var cat_Original: js.Function1[
    /* hasIpldPreload */ IpldPreload, 
    js.Function2[
      /* ipfsPath */ String | typings.cids.mod.^ , 
      /* options */ js.UndefOr[CatOptions with AbortOptions], 
      AsyncIterable[Uint8Array]
    ]
  ] = js.native
  
  def config(hasRepo: RepoAny): typings.ipfsCore.configMod.Config = js.native
  @JSName("config")
  var config_Original: Profiles = js.native
  
  val dag: Typeofdag = js.native
  
  def dht(hasLibp2pRepo: Libp2p): FindProvs = js.native
  @JSName("dht")
  var dht_Original: js.Function1[/* hasLibp2pRepo */ Libp2p, FindProvs] = js.native
  
  def dns(): js.Function2[
    /* domain */ String, 
    /* options */ js.UndefOr[DNSSettings with AbortOptions], 
    js.Promise[String]
  ] = js.native
  @JSName("dns")
  var dns_Original: js.Function0[
    js.Function2[
      /* domain */ String, 
      /* options */ js.UndefOr[DNSSettings with AbortOptions], 
      js.Promise[String]
    ]
  ] = js.native
  
  def files(hasIpldBlockBlockServiceRepoPreloadOptions: BlockBlockService): MFS = js.native
  @JSName("files")
  var files_Original: js.Function1[/* hasIpldBlockBlockServiceRepoPreloadOptions */ BlockBlockService, MFS] = js.native
  
  def get(hasIpldPreload: IpldPreload): js.Function2[
    /* ipfsPath */ String | typings.cids.mod.^ , 
    /* options */ js.UndefOr[GetOptions with AbortOptions], 
    AsyncIterable[File | Directory]
  ] = js.native
  @JSName("get")
  var get_Original: js.Function1[
    /* hasIpldPreload */ IpldPreload, 
    js.Function2[
      /* ipfsPath */ String | typings.cids.mod.^ , 
      /* options */ js.UndefOr[GetOptions with AbortOptions], 
      AsyncIterable[File | Directory]
    ]
  ] = js.native
  
  def id(hasPeerIdLibp2p: Libp2pPeerId): js.Function1[/* _options */ js.UndefOr[AbortOptions], js.Promise[typings.ipfsCore.idMod.PeerId]] = js.native
  @JSName("id")
  var id_Original: js.Function1[
    /* hasPeerIdLibp2p */ Libp2pPeerId, 
    js.Function1[/* _options */ js.UndefOr[AbortOptions], js.Promise[typings.ipfsCore.idMod.PeerId]]
  ] = js.native
  
  def init(hasApiManagerPrintOptions: ApiManager): js.Function1[/* options */ js.UndefOr[js.Any], js.Promise[Cat]] = js.native
  @JSName("init")
  var init_Original: js.Function1[
    /* hasApiManagerPrintOptions */ ApiManager, 
    js.Function1[/* options */ js.UndefOr[_], js.Promise[Cat]]
  ] = js.native
  
  def isOnline(hasLibp2p: `0`): js.Function0[Boolean] = js.native
  @JSName("isOnline")
  var isOnline_Original: js.Function1[/* hasLibp2p */ `0`, js.Function0[Boolean]] = js.native
  
  val key: Typeofkey = js.native
  
  def libp2p(hasOptionsPeerIdMultiaddrsRepoKeychainConfigConfig: typings.ipfsCore.anon.Config): js.Any = js.native
  @JSName("libp2p")
  var libp2p_Original: js.Function1[
    /* hasOptionsPeerIdMultiaddrsRepoKeychainConfigConfig */ typings.ipfsCore.anon.Config, 
    _
  ] = js.native
  
  def ls(hasIpldPreload: IpldPreload): js.Function2[
    /* ipfsPath */ String | typings.cids.mod.^ , 
    /* options */ js.UndefOr[LSOptions with AbortOptions], 
    AsyncIterable[File | Directory]
  ] = js.native
  @JSName("ls")
  var ls_Original: js.Function1[
    /* hasIpldPreload */ IpldPreload, 
    js.Function2[
      /* ipfsPath */ String | typings.cids.mod.^ , 
      /* options */ js.UndefOr[LSOptions with AbortOptions], 
      AsyncIterable[File | Directory]
    ]
  ] = js.native
  
  val name: Typeofname = js.native
  
  val `object`: Typeofobject = js.native
  
  val pin: Typeofpin = js.native
  
  def ping(hasLibp2p: Libp2pAny): js.Function2[
    /* peerId */ typings.peerId.mod.^, 
    /* options */ js.UndefOr[PingSettings with AbortOptions], 
    AsyncIterable[Pong | PingFailure | StatusUpdate]
  ] = js.native
  @JSName("ping")
  var ping_Original: js.Function1[
    /* hasLibp2p */ Libp2pAny, 
    js.Function2[
      /* peerId */ typings.peerId.mod.^, 
      /* options */ js.UndefOr[PingSettings with AbortOptions], 
      AsyncIterable[Pong | PingFailure | StatusUpdate]
    ]
  ] = js.native
  
  def pubsub(hasLibp2p: Libp2pAny): Ls = js.native
  @JSName("pubsub")
  var pubsub_Original: js.Function1[/* hasLibp2p */ Libp2pAny, Ls] = js.native
  
  def refs(hasIpldResolvePreload: Resolve): js.Function2[
    /* ipfsPath */ js.UndefOr[js.Any], 
    /* options */ js.UndefOr[js.Any], 
    AsyncGenerator[Ref, Unit, _]
  ] = js.native
  @JSName("refs")
  var refs_Original: Format = js.native
  
  val repo: Typeofrepo = js.native
  
  def resolve(hasIpldName: IpldName): js.Function2[
    /* path */ String, 
    /* opts */ js.UndefOr[ResolveSettings with AbortOptions], 
    js.Promise[String]
  ] = js.native
  @JSName("resolve")
  var resolve_Original: js.Function1[
    /* hasIpldName */ IpldName, 
    js.Function2[
      /* path */ String, 
      /* opts */ js.UndefOr[ResolveSettings with AbortOptions], 
      js.Promise[String]
    ]
  ] = js.native
  
  def start(
    hasApiManagerOptionsBlockServiceGcLockInitOptionsIpldKeychainPeerIdPinManagerPreloadPrintRepo: typings.ipfsCore.anon.InitOptions
  ): js.Function0[js.Promise[Bootstrap]] = js.native
  @JSName("start")
  var start_Original: js.Function1[
    /* hasApiManagerOptionsBlockServiceGcLockInitOptionsIpldKeychainPeerIdPinManagerPreloadPrintRepo */ typings.ipfsCore.anon.InitOptions, 
    js.Function0[js.Promise[Bootstrap]]
  ] = js.native
  
  val stats: Typeofstats = js.native
  
  def stop(
    hasApiManagerOptionsBitswapBlockServiceGcLockInitOptionsIpldIpnsKeychainLibp2pMfsPreloadPeerIdPinManagerPreloadPrintRepo: MfsPreload
  ): js.Function1[/* _options */ AbortOptions, js.Promise[Unit]] = js.native
  @JSName("stop")
  var stop_Original: js.Function1[
    /* hasApiManagerOptionsBitswapBlockServiceGcLockInitOptionsIpldIpnsKeychainLibp2pMfsPreloadPeerIdPinManagerPreloadPrintRepo */ MfsPreload, 
    js.Function1[/* _options */ AbortOptions, js.Promise[Unit]]
  ] = js.native
  
  val swarm: Typeofswarm = js.native
  
  def version(hasRepo: RepoAny): js.Function1[/* options */ js.UndefOr[AbortOptions], js.Promise[Version]] = js.native
  @JSName("version")
  var version_Original: js.Function1[
    /* hasRepo */ RepoAny, 
    js.Function1[/* options */ js.UndefOr[AbortOptions], js.Promise[Version]]
  ] = js.native
}
