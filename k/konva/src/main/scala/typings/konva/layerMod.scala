package typings.konva

import typings.konva.anon.Antialiased
import typings.konva.anon.Height
import typings.konva.canvasMod.HitCanvas
import typings.konva.canvasMod.SceneCanvas
import typings.konva.containerMod.Container
import typings.konva.containerMod.ContainerConfig
import typings.konva.contextMod.Context
import typings.konva.groupMod.Group
import typings.konva.nodeMod.Node
import typings.konva.nodeMod.NodeConfig
import typings.konva.shapeMod.Shape
import typings.konva.shapeMod.ShapeConfig
import typings.konva.typesMod.GetSet
import typings.konva.typesMod.Vector2d
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerMod {
  
  @JSImport("konva/types/Layer", "Layer")
  @js.native
  class Layer () extends Container[Group | Shape[ShapeConfig]] {
    def this(config: LayerConfig) = this()
    
    def _checkVisibility(): Unit = js.native
    
    def _getIntersection(pos: Vector2d): Antialiased = js.native
    
    def _setSmoothEnabled(): Unit = js.native
    
    def _validateAdd(child: js.Any): Unit = js.native
    
    var _waitingForDraw: Boolean = js.native
    
    def batchDraw(): this.type = js.native
    
    var canvas: SceneCanvas = js.native
    
    def clear(): this.type = js.native
    def clear(bounds: js.Any): this.type = js.native
    
    def clearBeforeDraw(): Boolean = js.native
    def clearBeforeDraw(v: Boolean): this.type = js.native
    @JSName("clearBeforeDraw")
    var clearBeforeDraw_Original: GetSet[Boolean, this.type] = js.native
    
    def createPNGStream(): js.Any = js.native
    
    def disableHitGraph(): this.type = js.native
    
    def drawHit(can: js.Any, top: js.Any): this.type = js.native
    
    def drawScene(can: js.Any, top: js.Any): this.type = js.native
    
    def enableHitGraph(): this.type = js.native
    
    def getCanvas(): SceneCanvas = js.native
    
    def getContext(): Context = js.native
    
    def getHeight(): Double = js.native
    
    def getHitCanvas(): HitCanvas = js.native
    
    def getHitGraphEnabled(`val`: js.Any): Boolean = js.native
    
    def getIntersection(pos: Vector2d): Node[NodeConfig] | Null = js.native
    def getIntersection(pos: Vector2d, selector: String): Node[NodeConfig] | Null = js.native
    
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
    
    def setHitGraphEnabled(`val`: js.Any): Unit = js.native
    
    def setSize(hasWidthHeight: Height): this.type = js.native
    
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
