package typings.ipfsUnixfsImporter

import typings.hamtSharding.bucketMod.BucketChild
import typings.hamtSharding.mod.Bucket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dirShardedMod {
  
  /**
    * @typedef {import('./types').ImporterOptions} ImporterOptions
    * @typedef {import('./types').ImportResult} ImportResult
    * @typedef {import('./types').InProgressImportResult} InProgressImportResult
    * @typedef {import('interface-blockstore').Blockstore} Blockstore
    */
  /**
    * @typedef {import('./dir').DirProps} DirProps
    */
  @JSImport("ipfs-unixfs-importer/dist/src/dir-sharded", JSImport.Default)
  @js.native
  open class default () extends DirSharded
  
  type Blockstore = typings.interfaceBlockstore.mod.Blockstore
  
  type DirProps = typings.ipfsUnixfsImporter.srcDirMod.DirProps
  
  /**
    * @typedef {import('./types').ImporterOptions} ImporterOptions
    * @typedef {import('./types').ImportResult} ImportResult
    * @typedef {import('./types').InProgressImportResult} InProgressImportResult
    * @typedef {import('interface-blockstore').Blockstore} Blockstore
    */
  /**
    * @typedef {import('./dir').DirProps} DirProps
    */
  @js.native
  trait DirSharded
    extends typings.ipfsUnixfsImporter.srcDirMod.default {
    
    /** @type {Bucket<InProgressImportResult | Dir>} */
    var _bucket: Bucket[InProgressImportResult | typings.ipfsUnixfsImporter.srcDirMod.default] = js.native
    
    def childCount(): Double = js.native
    
    def directChildrenCount(): Double = js.native
    
    def onlyChild(): (Bucket[
        typings.ipfsUnixfsImporter.typesMod.InProgressImportResult | typings.ipfsUnixfsImporter.srcDirMod.default
      ]) | (BucketChild[
        typings.ipfsUnixfsImporter.typesMod.InProgressImportResult | typings.ipfsUnixfsImporter.srcDirMod.default
      ]) = js.native
  }
  
  type ImportResult = typings.ipfsUnixfsImporter.typesMod.ImportResult
  
  type ImporterOptions = typings.ipfsUnixfsImporter.typesMod.ImporterOptions
  
  type InProgressImportResult = typings.ipfsUnixfsImporter.typesMod.InProgressImportResult
}
