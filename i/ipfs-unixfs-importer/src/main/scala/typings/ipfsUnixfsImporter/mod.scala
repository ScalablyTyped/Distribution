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
  
  type BufferImporter = typings.ipfsUnixfsImporter.typesMod.BufferImporter
  
  type ChunkValidator = typings.ipfsUnixfsImporter.typesMod.ChunkValidator
  
  type Chunker = typings.ipfsUnixfsImporter.typesMod.Chunker
  
  type DAGBuilder = typings.ipfsUnixfsImporter.typesMod.DAGBuilder
  
  type Directory = typings.ipfsUnixfsImporter.typesMod.Directory
  
  type File = typings.ipfsUnixfsImporter.typesMod.File
  
  type ImportCandidate = typings.ipfsUnixfsImporter.typesMod.ImportCandidate
  
  type ImportResult = typings.ipfsUnixfsImporter.typesMod.ImportResult
  
  type ImporterOptions = typings.ipfsUnixfsImporter.typesMod.ImporterOptions
  
  type ProgressHandler = typings.ipfsUnixfsImporter.typesMod.ProgressHandler
  
  type Reducer = typings.ipfsUnixfsImporter.typesMod.Reducer
  
  type TreeBuilder = typings.ipfsUnixfsImporter.typesMod.TreeBuilder
  
  type UserImporterOptions = typings.ipfsUnixfsImporter.typesMod.UserImporterOptions
}
