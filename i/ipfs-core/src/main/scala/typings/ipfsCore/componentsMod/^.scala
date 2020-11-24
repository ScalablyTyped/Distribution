package typings.ipfsCore.componentsMod

import typings.ipfsCore.addAllMod.AddAllOptions
import typings.ipfsCore.addAllMod.UnixFSEntry
import typings.ipfsCore.addMod.AddOptions
import typings.ipfsCore.anon.AddAll
import typings.ipfsCore.anon.ApiManager
import typings.ipfsCore.anon.BlockBlockService
import typings.ipfsCore.anon.Config
import typings.ipfsCore.anon.Dht
import typings.ipfsCore.anon.Files
import typings.ipfsCore.anon.FindProvs
import typings.ipfsCore.anon.IpldName
import typings.ipfsCore.anon.IpldPreload
import typings.ipfsCore.anon.Libp2p
import typings.ipfsCore.anon.Libp2pAny
import typings.ipfsCore.anon.Libp2pPeerId
import typings.ipfsCore.anon.Ls
import typings.ipfsCore.anon.MfsPreload
import typings.ipfsCore.anon.Print
import typings.ipfsCore.anon.RepoAny
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
import typings.std.AsyncIterable
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  var add: js.Function1[
    /* hasAddAll */ AddAll, 
    js.Function2[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.FileInput */ /* source */ js.Any, 
      /* options */ js.UndefOr[AddOptions with AbortOptions], 
      js.Promise[UnixFSEntry]
    ]
  ] = js.native
  
  var addAll: js.Function1[
    /* hasBlockGcLockPreloadPinOptions */ typings.ipfsCore.anon.Preload, 
    js.Function2[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.Source */ /* source */ js.Any, 
      /* options */ js.UndefOr[AddAllOptions with AbortOptions], 
      AsyncIterable[UnixFSEntry]
    ]
  ] = js.native
  
  var cat: js.Function1[
    /* hasIpldPreload */ IpldPreload, 
    js.Function2[
      /* ipfsPath */ String | typings.cids.mod.^ , 
      /* options */ js.UndefOr[CatOptions with AbortOptions], 
      AsyncIterable[Uint8Array]
    ]
  ] = js.native
  
  var dht: js.Function1[/* hasLibp2pRepo */ Libp2p, FindProvs] = js.native
  
  var dns: js.Function0[
    js.Function2[
      /* domain */ String, 
      /* options */ js.UndefOr[DNSSettings with AbortOptions], 
      js.Promise[String]
    ]
  ] = js.native
  
  var files: js.Function1[/* hasIpldBlockBlockServiceRepoPreloadOptions */ BlockBlockService, MFS] = js.native
  
  var get: js.Function1[
    /* hasIpldPreload */ IpldPreload, 
    js.Function2[
      /* ipfsPath */ String | typings.cids.mod.^ , 
      /* options */ js.UndefOr[GetOptions with AbortOptions], 
      AsyncIterable[File | Directory]
    ]
  ] = js.native
  
  var id: js.Function1[
    /* hasPeerIdLibp2p */ Libp2pPeerId, 
    js.Function1[/* _options */ js.UndefOr[AbortOptions], js.Promise[typings.ipfsCore.idMod.PeerId]]
  ] = js.native
  
  var init: js.Function1[
    /* hasApiManagerPrintOptions */ ApiManager, 
    js.Function1[/* options */ js.UndefOr[js.Any], js.Promise[Files]]
  ] = js.native
  
  var isOnline: js.Function1[/* hasLibp2p */ `0`, js.Function0[Boolean]] = js.native
  
  var libp2p: js.Function1[/* hasOptionsPeerIdMultiaddrsRepoKeychainConfigConfig */ Config, js.Any] = js.native
  
  var ls: js.Function1[
    /* hasIpldPreload */ IpldPreload, 
    js.Function2[
      /* ipfsPath */ String | typings.cids.mod.^ , 
      /* options */ js.UndefOr[LSOptions with AbortOptions], 
      AsyncIterable[File | Directory]
    ]
  ] = js.native
  
  var ping: js.Function1[
    /* hasLibp2p */ Libp2pAny, 
    js.Function2[
      /* peerId */ typings.peerId.mod.^, 
      /* options */ js.UndefOr[PingSettings with AbortOptions], 
      AsyncIterable[Pong | PingFailure | StatusUpdate]
    ]
  ] = js.native
  
  var pubsub: js.Function1[/* hasLibp2p */ Libp2pAny, Ls] = js.native
  
  var resolve: js.Function1[
    /* hasIpldName */ IpldName, 
    js.Function2[
      /* path */ String, 
      /* opts */ js.UndefOr[ResolveSettings with AbortOptions], 
      js.Promise[String]
    ]
  ] = js.native
  
  var start: js.Function1[
    /* hasApiManagerOptionsBlockServiceGcLockInitOptionsIpldKeychainPeerIdPinManagerPreloadPrintRepo */ Print, 
    js.Function0[js.Promise[Dht]]
  ] = js.native
  
  var stop: js.Function1[
    /* hasApiManagerOptionsBitswapBlockServiceGcLockInitOptionsIpldIpnsKeychainLibp2pMfsPreloadPeerIdPinManagerPreloadPrintRepo */ MfsPreload, 
    js.Function1[/* _options */ AbortOptions, js.Promise[Unit]]
  ] = js.native
  
  var version: js.Function1[
    /* hasRepo */ RepoAny, 
    js.Function1[/* options */ js.UndefOr[AbortOptions], js.Promise[Version]]
  ] = js.native
}
