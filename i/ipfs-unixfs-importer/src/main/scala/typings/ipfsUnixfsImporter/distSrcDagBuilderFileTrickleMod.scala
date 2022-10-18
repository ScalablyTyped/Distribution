package typings.ipfsUnixfsImporter

import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDagBuilderFileTrickleMod {
  
  @JSImport("ipfs-unixfs-importer/dist/src/dag-builder/file/trickle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    source: js.Iterable[typings.ipfsUnixfsImporter.distSrcTypesMod.InProgressImportResult],
    reduce: typings.ipfsUnixfsImporter.distSrcTypesMod.Reducer,
    options: typings.ipfsUnixfsImporter.distSrcTypesMod.ImporterOptions
  ): js.Promise[typings.ipfsUnixfsImporter.distSrcTypesMod.InProgressImportResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], reduce.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.ipfsUnixfsImporter.distSrcTypesMod.InProgressImportResult]]
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
    source: AsyncIterable[typings.ipfsUnixfsImporter.distSrcTypesMod.InProgressImportResult],
    reduce: typings.ipfsUnixfsImporter.distSrcTypesMod.Reducer,
    options: typings.ipfsUnixfsImporter.distSrcTypesMod.ImporterOptions
  ): js.Promise[typings.ipfsUnixfsImporter.distSrcTypesMod.InProgressImportResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], reduce.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.ipfsUnixfsImporter.distSrcTypesMod.InProgressImportResult]]
  
  type FileDAGBuilder = typings.ipfsUnixfsImporter.distSrcTypesMod.FileDAGBuilder
  
  type ImporterOptions = typings.ipfsUnixfsImporter.distSrcTypesMod.ImporterOptions
  
  type InProgressImportResult = typings.ipfsUnixfsImporter.distSrcTypesMod.InProgressImportResult
  
  type Reducer = typings.ipfsUnixfsImporter.distSrcTypesMod.Reducer
  
  type TrickleDagNode = typings.ipfsUnixfsImporter.distSrcTypesMod.TrickleDagNode
  
  type UnixFS = typings.ipfsUnixfs.mod.UnixFS
}
