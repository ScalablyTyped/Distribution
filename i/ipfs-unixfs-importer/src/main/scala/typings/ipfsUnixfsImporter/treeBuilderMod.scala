package typings.ipfsUnixfsImporter

import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeBuilderMod {
  
  @JSImport("ipfs-unixfs-importer/dist/src/tree-builder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @type {TreeBuilder}
    */
  inline def default(
    source: AsyncIterable[typings.ipfsUnixfsImporter.typesMod.InProgressImportResult],
    block: typings.interfaceBlockstore.mod.Blockstore,
    options: typings.ipfsUnixfsImporter.typesMod.ImporterOptions
  ): AsyncIterable[typings.ipfsUnixfsImporter.typesMod.ImportResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], block.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[typings.ipfsUnixfsImporter.typesMod.ImportResult]]
  
  type Blockstore = typings.interfaceBlockstore.mod.Blockstore
  
  type ImportResult = typings.ipfsUnixfsImporter.typesMod.ImportResult
  
  type ImporterOptions = typings.ipfsUnixfsImporter.typesMod.ImporterOptions
  
  type InProgressImportResult = typings.ipfsUnixfsImporter.typesMod.InProgressImportResult
  
  type TreeBuilder = js.Function3[
    /* source */ AsyncIterable[InProgressImportResult], 
    /* blockstore */ Blockstore, 
    /* options */ ImporterOptions, 
    AsyncIterable[ImportResult]
  ]
}
