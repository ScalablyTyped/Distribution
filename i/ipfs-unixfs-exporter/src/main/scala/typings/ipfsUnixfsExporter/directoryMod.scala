package typings.ipfsUnixfsExporter

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directoryMod extends Shortcut {
  
  /**
    * @typedef {import('../../../types').ExporterOptions} ExporterOptions
    * @typedef {import('../../../types').UnixfsV1DirectoryContent} UnixfsV1DirectoryContent
    * @typedef {import('../../../types').UnixfsV1Resolver} UnixfsV1Resolver
    */
  /**
    * @type {UnixfsV1Resolver}
    */
  @JSImport("ipfs-unixfs-exporter/dist/src/resolvers/unixfs-v1/content/directory", JSImport.Default)
  @js.native
  val default: UnixfsV1Resolver = js.native
  
  type ExporterOptions = typings.ipfsUnixfsExporter.typesMod.ExporterOptions
  
  type UnixfsV1DirectoryContent = typings.ipfsUnixfsExporter.typesMod.UnixfsV1DirectoryContent
  
  type UnixfsV1Resolver = typings.ipfsUnixfsExporter.typesMod.UnixfsV1Resolver
  
  type _To = UnixfsV1Resolver
  
  /* This means you don't have to write `default`, but can instead just say `directoryMod.foo` */
  override def _to: UnixfsV1Resolver = default
}
