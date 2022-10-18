package typings.ipfsUnixfsExporter

import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsFindCidInShardMod {
  
  @JSImport("ipfs-unixfs-exporter/dist/src/utils/find-cid-in-shard", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @typedef {import('../types').ShardTraversalContext} ShardTraversalContext
    *
    * @param {PBNode} node
    * @param {string} name
    * @param {Blockstore} blockstore
    * @param {ShardTraversalContext} [context]
    * @param {ExporterOptions} [options]
    * @returns {Promise<CID|null>}
    */
  inline def default(node: PBNode, name: String, blockstore: Blockstore): js.Promise[CID | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], name.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CID | Null]]
  inline def default(
    node: PBNode,
    name: String,
    blockstore: Blockstore,
    context: Unit,
    options: typings.ipfsUnixfsExporter.distSrcTypesMod.ExporterOptions
  ): js.Promise[CID | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], name.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any], context.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CID | Null]]
  inline def default(
    node: PBNode,
    name: String,
    blockstore: Blockstore,
    context: typings.ipfsUnixfsExporter.distSrcTypesMod.ShardTraversalContext
  ): js.Promise[CID | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], name.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CID | Null]]
  inline def default(
    node: PBNode,
    name: String,
    blockstore: Blockstore,
    context: typings.ipfsUnixfsExporter.distSrcTypesMod.ShardTraversalContext,
    options: typings.ipfsUnixfsExporter.distSrcTypesMod.ExporterOptions
  ): js.Promise[CID | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], name.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any], context.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CID | Null]]
  
  type Blockstore = typings.interfaceBlockstore.mod.Blockstore
  
  type CID = typings.multiformats.cidMod.CID[Any, Double, Double, Version]
  
  type ExporterOptions = typings.ipfsUnixfsExporter.distSrcTypesMod.ExporterOptions
  
  type PBLink = typings.ipldDagPb.mod.PBLink
  
  type PBNode = typings.ipldDagPb.mod.PBNode
  
  type ShardTraversalContext = typings.ipfsUnixfsExporter.distSrcTypesMod.ShardTraversalContext
}
