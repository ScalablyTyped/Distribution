package typings.ipfsHttpClient

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.ipfsHttpClient.anon.Peers
import typings.ipfsHttpClient.distSrcLibConfigureMod.Factory
import typings.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcBootstrapAddMod {
  
  @JSImport("ipfs-http-client/dist/src/bootstrap/add", "createAdd")
  @js.native
  val createAdd: Factory[
    js.Function2[
      /* addr */ Multiaddr_, 
      /* options */ js.UndefOr[AbortOptions & typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions], 
      js.Promise[Peers]
    ]
  ] = js.native
  
  type BootstrapAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_bootstrap.API<HTTPClientExtraOptions> */ Any
  
  type HTTPClientExtraOptions = typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
}
