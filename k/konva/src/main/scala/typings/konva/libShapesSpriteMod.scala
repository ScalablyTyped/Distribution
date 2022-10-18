package typings.konva

import typings.konva.libAnimationMod.Animation
import typings.konva.libShapeMod.Shape
import typings.konva.libShapeMod.ShapeConfig
import typings.konva.libTypesMod.GetSet
import typings.std.CanvasImageSource
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libShapesSpriteMod {
  
  @JSImport("konva/lib/shapes/Sprite", "Sprite")
  @js.native
  open class Sprite protected () extends Shape[SpriteConfig] {
    def this(config: Any) = this()
    
    def _hitFunc(context: Any): Unit = js.native
    
    def _sceneFunc(context: Any): Unit = js.native
    
    def _setInterval(): Unit = js.native
    
    def _updateIndex(): Unit = js.native
    
    var _updated: Boolean = js.native
    
    var anim: Animation = js.native
    
    def animation(): String = js.native
    def animation(v: String): this.type = js.native
    @JSName("animation")
    var animation_Original: GetSet[String, this.type] = js.native
    
    def animations(): Any = js.native
    def animations(v: Any): this.type = js.native
    @JSName("animations")
    var animations_Original: GetSet[Any, this.type] = js.native
    
    def frameIndex(): Double = js.native
    def frameIndex(v: Double): this.type = js.native
    @JSName("frameIndex")
    var frameIndex_Original: GetSet[Double, this.type] = js.native
    
    def frameOffsets(): Any = js.native
    def frameOffsets(v: Any): this.type = js.native
    @JSName("frameOffsets")
    var frameOffsets_Original: GetSet[Any, this.type] = js.native
    
    def frameRate(): Double = js.native
    def frameRate(v: Double): this.type = js.native
    @JSName("frameRate")
    var frameRate_Original: GetSet[Double, this.type] = js.native
    
    def image(): CanvasImageSource = js.native
    def image(v: CanvasImageSource): this.type = js.native
    @JSName("image")
    var image_Original: GetSet[CanvasImageSource, this.type] = js.native
    
    var interval: Any = js.native
    
    def isRunning(): Boolean = js.native
    
    def start(): Unit = js.native
    
    def stop(): Unit = js.native
  }
  
  trait SpriteConfig
    extends StObject
       with ShapeConfig {
    
    var animation: String
    
    var animations: Any
    
    var frameIndex: js.UndefOr[Double] = js.undefined
    
    var frameRate: js.UndefOr[Double] = js.undefined
    
    var image: HTMLImageElement
  }
  object SpriteConfig {
    
    inline def apply(animation: String, animations: Any, image: HTMLImageElement): SpriteConfig = {
      val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], animations = animations.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpriteConfig]
    }
    
    extension [Self <: SpriteConfig](x: Self) {
      
      inline def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimations(value: Any): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
      
      inline def setFrameIndex(value: Double): Self = StObject.set(x, "frameIndex", value.asInstanceOf[js.Any])
      
      inline def setFrameIndexUndefined: Self = StObject.set(x, "frameIndex", js.undefined)
      
      inline def setFrameRate(value: Double): Self = StObject.set(x, "frameRate", value.asInstanceOf[js.Any])
      
      inline def setFrameRateUndefined: Self = StObject.set(x, "frameRate", js.undefined)
      
      inline def setImage(value: HTMLImageElement): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    }
  }
}
