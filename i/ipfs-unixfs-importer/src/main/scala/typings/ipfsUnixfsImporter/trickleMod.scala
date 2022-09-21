package typings.ipfsUnixfsImporter

import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trickleMod {
  
  @JSImport("ipfs-unixfs-importer/dist/src/dag-builder/file/trickle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    source: js.Iterable[typings.ipfsUnixfsImporter.typesMod.InProgressImportResult],
    reduce: typings.ipfsUnixfsImporter.typesMod.Reducer,
    options: typings.ipfsUnixfsImporter.typesMod.ImporterOptions
  ): js.Promise[typings.ipfsUnixfsImporter.typesMod.InProgressImportResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], reduce.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.ipfsUnixfsImporter.typesMod.InProgressImportResult]]
  /**
    * @typedef {import('ipfs-unixfs').UnixFS} UnixFS
    * @typedef {import('../../types').ImporterOptions} ImporterOptions
    * @typedef {import('../../types').InProgressImportResult} InProgressImportResult
    * @typedef {import('../../types').TrickleDagNode} TrickleDagNode
    * @typedef {import('../../types').Reducer} Reducer
    * @typedef {import('../../types').FileDAGBuilder} FileDAGBuilder
    */
  /**
    * @type {FileDAGBuilder}
    */
  inline def default(
    source: AsyncIterable[typings.ipfsUnixfsImporter.typesMod.InProgressImportResult],
    reduce: typings.ipfsUnixfsImporter.typesMod.Reducer,
    options: typings.ipfsUnixfsImporter.typesMod.ImporterOptions
  ): js.Promise[typings.ipfsUnixfsImporter.typesMod.InProgressImportResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], reduce.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.ipfsUnixfsImporter.typesMod.InProgressImportResult]]
  
  type FileDAGBuilder = typings.ipfsUnixfsImporter.typesMod.FileDAGBuilder
  
  type ImporterOptions = typings.ipfsUnixfsImporter.typesMod.ImporterOptions
  
  type InProgressImportResult = typings.ipfsUnixfsImporter.typesMod.InProgressImportResult
  
  type Reducer = typings.ipfsUnixfsImporter.typesMod.Reducer
  
  type TrickleDagNode = typings.ipfsUnixfsImporter.typesMod.TrickleDagNode
  
  type UnixFS = typings.ipfsUnixfs.mod.UnixFS
}
