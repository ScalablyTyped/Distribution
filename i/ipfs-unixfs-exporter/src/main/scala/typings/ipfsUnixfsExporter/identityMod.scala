package typings.ipfsUnixfsExporter

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object identityMod extends Shortcut {
  
  /**
    * @type {Resolver}
    */
  @JSImport("ipfs-unixfs-exporter/dist/src/resolvers/identity", JSImport.Default)
  @js.native
  val default: Resolver = js.native
  
  type ExporterOptions = typings.ipfsUnixfsExporter.typesMod.ExporterOptions
  
  type Resolver = typings.ipfsUnixfsExporter.typesMod.Resolver
  
  type _To = Resolver
  
  /* This means you don't have to write `default`, but can instead just say `identityMod.foo` */
  override def _to: Resolver = default
}
