package typings.ipfsUnixfsExporter

import typings.interfaceBlockstore.mod.Blockstore
import typings.ipfsUnixfsExporter.typesMod.ExporterOptions
import typings.ipfsUnixfsExporter.typesMod.ResolveResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolversMod {
  
  @JSImport("ipfs-unixfs-exporter/dist/src/resolvers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @type {Resolve}
    */
  inline def default(
    cid: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_cid.CID */ Any,
    name: String,
    path: String,
    toResolve: js.Array[String],
    depth: Double,
    blockstore: Blockstore,
    options: ExporterOptions
  ): js.Promise[ResolveResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(cid.asInstanceOf[js.Any], name.asInstanceOf[js.Any], path.asInstanceOf[js.Any], toResolve.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResolveResult]]
  
  type Resolve = typings.ipfsUnixfsExporter.typesMod.Resolve
  
  type Resolver = typings.ipfsUnixfsExporter.typesMod.Resolver
}
