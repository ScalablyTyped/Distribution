package typings.konva

import typings.konva.libContextMod.Context
import typings.konva.libShapeMod.Shape
import typings.konva.libShapeMod.ShapeConfig
import typings.konva.libTypesMod.GetSet
import typings.konva.libTypesMod.IRect
import typings.std.CanvasImageSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libShapesImageMod {
  
  @JSImport("konva/lib/shapes/Image", "Image")
  @js.native
  open class Image protected () extends Shape[ImageConfig] {
    def this(attrs: ImageConfig) = this()
    
    def _hitFunc(context: Any): Unit = js.native
    
    def _sceneFunc(context: Context): Unit = js.native
    
    def _setImageLoad(): Unit = js.native
    
    def crop(): IRect = js.native
    def crop(v: IRect): this.type = js.native
    
    def cropHeight(): Double = js.native
    def cropHeight(v: Double): this.type = js.native
    @JSName("cropHeight")
    var cropHeight_Original: GetSet[Double, this.type] = js.native
    
    def cropWidth(): Double = js.native
    def cropWidth(v: Double): this.type = js.native
    @JSName("cropWidth")
    var cropWidth_Original: GetSet[Double, this.type] = js.native
    
    def cropX(): Double = js.native
    def cropX(v: Double): this.type = js.native
    @JSName("cropX")
    var cropX_Original: GetSet[Double, this.type] = js.native
    
    def cropY(): Double = js.native
    def cropY(v: Double): this.type = js.native
    @JSName("cropY")
    var cropY_Original: GetSet[Double, this.type] = js.native
    
    @JSName("crop")
    var crop_Original: GetSet[IRect, this.type] = js.native
    
    def getHeight(): Any = js.native
    
    def getWidth(): Any = js.native
    
    def image(): this.type = js.native
    def image(v: CanvasImageSource): this.type = js.native
    @JSName("image")
    var image_Original: GetSet[js.UndefOr[CanvasImageSource], this.type] = js.native
    @JSName("image")
    def image_Union(): js.UndefOr[CanvasImageSource] = js.native
  }
  /* static members */
  object Image {
    
    @JSImport("konva/lib/shapes/Image", "Image")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromURL(url: Any, callback: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fromURL")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def fromURL(url: Any, callback: Any, onError: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fromURL")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  trait ImageConfig
    extends StObject
       with ShapeConfig {
    
    var crop: js.UndefOr[IRect] = js.undefined
    
    var image: js.UndefOr[CanvasImageSource] = js.undefined
  }
  object ImageConfig {
    
    inline def apply(): ImageConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImageConfig] (val x: Self) extends AnyVal {
      
      inline def setCrop(value: IRect): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
      
      inline def setCropUndefined: Self = StObject.set(x, "crop", js.undefined)
      
      inline def setImage(value: CanvasImageSource): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    }
  }
}
