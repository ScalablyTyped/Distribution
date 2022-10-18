package typings.ipfsHttpClient

import typings.ipfsHttpClient.distSrcLibConfigureMod.Factory
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDagExportMod {
  
  @JSImport("ipfs-http-client/dist/src/dag/export", "createExport")
  @js.native
  val createExport: Factory[
    js.Function2[
      /* root */ CID[Any, Double, Double, Version], 
      /* options */ js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_dag.ExportOptions */ Any) & typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
      ], 
      AsyncIterable[js.typedarray.Uint8Array]
    ]
  ] = js.native
  
  type DAGAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_dag.API<HTTPClientExtraOptions> */ Any
  
  type HTTPClientExtraOptions = typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
}
