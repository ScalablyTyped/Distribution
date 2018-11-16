package typings
package kineticjsLib.KineticNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INode extends js.Object {
  def cache(): INode = js.native
  def cache(cacheConfig: js.Any): INode = js.native
  def clone(attrs: js.Any): INode = js.native
  def destroy(): scala.Unit = js.native
  def draw(): INode = js.native
  def drawBuffer(): js.Any = js.native
  def drawScene(): js.Any = js.native
  def fire(typeStr: java.lang.String): js.Any = js.native
  def fire(typeStr: java.lang.String, event: js.Any): js.Any = js.native
  def fire(typeStr: java.lang.String, event: js.Any, bubble: scala.Boolean): js.Any = js.native
  def getAbsoluteOpacity(): scala.Double = js.native
  def getAbsolutePosition(): Vector2d = js.native
  def getAbsoluteTransform(): js.Any = js.native
  def getAbsoluteZIndex(): scala.Double = js.native
  def getAttrs(): js.Any = js.native
  def getDragBounds(): js.Any = js.native
  def getDragConstraint(): js.Any = js.native
  def getDraggable(): scala.Boolean = js.native
  def getHeight(): js.Any = js.native
  def getId(): java.lang.String = js.native
  def getLayer(): js.Any = js.native
  def getLevel(): scala.Double = js.native
  def getListening(): js.Any = js.native
  def getName(): java.lang.String = js.native
  def getOffset(): Vector2d = js.native
  def getOpacity(): scala.Double = js.native
  def getParent(): js.Any = js.native
  def getPosition(): Vector2d = js.native
  def getRotation(): scala.Double = js.native
  def getRotationDeg(): scala.Double = js.native
  def getScale(): Vector2d = js.native
  def getScaleX(): scala.Double = js.native
  def getScaleY(): scala.Double = js.native
  def getSize(): ISize = js.native
  def getStage(): IStage = js.native
  def getTransform(): js.Any = js.native
  def getWidth(): js.Any = js.native
  def getX(): scala.Double = js.native
  def getY(): scala.Double = js.native
  def getZIndex(): scala.Double = js.native
  def height(): scala.Double = js.native
  def height(height: scala.Double): scala.Unit = js.native
  def hide(): scala.Unit = js.native
  // id
  def id(): java.lang.String = js.native
  def id(id: java.lang.String): scala.Unit = js.native
  def isDraggable(): scala.Boolean = js.native
  def isDragging(): scala.Boolean = js.native
  def isListening(): scala.Boolean = js.native
  def move(change: kineticjsLib.Anon_Y): scala.Unit = js.native
  def moveDown(): scala.Unit = js.native
  def moveTo(newContainer: IContainer): scala.Unit = js.native
  def moveToBottom(): scala.Unit = js.native
  def moveToTop(): scala.Unit = js.native
  def moveUp(): scala.Unit = js.native
  def name(): java.lang.String = js.native
  def name(name: java.lang.String): scala.Unit = js.native
  def off(typesStr: java.lang.String): scala.Unit = js.native
  // Events
  def on(typesStr: java.lang.String, handler: js.Function1[/* data */ js.Any, _]): scala.Unit = js.native
  def remove(): js.Any = js.native
  def rotate(theta: scala.Double): scala.Unit = js.native
  def rotateDeg(deg: scala.Double): scala.Unit = js.native
  def setAbsolutePosition(pos: Vector2d): scala.Unit = js.native
  def setAttrs(config: js.Any): scala.Unit = js.native
  def setDefaultAttrs(config: js.Any): scala.Unit = js.native
  def setDragBounds(bounds: js.Any): scala.Unit = js.native
  def setDragConstraint(constraint: java.lang.String): scala.Unit = js.native
  def setDraggable(draggable: scala.Boolean): scala.Unit = js.native
  def setHeight(height: scala.Double): js.Any = js.native
  def setId(id: java.lang.String): scala.Unit = js.native
  def setListening(listening: scala.Boolean): scala.Unit = js.native
  def setOffset(offset: Vector2d): js.Any = js.native
  def setOpacity(opacity: js.Any): scala.Unit = js.native
  def setPosition(position: Vector2d): scala.Unit = js.native
  def setRotation(theta: scala.Double): scala.Unit = js.native
  def setRotationDeg(rotDeg: scala.Double): scala.Unit = js.native
  def setScale(scale: Vector2d): scala.Unit = js.native
  def setScaleX(scale: scala.Double): scala.Unit = js.native
  def setScaleY(scale: scala.Double): scala.Unit = js.native
  def setSize(size: ISize): js.Any = js.native
  def setWidth(width: scala.Double): scala.Unit = js.native
  def setX(x: scala.Double): scala.Unit = js.native
  def setY(y: scala.Double): scala.Unit = js.native
  def setZIndex(zIndex: scala.Double): scala.Unit = js.native
  def show(): scala.Unit = js.native
  def simulate(eventType: java.lang.String): scala.Unit = js.native
  def toDataURL(config: js.Any): scala.Unit = js.native
  def transitionTo(config: js.Any): scala.Unit = js.native
  // Width / Height
  def width(): scala.Double = js.native
  def width(width: scala.Double): scala.Unit = js.native
  // Position
  def x(): scala.Double = js.native
  def x(x: scala.Double): scala.Unit = js.native
  def y(): scala.Double = js.native
  def y(y: scala.Double): scala.Unit = js.native
}

