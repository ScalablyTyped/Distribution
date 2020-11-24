package typings.ipfsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object wantlistForPeerMod {
  
  type CID = typings.cids.mod.^
  
  type PeerId = typings.peerId.mod.^
  
  type WantlistForPeer[ExtraOptions] = js.Function2[
    /* peerId */ typings.ipfsCore.wantlistForPeerMod.PeerId | typings.ipfsCore.wantlistForPeerMod.CID | java.lang.String | typings.std.Uint8Array, 
    /* options */ js.UndefOr[typings.ipfsCore.srcUtilsMod.AbortOptions with ExtraOptions], 
    js.Promise[js.Array[typings.ipfsCore.wantlistForPeerMod.CID]]
  ]
}
