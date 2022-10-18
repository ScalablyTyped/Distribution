package typings.ipfsUnixfsExporter

import org.scalablytyped.runtime.Shortcut
import typings.ipfsUnixfsExporter.distSrcTypesMod.Resolver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcResolversRawMod extends Shortcut {
  
  /**
    * @type {import('../types').Resolver}
    */
  @JSImport("ipfs-unixfs-exporter/dist/src/resolvers/raw", JSImport.Default)
  @js.native
  val default: Resolver = js.native
  
  type ExporterOptions = typings.ipfsUnixfsExporter.distSrcTypesMod.ExporterOptions
  
  type _To = Resolver
  
  /* This means you don't have to write `default`, but can instead just say `distSrcResolversRawMod.foo` */
  override def _to: Resolver = default
}
