package typings.ipfsHttpClient

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.ipfsHttpClient.distSrcLibConfigureMod.Factory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcNamePubsubSubsMod {
  
  @JSImport("ipfs-http-client/dist/src/name/pubsub/subs", "createSubs")
  @js.native
  val createSubs: Factory[
    js.Function1[
      /* options */ js.UndefOr[AbortOptions & typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions], 
      js.Promise[js.Array[String]]
    ]
  ] = js.native
  
  type HTTPClientExtraOptions = typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
  
  type NamePubsubAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_pubsub.API<HTTPClientExtraOptions> */ Any
}
