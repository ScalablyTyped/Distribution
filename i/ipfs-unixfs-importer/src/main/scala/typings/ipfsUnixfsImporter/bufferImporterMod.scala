package typings.ipfsUnixfsImporter

import typings.interfaceBlockstore.mod.Blockstore
import typings.ipfsUnixfsImporter.typesMod.File
import typings.ipfsUnixfsImporter.typesMod.ImporterOptions
import typings.ipfsUnixfsImporter.typesMod.InProgressImportResult
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bufferImporterMod {
  
  @JSImport("ipfs-unixfs-importer/dist/src/dag-builder/file/buffer-importer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @typedef {import('../../types').BufferImporter} BufferImporter
    */
  /**
    * @type {BufferImporter}
    */
  inline def default(file: File, block: Blockstore, options: ImporterOptions): AsyncIterable[js.Function0[js.Promise[InProgressImportResult]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(file.asInstanceOf[js.Any], block.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[js.Function0[js.Promise[InProgressImportResult]]]]
  
  type BufferImporter = typings.ipfsUnixfsImporter.typesMod.BufferImporter
}
