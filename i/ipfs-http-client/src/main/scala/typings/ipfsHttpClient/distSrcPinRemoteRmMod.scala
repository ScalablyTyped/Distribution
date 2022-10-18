package typings.ipfsHttpClient

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.ipfsHttpClient.distSrcLibCoreMod.Client
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPinRemoteRmMod {
  
  @JSImport("ipfs-http-client/dist/src/pin/remote/rm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createRm(client: Client): js.Function1[
    /* hasTimeoutSignalHeadersQuery */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_remote.Query */ Any) & AbortOptions & typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions, 
    js.Promise[Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRm")(client.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* hasTimeoutSignalHeadersQuery */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_remote.Query */ Any) & AbortOptions & typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions, 
    js.Promise[Unit]
  ]]
  
  type HTTPClientExtraOptions = typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
  
  type RemotePiningAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_remote.API<HTTPClientExtraOptions> */ Any
}
