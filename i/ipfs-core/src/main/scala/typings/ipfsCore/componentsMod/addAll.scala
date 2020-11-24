package typings.ipfsCore.componentsMod

import org.scalablytyped.runtime.TopLevel
import typings.ipfsCore.addAllMod.AddAllOptions
import typings.ipfsCore.addAllMod.UnixFSEntry
import typings.ipfsCore.srcUtilsMod.AbortOptions
import typings.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components", "addAll")
@js.native
object addAll
  extends TopLevel[
      js.Function1[
        /* hasBlockGcLockPreloadPinOptions */ typings.ipfsCore.anon.Preload, 
        js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.Source */ /* source */ js.Any, 
          /* options */ js.UndefOr[AddAllOptions with AbortOptions], 
          AsyncIterable[UnixFSEntry]
        ]
      ]
    ]
