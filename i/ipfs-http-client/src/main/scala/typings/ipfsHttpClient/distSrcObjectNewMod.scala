package typings.ipfsHttpClient

import typings.ipfsHttpClient.distSrcLibConfigureMod.Factory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcObjectNewMod {
  
  @JSImport("ipfs-http-client/dist/src/object/new", "createNew")
  @js.native
  val createNew: Factory[
    js.Function1[
      /* options */ js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_object.NewObjectOptions */ Any) & typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
      ], 
      js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID<unknown, number, number, imported_cid.Version> */ Any
      ]
    ]
  ] = js.native
  
  type HTTPClientExtraOptions = typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
  
  type ObjectAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_object.API<HTTPClientExtraOptions> */ Any
}
