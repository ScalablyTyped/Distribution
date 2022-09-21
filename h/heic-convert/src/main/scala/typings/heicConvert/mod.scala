package typings.heicConvert

import typings.heicConvert.heicConvertStrings.JPEG
import typings.heicConvert.heicConvertStrings.PNG
import typings.std.ArrayBufferLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /** @async */
  inline def apply(image: ConversionOptions): js.Promise[js.typedarray.ArrayBuffer] = ^.asInstanceOf[js.Dynamic].apply(image.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
  
  @JSImport("heic-convert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** @async */
  inline def all(image: ConversionOptions): js.Promise[js.Array[Convertible]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(image.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Convertible]]]
  
  trait ConversionOptions extends StObject {
    
    /**
      * the HEIC file buffer
      */
    var buffer: ArrayBufferLike
    
    /**
      * output format
      */
    var format: JPEG | PNG
    
    /**
      * the JPEG compression quality, between 0 and 1
      * @default 0.92
      */
    var quality: js.UndefOr[Double] = js.undefined
  }
  object ConversionOptions {
    
    inline def apply(buffer: ArrayBufferLike, format: JPEG | PNG): ConversionOptions = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConversionOptions]
    }
    
    extension [Self <: ConversionOptions](x: Self) {
      
      inline def setBuffer(value: ArrayBufferLike): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: JPEG | PNG): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    }
  }
  
  trait Convertible extends StObject {
    
    def convert(): js.Promise[js.typedarray.ArrayBuffer]
  }
  object Convertible {
    
    inline def apply(convert: () => js.Promise[js.typedarray.ArrayBuffer]): Convertible = {
      val __obj = js.Dynamic.literal(convert = js.Any.fromFunction0(convert))
      __obj.asInstanceOf[Convertible]
    }
    
    extension [Self <: Convertible](x: Self) {
      
      inline def setConvert(value: () => js.Promise[js.typedarray.ArrayBuffer]): Self = StObject.set(x, "convert", js.Any.fromFunction0(value))
    }
  }
}
