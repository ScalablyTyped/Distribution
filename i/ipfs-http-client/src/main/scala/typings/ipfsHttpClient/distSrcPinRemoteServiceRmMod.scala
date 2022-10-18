package typings.ipfsHttpClient

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.ipfsHttpClient.distSrcLibCoreMod.Client
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPinRemoteServiceRmMod {
  
  @JSImport("ipfs-http-client/dist/src/pin/remote/service/rm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createRm(client: Client): js.Function2[
    /* name */ String, 
    /* options */ js.UndefOr[AbortOptions & typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions], 
    js.Promise[Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRm")(client.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* name */ String, 
    /* options */ js.UndefOr[AbortOptions & typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions], 
    js.Promise[Unit]
  ]]
  
  type HTTPClientExtraOptions = typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
  
  type RemotePiningServiceAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_service.API<HTTPClientExtraOptions> */ Any
}
