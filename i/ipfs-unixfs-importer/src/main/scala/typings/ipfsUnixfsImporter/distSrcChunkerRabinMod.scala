package typings.ipfsUnixfsImporter

import typings.ipfsUnixfsImporter.distSrcTypesMod.ImporterOptions
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcChunkerRabinMod {
  
  @JSImport("ipfs-unixfs-importer/dist/src/chunker/rabin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @typedef {object} RabinOptions
    * @property {number} min
    * @property {number} max
    * @property {number} bits
    * @property {number} window
    * @property {number} polynomial
    */
  /**
    * @type {import('../types').Chunker}
    */
  inline def default(source: AsyncIterable[js.typedarray.Uint8Array], options: ImporterOptions): AsyncIterable[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[js.typedarray.Uint8Array]]
  
  trait RabinOptions extends StObject {
    
    var bits: Double
    
    var max: Double
    
    var min: Double
    
    var polynomial: Double
    
    var window: Double
  }
  object RabinOptions {
    
    inline def apply(bits: Double, max: Double, min: Double, polynomial: Double, window: Double): RabinOptions = {
      val __obj = js.Dynamic.literal(bits = bits.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], polynomial = polynomial.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
      __obj.asInstanceOf[RabinOptions]
    }
    
    extension [Self <: RabinOptions](x: Self) {
      
      inline def setBits(value: Double): Self = StObject.set(x, "bits", value.asInstanceOf[js.Any])
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setPolynomial(value: Double): Self = StObject.set(x, "polynomial", value.asInstanceOf[js.Any])
      
      inline def setWindow(value: Double): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    }
  }
}
