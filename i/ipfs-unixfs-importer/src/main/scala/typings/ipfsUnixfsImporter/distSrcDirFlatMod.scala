package typings.ipfsUnixfsImporter

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDirFlatMod {
  
  /**
    * @typedef {import('./types').ImporterOptions} ImporterOptions
    * @typedef {import('./types').ImportResult} ImportResult
    * @typedef {import('./types').InProgressImportResult} InProgressImportResult
    * @typedef {import('interface-blockstore').Blockstore} Blockstore
    * @typedef {import('./dir').DirProps} DirProps
    * @typedef {import('@ipld/dag-pb').PBNode} PBNode
    * @typedef {import('@ipld/dag-pb').PBLink} PBLink
    */
  @JSImport("ipfs-unixfs-importer/dist/src/dir-flat", JSImport.Default)
  @js.native
  open class default () extends DirFlat
  
  type Blockstore = typings.interfaceBlockstore.mod.Blockstore
  
  /**
    * @typedef {import('./types').ImporterOptions} ImporterOptions
    * @typedef {import('./types').ImportResult} ImportResult
    * @typedef {import('./types').InProgressImportResult} InProgressImportResult
    * @typedef {import('interface-blockstore').Blockstore} Blockstore
    * @typedef {import('./dir').DirProps} DirProps
    * @typedef {import('@ipld/dag-pb').PBNode} PBNode
    * @typedef {import('@ipld/dag-pb').PBLink} PBLink
    */
  @js.native
  trait DirFlat
    extends typings.ipfsUnixfsImporter.distSrcDirMod.default {
    
    /** @type {{ [key: string]: InProgressImportResult | Dir }} */
    var _children: StringDictionary[
        typings.ipfsUnixfsImporter.distSrcTypesMod.InProgressImportResult | typings.ipfsUnixfsImporter.distSrcDirMod.default
      ] = js.native
    
    def childCount(): Double = js.native
    
    def directChildrenCount(): Double = js.native
    
    def onlyChild(): typings.ipfsUnixfsImporter.distSrcTypesMod.InProgressImportResult | typings.ipfsUnixfsImporter.distSrcDirMod.default = js.native
  }
  
  type DirProps = typings.ipfsUnixfsImporter.distSrcDirMod.DirProps
  
  type ImportResult = typings.ipfsUnixfsImporter.distSrcTypesMod.ImportResult
  
  type ImporterOptions = typings.ipfsUnixfsImporter.distSrcTypesMod.ImporterOptions
  
  type InProgressImportResult = typings.ipfsUnixfsImporter.distSrcTypesMod.InProgressImportResult
  
  type PBLink = typings.ipldDagPb.mod.PBLink
  
  type PBNode = typings.ipldDagPb.mod.PBNode
}
