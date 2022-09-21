package typings.ipfsUnixfsImporter

import typings.ipfsUnixfsImporter.typesMod.InProgressImportResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileMod {
  
  @JSImport("ipfs-unixfs-importer/dist/src/dag-builder/file", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @type {import('../../types').UnixFSV1DagBuilder<File>}
    */
  inline def default(
    file: typings.ipfsUnixfsImporter.typesMod.File,
    block: typings.interfaceBlockstore.mod.Blockstore,
    options: typings.ipfsUnixfsImporter.typesMod.ImporterOptions
  ): js.Promise[InProgressImportResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(file.asInstanceOf[js.Any], block.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[InProgressImportResult]]
  
  type Blockstore = typings.interfaceBlockstore.mod.Blockstore
  
  type DAGBuilder = typings.ipfsUnixfsImporter.typesMod.DAGBuilder
  
  type File = typings.ipfsUnixfsImporter.typesMod.File
  
  type FileDAGBuilder = typings.ipfsUnixfsImporter.typesMod.FileDAGBuilder
  
  type ImporterOptions = typings.ipfsUnixfsImporter.typesMod.ImporterOptions
  
  type Reducer = typings.ipfsUnixfsImporter.typesMod.Reducer
}
