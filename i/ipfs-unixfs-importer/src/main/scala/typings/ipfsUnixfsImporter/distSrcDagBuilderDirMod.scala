package typings.ipfsUnixfsImporter

import org.scalablytyped.runtime.Shortcut
import typings.ipfsUnixfsImporter.distSrcTypesMod.UnixFSV1DagBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDagBuilderDirMod extends Shortcut {
  
  /**
    * @typedef {import('../types').Directory} Directory
    */
  /**
    * @type {import('../types').UnixFSV1DagBuilder<Directory>}
    */
  @JSImport("ipfs-unixfs-importer/dist/src/dag-builder/dir", JSImport.Default)
  @js.native
  val default: UnixFSV1DagBuilder[Directory] = js.native
  
  type Directory = typings.ipfsUnixfsImporter.distSrcTypesMod.Directory
  
  type _To = UnixFSV1DagBuilder[Directory]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcDagBuilderDirMod.foo` */
  override def _to: UnixFSV1DagBuilder[Directory] = default
}
