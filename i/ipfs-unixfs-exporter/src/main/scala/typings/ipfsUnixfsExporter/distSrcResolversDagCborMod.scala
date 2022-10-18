package typings.ipfsUnixfsExporter

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcResolversDagCborMod extends Shortcut {
  
  /**
    * @typedef {import('../types').Resolver} Resolver
    */
  /**
    * @type {Resolver}
    */
  @JSImport("ipfs-unixfs-exporter/dist/src/resolvers/dag-cbor", JSImport.Default)
  @js.native
  val default: Resolver = js.native
  
  type Resolver = typings.ipfsUnixfsExporter.distSrcTypesMod.Resolver
  
  type _To = Resolver
  
  /* This means you don't have to write `default`, but can instead just say `distSrcResolversDagCborMod.foo` */
  override def _to: Resolver = default
}
