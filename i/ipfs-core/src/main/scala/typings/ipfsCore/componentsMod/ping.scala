package typings.ipfsCore.componentsMod

import org.scalablytyped.runtime.TopLevel
import typings.ipfsCore.anon.Libp2pAny
import typings.ipfsCore.pingMod.PingFailure
import typings.ipfsCore.pingMod.PingSettings
import typings.ipfsCore.pingMod.Pong
import typings.ipfsCore.pingMod.StatusUpdate
import typings.ipfsCore.srcUtilsMod.AbortOptions
import typings.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components", "ping")
@js.native
object ping
  extends TopLevel[
      js.Function1[
        /* hasLibp2p */ Libp2pAny, 
        js.Function2[
          /* peerId */ typings.peerId.mod.^, 
          /* options */ js.UndefOr[PingSettings with AbortOptions], 
          AsyncIterable[Pong | PingFailure | StatusUpdate]
        ]
      ]
    ]
