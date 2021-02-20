package typings.konva

import org.scalablytyped.runtime.StringDictionary
import typings.konva.anon.Callback
import typings.konva.anon.DrawBorder
import typings.konva.anon.Handler
import typings.konva.anon.HeightWidth
import typings.konva.anon.MimeType
import typings.konva.anon.OffsetX
import typings.konva.anon.RelativeTo
import typings.konva.anon.Width
import typings.konva.anon.X
import typings.konva.canvasMod.Canvas
import typings.konva.canvasMod.SceneCanvas
import typings.konva.containerMod.Container
import typings.konva.contextMod.Context
import typings.konva.konvaStrings.abort
import typings.konva.konvaStrings.animationcancel
import typings.konva.konvaStrings.animationend
import typings.konva.konvaStrings.animationiteration
import typings.konva.konvaStrings.animationstart
import typings.konva.konvaStrings.auxclick
import typings.konva.konvaStrings.blur
import typings.konva.konvaStrings.cancel
import typings.konva.konvaStrings.canplay
import typings.konva.konvaStrings.canplaythrough
import typings.konva.konvaStrings.change
import typings.konva.konvaStrings.click
import typings.konva.konvaStrings.close
import typings.konva.konvaStrings.contextmenu
import typings.konva.konvaStrings.cuechange
import typings.konva.konvaStrings.dblclick
import typings.konva.konvaStrings.drag
import typings.konva.konvaStrings.dragend
import typings.konva.konvaStrings.dragenter
import typings.konva.konvaStrings.dragexit
import typings.konva.konvaStrings.dragleave
import typings.konva.konvaStrings.dragover
import typings.konva.konvaStrings.dragstart
import typings.konva.konvaStrings.drop
import typings.konva.konvaStrings.durationchange
import typings.konva.konvaStrings.emptied
import typings.konva.konvaStrings.ended
import typings.konva.konvaStrings.error
import typings.konva.konvaStrings.focus
import typings.konva.konvaStrings.focusin
import typings.konva.konvaStrings.focusout
import typings.konva.konvaStrings.gotpointercapture
import typings.konva.konvaStrings.input
import typings.konva.konvaStrings.invalid
import typings.konva.konvaStrings.keydown
import typings.konva.konvaStrings.keypress
import typings.konva.konvaStrings.keyup
import typings.konva.konvaStrings.load
import typings.konva.konvaStrings.loadeddata
import typings.konva.konvaStrings.loadedmetadata
import typings.konva.konvaStrings.loadstart
import typings.konva.konvaStrings.lostpointercapture
import typings.konva.konvaStrings.mousedown
import typings.konva.konvaStrings.mouseenter
import typings.konva.konvaStrings.mouseleave
import typings.konva.konvaStrings.mousemove
import typings.konva.konvaStrings.mouseout
import typings.konva.konvaStrings.mouseover
import typings.konva.konvaStrings.mouseup
import typings.konva.konvaStrings.pause
import typings.konva.konvaStrings.play
import typings.konva.konvaStrings.playing
import typings.konva.konvaStrings.pointercancel
import typings.konva.konvaStrings.pointerdown
import typings.konva.konvaStrings.pointerenter
import typings.konva.konvaStrings.pointerleave
import typings.konva.konvaStrings.pointermove
import typings.konva.konvaStrings.pointerout
import typings.konva.konvaStrings.pointerover
import typings.konva.konvaStrings.pointerup
import typings.konva.konvaStrings.progress
import typings.konva.konvaStrings.ratechange
import typings.konva.konvaStrings.reset
import typings.konva.konvaStrings.resize
import typings.konva.konvaStrings.scroll
import typings.konva.konvaStrings.securitypolicyviolation
import typings.konva.konvaStrings.seeked
import typings.konva.konvaStrings.seeking
import typings.konva.konvaStrings.select
import typings.konva.konvaStrings.selectionchange
import typings.konva.konvaStrings.selectstart
import typings.konva.konvaStrings.stalled
import typings.konva.konvaStrings.submit
import typings.konva.konvaStrings.suspend
import typings.konva.konvaStrings.timeupdate
import typings.konva.konvaStrings.toggle
import typings.konva.konvaStrings.touchcancel
import typings.konva.konvaStrings.touchend
import typings.konva.konvaStrings.touchmove
import typings.konva.konvaStrings.touchstart
import typings.konva.konvaStrings.transitioncancel
import typings.konva.konvaStrings.transitionend
import typings.konva.konvaStrings.transitionrun
import typings.konva.konvaStrings.transitionstart
import typings.konva.konvaStrings.volumechange
import typings.konva.konvaStrings.waiting
import typings.konva.konvaStrings.wheel
import typings.konva.layerMod.Layer
import typings.konva.shapeMod.Shape
import typings.konva.shapeMod.ShapeConfig
import typings.konva.stageMod.Stage
import typings.konva.typesMod.GetSet
import typings.konva.typesMod.IRect
import typings.konva.typesMod.Vector2d
import typings.konva.utilMod.Collection
import typings.konva.utilMod.Transform
import typings.std.AnimationEvent
import typings.std.DragEvent
import typings.std.ErrorEvent
import typings.std.Event
import typings.std.EventTarget
import typings.std.FocusEvent
import typings.std.HTMLCanvasElement
import typings.std.ImageData
import typings.std.KeyboardEvent
import typings.std.Map
import typings.std.MouseEvent
import typings.std.Number
import typings.std.PointerEvent
import typings.std.ProgressEvent
import typings.std.SecurityPolicyViolationEvent
import typings.std.TouchEvent
import typings.std.TransitionEvent
import typings.std.UIEvent
import typings.std.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeMod {
  
  @JSImport("konva/types/Node", "Node")
  @js.native
  abstract class Node[Config /* <: NodeConfig */] () extends StObject {
    def this(config: Config) = this()
    
    var _allEventListeners: Null | js.Array[js.Function] = js.native
    
    var _attachedDepsListeners: Map[String, Boolean] = js.native
    
    var _attrsAffectingSize: js.Array[String] = js.native
    
    def _batchTransformChanges(func: js.Any): Unit = js.native
    
    var _batchingTransformChange: Boolean = js.native
    
    var _cache: Map[String, _] = js.native
    
    def _calculate(name: js.Any, deps: js.Any, getter: js.Any): js.Any = js.native
    
    def _clearCache(): Unit = js.native
    def _clearCache(attr: String): Unit = js.native
    
    def _clearCaches(): Unit = js.native
    
    def _clearSelfAndDescendantCache(): Unit = js.native
    def _clearSelfAndDescendantCache(attr: js.UndefOr[scala.Nothing], forceEvent: Boolean): Unit = js.native
    def _clearSelfAndDescendantCache(attr: String): Unit = js.native
    def _clearSelfAndDescendantCache(attr: String, forceEvent: Boolean): Unit = js.native
    
    def _clearTransform(): OffsetX = js.native
    
    def _createDragElement(evt: js.Any): Unit = js.native
    
    def _delegate(event: String, selector: String, handler: js.Function1[/* e */ Event, Unit]): Unit = js.native
    
    def _dragChange(): Unit = js.native
    
    def _dragCleanup(): Unit = js.native
    
    var _dragEventId: Double | Null = js.native
    
    def _drawCachedHitCanvas(context: Context): Unit = js.native
    
    def _drawCachedSceneCanvas(context: Context): Unit = js.native
    
    def _eachAncestorReverse(func: js.Any, top: js.Any): Unit = js.native
    
    var _filterUpToDate: Boolean = js.native
    
    def _fire(eventType: js.Any, evt: js.Any): Unit = js.native
    
    def _fireAndBubble(eventType: js.Any, evt: js.Any): Unit = js.native
    def _fireAndBubble(eventType: js.Any, evt: js.Any, compareShape: js.Any): Unit = js.native
    
    def _fireChangeEvent(attr: js.Any, oldVal: js.Any, newVal: js.Any): Unit = js.native
    
    def _getAbsoluteOpacity(): Double = js.native
    
    def _getAbsoluteTransform(): Transform = js.native
    def _getAbsoluteTransform(top: Node[NodeConfig]): Transform = js.native
    
    def _getCache(attr: String, privateGetter: js.Function): js.Any = js.native
    
    def _getCachedSceneCanvas(): js.Any = js.native
    
    def _getCanvasCache(): js.Any = js.native
    
    def _getProtoListeners(eventType: js.Any): js.Any = js.native
    
    def _getStage(): js.UndefOr[Stage] = js.native
    
    def _getTransform(): Transform = js.native
    
    var _id: Double = js.native
    
    def _isListening(): js.Any = js.native
    def _isListening(relativeTo: Node[NodeConfig]): js.Any = js.native
    
    def _isMatch(selector: js.Any): js.Any = js.native
    
    var _isUnderCache: Boolean = js.native
    
    def _isVisible(relativeTo: js.Any): js.Any = js.native
    
    var _lastPos: Vector2d = js.native
    
    def _listenDrag(): Unit = js.native
    
    var _needClearTransformCache: Boolean = js.native
    
    def _off(`type`: js.Any): Unit = js.native
    def _off(`type`: js.Any, name: js.UndefOr[scala.Nothing], callback: js.Any): Unit = js.native
    def _off(`type`: js.Any, name: js.Any): Unit = js.native
    def _off(`type`: js.Any, name: js.Any, callback: js.Any): Unit = js.native
    
    def _remove(): Unit = js.native
    
    def _setAttr(key: js.Any, `val`: js.Any): Unit = js.native
    def _setAttr(key: js.Any, `val`: js.Any, skipFire: Boolean): Unit = js.native
    
    def _setComponentAttr(key: js.Any, component: js.Any, `val`: js.Any): Unit = js.native
    
    def _setDragPosition(evt: js.Any, elem: js.Any): Unit = js.native
    
    def _setTransform(trans: js.Any): Unit = js.native
    
    var _shouldFireChangeEvents: Boolean = js.native
    
    def _toKonvaCanvas(config: js.Any): SceneCanvas = js.native
    
    def _transformedRect(rect: IRect, top: Node[NodeConfig]): Width = js.native
    
    def absolutePosition(): Vector2d = js.native
    def absolutePosition(v: Vector2d): this.type = js.native
    @JSName("absolutePosition")
    var absolutePosition_Original: GetSet[Vector2d, this.type] = js.native
    
    def addEventListener(`type`: String, handler: js.Function1[/* e */ Event, Unit]): this.type = js.native
    
    def addName(name: js.Any): this.type = js.native
    
    def alpha(): Double = js.native
    def alpha(v: Double): this.type = js.native
    @JSName("alpha")
    var alpha_Original: GetSet[Double, this.type] = js.native
    
    var attrs: js.Any = js.native
    
    def blue(): Double = js.native
    def blue(v: Double): this.type = js.native
    @JSName("blue")
    var blue_Original: GetSet[Double, this.type] = js.native
    
    def blurRadius(): Double = js.native
    def blurRadius(v: Double): this.type = js.native
    @JSName("blurRadius")
    var blurRadius_Original: GetSet[Double, this.type] = js.native
    
    def brightness(): Double = js.native
    def brightness(v: Double): this.type = js.native
    @JSName("brightness")
    var brightness_Original: GetSet[Double, this.type] = js.native
    
    def cache(): this.type = js.native
    def cache(config: DrawBorder): this.type = js.native
    
    var children: Collection[_] = js.native
    
    var className: String = js.native
    
    def clearCache(): this.type = js.native
    
    def clone(obj: js.Any): js.Any = js.native
    
    def contrast(): Double = js.native
    def contrast(v: Double): this.type = js.native
    @JSName("contrast")
    var contrast_Original: GetSet[Double, this.type] = js.native
    
    def destroy(): this.type = js.native
    
    def dispatchEvent(evt: js.Any): this.type = js.native
    
    def dragBoundFunc(): js.ThisFunction1[/* this */ Node[NodeConfig], /* pos */ Vector2d, Vector2d] = js.native
    def dragBoundFunc(v: js.ThisFunction1[/* this */ Node[NodeConfig], /* pos */ Vector2d, Vector2d]): this.type = js.native
    @JSName("dragBoundFunc")
    var dragBoundFunc_Original: GetSet[
        js.ThisFunction1[/* this */ Node[NodeConfig], /* pos */ Vector2d, Vector2d], 
        this.type
      ] = js.native
    
    def dragDistance(): Double = js.native
    def dragDistance(v: Double): this.type = js.native
    @JSName("dragDistance")
    var dragDistance_Original: GetSet[Double, this.type] = js.native
    
    def draggable(): Boolean = js.native
    def draggable(v: Boolean): this.type = js.native
    @JSName("draggable")
    var draggable_Original: GetSet[Boolean, this.type] = js.native
    
    def draw(): this.type = js.native
    
    def drawHit(): Unit = js.native
    def drawHit(canvas: js.UndefOr[scala.Nothing], top: Node[NodeConfig]): Unit = js.native
    def drawHit(canvas: Canvas): Unit = js.native
    def drawHit(canvas: Canvas, top: Node[NodeConfig]): Unit = js.native
    
    def drawScene(): Unit = js.native
    def drawScene(canvas: js.UndefOr[scala.Nothing], top: Node[NodeConfig]): Unit = js.native
    def drawScene(canvas: Canvas): Unit = js.native
    def drawScene(canvas: Canvas, top: Node[NodeConfig]): Unit = js.native
    
    def embossBlend(): Boolean = js.native
    def embossBlend(v: Boolean): this.type = js.native
    @JSName("embossBlend")
    var embossBlend_Original: GetSet[Boolean, this.type] = js.native
    
    def embossDirection(): String = js.native
    def embossDirection(v: String): this.type = js.native
    @JSName("embossDirection")
    var embossDirection_Original: GetSet[String, this.type] = js.native
    
    def embossStrength(): Double = js.native
    def embossStrength(v: Double): this.type = js.native
    @JSName("embossStrength")
    var embossStrength_Original: GetSet[Double, this.type] = js.native
    
    def embossWhiteLevel(): Double = js.native
    def embossWhiteLevel(v: Double): this.type = js.native
    @JSName("embossWhiteLevel")
    var embossWhiteLevel_Original: GetSet[Double, this.type] = js.native
    
    def enhance(): Double = js.native
    def enhance(v: Double): this.type = js.native
    @JSName("enhance")
    var enhance_Original: GetSet[Double, this.type] = js.native
    
    var eventListeners: StringDictionary[js.Array[Handler]] = js.native
    
    def filters(): js.Array[Filter] = js.native
    def filters(v: js.Array[Filter]): this.type = js.native
    @JSName("filters")
    var filters_Original: GetSet[js.Array[Filter], this.type] = js.native
    
    def findAncestor(selector: js.Any): Node[NodeConfig] = js.native
    def findAncestor(selector: js.Any, includeSelf: js.UndefOr[scala.Nothing], stopNode: js.Any): Node[NodeConfig] = js.native
    def findAncestor(selector: js.Any, includeSelf: js.Any): Node[NodeConfig] = js.native
    def findAncestor(selector: js.Any, includeSelf: js.Any, stopNode: js.Any): Node[NodeConfig] = js.native
    
    def findAncestors(selector: js.Any): js.Array[Node[NodeConfig]] = js.native
    def findAncestors(selector: js.Any, includeSelf: js.UndefOr[scala.Nothing], stopNode: js.Any): js.Array[Node[NodeConfig]] = js.native
    def findAncestors(selector: js.Any, includeSelf: js.Any): js.Array[Node[NodeConfig]] = js.native
    def findAncestors(selector: js.Any, includeSelf: js.Any, stopNode: js.Any): js.Array[Node[NodeConfig]] = js.native
    
    def fire(eventType: js.Any): this.type = js.native
    def fire(eventType: js.Any, evt: js.UndefOr[scala.Nothing], bubble: js.Any): this.type = js.native
    def fire(eventType: js.Any, evt: js.Any): this.type = js.native
    def fire(eventType: js.Any, evt: js.Any, bubble: js.Any): this.type = js.native
    
    def getAbsoluteOpacity(): js.Any = js.native
    
    def getAbsolutePosition(): X = js.native
    def getAbsolutePosition(top: js.Any): X = js.native
    
    def getAbsoluteRotation(): Double = js.native
    
    def getAbsoluteScale(): X = js.native
    def getAbsoluteScale(top: js.Any): X = js.native
    
    def getAbsoluteTransform(): Transform = js.native
    def getAbsoluteTransform(top: Node[NodeConfig]): Transform = js.native
    
    def getAbsoluteZIndex(): Double = js.native
    
    def getAncestors(): Collection[Node[NodeConfig]] = js.native
    
    def getAttr(attr: String): js.Any = js.native
    
    def getAttrs(): js.Any = js.native
    
    def getChildren(): Collection[_] = js.native
    
    def getClassName(): String = js.native
    
    def getClientRect(): Width = js.native
    def getClientRect(config: RelativeTo): Width = js.native
    
    def getDepth(): Double = js.native
    
    def getDragDistance(): js.Any = js.native
    
    def getLayer(): Layer | Null = js.native
    
    def getParent(): Container[Node[NodeConfig]] = js.native
    
    def getPosition(): X = js.native
    
    def getSize(): HeightWidth = js.native
    
    def getStage(): Stage | Null = js.native
    
    def getTransform(): Transform = js.native
    
    def getType(): String = js.native
    
    def getZIndex(): Double = js.native
    
    def globalCompositeOperation(): globalCompositeOperationType = js.native
    def globalCompositeOperation(v: globalCompositeOperationType): this.type = js.native
    @JSName("globalCompositeOperation")
    var globalCompositeOperation_Original: GetSet[globalCompositeOperationType, this.type] = js.native
    
    def green(): Double = js.native
    def green(v: Double): this.type = js.native
    @JSName("green")
    var green_Original: GetSet[Double, this.type] = js.native
    
    def hasChildren(): Boolean = js.native
    
    def hasName(name: js.Any): Boolean = js.native
    
    def height(): Double = js.native
    def height(v: Double): this.type = js.native
    @JSName("height")
    var height_Original: GetSet[Double, this.type] = js.native
    
    def hide(): this.type = js.native
    
    def hue(): Double = js.native
    def hue(v: Double): this.type = js.native
    @JSName("hue")
    var hue_Original: GetSet[Double, this.type] = js.native
    
    def id(): String = js.native
    def id(v: String): this.type = js.native
    @JSName("id")
    var id_Original: GetSet[String, this.type] = js.native
    
    var index: Double = js.native
    
    def isAncestorOf(node: js.Any): Boolean = js.native
    
    def isCached(): Boolean = js.native
    
    def isDragging(): Boolean = js.native
    
    def isListening(): js.Any = js.native
    
    def isVisible(): js.Any = js.native
    
    def kaleidoscopeAngle(): Double = js.native
    def kaleidoscopeAngle(v: Double): this.type = js.native
    @JSName("kaleidoscopeAngle")
    var kaleidoscopeAngle_Original: GetSet[Double, this.type] = js.native
    
    def kaleidoscopePower(): Double = js.native
    def kaleidoscopePower(v: Double): this.type = js.native
    @JSName("kaleidoscopePower")
    var kaleidoscopePower_Original: GetSet[Double, this.type] = js.native
    
    def levels(): Double = js.native
    def levels(v: Double): this.type = js.native
    @JSName("levels")
    var levels_Original: GetSet[Double, this.type] = js.native
    
    def listening(): Boolean = js.native
    def listening(v: Boolean): this.type = js.native
    @JSName("listening")
    var listening_Original: GetSet[Boolean, this.type] = js.native
    
    def luminance(): Double = js.native
    def luminance(v: Double): this.type = js.native
    @JSName("luminance")
    var luminance_Original: GetSet[Double, this.type] = js.native
    
    def move(change: js.Any): this.type = js.native
    
    def moveDown(): Boolean = js.native
    
    def moveTo(newContainer: js.Any): this.type = js.native
    
    def moveToBottom(): Boolean = js.native
    
    def moveToTop(): Boolean = js.native
    
    def moveUp(): Boolean = js.native
    
    def name(): String = js.native
    def name(v: String): this.type = js.native
    @JSName("name")
    var name_Original: GetSet[String, this.type] = js.native
    
    var nodeType: String = js.native
    
    def noise(): Double = js.native
    def noise(v: Double): this.type = js.native
    @JSName("noise")
    var noise_Original: GetSet[Double, this.type] = js.native
    
    def off(evtStr: String): this.type = js.native
    def off(evtStr: String, callback: js.Function): this.type = js.native
    
    def offset(): Vector2d = js.native
    def offset(v: Vector2d): this.type = js.native
    
    def offsetX(): Double = js.native
    def offsetX(v: Double): this.type = js.native
    @JSName("offsetX")
    var offsetX_Original: GetSet[Double, this.type] = js.native
    
    def offsetY(): Double = js.native
    def offsetY(v: Double): this.type = js.native
    @JSName("offsetY")
    var offsetY_Original: GetSet[Double, this.type] = js.native
    
    @JSName("offset")
    var offset_Original: GetSet[Vector2d, this.type] = js.native
    
    @JSName("on")
    def on_abort(evtStr: abort, handler: KonvaEventListener[this.type, UIEvent]): js.Any = js.native
    @JSName("on")
    def on_animationcancel(evtStr: animationcancel, handler: KonvaEventListener[this.type, AnimationEvent]): js.Any = js.native
    @JSName("on")
    def on_animationend(evtStr: animationend, handler: KonvaEventListener[this.type, AnimationEvent]): js.Any = js.native
    @JSName("on")
    def on_animationiteration(evtStr: animationiteration, handler: KonvaEventListener[this.type, AnimationEvent]): js.Any = js.native
    @JSName("on")
    def on_animationstart(evtStr: animationstart, handler: KonvaEventListener[this.type, AnimationEvent]): js.Any = js.native
    @JSName("on")
    def on_auxclick(evtStr: auxclick, handler: KonvaEventListener[this.type, MouseEvent]): js.Any = js.native
    @JSName("on")
    def on_blur(evtStr: blur, handler: KonvaEventListener[this.type, FocusEvent]): js.Any = js.native
    @JSName("on")
    def on_cancel(evtStr: cancel, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
    @JSName("on")
    def on_canplay(evtStr: canplay, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
    @JSName("on")
    def on_canplaythrough(evtStr: canplaythrough, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
    @JSName("on")
    def on_change(evtStr: change, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
    @JSName("on")
    def on_click(evtStr: click, handler: KonvaEventListener[this.type, MouseEvent]): js.Any = js.native
    @JSName("on")
    def on_close(evtStr: close, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
    @JSName("on")
    def on_contextmenu(evtStr: contextmenu, handler: KonvaEventListener[this.type, MouseEvent]): js.Any = js.native
    @JSName("on")
    def on_cuechange(evtStr: cuechange, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
    @JSName("on")
    def on_dblclick(evtStr: dblclick, handler: KonvaEventListener[this.type, MouseEvent]): js.Any = js.native
    @JSName("on")
    def on_drag(evtStr: drag, handler: KonvaEventListener[this.type, DragEvent]): js.Any = js.native
    @JSName("on")
    def on_dragend(evtStr: dragend, handler: KonvaEventListener[this.type, DragEvent]): js.Any = js.native
    @JSName("on")
    def on_dragenter(evtStr: dragenter, handler: KonvaEventListener[this.type, DragEvent]): js.Any = js.native
    @JSName("on")
    def on_dragexit(evtStr: dragexit, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
    @JSName("on")
    def on_dragleave(evtStr: dragleave, handler: KonvaEventListener[this.type, DragEvent]): js.Any = js.native
    @JSName("on")
    def on_dragover(evtStr: dragover, handler: KonvaEventListener[this.type, DragEvent]): js.Any = js.native
    @JSName("on")
    def on_dragstart(evtStr: dragstart, handler: KonvaEventListener[this.type, DragEvent]): js.Any = js.native
    @JSName("on")
    def on_drop(evtStr: drop, handler: KonvaEventListener[this.type, DragEvent]): js.Any = js.native
    @JSName("on")
    def on_durationchange(evtStr: durationchange, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
    @JSName("on")
    def on_emptied(evtStr: emptied, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
    @JSName("on")
    def on_ended(evtStr: ended, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
    @JSName("on")
    def on_error(evtStr: error, handler: KonvaEventListener[this.type, ErrorEvent]): js.Any = js.native
    @JSName("on")
    def on_focus(evtStr: focus, handler: KonvaEventListener[this.type, FocusEvent]): js.Any = js.native
    @JSName("on")
    def on_focusin(evtStr: focusin, handler: KonvaEventListener[this.type, FocusEvent]): js.Any = js.native
    @JSName("on")
    def on_focusout(evtStr: focusout, handler: KonvaEventListener[this.type, FocusEvent]): js.Any = js.native
    @JSName("on")
    def on_gotpointercapture(evtStr: gotpointercapture, handler: KonvaEventListener[this.type, PointerEvent]): js.Any = js.native
    @JSName("on")
    def on_input(evtStr: input, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
    @JSName("on")
    def on_invalid(evtStr: invalid, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
    @JSName("on")
    def on_keydown(evtStr: keydown, handler: KonvaEventListener[this.type, KeyboardEvent]): js.Any = js.native
    @JSName("on")
    def on_keypress(evtStr: keypress, handler: KonvaEventListener[this.type, KeyboardEvent]): js.Any = js.native
    @JSName("on")
    def on_keyup(evtStr: keyup, handler: KonvaEventListener[this.type, KeyboardEvent]): js.Any = js.native
    @JSName("on")
    def on_load(evtStr: load, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
    @JSName("on")
    def on_loadeddata(evtStr: loadeddata, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
    @JSName("on")
    def on_loadedmetadata(evtStr: loadedmetadata, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
    @JSName("on")
    def on_loadstart(evtStr: loadstart, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
    @JSName("on")
    def on_lostpointercapture(evtStr: lostpointercapture, handler: KonvaEventListener[this.type, PointerEvent]): js.Any = js.native
    @JSName("on")
    def on_mousedown(evtStr: mousedown, handler: KonvaEventListener[this.type, MouseEvent]): js.Any = js.native
    @JSName("on")
    def on_mouseenter(evtStr: mouseenter, handler: KonvaEventListener[this.type, MouseEvent]): js.Any = js.native
    @JSName("on")
    def on_mouseleave(evtStr: mouseleave, handler: KonvaEventListener[this.type, MouseEvent]): js.Any = js.native
    @JSName("on")
    def on_mousemove(evtStr: mousemove, handler: KonvaEventListener[this.type, MouseEvent]): js.Any = js.native
    @JSName("on")
    def on_mouseout(evtStr: mouseout, handler: KonvaEventListener[this.type, MouseEvent]): js.Any = js.native
    @JSName("on")
    def on_mouseover(evtStr: mouseover, handler: KonvaEventListener[this.type, MouseEvent]): js.Any = js.native
    @JSName("on")
    def on_mouseup(evtStr: mouseup, handler: KonvaEventListener[this.type, MouseEvent]): js.Any = js.native
    @JSName("on")
    def on_pause(evtStr: pause, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
    @JSName("on")
    def on_play(evtStr: play, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
    @JSName("on")
    def on_playing(evtStr: playing, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
    @JSName("on")
    def on_pointercancel(evtStr: pointercancel, handler: KonvaEventListener[this.type, PointerEvent]): js.Any = js.native
    @JSName("on")
    def on_pointerdown(evtStr: pointerdown, handler: KonvaEventListener[this.type, PointerEvent]): js.Any = js.native
    @JSName("on")
    def on_pointerenter(evtStr: pointerenter, handler: KonvaEventListener[this.type, PointerEvent]): js.Any = js.native
    @JSName("on")
    def on_pointerleave(evtStr: pointerleave, handler: KonvaEventListener[this.type, PointerEvent]): js.Any = js.native
    @JSName("on")
    def on_pointermove(evtStr: pointermove, handler: KonvaEventListener[this.type, PointerEvent]): js.Any = js.native
    @JSName("on")
    def on_pointerout(evtStr: pointerout, handler: KonvaEventListener[this.type, PointerEvent]): js.Any = js.native
    @JSName("on")
    def on_pointerover(evtStr: pointerover, handler: KonvaEventListener[this.type, PointerEvent]): js.Any = js.native
    @JSName("on")
    def on_pointerup(evtStr: pointerup, handler: KonvaEventListener[this.type, PointerEvent]): js.Any = js.native
    @JSName("on")
    def on_progress(evtStr: progress, handler: KonvaEventListener[this.type, ProgressEvent[EventTarget]]): js.Any = js.native
    @JSName("on")
    def on_ratechange(evtStr: ratechange, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
    @JSName("on")
    def on_reset(evtStr: reset, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
    @JSName("on")
    def on_resize(evtStr: resize, handler: KonvaEventListener[this.type, UIEvent]): js.Any = js.native
    @JSName("on")
    def on_scroll(evtStr: scroll, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
    @JSName("on")
    def on_securitypolicyviolation(
      evtStr: securitypolicyviolation,
      handler: KonvaEventListener[this.type, SecurityPolicyViolationEvent]
    ): js.Any = js.native
    @JSName("on")
    def on_seeked(evtStr: seeked, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
    @JSName("on")
    def on_seeking(evtStr: seeking, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
    @JSName("on")
    def on_select(evtStr: select, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
    @JSName("on")
    def on_selectionchange(evtStr: selectionchange, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
    @JSName("on")
    def on_selectstart(evtStr: selectstart, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
    @JSName("on")
    def on_stalled(evtStr: stalled, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
    @JSName("on")
    def on_submit(evtStr: submit, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
    @JSName("on")
    def on_suspend(evtStr: suspend, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
    @JSName("on")
    def on_timeupdate(evtStr: timeupdate, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
    @JSName("on")
    def on_toggle(evtStr: toggle, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
    @JSName("on")
    def on_touchcancel(evtStr: touchcancel, handler: KonvaEventListener[this.type, TouchEvent]): js.Any = js.native
    @JSName("on")
    def on_touchend(evtStr: touchend, handler: KonvaEventListener[this.type, TouchEvent]): js.Any = js.native
    @JSName("on")
    def on_touchmove(evtStr: touchmove, handler: KonvaEventListener[this.type, TouchEvent]): js.Any = js.native
    @JSName("on")
    def on_touchstart(evtStr: touchstart, handler: KonvaEventListener[this.type, TouchEvent]): js.Any = js.native
    @JSName("on")
    def on_transitioncancel(evtStr: transitioncancel, handler: KonvaEventListener[this.type, TransitionEvent]): js.Any = js.native
    @JSName("on")
    def on_transitionend(evtStr: transitionend, handler: KonvaEventListener[this.type, TransitionEvent]): js.Any = js.native
    @JSName("on")
    def on_transitionrun(evtStr: transitionrun, handler: KonvaEventListener[this.type, TransitionEvent]): js.Any = js.native
    @JSName("on")
    def on_transitionstart(evtStr: transitionstart, handler: KonvaEventListener[this.type, TransitionEvent]): js.Any = js.native
    @JSName("on")
    def on_volumechange(evtStr: volumechange, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
    @JSName("on")
    def on_waiting(evtStr: waiting, handler: KonvaEventListener[this.type, Event]): js.Any = js.native
    @JSName("on")
    def on_wheel(evtStr: wheel, handler: KonvaEventListener[this.type, WheelEvent]): js.Any = js.native
    
    def opacity(): Double = js.native
    def opacity(v: Double): this.type = js.native
    @JSName("opacity")
    var opacity_Original: GetSet[Double, this.type] = js.native
    
    var parent: Container[Node[NodeConfig]] | Null = js.native
    
    def pixelSize(): Double = js.native
    def pixelSize(v: Double): this.type = js.native
    @JSName("pixelSize")
    var pixelSize_Original: GetSet[Double, this.type] = js.native
    
    def position(): Vector2d = js.native
    def position(v: Vector2d): this.type = js.native
    @JSName("position")
    var position_Original: GetSet[Vector2d, this.type] = js.native
    
    def preventDefault(): Boolean = js.native
    def preventDefault(v: Boolean): this.type = js.native
    @JSName("preventDefault")
    var preventDefault_Original: GetSet[Boolean, this.type] = js.native
    
    def red(): Double = js.native
    def red(v: Double): this.type = js.native
    @JSName("red")
    var red_Original: GetSet[Double, this.type] = js.native
    
    def remove(): this.type = js.native
    
    def removeEventListener(`type`: String): this.type = js.native
    
    def removeName(name: js.Any): this.type = js.native
    
    def rotate(theta: js.Any): this.type = js.native
    
    def rotation(): Double = js.native
    def rotation(v: Double): this.type = js.native
    @JSName("rotation")
    var rotation_Original: GetSet[Double, this.type] = js.native
    
    def saturation(): Double = js.native
    def saturation(v: Double): this.type = js.native
    @JSName("saturation")
    var saturation_Original: GetSet[Double, this.type] = js.native
    
    def scale(): Vector2d = js.native
    def scale(v: Vector2d): this.type = js.native
    
    def scaleX(): Double = js.native
    def scaleX(v: Double): this.type = js.native
    @JSName("scaleX")
    var scaleX_Original: GetSet[Double, this.type] = js.native
    
    def scaleY(): Double = js.native
    def scaleY(v: Double): this.type = js.native
    @JSName("scaleY")
    var scaleY_Original: GetSet[Double, this.type] = js.native
    
    @JSName("scale")
    var scale_Original: GetSet[Vector2d, this.type] = js.native
    
    def setAbsolutePosition(pos: js.Any): this.type = js.native
    
    def setAttr(attr: js.Any, `val`: js.Any): this.type = js.native
    
    def setAttrs(config: js.Any): this.type = js.native
    
    def setDraggable(draggable: js.Any): Unit = js.native
    
    def setId(id: js.Any): this.type = js.native
    
    def setName(name: js.Any): this.type = js.native
    
    def setPosition(pos: js.Any): this.type = js.native
    
    def setSize(size: js.Any): this.type = js.native
    
    def setZIndex(zIndex: js.Any): this.type = js.native
    
    def shouldDrawHit(): js.Any = js.native
    def shouldDrawHit(top: Node[NodeConfig]): js.Any = js.native
    
    def show(): this.type = js.native
    
    def size(): HeightWidth = js.native
    def size(v: HeightWidth): this.type = js.native
    @JSName("size")
    var size_Original: GetSet[HeightWidth, this.type] = js.native
    
    def skew(): Vector2d = js.native
    def skew(v: Vector2d): this.type = js.native
    
    def skewX(): Double = js.native
    def skewX(v: Double): this.type = js.native
    @JSName("skewX")
    var skewX_Original: GetSet[Double, this.type] = js.native
    
    def skewY(): Double = js.native
    def skewY(v: Double): this.type = js.native
    @JSName("skewY")
    var skewY_Original: GetSet[Double, this.type] = js.native
    
    @JSName("skew")
    var skew_Original: GetSet[Vector2d, this.type] = js.native
    
    def startDrag(): Unit = js.native
    def startDrag(evt: js.UndefOr[scala.Nothing], bubbleEvent: Boolean): Unit = js.native
    def startDrag(evt: js.Any): Unit = js.native
    def startDrag(evt: js.Any, bubbleEvent: Boolean): Unit = js.native
    
    def stopDrag(): Unit = js.native
    def stopDrag(evt: js.Any): Unit = js.native
    
    def threshold(): Double = js.native
    def threshold(v: Double): this.type = js.native
    @JSName("threshold")
    var threshold_Original: GetSet[Double, this.type] = js.native
    
    def to(params: AnimTo): Unit = js.native
    
    def toCanvas(config: js.Any): HTMLCanvasElement = js.native
    
    def toDataURL(): String = js.native
    def toDataURL(config: Callback): String = js.native
    
    def toImage(): Unit = js.native
    def toImage(config: MimeType): Unit = js.native
    
    def toJSON(): String = js.native
    
    def toObject(): js.Any = js.native
    
    def transformsEnabled(): String = js.native
    def transformsEnabled(v: String): this.type = js.native
    @JSName("transformsEnabled")
    var transformsEnabled_Original: GetSet[String, this.type] = js.native
    
    def value(): Double = js.native
    def value(v: Double): this.type = js.native
    @JSName("value")
    var value_Original: GetSet[Double, this.type] = js.native
    
    def visible(): Boolean = js.native
    def visible(v: Boolean): this.type = js.native
    @JSName("visible")
    var visible_Original: GetSet[Boolean, this.type] = js.native
    
    def width(): Double = js.native
    def width(v: Double): this.type = js.native
    @JSName("width")
    var width_Original: GetSet[Double, this.type] = js.native
    
    def x(): Double = js.native
    def x(v: Double): this.type = js.native
    @JSName("x")
    var x_Original: GetSet[Double, this.type] = js.native
    
    def y(): Double = js.native
    def y(v: Double): this.type = js.native
    @JSName("y")
    var y_Original: GetSet[Double, this.type] = js.native
    
    def zIndex(): Double = js.native
    def zIndex(v: Double): this.type = js.native
    @JSName("zIndex")
    var zIndex_Original: GetSet[Double, this.type] = js.native
  }
  /* static members */
  object Node {
    
    @JSImport("konva/types/Node", "Node._createNode")
    @js.native
    def _createNode(obj: js.Any): js.Any = js.native
    @JSImport("konva/types/Node", "Node._createNode")
    @js.native
    def _createNode(obj: js.Any, container: js.Any): js.Any = js.native
    
    @JSImport("konva/types/Node", "Node.create")
    @js.native
    def create(data: js.Any): js.Any = js.native
    @JSImport("konva/types/Node", "Node.create")
    @js.native
    def create(data: js.Any, container: js.Any): js.Any = js.native
  }
  
  @JSImport("konva/types/Node", "_addName")
  @js.native
  def addName(node: js.Any, name: String): Unit = js.native
  
  @JSImport("konva/types/Node", "ids")
  @js.native
  val ids: js.Any = js.native
  
  @JSImport("konva/types/Node", "names")
  @js.native
  val names: js.Any = js.native
  
  @JSImport("konva/types/Node", "_removeId")
  @js.native
  def removeId(id: String, node: js.Any): Unit = js.native
  
  @JSImport("konva/types/Node", "_removeName")
  @js.native
  def removeName(name: String, _id: Double): Unit = js.native
  
  @js.native
  trait AnimTo extends NodeConfig {
    
    var duration: js.UndefOr[Double] = js.native
    
    var onFinish: js.UndefOr[js.Function] = js.native
    
    var onUpdate: js.UndefOr[js.Function] = js.native
  }
  object AnimTo {
    
    @scala.inline
    def apply(): AnimTo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnimTo]
    }
    
    @scala.inline
    implicit class AnimToMutableBuilder[Self <: AnimTo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setOnFinish(value: js.Function): Self = StObject.set(x, "onFinish", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnFinishUndefined: Self = StObject.set(x, "onFinish", js.undefined)
      
      @scala.inline
      def setOnUpdate(value: js.Function): Self = StObject.set(x, "onUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
    }
  }
  
  type Filter = js.ThisFunction1[/* this */ Node[NodeConfig], /* imageData */ ImageData, Unit]
  
  type KonvaEventListener[This, EventType] = js.ThisFunction1[/* this */ This, /* ev */ KonvaEventObject[EventType], Unit]
  
  @js.native
  trait KonvaEventObject[EventType] extends StObject {
    
    var cancelBubble: Boolean = js.native
    
    var child: js.UndefOr[Node[NodeConfig]] = js.native
    
    var currentTarget: Node[NodeConfig] = js.native
    
    var evt: EventType = js.native
    
    var target: Shape[ShapeConfig] | Stage = js.native
  }
  object KonvaEventObject {
    
    @scala.inline
    def apply[EventType](
      cancelBubble: Boolean,
      currentTarget: Node[NodeConfig],
      evt: EventType,
      target: Shape[ShapeConfig] | Stage
    ): KonvaEventObject[EventType] = {
      val __obj = js.Dynamic.literal(cancelBubble = cancelBubble.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], evt = evt.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[KonvaEventObject[EventType]]
    }
    
    @scala.inline
    implicit class KonvaEventObjectMutableBuilder[Self <: KonvaEventObject[_], EventType] (val x: Self with KonvaEventObject[EventType]) extends AnyVal {
      
      @scala.inline
      def setCancelBubble(value: Boolean): Self = StObject.set(x, "cancelBubble", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChild(value: Node[NodeConfig]): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildUndefined: Self = StObject.set(x, "child", js.undefined)
      
      @scala.inline
      def setCurrentTarget(value: Node[NodeConfig]): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvt(value: EventType): Self = StObject.set(x, "evt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: Shape[ShapeConfig] | Stage): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NodeConfig
    extends /* index */ StringDictionary[js.Any] {
    
    var dragBoundFunc: js.UndefOr[js.ThisFunction1[/* this */ Node[this.type], /* pos */ Vector2d, Vector2d]] = js.native
    
    var dragDistance: js.UndefOr[Double] = js.native
    
    var draggable: js.UndefOr[Boolean] = js.native
    
    var filters: js.UndefOr[js.Array[Filter]] = js.native
    
    var globalCompositeOperation: js.UndefOr[globalCompositeOperationType] = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var listening: js.UndefOr[Boolean] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var offset: js.UndefOr[Vector2d] = js.native
    
    var offsetX: js.UndefOr[Double] = js.native
    
    var offsetY: js.UndefOr[Double] = js.native
    
    var opacity: js.UndefOr[Number] = js.native
    
    var preventDefault: js.UndefOr[Boolean] = js.native
    
    var rotation: js.UndefOr[Double] = js.native
    
    var rotationDeg: js.UndefOr[Double] = js.native
    
    var scale: js.UndefOr[Vector2d] = js.native
    
    var scaleX: js.UndefOr[Double] = js.native
    
    var scaleY: js.UndefOr[Double] = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
    
    var width: js.UndefOr[Double] = js.native
    
    var x: js.UndefOr[Double] = js.native
    
    var y: js.UndefOr[Double] = js.native
  }
  object NodeConfig {
    
    @scala.inline
    def apply(): NodeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeConfig]
    }
    
    @scala.inline
    implicit class NodeConfigMutableBuilder[Self <: NodeConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDragBoundFunc(value: js.ThisFunction1[/* this */ Node[NodeConfig], /* pos */ Vector2d, Vector2d]): Self = StObject.set(x, "dragBoundFunc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragBoundFuncUndefined: Self = StObject.set(x, "dragBoundFunc", js.undefined)
      
      @scala.inline
      def setDragDistance(value: Double): Self = StObject.set(x, "dragDistance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragDistanceUndefined: Self = StObject.set(x, "dragDistance", js.undefined)
      
      @scala.inline
      def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      @scala.inline
      def setFilters(value: js.Array[Filter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setGlobalCompositeOperation(value: globalCompositeOperationType): Self = StObject.set(x, "globalCompositeOperation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalCompositeOperationUndefined: Self = StObject.set(x, "globalCompositeOperation", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setListening(value: Boolean): Self = StObject.set(x, "listening", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListeningUndefined: Self = StObject.set(x, "listening", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOffset(value: Vector2d): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
      
      @scala.inline
      def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
      
      @scala.inline
      def setOpacity(value: Number): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setPreventDefault(value: Boolean): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
      
      @scala.inline
      def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationDeg(value: Double): Self = StObject.set(x, "rotationDeg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationDegUndefined: Self = StObject.set(x, "rotationDeg", js.undefined)
      
      @scala.inline
      def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      @scala.inline
      def setScale(value: Vector2d): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      @scala.inline
      def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
      
      @scala.inline
      def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleYUndefined: Self = StObject.set(x, "scaleY", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  /* Inlined std.GlobalEventHandlersEventMap & {[index: string] : any} */
  @js.native
  trait NodeEventMap
    extends /* index */ StringDictionary[js.Any] {
    
    var abort: UIEvent = js.native
    
    var animationcancel: AnimationEvent = js.native
    
    var animationend: AnimationEvent = js.native
    
    var animationiteration: AnimationEvent = js.native
    
    var animationstart: AnimationEvent = js.native
    
    var auxclick: MouseEvent = js.native
    
    var blur: FocusEvent = js.native
    
    var cancel: Event = js.native
    
    var canplay: Event = js.native
    
    var canplaythrough: Event = js.native
    
    var change: Event = js.native
    
    var click: MouseEvent = js.native
    
    var close: Event = js.native
    
    var contextmenu: MouseEvent = js.native
    
    var cuechange: Event = js.native
    
    var dblclick: MouseEvent = js.native
    
    var drag: DragEvent = js.native
    
    var dragend: DragEvent = js.native
    
    var dragenter: DragEvent = js.native
    
    var dragexit: Event = js.native
    
    var dragleave: DragEvent = js.native
    
    var dragover: DragEvent = js.native
    
    var dragstart: DragEvent = js.native
    
    var drop: DragEvent = js.native
    
    var durationchange: Event = js.native
    
    var emptied: Event = js.native
    
    var ended: Event = js.native
    
    var error: ErrorEvent = js.native
    
    var focus: FocusEvent = js.native
    
    var focusin: FocusEvent = js.native
    
    var focusout: FocusEvent = js.native
    
    var gotpointercapture: PointerEvent = js.native
    
    var input: Event = js.native
    
    var invalid: Event = js.native
    
    var keydown: KeyboardEvent = js.native
    
    var keypress: KeyboardEvent = js.native
    
    var keyup: KeyboardEvent = js.native
    
    var load: Event = js.native
    
    var loadeddata: Event = js.native
    
    var loadedmetadata: Event = js.native
    
    var loadstart: Event = js.native
    
    var lostpointercapture: PointerEvent = js.native
    
    var mousedown: MouseEvent = js.native
    
    var mouseenter: MouseEvent = js.native
    
    var mouseleave: MouseEvent = js.native
    
    var mousemove: MouseEvent = js.native
    
    var mouseout: MouseEvent = js.native
    
    var mouseover: MouseEvent = js.native
    
    var mouseup: MouseEvent = js.native
    
    var pause: Event = js.native
    
    var play: Event = js.native
    
    var playing: Event = js.native
    
    var pointercancel: PointerEvent = js.native
    
    var pointerdown: PointerEvent = js.native
    
    var pointerenter: PointerEvent = js.native
    
    var pointerleave: PointerEvent = js.native
    
    var pointermove: PointerEvent = js.native
    
    var pointerout: PointerEvent = js.native
    
    var pointerover: PointerEvent = js.native
    
    var pointerup: PointerEvent = js.native
    
    var progress: ProgressEvent[EventTarget] = js.native
    
    var ratechange: Event = js.native
    
    var reset: Event = js.native
    
    var resize: UIEvent = js.native
    
    var scroll: Event = js.native
    
    var securitypolicyviolation: SecurityPolicyViolationEvent = js.native
    
    var seeked: Event = js.native
    
    var seeking: Event = js.native
    
    var select: Event = js.native
    
    var selectionchange: Event = js.native
    
    var selectstart: Event = js.native
    
    var stalled: Event = js.native
    
    var submit: Event = js.native
    
    var suspend: Event = js.native
    
    var timeupdate: Event = js.native
    
    var toggle: Event = js.native
    
    var touchcancel: TouchEvent = js.native
    
    var touchend: TouchEvent = js.native
    
    var touchmove: TouchEvent = js.native
    
    var touchstart: TouchEvent = js.native
    
    var transitioncancel: TransitionEvent = js.native
    
    var transitionend: TransitionEvent = js.native
    
    var transitionrun: TransitionEvent = js.native
    
    var transitionstart: TransitionEvent = js.native
    
    var volumechange: Event = js.native
    
    var waiting: Event = js.native
    
    var wheel: WheelEvent = js.native
  }
  object NodeEventMap {
    
    @scala.inline
    def apply(
      abort: UIEvent,
      animationcancel: AnimationEvent,
      animationend: AnimationEvent,
      animationiteration: AnimationEvent,
      animationstart: AnimationEvent,
      auxclick: MouseEvent,
      blur: FocusEvent,
      cancel: Event,
      canplay: Event,
      canplaythrough: Event,
      change: Event,
      click: MouseEvent,
      close: Event,
      contextmenu: MouseEvent,
      cuechange: Event,
      dblclick: MouseEvent,
      drag: DragEvent,
      dragend: DragEvent,
      dragenter: DragEvent,
      dragexit: Event,
      dragleave: DragEvent,
      dragover: DragEvent,
      dragstart: DragEvent,
      drop: DragEvent,
      durationchange: Event,
      emptied: Event,
      ended: Event,
      error: ErrorEvent,
      focus: FocusEvent,
      focusin: FocusEvent,
      focusout: FocusEvent,
      gotpointercapture: PointerEvent,
      input: Event,
      invalid: Event,
      keydown: KeyboardEvent,
      keypress: KeyboardEvent,
      keyup: KeyboardEvent,
      load: Event,
      loadeddata: Event,
      loadedmetadata: Event,
      loadstart: Event,
      lostpointercapture: PointerEvent,
      mousedown: MouseEvent,
      mouseenter: MouseEvent,
      mouseleave: MouseEvent,
      mousemove: MouseEvent,
      mouseout: MouseEvent,
      mouseover: MouseEvent,
      mouseup: MouseEvent,
      pause: Event,
      play: Event,
      playing: Event,
      pointercancel: PointerEvent,
      pointerdown: PointerEvent,
      pointerenter: PointerEvent,
      pointerleave: PointerEvent,
      pointermove: PointerEvent,
      pointerout: PointerEvent,
      pointerover: PointerEvent,
      pointerup: PointerEvent,
      progress: ProgressEvent[EventTarget],
      ratechange: Event,
      reset: Event,
      resize: UIEvent,
      scroll: Event,
      securitypolicyviolation: SecurityPolicyViolationEvent,
      seeked: Event,
      seeking: Event,
      select: Event,
      selectionchange: Event,
      selectstart: Event,
      stalled: Event,
      submit: Event,
      suspend: Event,
      timeupdate: Event,
      toggle: Event,
      touchcancel: TouchEvent,
      touchend: TouchEvent,
      touchmove: TouchEvent,
      touchstart: TouchEvent,
      transitioncancel: TransitionEvent,
      transitionend: TransitionEvent,
      transitionrun: TransitionEvent,
      transitionstart: TransitionEvent,
      volumechange: Event,
      waiting: Event,
      wheel: WheelEvent
    ): NodeEventMap = {
      val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeEventMap]
    }
    
    @scala.inline
    implicit class NodeEventMapMutableBuilder[Self <: NodeEventMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbort(value: UIEvent): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationcancel(value: AnimationEvent): Self = StObject.set(x, "animationcancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationend(value: AnimationEvent): Self = StObject.set(x, "animationend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationiteration(value: AnimationEvent): Self = StObject.set(x, "animationiteration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationstart(value: AnimationEvent): Self = StObject.set(x, "animationstart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuxclick(value: MouseEvent): Self = StObject.set(x, "auxclick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlur(value: FocusEvent): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancel(value: Event): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanplay(value: Event): Self = StObject.set(x, "canplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanplaythrough(value: Event): Self = StObject.set(x, "canplaythrough", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChange(value: Event): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClick(value: MouseEvent): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClose(value: Event): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextmenu(value: MouseEvent): Self = StObject.set(x, "contextmenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCuechange(value: Event): Self = StObject.set(x, "cuechange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDblclick(value: MouseEvent): Self = StObject.set(x, "dblclick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrag(value: DragEvent): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragend(value: DragEvent): Self = StObject.set(x, "dragend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragenter(value: DragEvent): Self = StObject.set(x, "dragenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragexit(value: Event): Self = StObject.set(x, "dragexit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragleave(value: DragEvent): Self = StObject.set(x, "dragleave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragover(value: DragEvent): Self = StObject.set(x, "dragover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragstart(value: DragEvent): Self = StObject.set(x, "dragstart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrop(value: DragEvent): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationchange(value: Event): Self = StObject.set(x, "durationchange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptied(value: Event): Self = StObject.set(x, "emptied", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnded(value: Event): Self = StObject.set(x, "ended", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: ErrorEvent): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocus(value: FocusEvent): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusin(value: FocusEvent): Self = StObject.set(x, "focusin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusout(value: FocusEvent): Self = StObject.set(x, "focusout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGotpointercapture(value: PointerEvent): Self = StObject.set(x, "gotpointercapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInput(value: Event): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalid(value: Event): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeydown(value: KeyboardEvent): Self = StObject.set(x, "keydown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeypress(value: KeyboardEvent): Self = StObject.set(x, "keypress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyup(value: KeyboardEvent): Self = StObject.set(x, "keyup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoad(value: Event): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadeddata(value: Event): Self = StObject.set(x, "loadeddata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadedmetadata(value: Event): Self = StObject.set(x, "loadedmetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadstart(value: Event): Self = StObject.set(x, "loadstart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLostpointercapture(value: PointerEvent): Self = StObject.set(x, "lostpointercapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMousedown(value: MouseEvent): Self = StObject.set(x, "mousedown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseenter(value: MouseEvent): Self = StObject.set(x, "mouseenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseleave(value: MouseEvent): Self = StObject.set(x, "mouseleave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMousemove(value: MouseEvent): Self = StObject.set(x, "mousemove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseout(value: MouseEvent): Self = StObject.set(x, "mouseout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseover(value: MouseEvent): Self = StObject.set(x, "mouseover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseup(value: MouseEvent): Self = StObject.set(x, "mouseup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPause(value: Event): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlay(value: Event): Self = StObject.set(x, "play", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaying(value: Event): Self = StObject.set(x, "playing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointercancel(value: PointerEvent): Self = StObject.set(x, "pointercancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointerdown(value: PointerEvent): Self = StObject.set(x, "pointerdown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointerenter(value: PointerEvent): Self = StObject.set(x, "pointerenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointerleave(value: PointerEvent): Self = StObject.set(x, "pointerleave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointermove(value: PointerEvent): Self = StObject.set(x, "pointermove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointerout(value: PointerEvent): Self = StObject.set(x, "pointerout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointerover(value: PointerEvent): Self = StObject.set(x, "pointerover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointerup(value: PointerEvent): Self = StObject.set(x, "pointerup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgress(value: ProgressEvent[EventTarget]): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRatechange(value: Event): Self = StObject.set(x, "ratechange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReset(value: Event): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResize(value: UIEvent): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScroll(value: Event): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecuritypolicyviolation(value: SecurityPolicyViolationEvent): Self = StObject.set(x, "securitypolicyviolation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeeked(value: Event): Self = StObject.set(x, "seeked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeeking(value: Event): Self = StObject.set(x, "seeking", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelect(value: Event): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionchange(value: Event): Self = StObject.set(x, "selectionchange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectstart(value: Event): Self = StObject.set(x, "selectstart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStalled(value: Event): Self = StObject.set(x, "stalled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmit(value: Event): Self = StObject.set(x, "submit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuspend(value: Event): Self = StObject.set(x, "suspend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeupdate(value: Event): Self = StObject.set(x, "timeupdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggle(value: Event): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchcancel(value: TouchEvent): Self = StObject.set(x, "touchcancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchend(value: TouchEvent): Self = StObject.set(x, "touchend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchmove(value: TouchEvent): Self = StObject.set(x, "touchmove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchstart(value: TouchEvent): Self = StObject.set(x, "touchstart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitioncancel(value: TransitionEvent): Self = StObject.set(x, "transitioncancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionend(value: TransitionEvent): Self = StObject.set(x, "transitionend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionrun(value: TransitionEvent): Self = StObject.set(x, "transitionrun", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionstart(value: TransitionEvent): Self = StObject.set(x, "transitionstart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolumechange(value: Event): Self = StObject.set(x, "volumechange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaiting(value: Event): Self = StObject.set(x, "waiting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWheel(value: WheelEvent): Self = StObject.set(x, "wheel", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.konva.konvaStrings._empty
    - typings.konva.konvaStrings.`source-over`
    - typings.konva.konvaStrings.`source-in`
    - typings.konva.konvaStrings.`source-out`
    - typings.konva.konvaStrings.`source-atop`
    - typings.konva.konvaStrings.`destination-over`
    - typings.konva.konvaStrings.`destination-in`
    - typings.konva.konvaStrings.`destination-out`
    - typings.konva.konvaStrings.`destination-atop`
    - typings.konva.konvaStrings.lighter
    - typings.konva.konvaStrings.copy
    - typings.konva.konvaStrings.xor
    - typings.konva.konvaStrings.multiply
    - typings.konva.konvaStrings.screen
    - typings.konva.konvaStrings.overlay
    - typings.konva.konvaStrings.darken
    - typings.konva.konvaStrings.lighten
    - typings.konva.konvaStrings.`color-dodge`
    - typings.konva.konvaStrings.`color-burn`
    - typings.konva.konvaStrings.`hard-light`
    - typings.konva.konvaStrings.`soft-light`
    - typings.konva.konvaStrings.difference
    - typings.konva.konvaStrings.exclusion
    - typings.konva.konvaStrings.hue
    - typings.konva.konvaStrings.saturation
    - typings.konva.konvaStrings.color
    - typings.konva.konvaStrings.luminosity
  */
  trait globalCompositeOperationType extends StObject
  object globalCompositeOperationType {
    
    @scala.inline
    def _empty: typings.konva.konvaStrings._empty = "".asInstanceOf[typings.konva.konvaStrings._empty]
    
    @scala.inline
    def color: typings.konva.konvaStrings.color = "color".asInstanceOf[typings.konva.konvaStrings.color]
    
    @scala.inline
    def `color-burn`: typings.konva.konvaStrings.`color-burn` = "color-burn".asInstanceOf[typings.konva.konvaStrings.`color-burn`]
    
    @scala.inline
    def `color-dodge`: typings.konva.konvaStrings.`color-dodge` = "color-dodge".asInstanceOf[typings.konva.konvaStrings.`color-dodge`]
    
    @scala.inline
    def copy: typings.konva.konvaStrings.copy = "copy".asInstanceOf[typings.konva.konvaStrings.copy]
    
    @scala.inline
    def darken: typings.konva.konvaStrings.darken = "darken".asInstanceOf[typings.konva.konvaStrings.darken]
    
    @scala.inline
    def `destination-atop`: typings.konva.konvaStrings.`destination-atop` = "destination-atop".asInstanceOf[typings.konva.konvaStrings.`destination-atop`]
    
    @scala.inline
    def `destination-in`: typings.konva.konvaStrings.`destination-in` = "destination-in".asInstanceOf[typings.konva.konvaStrings.`destination-in`]
    
    @scala.inline
    def `destination-out`: typings.konva.konvaStrings.`destination-out` = "destination-out".asInstanceOf[typings.konva.konvaStrings.`destination-out`]
    
    @scala.inline
    def `destination-over`: typings.konva.konvaStrings.`destination-over` = "destination-over".asInstanceOf[typings.konva.konvaStrings.`destination-over`]
    
    @scala.inline
    def difference: typings.konva.konvaStrings.difference = "difference".asInstanceOf[typings.konva.konvaStrings.difference]
    
    @scala.inline
    def exclusion: typings.konva.konvaStrings.exclusion = "exclusion".asInstanceOf[typings.konva.konvaStrings.exclusion]
    
    @scala.inline
    def `hard-light`: typings.konva.konvaStrings.`hard-light` = "hard-light".asInstanceOf[typings.konva.konvaStrings.`hard-light`]
    
    @scala.inline
    def hue: typings.konva.konvaStrings.hue = "hue".asInstanceOf[typings.konva.konvaStrings.hue]
    
    @scala.inline
    def lighten: typings.konva.konvaStrings.lighten = "lighten".asInstanceOf[typings.konva.konvaStrings.lighten]
    
    @scala.inline
    def lighter: typings.konva.konvaStrings.lighter = "lighter".asInstanceOf[typings.konva.konvaStrings.lighter]
    
    @scala.inline
    def luminosity: typings.konva.konvaStrings.luminosity = "luminosity".asInstanceOf[typings.konva.konvaStrings.luminosity]
    
    @scala.inline
    def multiply: typings.konva.konvaStrings.multiply = "multiply".asInstanceOf[typings.konva.konvaStrings.multiply]
    
    @scala.inline
    def overlay: typings.konva.konvaStrings.overlay = "overlay".asInstanceOf[typings.konva.konvaStrings.overlay]
    
    @scala.inline
    def saturation: typings.konva.konvaStrings.saturation = "saturation".asInstanceOf[typings.konva.konvaStrings.saturation]
    
    @scala.inline
    def screen: typings.konva.konvaStrings.screen = "screen".asInstanceOf[typings.konva.konvaStrings.screen]
    
    @scala.inline
    def `soft-light`: typings.konva.konvaStrings.`soft-light` = "soft-light".asInstanceOf[typings.konva.konvaStrings.`soft-light`]
    
    @scala.inline
    def `source-atop`: typings.konva.konvaStrings.`source-atop` = "source-atop".asInstanceOf[typings.konva.konvaStrings.`source-atop`]
    
    @scala.inline
    def `source-in`: typings.konva.konvaStrings.`source-in` = "source-in".asInstanceOf[typings.konva.konvaStrings.`source-in`]
    
    @scala.inline
    def `source-out`: typings.konva.konvaStrings.`source-out` = "source-out".asInstanceOf[typings.konva.konvaStrings.`source-out`]
    
    @scala.inline
    def `source-over`: typings.konva.konvaStrings.`source-over` = "source-over".asInstanceOf[typings.konva.konvaStrings.`source-over`]
    
    @scala.inline
    def xor: typings.konva.konvaStrings.xor = "xor".asInstanceOf[typings.konva.konvaStrings.xor]
  }
}
