package typings.imageSize

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfaceMod {
  
  @js.native
  trait IImage extends StObject {
    
    def calculate(buffer: Buffer): ISizeCalculationResult = js.native
    def calculate(buffer: Buffer, filepath: String): ISizeCalculationResult = js.native
    
    def validate(buffer: Buffer): Boolean = js.native
  }
  
  trait ISize extends StObject {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var orientation: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object ISize {
    
    inline def apply(): ISize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISize]
    }
    
    extension [Self <: ISize](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setOrientation(value: Double): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait ISizeCalculationResult
    extends StObject
       with ISize {
    
    var images: js.UndefOr[js.Array[ISize]] = js.undefined
  }
  object ISizeCalculationResult {
    
    inline def apply(): ISizeCalculationResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISizeCalculationResult]
    }
    
    extension [Self <: ISizeCalculationResult](x: Self) {
      
      inline def setImages(value: js.Array[ISize]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
      
      inline def setImagesVarargs(value: ISize*): Self = StObject.set(x, "images", js.Array(value*))
    }
  }
}
