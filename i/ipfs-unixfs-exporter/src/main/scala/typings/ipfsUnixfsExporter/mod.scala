package typings.ipfsUnixfsExporter

import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.std.AsyncGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ipfs-unixfs-exporter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def exporter(path: String, blockstore: Blockstore): js.Promise[typings.ipfsUnixfsExporter.distSrcTypesMod.UnixFSEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("exporter")(path.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.ipfsUnixfsExporter.distSrcTypesMod.UnixFSEntry]]
  inline def exporter(
    path: String,
    blockstore: Blockstore,
    options: typings.ipfsUnixfsExporter.distSrcTypesMod.ExporterOptions
  ): js.Promise[typings.ipfsUnixfsExporter.distSrcTypesMod.UnixFSEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("exporter")(path.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.ipfsUnixfsExporter.distSrcTypesMod.UnixFSEntry]]
  inline def exporter(path: CID[Any, Double, Double, Version], blockstore: Blockstore): js.Promise[typings.ipfsUnixfsExporter.distSrcTypesMod.UnixFSEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("exporter")(path.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.ipfsUnixfsExporter.distSrcTypesMod.UnixFSEntry]]
  inline def exporter(
    path: CID[Any, Double, Double, Version],
    blockstore: Blockstore,
    options: typings.ipfsUnixfsExporter.distSrcTypesMod.ExporterOptions
  ): js.Promise[typings.ipfsUnixfsExporter.distSrcTypesMod.UnixFSEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("exporter")(path.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.ipfsUnixfsExporter.distSrcTypesMod.UnixFSEntry]]
  
  inline def recursive(path: String, blockstore: Blockstore): AsyncGenerator[typings.ipfsUnixfsExporter.distSrcTypesMod.UnixFSEntry, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("recursive")(path.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[typings.ipfsUnixfsExporter.distSrcTypesMod.UnixFSEntry, Unit, Any]]
  inline def recursive(
    path: String,
    blockstore: Blockstore,
    options: typings.ipfsUnixfsExporter.distSrcTypesMod.ExporterOptions
  ): AsyncGenerator[typings.ipfsUnixfsExporter.distSrcTypesMod.UnixFSEntry, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("recursive")(path.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[typings.ipfsUnixfsExporter.distSrcTypesMod.UnixFSEntry, Unit, Any]]
  inline def recursive(path: CID[Any, Double, Double, Version], blockstore: Blockstore): AsyncGenerator[typings.ipfsUnixfsExporter.distSrcTypesMod.UnixFSEntry, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("recursive")(path.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[typings.ipfsUnixfsExporter.distSrcTypesMod.UnixFSEntry, Unit, Any]]
  inline def recursive(
    path: CID[Any, Double, Double, Version],
    blockstore: Blockstore,
    options: typings.ipfsUnixfsExporter.distSrcTypesMod.ExporterOptions
  ): AsyncGenerator[typings.ipfsUnixfsExporter.distSrcTypesMod.UnixFSEntry, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("recursive")(path.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[typings.ipfsUnixfsExporter.distSrcTypesMod.UnixFSEntry, Unit, Any]]
  
  inline def walkPath(path: String, blockstore: Blockstore): AsyncGenerator[typings.ipfsUnixfsExporter.distSrcTypesMod.UnixFSEntry, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("walkPath")(path.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[typings.ipfsUnixfsExporter.distSrcTypesMod.UnixFSEntry, Unit, Any]]
  inline def walkPath(
    path: String,
    blockstore: Blockstore,
    options: typings.ipfsUnixfsExporter.distSrcTypesMod.ExporterOptions
  ): AsyncGenerator[typings.ipfsUnixfsExporter.distSrcTypesMod.UnixFSEntry, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("walkPath")(path.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[typings.ipfsUnixfsExporter.distSrcTypesMod.UnixFSEntry, Unit, Any]]
  inline def walkPath(path: CID[Any, Double, Double, Version], blockstore: Blockstore): AsyncGenerator[typings.ipfsUnixfsExporter.distSrcTypesMod.UnixFSEntry, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("walkPath")(path.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[typings.ipfsUnixfsExporter.distSrcTypesMod.UnixFSEntry, Unit, Any]]
  inline def walkPath(
    path: CID[Any, Double, Double, Version],
    blockstore: Blockstore,
    options: typings.ipfsUnixfsExporter.distSrcTypesMod.ExporterOptions
  ): AsyncGenerator[typings.ipfsUnixfsExporter.distSrcTypesMod.UnixFSEntry, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("walkPath")(path.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[typings.ipfsUnixfsExporter.distSrcTypesMod.UnixFSEntry, Unit, Any]]
  
  type Blockstore = typings.interfaceBlockstore.mod.Blockstore
  
  type ExporterOptions = typings.ipfsUnixfsExporter.distSrcTypesMod.ExporterOptions
  
  type IdentityNode = typings.ipfsUnixfsExporter.distSrcTypesMod.IdentityNode
  
  type ObjectNode = typings.ipfsUnixfsExporter.distSrcTypesMod.ObjectNode
  
  type RawNode = typings.ipfsUnixfsExporter.distSrcTypesMod.RawNode
  
  type UnixFS = typings.ipfsUnixfs.mod.UnixFS
  
  type UnixFSDirectory = typings.ipfsUnixfsExporter.distSrcTypesMod.UnixFSDirectory
  
  type UnixFSEntry = typings.ipfsUnixfsExporter.distSrcTypesMod.UnixFSEntry
  
  type UnixFSFile = typings.ipfsUnixfsExporter.distSrcTypesMod.UnixFSFile
}
