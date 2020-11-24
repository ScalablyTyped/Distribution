package typings.ipfsCore.componentsMod

import org.scalablytyped.runtime.TopLevel
import typings.ipfsCore.anon.ApiManager
import typings.ipfsCore.anon.Files
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components", "init")
@js.native
object init
  extends TopLevel[
      js.Function1[
        /* hasApiManagerPrintOptions */ ApiManager, 
        js.Function1[/* options */ js.UndefOr[js.Any], js.Promise[Files]]
      ]
    ]
