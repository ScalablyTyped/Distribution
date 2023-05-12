package typings.ipfsUnixfsImporter

import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDagBuilderValidateChunksMod {
  
  @JSImport("ipfs-unixfs-importer/dist/src/dag-builder/validate-chunks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultChunkValidator(): ChunkValidator = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultChunkValidator")().asInstanceOf[ChunkValidator]
  
  type ChunkValidator = js.Function1[
    /* source */ AsyncIterable[js.typedarray.Uint8Array], 
    AsyncIterable[js.typedarray.Uint8Array]
  ]
}
