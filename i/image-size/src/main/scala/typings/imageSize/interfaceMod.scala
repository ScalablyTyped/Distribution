package typings.imageSize

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfaceMod {
  
  @js.native
  trait IImage extends StObject {
    
    def calculate(buffer: Buffer): ISizeCalculationResult = js.native
    def calculate(buffer: Buffer, filepath: String): ISizeCalculationResult = js.native
    
    def validate(buffer: Buffer): Boolean = js.native
  }
  
  @js.native
  trait ISize extends StObject {
    
    var height: js.UndefOr[Double] = js.native
    
    var orientation: js.UndefOr[Double] = js.native
    
    var `type`: js.UndefOr[String] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object ISize {
    
    @scala.inline
    def apply(): ISize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISize]
    }
    
    @scala.inline
    implicit class ISizeMutableBuilder[Self <: ISize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setOrientation(value: Double): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait ISizeCalculationResult extends ISize {
    
    var images: js.UndefOr[js.Array[ISize]] = js.native
  }
  object ISizeCalculationResult {
    
    @scala.inline
    def apply(): ISizeCalculationResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISizeCalculationResult]
    }
    
    @scala.inline
    implicit class ISizeCalculationResultMutableBuilder[Self <: ISizeCalculationResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImages(value: js.Array[ISize]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
      
      @scala.inline
      def setImagesVarargs(value: ISize*): Self = StObject.set(x, "images", js.Array(value :_*))
    }
  }
}
