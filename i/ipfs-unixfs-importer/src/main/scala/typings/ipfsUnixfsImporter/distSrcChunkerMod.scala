package typings.ipfsUnixfsImporter

import typings.ipfsUnixfsImporter.distSrcChunkerFixedSizeMod.FixedSizeOptions
import typings.ipfsUnixfsImporter.distSrcChunkerRabinMod.RabinOptions
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcChunkerMod {
  
  @JSImport("ipfs-unixfs-importer/dist/src/chunker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fixedSize(): Chunker = ^.asInstanceOf[js.Dynamic].applyDynamic("fixedSize")().asInstanceOf[Chunker]
  inline def fixedSize(options: FixedSizeOptions): Chunker = ^.asInstanceOf[js.Dynamic].applyDynamic("fixedSize")(options.asInstanceOf[js.Any]).asInstanceOf[Chunker]
  
  inline def rabin(): Chunker = ^.asInstanceOf[js.Dynamic].applyDynamic("rabin")().asInstanceOf[Chunker]
  inline def rabin(options: RabinOptions): Chunker = ^.asInstanceOf[js.Dynamic].applyDynamic("rabin")(options.asInstanceOf[js.Any]).asInstanceOf[Chunker]
  
  type Chunker = js.Function1[
    /* source */ AsyncIterable[js.typedarray.Uint8Array], 
    AsyncIterable[js.typedarray.Uint8Array]
  ]
}
