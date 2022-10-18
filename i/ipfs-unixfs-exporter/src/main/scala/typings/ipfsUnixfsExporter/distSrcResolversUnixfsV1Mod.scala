package typings.ipfsUnixfsExporter

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcResolversUnixfsV1Mod extends Shortcut {
  
  /**
    * @type {Resolver}
    */
  @JSImport("ipfs-unixfs-exporter/dist/src/resolvers/unixfs-v1", JSImport.Default)
  @js.native
  val default: Resolver = js.native
  
  type PBNode = typings.ipldDagPb.mod.PBNode
  
  type Resolve = typings.ipfsUnixfsExporter.distSrcTypesMod.Resolve
  
  type Resolver = typings.ipfsUnixfsExporter.distSrcTypesMod.Resolver
  
  type UnixfsV1Resolver = typings.ipfsUnixfsExporter.distSrcTypesMod.UnixfsV1Resolver
  
  type _To = Resolver
  
  /* This means you don't have to write `default`, but can instead just say `distSrcResolversUnixfsV1Mod.foo` */
  override def _to: Resolver = default
}
