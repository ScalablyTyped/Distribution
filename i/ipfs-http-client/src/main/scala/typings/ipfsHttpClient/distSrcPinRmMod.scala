package typings.ipfsHttpClient

import typings.ipfsHttpClient.distSrcTypesMod.Options
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPinRmMod {
  
  @JSImport("ipfs-http-client/dist/src/pin/rm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createRm(config: Options): js.Function2[
    /* path */ String | (CID[Any, Double, Double, Version]), 
    /* options */ js.UndefOr[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_pin.RmOptions */ Any) & typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
    ], 
    js.Promise[CID[Any, Double, Double, Version]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRm")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* path */ String | (CID[Any, Double, Double, Version]), 
    /* options */ js.UndefOr[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_pin.RmOptions */ Any) & typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
    ], 
    js.Promise[CID[Any, Double, Double, Version]]
  ]]
  
  type HTTPClientExtraOptions = typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
  
  type PinAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_pin.API<HTTPClientExtraOptions> */ Any
}
