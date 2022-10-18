package typings.ipfsHttpClient

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.ipfsHttpClient.distSrcLibConfigureMod.Factory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPubsubLsMod {
  
  @JSImport("ipfs-http-client/dist/src/pubsub/ls", "createLs")
  @js.native
  val createLs: Factory[
    js.Function1[
      /* options */ js.UndefOr[AbortOptions & typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions], 
      js.Promise[js.Array[String]]
    ]
  ] = js.native
  
  type HTTPClientExtraOptions = typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
  
  type PubsubAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_pubsub.API<HTTPClientExtraOptions> */ Any
}
