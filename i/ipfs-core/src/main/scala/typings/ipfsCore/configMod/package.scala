package typings.ipfsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object configMod {
  
  type APIAddress = java.lang.String | js.Array[java.lang.String]
  
  type ApplyOptions = typings.ipfsCore.srcUtilsMod.AbortOptions with typings.ipfsCore.configMod.ApplyOptionsExt
  
  type ApplyProfile = js.Function2[
    /* name */ java.lang.String, 
    /* options */ js.UndefOr[
      typings.ipfsCore.srcUtilsMod.AbortOptions with typings.ipfsCore.configMod.ApplyOptionsExt
    ], 
    js.Promise[typings.ipfsCore.anon.Original]
  ]
  
  type BootstrapConfig = js.Array[java.lang.String]
  
  type DatastoreSpec = js.Any
  
  type DelegateAddress = js.Array[java.lang.String]
  
  type GatewayAddress = java.lang.String | js.Array[java.lang.String]
  
  type Get = js.Function2[
    /* key */ js.UndefOr[java.lang.String], 
    /* options */ js.UndefOr[typings.ipfsCore.srcUtilsMod.AbortOptions], 
    js.Promise[typings.std.JSON]
  ]
  
  type GetAll = js.Function1[
    /* options */ js.UndefOr[typings.ipfsCore.srcUtilsMod.AbortOptions], 
    js.Promise[typings.ipfsCore.configMod.IPFSConfig]
  ]
  
  type ListProfiles = js.Function1[
    /* options */ js.UndefOr[typings.ipfsCore.srcUtilsMod.AbortOptions], 
    js.Promise[js.Array[typings.ipfsCore.configMod.Profile]]
  ]
  
  type Multiaddr = java.lang.String
  
  type PeerID = java.lang.String
  
  type PrivateKey = java.lang.String
  
  type Replace = js.Function2[
    /* value */ typings.ipfsCore.anon.PartialIPFSConfig, 
    /* options */ js.UndefOr[typings.ipfsCore.srcUtilsMod.AbortOptions], 
    js.Promise[scala.Unit]
  ]
  
  type Set = js.Function3[
    /* key */ java.lang.String, 
    /* value */ typings.std.JSON, 
    /* options */ js.UndefOr[typings.ipfsCore.srcUtilsMod.AbortOptions], 
    js.Promise[scala.Unit]
  ]
  
  type SwarmAddress = js.Array[java.lang.String]
}
