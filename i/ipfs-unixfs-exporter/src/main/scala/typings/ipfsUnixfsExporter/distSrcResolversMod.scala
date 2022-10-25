package typings.ipfsUnixfsExporter

import typings.interfaceBlockstore.mod.Blockstore
import typings.ipfsUnixfsExporter.distSrcTypesMod.ExporterOptions
import typings.ipfsUnixfsExporter.distSrcTypesMod.ResolveResult
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.multiformats.mod.CID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcResolversMod {
  
  @JSImport("ipfs-unixfs-exporter/dist/src/resolvers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @type {Resolve}
    */
  inline def default(
    cid: CID[Any, Double, Double, Version],
    name: String,
    path: String,
    toResolve: js.Array[String],
    depth: Double,
    blockstore: Blockstore,
    options: ExporterOptions
  ): js.Promise[ResolveResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(cid.asInstanceOf[js.Any], name.asInstanceOf[js.Any], path.asInstanceOf[js.Any], toResolve.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResolveResult]]
  
  type Resolve = typings.ipfsUnixfsExporter.distSrcTypesMod.Resolve
  
  type Resolver = typings.ipfsUnixfsExporter.distSrcTypesMod.Resolver
}
