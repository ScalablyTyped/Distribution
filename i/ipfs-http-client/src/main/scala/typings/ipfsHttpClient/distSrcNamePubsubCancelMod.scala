package typings.ipfsHttpClient

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.ipfsHttpClient.distSrcLibConfigureMod.Factory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcNamePubsubCancelMod {
  
  @JSImport("ipfs-http-client/dist/src/name/pubsub/cancel", "createCancel")
  @js.native
  val createCancel: Factory[
    js.Function2[
      /* name */ String, 
      /* options */ js.UndefOr[AbortOptions & typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions], 
      js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_pubsub.PubsubCancelResult */ Any
      ]
    ]
  ] = js.native
  
  type HTTPClientExtraOptions = typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
  
  type NamePubsubAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_pubsub.API<HTTPClientExtraOptions> */ Any
}
