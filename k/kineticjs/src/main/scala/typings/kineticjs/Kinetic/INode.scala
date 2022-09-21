package typings.kineticjs.Kinetic

import typings.kineticjs.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INode extends StObject {
  
  def cache(): INode = js.native
  def cache(cacheConfig: Any): INode = js.native
  
  def clone(attrs: Any): INode = js.native
  
  def destroy(): Unit = js.native
  
  def draw(): INode = js.native
  
  def drawBuffer(): Any = js.native
  
  def drawScene(): Any = js.native
  
  def fire(typeStr: String): Any = js.native
  def fire(typeStr: String, event: Any): Any = js.native
  def fire(typeStr: String, event: Any, bubble: Boolean): Any = js.native
  def fire(typeStr: String, event: Unit, bubble: Boolean): Any = js.native
  
  def getAbsoluteOpacity(): Double = js.native
  
  def getAbsolutePosition(): Vector2d = js.native
  
  def getAbsoluteTransform(): Any = js.native
  
  def getAbsoluteZIndex(): Double = js.native
  
  def getAttrs(): Any = js.native
  
  def getDragBounds(): Any = js.native
  
  def getDragConstraint(): Any = js.native
  
  def getDraggable(): Boolean = js.native
  
  def getHeight(): Any = js.native
  
  def getId(): String = js.native
  
  def getLayer(): Any = js.native
  
  def getLevel(): Double = js.native
  
  def getListening(): Any = js.native
  
  def getName(): String = js.native
  
  def getOffset(): Vector2d = js.native
  
  def getOpacity(): Double = js.native
  
  def getParent(): Any = js.native
  
  def getPosition(): Vector2d = js.native
  
  def getRotation(): Double = js.native
  
  def getRotationDeg(): Double = js.native
  
  def getScale(): Vector2d = js.native
  
  def getScaleX(): Double = js.native
  
  def getScaleY(): Double = js.native
  
  def getSize(): ISize = js.native
  
  def getStage(): IStage = js.native
  
  def getTransform(): Any = js.native
  
  def getWidth(): Any = js.native
  
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
  def on(typesStr: String, handler: js.Function1[/* data */ Any, Any]): Unit = js.native
  
  def remove(): Any = js.native
  
  def rotate(theta: Double): Unit = js.native
  
  def rotateDeg(deg: Double): Unit = js.native
  
  def setAbsolutePosition(pos: Vector2d): Unit = js.native
  
  def setAttrs(config: Any): Unit = js.native
  
  def setDefaultAttrs(config: Any): Unit = js.native
  
  def setDragBounds(bounds: Any): Unit = js.native
  
  def setDragConstraint(constraint: String): Unit = js.native
  
  def setDraggable(draggable: Boolean): Unit = js.native
  
  def setHeight(height: Double): Any = js.native
  
  def setId(id: String): Unit = js.native
  
  def setListening(listening: Boolean): Unit = js.native
  
  def setOffset(offset: Vector2d): Any = js.native
  
  def setOpacity(opacity: Any): Unit = js.native
  
  def setPosition(position: Vector2d): Unit = js.native
  
  def setRotation(theta: Double): Unit = js.native
  
  def setRotationDeg(rotDeg: Double): Unit = js.native
  
  def setScale(scale: Vector2d): Unit = js.native
  
  def setScaleX(scale: Double): Unit = js.native
  
  def setScaleY(scale: Double): Unit = js.native
  
  def setSize(size: ISize): Any = js.native
  
  def setWidth(width: Double): Unit = js.native
  
  def setX(x: Double): Unit = js.native
  
  def setY(y: Double): Unit = js.native
  
  def setZIndex(zIndex: Double): Unit = js.native
  
  def show(): Unit = js.native
  
  def simulate(eventType: String): Unit = js.native
  
  def toDataURL(config: Any): Unit = js.native
  
  def transitionTo(config: Any): Unit = js.native
  
  // Width / Height
  def width(): Double = js.native
  def width(width: Double): Unit = js.native
  
  // Position
  def x(): Double = js.native
  def x(x: Double): Unit = js.native
  
  def y(): Double = js.native
  def y(y: Double): Unit = js.native
}
