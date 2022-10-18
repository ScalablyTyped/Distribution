package typings.ipfsHttpClient

import typings.ipfsHttpClient.distSrcLibCoreMod.Client
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPinRemoteServiceLsMod {
  
  @JSImport("ipfs-http-client/dist/src/pin/remote/service/ls", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createLs(client: Client): js.Function1[
    /* options */ js.UndefOr[js.Object], 
    js.Promise[
      js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_service.RemotePinServiceWithStat */ Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLs")(client.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* options */ js.UndefOr[js.Object], 
    js.Promise[
      js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_service.RemotePinServiceWithStat */ Any
      ]
    ]
  ]]
  
  type HTTPClientExtraOptions = typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
  
  type RemotePiningServiceAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_service.API<HTTPClientExtraOptions> */ Any
}
