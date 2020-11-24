package typings.ipfsCore.componentsMod

import org.scalablytyped.runtime.TopLevel
import typings.ipfsCore.anon.IpldPreload
import typings.ipfsCore.catMod.CatOptions
import typings.ipfsCore.srcUtilsMod.AbortOptions
import typings.std.AsyncIterable
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components", "cat")
@js.native
object cat
  extends TopLevel[
      js.Function1[
        /* hasIpldPreload */ IpldPreload, 
        js.Function2[
          /* ipfsPath */ String | typings.cids.mod.^ , 
          /* options */ js.UndefOr[CatOptions with AbortOptions], 
          AsyncIterable[Uint8Array]
        ]
      ]
    ]
