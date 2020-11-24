package typings.ipfsCore.componentsMod

import org.scalablytyped.runtime.TopLevel
import typings.ipfsCore.anon.RepoAny
import typings.ipfsCore.componentsVersionMod.Version
import typings.ipfsCore.srcUtilsMod.AbortOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components", "version")
@js.native
object version
  extends TopLevel[
      js.Function1[
        /* hasRepo */ RepoAny, 
        js.Function1[/* options */ js.UndefOr[AbortOptions], js.Promise[Version]]
      ]
    ]
