package typings.ipfsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object componentsMod {
  
  type AddAll_ = js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.Source */ /* source */ js.Any, 
    /* options */ js.UndefOr[
      typings.ipfsCore.addAllMod.AddAllOptions with typings.ipfsCore.srcUtilsMod.AbortOptions
    ], 
    typings.std.AsyncIterable[typings.ipfsCore.addAllMod.UnixFSEntry]
  ]
  
  type Add_ = js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.FileInput */ /* source */ js.Any, 
    /* options */ js.UndefOr[
      typings.ipfsCore.addMod.AddOptions with typings.ipfsCore.srcUtilsMod.AbortOptions
    ], 
    js.Promise[typings.ipfsCore.addAllMod.UnixFSEntry]
  ]
  
  type CID = typings.cids.mod.^
  
  type Cat_ = js.Function2[
    /* ipfsPath */ java.lang.String | typings.cids.mod.^ , 
    /* options */ js.UndefOr[
      typings.ipfsCore.catMod.CatOptions with typings.ipfsCore.srcUtilsMod.AbortOptions
    ], 
    typings.std.AsyncIterable[typings.std.Uint8Array]
  ]
  
  type DNS_ = js.Function2[
    /* domain */ java.lang.String, 
    /* options */ js.UndefOr[
      typings.ipfsCore.dnsMod.DNSSettings with typings.ipfsCore.srcUtilsMod.AbortOptions
    ], 
    js.Promise[java.lang.String]
  ]
  
  type Get_ = js.Function2[
    /* ipfsPath */ java.lang.String | typings.cids.mod.^ , 
    /* options */ js.UndefOr[
      typings.ipfsCore.dagGetMod.GetOptions with typings.ipfsCore.srcUtilsMod.AbortOptions
    ], 
    typings.std.AsyncIterable[typings.ipfsCore.srcUtilsMod.File | typings.ipfsCore.srcUtilsMod.Directory]
  ]
  
  type ID_ = js.Function1[
    /* _options */ js.UndefOr[typings.ipfsCore.srcUtilsMod.AbortOptions], 
    js.Promise[typings.ipfsCore.idMod.PeerId]
  ]
  
  type IPFSBitSwap = js.Any
  
  type IPFSBlockService = js.Any
  
  type IPFSRepo = js.Any
  
  type IPLD = js.Any
  
  type IPLDBlock = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src */ js.Any
  
  type IPLDConfig = js.Any
  
  type Init_ = js.Function1[/* options */ js.UndefOr[js.Any], js.Promise[typings.ipfsCore.anon.Files]]
  
  type IsOnline_ = js.Function0[scala.Boolean]
  
  type LS_ = js.Function2[
    /* ipfsPath */ java.lang.String | typings.cids.mod.^ , 
    /* options */ js.UndefOr[
      typings.ipfsCore.componentsLsMod.LSOptions with typings.ipfsCore.srcUtilsMod.AbortOptions
    ], 
    typings.std.AsyncIterable[typings.ipfsCore.srcUtilsMod.File | typings.ipfsCore.srcUtilsMod.Directory]
  ]
  
  type LibP2PConfig = js.Any
  
  type LibP2PService = js.Any
  
  type LibP2P_ = js.Any
  
  type LocalRefs = js.Function1[
    /* options */ js.UndefOr[js.Any], 
    typings.std.AsyncGenerator[typings.ipfsCore.anon.Ref, scala.Unit, js.Any]
  ]
  
  type Lock = js.Function0[scala.Unit]
  
  type Multiaddr = typings.multiaddr.mod.^
  
  type PeerId = typings.peerId.mod.^
  
  type Ping_ = js.Function2[
    /* peerId */ typings.peerId.mod.^, 
    /* options */ js.UndefOr[
      typings.ipfsCore.pingMod.PingSettings with typings.ipfsCore.srcUtilsMod.AbortOptions
    ], 
    typings.std.AsyncIterable[
      typings.ipfsCore.pingMod.Pong | typings.ipfsCore.pingMod.PingFailure | typings.ipfsCore.pingMod.StatusUpdate
    ]
  ]
  
  type Preload = (js.Function0[scala.Unit] with typings.ipfsCore.anon.Start) | typings.ipfsCore.anon.Call
  
  type RefsWithLocal = (js.Function2[
    /* ipfsPath */ js.UndefOr[js.Any], 
    /* options */ js.UndefOr[js.Any], 
    typings.std.AsyncGenerator[typings.ipfsCore.anon.Ref, scala.Unit, _]
  ]) with typings.ipfsCore.anon.LocalLocalRefs
  
  type Refs_ = js.Function2[
    /* ipfsPath */ js.UndefOr[js.Any], 
    /* options */ js.UndefOr[js.Any], 
    typings.std.AsyncGenerator[typings.ipfsCore.anon.Ref, scala.Unit, js.Any]
  ]
  
  type Resolve_ = js.Function2[
    /* path */ java.lang.String, 
    /* opts */ js.UndefOr[
      typings.ipfsCore.nameResolveMod.ResolveSettings with typings.ipfsCore.srcUtilsMod.AbortOptions
    ], 
    js.Promise[java.lang.String]
  ]
  
  type Start_ = js.Function0[js.Promise[typings.ipfsCore.anon.Dht]]
  
  type Stop_ = js.Function1[/* _options */ typings.ipfsCore.srcUtilsMod.AbortOptions, js.Promise[scala.Unit]]
  
  type Version_ = js.Function1[
    /* options */ js.UndefOr[typings.ipfsCore.srcUtilsMod.AbortOptions], 
    js.Promise[typings.ipfsCore.componentsVersionMod.Version]
  ]
}
