package typings.ipfsUnixfsImporter

import typings.ipfsUnixfsImporter.distSrcTypesMod.InProgressImportResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDagBuilderFileMod {
  
  @JSImport("ipfs-unixfs-importer/dist/src/dag-builder/file", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @type {import('../../types').UnixFSV1DagBuilder<File>}
    */
  inline def default(
    file: typings.ipfsUnixfsImporter.distSrcTypesMod.File,
    block: typings.interfaceBlockstore.mod.Blockstore,
    options: typings.ipfsUnixfsImporter.distSrcTypesMod.ImporterOptions
  ): js.Promise[InProgressImportResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(file.asInstanceOf[js.Any], block.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[InProgressImportResult]]
  
  type Blockstore = typings.interfaceBlockstore.mod.Blockstore
  
  type DAGBuilder = typings.ipfsUnixfsImporter.distSrcTypesMod.DAGBuilder
  
  type File = typings.ipfsUnixfsImporter.distSrcTypesMod.File
  
  type FileDAGBuilder = typings.ipfsUnixfsImporter.distSrcTypesMod.FileDAGBuilder
  
  type ImporterOptions = typings.ipfsUnixfsImporter.distSrcTypesMod.ImporterOptions
  
  type Reducer = typings.ipfsUnixfsImporter.distSrcTypesMod.Reducer
}
