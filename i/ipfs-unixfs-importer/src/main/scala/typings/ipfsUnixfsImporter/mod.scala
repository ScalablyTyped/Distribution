package typings.ipfsUnixfsImporter

import typings.std.AsyncGenerator
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ipfs-unixfs-importer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def importer(source: js.Iterable[ImportCandidate], blockstore: Blockstore): AsyncGenerator[ImportResult, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("importer")(source.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[ImportResult, Unit, Any]]
  inline def importer(source: js.Iterable[ImportCandidate], blockstore: Blockstore, options: UserImporterOptions): AsyncGenerator[ImportResult, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("importer")(source.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[ImportResult, Unit, Any]]
  inline def importer(source: ImportCandidate, blockstore: Blockstore): AsyncGenerator[ImportResult, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("importer")(source.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[ImportResult, Unit, Any]]
  inline def importer(source: ImportCandidate, blockstore: Blockstore, options: UserImporterOptions): AsyncGenerator[ImportResult, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("importer")(source.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[ImportResult, Unit, Any]]
  inline def importer(source: AsyncIterable[ImportCandidate], blockstore: Blockstore): AsyncGenerator[ImportResult, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("importer")(source.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[ImportResult, Unit, Any]]
  inline def importer(source: AsyncIterable[ImportCandidate], blockstore: Blockstore, options: UserImporterOptions): AsyncGenerator[ImportResult, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("importer")(source.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[ImportResult, Unit, Any]]
  
  type Blockstore = typings.interfaceBlockstore.mod.Blockstore
  
  type BufferImporter = typings.ipfsUnixfsImporter.distSrcTypesMod.BufferImporter
  
  type ChunkValidator = typings.ipfsUnixfsImporter.distSrcTypesMod.ChunkValidator
  
  type Chunker = typings.ipfsUnixfsImporter.distSrcTypesMod.Chunker
  
  type DAGBuilder = typings.ipfsUnixfsImporter.distSrcTypesMod.DAGBuilder
  
  type Directory = typings.ipfsUnixfsImporter.distSrcTypesMod.Directory
  
  type File = typings.ipfsUnixfsImporter.distSrcTypesMod.File
  
  type ImportCandidate = typings.ipfsUnixfsImporter.distSrcTypesMod.ImportCandidate
  
  type ImportResult = typings.ipfsUnixfsImporter.distSrcTypesMod.ImportResult
  
  type ImporterOptions = typings.ipfsUnixfsImporter.distSrcTypesMod.ImporterOptions
  
  type ProgressHandler = typings.ipfsUnixfsImporter.distSrcTypesMod.ProgressHandler
  
  type Reducer = typings.ipfsUnixfsImporter.distSrcTypesMod.Reducer
  
  type TreeBuilder = typings.ipfsUnixfsImporter.distSrcTypesMod.TreeBuilder
  
  type UserImporterOptions = typings.ipfsUnixfsImporter.distSrcTypesMod.UserImporterOptions
}
