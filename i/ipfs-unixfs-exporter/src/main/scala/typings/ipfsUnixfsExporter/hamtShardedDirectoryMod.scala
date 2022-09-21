package typings.ipfsUnixfsExporter

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hamtShardedDirectoryMod extends Shortcut {
  
  /**
    * @typedef {import('interface-blockstore').Blockstore} Blockstore
    * @typedef {import('../../../types').ExporterOptions} ExporterOptions
    * @typedef {import('../../../types').Resolve} Resolve
    * @typedef {import('../../../types').UnixfsV1DirectoryContent} UnixfsV1DirectoryContent
    * @typedef {import('../../../types').UnixfsV1Resolver} UnixfsV1Resolver
    * @typedef {import('@ipld/dag-pb').PBNode} PBNode
    */
  /**
    * @type {UnixfsV1Resolver}
    */
  @JSImport("ipfs-unixfs-exporter/dist/src/resolvers/unixfs-v1/content/hamt-sharded-directory", JSImport.Default)
  @js.native
  val default: UnixfsV1Resolver = js.native
  
  type Blockstore = typings.interfaceBlockstore.mod.Blockstore
  
  type ExporterOptions = typings.ipfsUnixfsExporter.typesMod.ExporterOptions
  
  type PBNode = typings.ipldDagPb.mod.PBNode
  
  type Resolve = typings.ipfsUnixfsExporter.typesMod.Resolve
  
  type UnixfsV1DirectoryContent = typings.ipfsUnixfsExporter.typesMod.UnixfsV1DirectoryContent
  
  type UnixfsV1Resolver = typings.ipfsUnixfsExporter.typesMod.UnixfsV1Resolver
  
  type _To = UnixfsV1Resolver
  
  /* This means you don't have to write `default`, but can instead just say `hamtShardedDirectoryMod.foo` */
  override def _to: UnixfsV1Resolver = default
}
