package typings.ipfsHttpClient

import typings.ipfsHttpClient.distSrcTypesMod.Options
import typings.ipldDagPb.distSrcInterfaceMod.PBNode
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.multiformats.mod.CID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcObjectPutMod {
  
  @JSImport("ipfs-http-client/dist/src/object/put", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createPut(
    codecs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_multicodecs.Multicodecs */ Any,
    options: Options
  ): js.Function2[
    /* obj */ PBNode, 
    /* options */ js.UndefOr[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_object.PutOptions */ Any) & typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
    ], 
    js.Promise[CID[Any, Double, Double, Version]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPut")(codecs.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* obj */ PBNode, 
    /* options */ js.UndefOr[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_object.PutOptions */ Any) & typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
    ], 
    js.Promise[CID[Any, Double, Double, Version]]
  ]]
  
  type HTTPClientExtraOptions = typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
  
  type ObjectAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_object.API<HTTPClientExtraOptions> */ Any
}
