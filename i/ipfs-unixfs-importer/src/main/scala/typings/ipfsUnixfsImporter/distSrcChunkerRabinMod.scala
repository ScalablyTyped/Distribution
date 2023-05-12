package typings.ipfsUnixfsImporter

import typings.ipfsUnixfsImporter.distSrcChunkerMod.Chunker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcChunkerRabinMod {
  
  @JSImport("ipfs-unixfs-importer/dist/src/chunker/rabin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def rabin(): Chunker = ^.asInstanceOf[js.Dynamic].applyDynamic("rabin")().asInstanceOf[Chunker]
  inline def rabin(options: RabinOptions): Chunker = ^.asInstanceOf[js.Dynamic].applyDynamic("rabin")(options.asInstanceOf[js.Any]).asInstanceOf[Chunker]
  
  trait RabinOptions extends StObject {
    
    var avgChunkSize: js.UndefOr[Double] = js.undefined
    
    var maxChunkSize: js.UndefOr[Double] = js.undefined
    
    var minChunkSize: js.UndefOr[Double] = js.undefined
    
    var window: js.UndefOr[Double] = js.undefined
  }
  object RabinOptions {
    
    inline def apply(): RabinOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RabinOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RabinOptions] (val x: Self) extends AnyVal {
      
      inline def setAvgChunkSize(value: Double): Self = StObject.set(x, "avgChunkSize", value.asInstanceOf[js.Any])
      
      inline def setAvgChunkSizeUndefined: Self = StObject.set(x, "avgChunkSize", js.undefined)
      
      inline def setMaxChunkSize(value: Double): Self = StObject.set(x, "maxChunkSize", value.asInstanceOf[js.Any])
      
      inline def setMaxChunkSizeUndefined: Self = StObject.set(x, "maxChunkSize", js.undefined)
      
      inline def setMinChunkSize(value: Double): Self = StObject.set(x, "minChunkSize", value.asInstanceOf[js.Any])
      
      inline def setMinChunkSizeUndefined: Self = StObject.set(x, "minChunkSize", js.undefined)
      
      inline def setWindow(value: Double): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
      
      inline def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
    }
  }
}
