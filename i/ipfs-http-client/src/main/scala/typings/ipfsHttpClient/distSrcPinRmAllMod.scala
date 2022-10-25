package typings.ipfsHttpClient

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.ipfsCoreTypes.distSrcUtilsMod.AwaitIterable
import typings.ipfsHttpClient.distSrcLibConfigureMod.Factory
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPinRmAllMod {
  
  @JSImport("ipfs-http-client/dist/src/pin/rm-all", "createRmAll")
  @js.native
  val createRmAll: Factory[
    js.Function2[
      /* source */ AwaitIterable[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_pin.RmAllInput */ Any
      ], 
      /* options */ js.UndefOr[AbortOptions & typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions], 
      AsyncIterable[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID<unknown, number, number, imported_cid.Version> */ Any
      ]
    ]
  ] = js.native
  
  type HTTPClientExtraOptions = typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
  
  type PinAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_pin.API<HTTPClientExtraOptions> */ Any
}
