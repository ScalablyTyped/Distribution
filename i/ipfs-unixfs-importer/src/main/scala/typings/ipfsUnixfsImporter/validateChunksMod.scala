package typings.ipfsUnixfsImporter

import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validateChunksMod {
  
  @JSImport("ipfs-unixfs-importer/dist/src/dag-builder/validate-chunks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @typedef {import('../types').ChunkValidator} ChunkValidator
    */
  /**
    * @type {ChunkValidator}
    */
  inline def default(source: AsyncIterable[js.typedarray.Uint8Array]): AsyncIterable[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any]).asInstanceOf[AsyncIterable[js.typedarray.Uint8Array]]
  
  type ChunkValidator = typings.ipfsUnixfsImporter.typesMod.ChunkValidator
}
