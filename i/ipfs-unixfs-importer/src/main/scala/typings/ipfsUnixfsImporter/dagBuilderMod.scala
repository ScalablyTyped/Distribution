package typings.ipfsUnixfsImporter

import typings.interfaceBlockstore.mod.Blockstore
import typings.ipfsUnixfsImporter.typesMod.ImportCandidate
import typings.ipfsUnixfsImporter.typesMod.ImporterOptions
import typings.ipfsUnixfsImporter.typesMod.InProgressImportResult
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dagBuilderMod {
  
  @JSImport("ipfs-unixfs-importer/dist/src/dag-builder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(source: js.Iterable[ImportCandidate], blockstore: Blockstore, options: ImporterOptions): AsyncIterable[js.Function0[js.Promise[InProgressImportResult]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[js.Function0[js.Promise[InProgressImportResult]]]]
  /**
    * @type {DAGBuilder}
    */
  inline def default(source: AsyncIterable[ImportCandidate], blockstore: Blockstore, options: ImporterOptions): AsyncIterable[js.Function0[js.Promise[InProgressImportResult]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[js.Function0[js.Promise[InProgressImportResult]]]]
  
  type ChunkValidator = typings.ipfsUnixfsImporter.typesMod.ChunkValidator
  
  type Chunker = typings.ipfsUnixfsImporter.typesMod.Chunker
  
  type DAGBuilder = typings.ipfsUnixfsImporter.typesMod.DAGBuilder
  
  type Directory = typings.ipfsUnixfsImporter.typesMod.Directory
  
  type File = typings.ipfsUnixfsImporter.typesMod.File
}
