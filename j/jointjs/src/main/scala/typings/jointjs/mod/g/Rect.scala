package typings.jointjs.mod.g

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jointjs", "g.Rect")
@js.native
class Rect ()
  extends StObject
     with PlainRect {
  def this(r: PlainRect) = this()
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Unit, y: Double) = this()
  def this(x: Double, y: Double, width: Double) = this()
  def this(x: Double, y: Unit, width: Double) = this()
  def this(x: Unit, y: Double, width: Double) = this()
  def this(x: Unit, y: Unit, width: Double) = this()
  def this(x: Double, y: Double, width: Double, height: Double) = this()
  def this(x: Double, y: Double, width: Unit, height: Double) = this()
  def this(x: Double, y: Unit, width: Double, height: Double) = this()
  def this(x: Double, y: Unit, width: Unit, height: Double) = this()
  def this(x: Unit, y: Double, width: Double, height: Double) = this()
  def this(x: Unit, y: Double, width: Unit, height: Double) = this()
  def this(x: Unit, y: Unit, width: Double, height: Double) = this()
  def this(x: Unit, y: Unit, width: Unit, height: Double) = this()
  
  def bbox(): Rect = js.native
  def bbox(angle: Double): Rect = js.native
  
  def bottomLeft(): Point = js.native
  
  def bottomLine(): Line = js.native
  
  def bottomMiddle(): Point = js.native
  
  def bottomRight(): Point = js.native
  
  def center(): Point = js.native
  
  def containsPoint(p: String): Boolean = js.native
  def containsPoint(p: PlainPoint): Boolean = js.native
  
  def containsRect(r: PlainRect): Boolean = js.native
  
  def corner(): Point = js.native
  
  def equals(r: PlainRect): Boolean = js.native
  
  /* CompleteClass */
  var height: Double = js.native
  
  def inflate(): this.type = js.native
  def inflate(dx: Double): this.type = js.native
  def inflate(dx: Double, dy: Double): this.type = js.native
  def inflate(dx: Unit, dy: Double): this.type = js.native
  
  def intersect(r: Rect): Rect | Null = js.native
  
  def intersectionWithLine(l: Line): js.Array[Point] | Null = js.native
  
  def intersectionWithLineFromCenterToPoint(p: String): Point = js.native
  def intersectionWithLineFromCenterToPoint(p: String, angle: Double): Point = js.native
  def intersectionWithLineFromCenterToPoint(p: PlainPoint): Point = js.native
  def intersectionWithLineFromCenterToPoint(p: PlainPoint, angle: Double): Point = js.native
  
  def leftLine(): Line = js.native
  
  def leftMiddle(): Point = js.native
  
  def maxRectScaleToFit(rect: PlainRect): Scale_ = js.native
  def maxRectScaleToFit(rect: PlainRect, origin: PlainPoint): Scale_ = js.native
  
  def maxRectUniformScaleToFit(rect: PlainRect): Double = js.native
  def maxRectUniformScaleToFit(rect: PlainRect, origin: PlainPoint): Double = js.native
  
  def moveAndExpand(r: PlainRect): this.type = js.native
  
  def normalize(): this.type = js.native
  
  def offset(): this.type = js.native
  def offset(dx: Double): this.type = js.native
  def offset(dx: Double, dy: Double): this.type = js.native
  def offset(dx: Unit, dy: Double): this.type = js.native
  def offset(p: PlainPoint): this.type = js.native
  
  def origin(): Point = js.native
  
  def pointNearestToPoint(point: String): Point = js.native
  def pointNearestToPoint(point: PlainPoint): Point = js.native
  
  def rightLine(): Line = js.native
  
  def rightMiddle(): Point = js.native
  
  def round(): this.type = js.native
  def round(precision: Double): this.type = js.native
  
  def scale(sx: Double, sy: Double): this.type = js.native
  def scale(sx: Double, sy: Double, origin: String): this.type = js.native
  def scale(sx: Double, sy: Double, origin: PlainPoint): this.type = js.native
  
  def sideNearestToPoint(point: String): RectangleSide = js.native
  def sideNearestToPoint(point: PlainPoint): RectangleSide = js.native
  
  def snapToGrid(gx: Double): this.type = js.native
  def snapToGrid(gx: Double, gy: Double): this.type = js.native
  
  def toJSON(): PlainRect = js.native
  
  def topLeft(): Point = js.native
  
  def topLine(): Line = js.native
  
  def topMiddle(): Point = js.native
  
  def topRight(): Point = js.native
  
  def translate(): this.type = js.native
  def translate(tx: Double): this.type = js.native
  def translate(tx: Double, ty: Double): this.type = js.native
  def translate(tx: Unit, ty: Double): this.type = js.native
  def translate(tx: PlainPoint): this.type = js.native
  
  def union(rect: PlainRect): Rect = js.native
  
  /* CompleteClass */
  var width: Double = js.native
  
  /* CompleteClass */
  var x: Double = js.native
  
  /* CompleteClass */
  var y: Double = js.native
}
object Rect {
  
  @JSImport("jointjs", "g.Rect")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def fromEllipse(e: Ellipse): Rect = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEllipse")(e.asInstanceOf[js.Any]).asInstanceOf[Rect]
}
