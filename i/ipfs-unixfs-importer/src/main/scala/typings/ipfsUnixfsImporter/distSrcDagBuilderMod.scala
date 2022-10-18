package typings.ipfsUnixfsImporter

import typings.interfaceBlockstore.mod.Blockstore
import typings.ipfsUnixfsImporter.distSrcTypesMod.ImportCandidate
import typings.ipfsUnixfsImporter.distSrcTypesMod.ImporterOptions
import typings.ipfsUnixfsImporter.distSrcTypesMod.InProgressImportResult
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDagBuilderMod {
  
  @JSImport("ipfs-unixfs-importer/dist/src/dag-builder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(source: js.Iterable[ImportCandidate], blockstore: Blockstore, options: ImporterOptions): AsyncIterable[js.Function0[js.Promise[InProgressImportResult]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[js.Function0[js.Promise[InProgressImportResult]]]]
  /**
    * @type {DAGBuilder}
    */
  inline def default(source: AsyncIterable[ImportCandidate], blockstore: Blockstore, options: ImporterOptions): AsyncIterable[js.Function0[js.Promise[InProgressImportResult]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[js.Function0[js.Promise[InProgressImportResult]]]]
  
  type ChunkValidator = typings.ipfsUnixfsImporter.distSrcTypesMod.ChunkValidator
  
  type Chunker = typings.ipfsUnixfsImporter.distSrcTypesMod.Chunker
  
  type DAGBuilder = typings.ipfsUnixfsImporter.distSrcTypesMod.DAGBuilder
  
  type Directory = typings.ipfsUnixfsImporter.distSrcTypesMod.Directory
  
  type File = typings.ipfsUnixfsImporter.distSrcTypesMod.File
}
