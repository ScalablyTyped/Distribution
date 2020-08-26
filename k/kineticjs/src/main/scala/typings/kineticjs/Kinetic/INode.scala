package typings.kineticjs.Kinetic

import typings.kineticjs.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INode extends js.Object {
  def cache(): INode = js.native
  def cache(cacheConfig: js.Any): INode = js.native
  def clone(attrs: js.Any): INode = js.native
  def destroy(): Unit = js.native
  def draw(): INode = js.native
  def drawBuffer(): js.Any = js.native
  def drawScene(): js.Any = js.native
  def fire(typeStr: String): js.Any = js.native
  def fire(typeStr: String, event: js.UndefOr[scala.Nothing], bubble: Boolean): js.Any = js.native
  def fire(typeStr: String, event: js.Any): js.Any = js.native
  def fire(typeStr: String, event: js.Any, bubble: Boolean): js.Any = js.native
  def getAbsoluteOpacity(): Double = js.native
  def getAbsolutePosition(): Vector2d = js.native
  def getAbsoluteTransform(): js.Any = js.native
  def getAbsoluteZIndex(): Double = js.native
  def getAttrs(): js.Any = js.native
  def getDragBounds(): js.Any = js.native
  def getDragConstraint(): js.Any = js.native
  def getDraggable(): Boolean = js.native
  def getHeight(): js.Any = js.native
  def getId(): String = js.native
  def getLayer(): js.Any = js.native
  def getLevel(): Double = js.native
  def getListening(): js.Any = js.native
  def getName(): String = js.native
  def getOffset(): Vector2d = js.native
  def getOpacity(): Double = js.native
  def getParent(): js.Any = js.native
  def getPosition(): Vector2d = js.native
  def getRotation(): Double = js.native
  def getRotationDeg(): Double = js.native
  def getScale(): Vector2d = js.native
  def getScaleX(): Double = js.native
  def getScaleY(): Double = js.native
  def getSize(): ISize = js.native
  def getStage(): IStage = js.native
  def getTransform(): js.Any = js.native
  def getWidth(): js.Any = js.native
  def getX(): Double = js.native
  def getY(): Double = js.native
  def getZIndex(): Double = js.native
  def height(): Double = js.native
  def height(height: Double): Unit = js.native
  def hide(): Unit = js.native
  // id
  def id(): String = js.native
  def id(id: String): Unit = js.native
  def isDraggable(): Boolean = js.native
  def isDragging(): Boolean = js.native
  def isListening(): Boolean = js.native
  def move(change: X): Unit = js.native
  def moveDown(): Unit = js.native
  def moveTo(newContainer: IContainer): Unit = js.native
  def moveToBottom(): Unit = js.native
  def moveToTop(): Unit = js.native
  def moveUp(): Unit = js.native
  def name(): String = js.native
  def name(name: String): Unit = js.native
  def off(typesStr: String): Unit = js.native
  // Events
  def on(typesStr: String, handler: js.Function1[/* data */ js.Any, _]): Unit = js.native
  def remove(): js.Any = js.native
  def rotate(theta: Double): Unit = js.native
  def rotateDeg(deg: Double): Unit = js.native
  def setAbsolutePosition(pos: Vector2d): Unit = js.native
  def setAttrs(config: js.Any): Unit = js.native
  def setDefaultAttrs(config: js.Any): Unit = js.native
  def setDragBounds(bounds: js.Any): Unit = js.native
  def setDragConstraint(constraint: String): Unit = js.native
  def setDraggable(draggable: Boolean): Unit = js.native
  def setHeight(height: Double): js.Any = js.native
  def setId(id: String): Unit = js.native
  def setListening(listening: Boolean): Unit = js.native
  def setOffset(offset: Vector2d): js.Any = js.native
  def setOpacity(opacity: js.Any): Unit = js.native
  def setPosition(position: Vector2d): Unit = js.native
  def setRotation(theta: Double): Unit = js.native
  def setRotationDeg(rotDeg: Double): Unit = js.native
  def setScale(scale: Vector2d): Unit = js.native
  def setScaleX(scale: Double): Unit = js.native
  def setScaleY(scale: Double): Unit = js.native
  def setSize(size: ISize): js.Any = js.native
  def setWidth(width: Double): Unit = js.native
  def setX(x: Double): Unit = js.native
  def setY(y: Double): Unit = js.native
  def setZIndex(zIndex: Double): Unit = js.native
  def show(): Unit = js.native
  def simulate(eventType: String): Unit = js.native
  def toDataURL(config: js.Any): Unit = js.native
  def transitionTo(config: js.Any): Unit = js.native
  // Width / Height
  def width(): Double = js.native
  def width(width: Double): Unit = js.native
  // Position
  def x(): Double = js.native
  def x(x: Double): Unit = js.native
  def y(): Double = js.native
  def y(y: Double): Unit = js.native
}

