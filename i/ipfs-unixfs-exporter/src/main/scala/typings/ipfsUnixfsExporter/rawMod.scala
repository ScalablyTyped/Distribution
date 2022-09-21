package typings.ipfsUnixfsExporter

import org.scalablytyped.runtime.Shortcut
import typings.ipfsUnixfsExporter.typesMod.Resolver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rawMod extends Shortcut {
  
  /**
    * @type {import('../types').Resolver}
    */
  @JSImport("ipfs-unixfs-exporter/dist/src/resolvers/raw", JSImport.Default)
  @js.native
  val default: Resolver = js.native
  
  type ExporterOptions = typings.ipfsUnixfsExporter.typesMod.ExporterOptions
  
  type _To = Resolver
  
  /* This means you don't have to write `default`, but can instead just say `rawMod.foo` */
  override def _to: Resolver = default
}
