package typings.ipfsUnixfsExporter

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcResolversIdentityMod extends Shortcut {
  
  /**
    * @type {Resolver}
    */
  @JSImport("ipfs-unixfs-exporter/dist/src/resolvers/identity", JSImport.Default)
  @js.native
  val default: Resolver = js.native
  
  type ExporterOptions = typings.ipfsUnixfsExporter.distSrcTypesMod.ExporterOptions
  
  type Resolver = typings.ipfsUnixfsExporter.distSrcTypesMod.Resolver
  
  type _To = Resolver
  
  /* This means you don't have to write `default`, but can instead just say `distSrcResolversIdentityMod.foo` */
  override def _to: Resolver = default
}
