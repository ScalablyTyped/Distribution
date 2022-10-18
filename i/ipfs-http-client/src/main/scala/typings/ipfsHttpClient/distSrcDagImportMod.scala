package typings.ipfsHttpClient

import typings.ipfsHttpClient.distSrcLibConfigureMod.Factory
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDagImportMod {
  
  @JSImport("ipfs-http-client/dist/src/dag/import", "createImport")
  @js.native
  val createImport: Factory[
    js.Function2[
      /* source */ (js.Iterable[AsyncIterable[js.typedarray.Uint8Array] | js.typedarray.Uint8Array]) | (AsyncIterable[AsyncIterable[js.typedarray.Uint8Array] | js.typedarray.Uint8Array]), 
      /* options */ js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_dag.ImportOptions */ Any) & typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
      ], 
      AsyncIterable[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_dag.ImportResult */ Any
      ]
    ]
  ] = js.native
  
  type DAGAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_dag.API<HTTPClientExtraOptions> */ Any
  
  type HTTPClientExtraOptions = typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
}
