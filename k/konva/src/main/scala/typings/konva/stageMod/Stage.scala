package typings.konva.stageMod

import typings.konva.anon.Left
import typings.konva.anon.Vector2didnumberundefined
import typings.konva.canvasMod.HitCanvas
import typings.konva.canvasMod.SceneCanvas
import typings.konva.containerMod.Container
import typings.konva.layerMod.Layer
import typings.konva.nodeMod.Node
import typings.konva.nodeMod.NodeConfig
import typings.konva.shapeMod.Shape
import typings.konva.shapeMod.ShapeConfig
import typings.konva.typesMod.GetSet
import typings.konva.typesMod.Vector2d
import typings.konva.utilMod.Collection
import typings.std.HTMLDivElement
import typings.std.PointerEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("konva/types/Stage", "Stage")
@js.native
class Stage protected () extends Container[Layer] {
  def this(config: StageConfig) = this()
  
  def _bindContentEvents(): Unit = js.native
  
  def _buildDOM(): Unit = js.native
  
  var _changedPointerPositions: js.Array[Vector2didnumberundefined] = js.native
  
  def _checkVisibility(): Unit = js.native
  
  def _contextmenu(evt: js.Any): Unit = js.native
  
  def _getContentPosition(): Left = js.native
  
  def _getPointerById(): Vector2didnumberundefined = js.native
  def _getPointerById(id: Double): Vector2didnumberundefined = js.native
  
  def _lostpointercapture(evt: PointerEvent): Unit = js.native
  
  def _mousedown(evt: js.Any): Unit = js.native
  
  def _mouseenter(evt: js.Any): Unit = js.native
  
  def _mousemove(evt: js.Any): Unit = js.native
  
  def _mouseout(evt: js.Any): Unit = js.native
  
  def _mouseover(evt: js.Any): Unit = js.native
  
  def _mouseup(evt: js.Any): Unit = js.native
  
  var _pointerPositions: js.Array[Vector2didnumberundefined] = js.native
  
  def _pointercancel(evt: PointerEvent): Unit = js.native
  
  def _pointerdown(evt: PointerEvent): Unit = js.native
  
  def _pointermove(evt: PointerEvent): Unit = js.native
  
  def _pointerup(evt: PointerEvent): Unit = js.native
  
  def _resizeDOM(): Unit = js.native
  
  def _setPointerPosition(evt: js.Any): Unit = js.native
  
  def _touchend(evt: js.Any): Unit = js.native
  
  def _touchmove(evt: js.Any): Unit = js.native
  
  def _touchstart(evt: js.Any): Unit = js.native
  
  def _validateAdd(child: js.Any): Unit = js.native
  
  def _wheel(evt: js.Any): Unit = js.native
  
  def add(layer: Layer): this.type = js.native
  
  def batchDraw(): this.type = js.native
  
  var bufferCanvas: SceneCanvas = js.native
  
  var bufferHitCanvas: HitCanvas = js.native
  
  def clear(): this.type = js.native
  
  var clickEndShape: Shape[ShapeConfig] = js.native
  
  var clickStartShape: Shape[ShapeConfig] = js.native
  
  def container(): HTMLDivElement = js.native
  def container(v: HTMLDivElement): this.type = js.native
  @JSName("container")
  var container_Original: GetSet[HTMLDivElement, this.type] = js.native
  
  var content: HTMLDivElement = js.native
  
  var dblTimeout: js.Any = js.native
  
  def getContent(): HTMLDivElement = js.native
  
  def getIntersection(): Shape[ShapeConfig] | Null = js.native
  def getIntersection(pos: Null, selector: String): Shape[ShapeConfig] | Null = js.native
  def getIntersection(pos: Vector2d): Shape[ShapeConfig] | Null = js.native
  def getIntersection(pos: Vector2d, selector: String): Shape[ShapeConfig] | Null = js.native
  
  def getLayers(): Collection[Node[NodeConfig]] = js.native
  
  def getPointerPosition(): Vector2d | Null = js.native
  
  def getPointersPositions(): js.Array[Vector2didnumberundefined] = js.native
  
  def hasPointerCapture(pointerId: Double): Boolean = js.native
  
  var pointerPos: Vector2d | Null = js.native
  
  def releaseCapture(pointerId: Double): Unit = js.native
  
  def setContainer(container: js.Any): this.type = js.native
  
  def setPointerCapture(pointerId: Double): Unit = js.native
  
  def setPointersPositions(evt: js.Any): Unit = js.native
  
  var tapEndShape: Shape[ShapeConfig] = js.native
  
  var tapStartShape: Shape[ShapeConfig] = js.native
  
  var targetShape: Shape[ShapeConfig] = js.native
}
