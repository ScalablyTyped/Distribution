package typings.ipfsUnixfsImporter

import typings.ipfsUnixfsImporter.distSrcTypesMod.ImporterOptions
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcChunkerFixedSizeMod {
  
  @JSImport("ipfs-unixfs-importer/dist/src/chunker/fixed-size", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @type {import('../types').Chunker}
    */
  inline def default(source: AsyncIterable[js.typedarray.Uint8Array], options: ImporterOptions): AsyncIterable[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[js.typedarray.Uint8Array]]
}
