package typings.ipfsUnixfsExporter

import typings.std.AsyncGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ipfs-unixfs-exporter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def exporter(path: String, blockstore: Blockstore): js.Promise[typings.ipfsUnixfsExporter.typesMod.UnixFSEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("exporter")(path.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.ipfsUnixfsExporter.typesMod.UnixFSEntry]]
  inline def exporter(path: String, blockstore: Blockstore, options: typings.ipfsUnixfsExporter.typesMod.ExporterOptions): js.Promise[typings.ipfsUnixfsExporter.typesMod.UnixFSEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("exporter")(path.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.ipfsUnixfsExporter.typesMod.UnixFSEntry]]
  inline def exporter(
    path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any,
    blockstore: Blockstore
  ): js.Promise[typings.ipfsUnixfsExporter.typesMod.UnixFSEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("exporter")(path.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.ipfsUnixfsExporter.typesMod.UnixFSEntry]]
  inline def exporter(
    path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any,
    blockstore: Blockstore,
    options: typings.ipfsUnixfsExporter.typesMod.ExporterOptions
  ): js.Promise[typings.ipfsUnixfsExporter.typesMod.UnixFSEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("exporter")(path.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.ipfsUnixfsExporter.typesMod.UnixFSEntry]]
  
  inline def recursive(path: String, blockstore: Blockstore): AsyncGenerator[typings.ipfsUnixfsExporter.typesMod.UnixFSEntry, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("recursive")(path.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[typings.ipfsUnixfsExporter.typesMod.UnixFSEntry, Unit, Any]]
  inline def recursive(path: String, blockstore: Blockstore, options: typings.ipfsUnixfsExporter.typesMod.ExporterOptions): AsyncGenerator[typings.ipfsUnixfsExporter.typesMod.UnixFSEntry, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("recursive")(path.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[typings.ipfsUnixfsExporter.typesMod.UnixFSEntry, Unit, Any]]
  inline def recursive(
    path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any,
    blockstore: Blockstore
  ): AsyncGenerator[typings.ipfsUnixfsExporter.typesMod.UnixFSEntry, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("recursive")(path.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[typings.ipfsUnixfsExporter.typesMod.UnixFSEntry, Unit, Any]]
  inline def recursive(
    path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any,
    blockstore: Blockstore,
    options: typings.ipfsUnixfsExporter.typesMod.ExporterOptions
  ): AsyncGenerator[typings.ipfsUnixfsExporter.typesMod.UnixFSEntry, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("recursive")(path.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[typings.ipfsUnixfsExporter.typesMod.UnixFSEntry, Unit, Any]]
  
  inline def walkPath(path: String, blockstore: Blockstore): AsyncGenerator[typings.ipfsUnixfsExporter.typesMod.UnixFSEntry, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("walkPath")(path.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[typings.ipfsUnixfsExporter.typesMod.UnixFSEntry, Unit, Any]]
  inline def walkPath(path: String, blockstore: Blockstore, options: typings.ipfsUnixfsExporter.typesMod.ExporterOptions): AsyncGenerator[typings.ipfsUnixfsExporter.typesMod.UnixFSEntry, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("walkPath")(path.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[typings.ipfsUnixfsExporter.typesMod.UnixFSEntry, Unit, Any]]
  inline def walkPath(
    path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any,
    blockstore: Blockstore
  ): AsyncGenerator[typings.ipfsUnixfsExporter.typesMod.UnixFSEntry, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("walkPath")(path.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[typings.ipfsUnixfsExporter.typesMod.UnixFSEntry, Unit, Any]]
  inline def walkPath(
    path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any,
    blockstore: Blockstore,
    options: typings.ipfsUnixfsExporter.typesMod.ExporterOptions
  ): AsyncGenerator[typings.ipfsUnixfsExporter.typesMod.UnixFSEntry, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("walkPath")(path.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[typings.ipfsUnixfsExporter.typesMod.UnixFSEntry, Unit, Any]]
  
  type Blockstore = typings.interfaceBlockstore.mod.Blockstore
  
  type ExporterOptions = typings.ipfsUnixfsExporter.typesMod.ExporterOptions
  
  type IdentityNode = typings.ipfsUnixfsExporter.typesMod.IdentityNode
  
  type ObjectNode = typings.ipfsUnixfsExporter.typesMod.ObjectNode
  
  type RawNode = typings.ipfsUnixfsExporter.typesMod.RawNode
  
  type UnixFS = typings.ipfsUnixfs.mod.UnixFS
  
  type UnixFSDirectory = typings.ipfsUnixfsExporter.typesMod.UnixFSDirectory
  
  type UnixFSEntry = typings.ipfsUnixfsExporter.typesMod.UnixFSEntry
  
  type UnixFSFile = typings.ipfsUnixfsExporter.typesMod.UnixFSFile
}
