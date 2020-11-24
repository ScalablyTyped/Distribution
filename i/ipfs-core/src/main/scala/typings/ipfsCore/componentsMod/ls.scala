package typings.ipfsCore.componentsMod

import org.scalablytyped.runtime.TopLevel
import typings.ipfsCore.anon.IpldPreload
import typings.ipfsCore.componentsLsMod.LSOptions
import typings.ipfsCore.srcUtilsMod.AbortOptions
import typings.ipfsCore.srcUtilsMod.Directory
import typings.ipfsCore.srcUtilsMod.File
import typings.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components", "ls")
@js.native
object ls
  extends TopLevel[
      js.Function1[
        /* hasIpldPreload */ IpldPreload, 
        js.Function2[
          /* ipfsPath */ String | typings.cids.mod.^ , 
          /* options */ js.UndefOr[LSOptions with AbortOptions], 
          AsyncIterable[File | Directory]
        ]
      ]
    ]
