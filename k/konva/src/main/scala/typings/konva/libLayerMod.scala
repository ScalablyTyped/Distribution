package typings.konva

import typings.konva.anon.Antialiased
import typings.konva.anon.Height
import typings.konva.libCanvasMod.HitCanvas
import typings.konva.libCanvasMod.SceneCanvas
import typings.konva.libContainerMod.Container
import typings.konva.libContainerMod.ContainerConfig
import typings.konva.libContextMod.Context
import typings.konva.libGroupMod.Group
import typings.konva.libShapeMod.Shape
import typings.konva.libShapeMod.ShapeConfig
import typings.konva.libTypesMod.GetSet
import typings.konva.libTypesMod.Vector2d
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLayerMod {
  
  @JSImport("konva/lib/Layer", "Layer")
  @js.native
  open class Layer () extends Container[Group | Shape[ShapeConfig]] {
    def this(config: LayerConfig) = this()
    
    def _checkVisibility(): Unit = js.native
    
    def _getIntersection(pos: Vector2d): Antialiased = js.native
    
    def _setSmoothEnabled(): Unit = js.native
    
    def _validateAdd(child: Any): Unit = js.native
    
    var _waitingForDraw: Boolean = js.native
    
    def batchDraw(): this.type = js.native
    
    var canvas: SceneCanvas = js.native
    
    def clear(): this.type = js.native
    def clear(bounds: Any): this.type = js.native
    
    def clearBeforeDraw(): Boolean = js.native
    def clearBeforeDraw(v: Boolean): this.type = js.native
    @JSName("clearBeforeDraw")
    var clearBeforeDraw_Original: GetSet[Boolean, this.type] = js.native
    
    def createPNGStream(): Any = js.native
    
    def disableHitGraph(): this.type = js.native
    
    def enableHitGraph(): this.type = js.native
    
    def getCanvas(): SceneCanvas = js.native
    
    def getContext(): Context = js.native
    
    def getHeight(): Double = js.native
    
    def getHitCanvas(): HitCanvas = js.native
    
    def getHitGraphEnabled(`val`: Any): Boolean = js.native
    
    def getIntersection(pos: Vector2d): Shape[ShapeConfig] = js.native
    
    def getNativeCanvasElement(): HTMLCanvasElement = js.native
    
    def getWidth(): Double = js.native
    
    var hitCanvas: HitCanvas = js.native
    
    def hitGraphEnabled(): Boolean = js.native
    def hitGraphEnabled(v: Boolean): this.type = js.native
    @JSName("hitGraphEnabled")
    var hitGraphEnabled_Original: GetSet[Boolean, this.type] = js.native
    
    def imageSmoothingEnabled(): Boolean = js.native
    def imageSmoothingEnabled(v: Boolean): this.type = js.native
    @JSName("imageSmoothingEnabled")
    var imageSmoothingEnabled_Original: GetSet[Boolean, this.type] = js.native
    
    def setHeight(): Unit = js.native
    
    def setHitGraphEnabled(`val`: Any): Unit = js.native
    
    def setSize(param0: Height): this.type = js.native
    
    def setWidth(): Unit = js.native
    
    def toggleHitCanvas(): Unit = js.native
  }
  
  trait LayerConfig
    extends StObject
       with ContainerConfig {
    
    var hitGraphEnabled: js.UndefOr[Boolean] = js.undefined
    
    var imageSmoothingEnabled: js.UndefOr[Boolean] = js.undefined
  }
  object LayerConfig {
    
    inline def apply(): LayerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayerConfig]
    }
    
    extension [Self <: LayerConfig](x: Self) {
      
      inline def setHitGraphEnabled(value: Boolean): Self = StObject.set(x, "hitGraphEnabled", value.asInstanceOf[js.Any])
      
      inline def setHitGraphEnabledUndefined: Self = StObject.set(x, "hitGraphEnabled", js.undefined)
      
      inline def setImageSmoothingEnabled(value: Boolean): Self = StObject.set(x, "imageSmoothingEnabled", value.asInstanceOf[js.Any])
      
      inline def setImageSmoothingEnabledUndefined: Self = StObject.set(x, "imageSmoothingEnabled", js.undefined)
    }
  }
}
