package typings.ipfsHttpClient

import typings.ipfsHttpClient.distSrcTypesMod.Options
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.multiformats.mod.CID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPinAddMod {
  
  @JSImport("ipfs-http-client/dist/src/pin/add", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createAdd(config: Options): js.Function2[
    /* path */ String | (CID[Any, Double, Double, Version]), 
    /* options */ js.UndefOr[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_pin.AddOptions */ Any) & typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
    ], 
    js.Promise[CID[Any, Double, Double, Version]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAdd")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* path */ String | (CID[Any, Double, Double, Version]), 
    /* options */ js.UndefOr[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_pin.AddOptions */ Any) & typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
    ], 
    js.Promise[CID[Any, Double, Double, Version]]
  ]]
  
  type HTTPClientExtraOptions = typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
  
  type PinAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_pin.API<HTTPClientExtraOptions> */ Any
}
