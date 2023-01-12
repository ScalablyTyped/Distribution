package typings.konva

import typings.konva.anon.Left
import typings.konva.anon.Vector2didnumber
import typings.konva.anon.Vector2didnumberundefined
import typings.konva.libCanvasMod.HitCanvas
import typings.konva.libCanvasMod.SceneCanvas
import typings.konva.libContainerMod.Container
import typings.konva.libContainerMod.ContainerConfig
import typings.konva.libLayerMod.Layer
import typings.konva.libShapeMod.Shape
import typings.konva.libShapeMod.ShapeConfig
import typings.konva.libTypesMod.GetSet
import typings.konva.libTypesMod.Vector2d
import typings.std.HTMLDivElement
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStageMod {
  
  @JSImport("konva/lib/Stage", "Stage")
  @js.native
  open class Stage protected () extends Container[Layer] {
    def this(config: StageConfig) = this()
    
    def _bindContentEvents(): Unit = js.native
    
    def _buildDOM(): Unit = js.native
    
    var _changedPointerPositions: js.Array[Vector2didnumber] = js.native
    
    def _checkVisibility(): Unit = js.native
    
    def _contextmenu(evt: Any): Unit = js.native
    
    def _getContentPosition(): Left = js.native
    
    def _getPointerById(): Vector2didnumberundefined = js.native
    def _getPointerById(id: Double): Vector2didnumberundefined = js.native
    
    def _getTargetShape(evenType: Any): Shape[ShapeConfig] = js.native
    
    def _lostpointercapture(evt: PointerEvent): Unit = js.native
    
    var _mouseClickEndShape: Shape[ShapeConfig] = js.native
    
    var _mouseClickStartShape: Shape[ShapeConfig] = js.native
    
    var _mouseDblTimeout: Any = js.native
    
    var _mouseTargetShape: Shape[ShapeConfig] = js.native
    
    var _pointerClickEndShape: Shape[ShapeConfig] = js.native
    
    var _pointerClickStartShape: Shape[ShapeConfig] = js.native
    
    var _pointerDblTimeout: Any = js.native
    
    var _pointerPositions: js.Array[Vector2didnumberundefined] = js.native
    
    var _pointerTargetShape: Shape[ShapeConfig] = js.native
    
    def _pointercancel(evt: PointerEvent): Unit = js.native
    
    def _pointerdown(evt: MouseEvent): Unit = js.native
    def _pointerdown(evt: PointerEvent): Unit = js.native
    def _pointerdown(evt: TouchEvent): Unit = js.native
    
    def _pointerenter(evt: Any): Unit = js.native
    
    def _pointerleave(evt: Any): Unit = js.native
    
    def _pointermove(evt: MouseEvent): Unit = js.native
    def _pointermove(evt: PointerEvent): Unit = js.native
    def _pointermove(evt: TouchEvent): Unit = js.native
    
    def _pointerover(evt: Any): Unit = js.native
    
    def _pointerup(evt: Any): Unit = js.native
    
    def _resizeDOM(): Unit = js.native
    
    def _setPointerPosition(evt: Any): Unit = js.native
    
    var _touchClickEndShape: Shape[ShapeConfig] = js.native
    
    var _touchClickStartShape: Shape[ShapeConfig] = js.native
    
    var _touchDblTimeout: Any = js.native
    
    var _touchTargetShape: Shape[ShapeConfig] = js.native
    
    def _validateAdd(child: Any): Unit = js.native
    
    def _wheel(evt: Any): Unit = js.native
    
    def add(layer: Layer, rest: Any*): this.type = js.native
    
    def batchDraw(): this.type = js.native
    
    var bufferCanvas: SceneCanvas = js.native
    
    var bufferHitCanvas: HitCanvas = js.native
    
    def clear(): this.type = js.native
    
    def container(): HTMLDivElement = js.native
    def container(v: HTMLDivElement): this.type = js.native
    @JSName("container")
    var container_Original: GetSet[HTMLDivElement, this.type] = js.native
    
    var content: HTMLDivElement = js.native
    
    def getContent(): HTMLDivElement = js.native
    
    def getIntersection(pos: Vector2d): Shape[ShapeConfig] = js.native
    
    def getLayers(): js.Array[Layer] = js.native
    
    def getPointerPosition(): Vector2d | Null = js.native
    
    def getPointersPositions(): js.Array[Vector2didnumberundefined] = js.native
    
    def hasPointerCapture(pointerId: Double): Boolean = js.native
    
    var pointerPos: Vector2d | Null = js.native
    
    def releaseCapture(pointerId: Double): Unit = js.native
    
    def setContainer(container: Any): this.type = js.native
    
    def setPointerCapture(pointerId: Double): Unit = js.native
    
    def setPointersPositions(evt: Any): Unit = js.native
  }
  
  @JSImport("konva/lib/Stage", "stages")
  @js.native
  val stages: js.Array[Stage] = js.native
  
  trait StageConfig
    extends StObject
       with ContainerConfig {
    
    var container: HTMLDivElement | String
  }
  object StageConfig {
    
    inline def apply(container: HTMLDivElement | String): StageConfig = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
      __obj.asInstanceOf[StageConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StageConfig] (val x: Self) extends AnyVal {
      
      inline def setContainer(value: HTMLDivElement | String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    }
  }
}
