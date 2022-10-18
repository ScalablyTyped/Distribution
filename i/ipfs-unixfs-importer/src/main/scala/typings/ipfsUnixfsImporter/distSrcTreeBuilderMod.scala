package typings.ipfsUnixfsImporter

import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTreeBuilderMod {
  
  @JSImport("ipfs-unixfs-importer/dist/src/tree-builder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @type {TreeBuilder}
    */
  inline def default(
    source: AsyncIterable[typings.ipfsUnixfsImporter.distSrcTypesMod.InProgressImportResult],
    block: typings.interfaceBlockstore.mod.Blockstore,
    options: typings.ipfsUnixfsImporter.distSrcTypesMod.ImporterOptions
  ): AsyncIterable[typings.ipfsUnixfsImporter.distSrcTypesMod.ImportResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], block.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[typings.ipfsUnixfsImporter.distSrcTypesMod.ImportResult]]
  
  type Blockstore = typings.interfaceBlockstore.mod.Blockstore
  
  type ImportResult = typings.ipfsUnixfsImporter.distSrcTypesMod.ImportResult
  
  type ImporterOptions = typings.ipfsUnixfsImporter.distSrcTypesMod.ImporterOptions
  
  type InProgressImportResult = typings.ipfsUnixfsImporter.distSrcTypesMod.InProgressImportResult
  
  type TreeBuilder = js.Function3[
    /* source */ AsyncIterable[InProgressImportResult], 
    /* blockstore */ Blockstore, 
    /* options */ ImporterOptions, 
    AsyncIterable[ImportResult]
  ]
}
