package typings.ipfsUnixfsImporter

import typings.ipfsUnixfsImporter.distSrcChunkerMod.Chunker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcChunkerFixedSizeMod {
  
  @JSImport("ipfs-unixfs-importer/dist/src/chunker/fixed-size", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fixedSize(): Chunker = ^.asInstanceOf[js.Dynamic].applyDynamic("fixedSize")().asInstanceOf[Chunker]
  inline def fixedSize(options: FixedSizeOptions): Chunker = ^.asInstanceOf[js.Dynamic].applyDynamic("fixedSize")(options.asInstanceOf[js.Any]).asInstanceOf[Chunker]
  
  trait FixedSizeOptions extends StObject {
    
    var chunkSize: js.UndefOr[Double] = js.undefined
  }
  object FixedSizeOptions {
    
    inline def apply(): FixedSizeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FixedSizeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FixedSizeOptions] (val x: Self) extends AnyVal {
      
      inline def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
      
      inline def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
    }
  }
}
