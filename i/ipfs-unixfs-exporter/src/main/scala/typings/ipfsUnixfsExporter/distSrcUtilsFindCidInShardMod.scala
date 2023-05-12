package typings.ipfsUnixfsExporter

import typings.ipfsUnixfsExporter.mod.ExporterOptions
import typings.ipfsUnixfsExporter.mod.ReadableStorage
import typings.ipfsUnixfsExporter.mod.ShardTraversalContext
import typings.ipldDagPb.mod.PBNode
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsFindCidInShardMod {
  
  @JSImport("ipfs-unixfs-exporter/dist/src/utils/find-cid-in-shard", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(node: PBNode, name: String, blockstore: ReadableStorage): js.Promise[js.UndefOr[CID[Any, Double, Double, Version]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], name.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[CID[Any, Double, Double, Version]]]]
  inline def default(node: PBNode, name: String, blockstore: ReadableStorage, context: Unit, options: ExporterOptions): js.Promise[js.UndefOr[CID[Any, Double, Double, Version]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], name.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any], context.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[CID[Any, Double, Double, Version]]]]
  inline def default(node: PBNode, name: String, blockstore: ReadableStorage, context: ShardTraversalContext): js.Promise[js.UndefOr[CID[Any, Double, Double, Version]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], name.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[CID[Any, Double, Double, Version]]]]
  inline def default(
    node: PBNode,
    name: String,
    blockstore: ReadableStorage,
    context: ShardTraversalContext,
    options: ExporterOptions
  ): js.Promise[js.UndefOr[CID[Any, Double, Double, Version]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], name.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any], context.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[CID[Any, Double, Double, Version]]]]
}
