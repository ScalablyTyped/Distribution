package typings.ipfsHttpClient

import typings.ipfsHttpClient.distSrcTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDagPutMod {
  
  @JSImport("ipfs-http-client/dist/src/dag/put", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createPut(
    codecs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_multicodecs.Multicodecs */ Any,
    options: Options
  ): js.Function2[
    /* node */ Any, 
    /* options */ js.UndefOr[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_dag.PutOptions */ Any) & typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
    ], 
    js.Promise[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPut")(codecs.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* node */ Any, 
    /* options */ js.UndefOr[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_dag.PutOptions */ Any) & typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
    ], 
    js.Promise[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any
    ]
  ]]
  
  type DAGAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_dag.API<HTTPClientExtraOptions> */ Any
  
  type HTTPClientExtraOptions = typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
}
