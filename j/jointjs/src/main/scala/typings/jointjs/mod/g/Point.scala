package typings.jointjs.mod.g

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jointjs", "g.Point")
@js.native
class Point ()
  extends StObject
     with PlainPoint {
  def this(p: String) = this()
  def this(p: PlainPoint) = this()
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Unit, y: Double) = this()
  
  def adhereToRect(r: Rect): this.type = js.native
  
  def angleBetween(p1: PlainPoint, p2: PlainPoint): Double = js.native
  
  def bearing(p: Point): CardinalDirection = js.native
  
  def changeInAngle(dx: Double, dy: Double, ref: String): Double = js.native
  def changeInAngle(dx: Double, dy: Double, ref: PlainPoint): Double = js.native
  
  def chooseClosest(points: js.Array[PlainPoint]): Point | Null = js.native
  
  def cross(p1: PlainPoint, p2: PlainPoint): Double = js.native
  
  def difference(): Point = js.native
  def difference(dx: Double): Point = js.native
  def difference(dx: Double, dy: Double): Point = js.native
  def difference(dx: Unit, dy: Double): Point = js.native
  def difference(p: PlainPoint): Point = js.native
  
  def distance(p: String): Double = js.native
  def distance(p: PlainPoint): Double = js.native
  
  def dot(p: PlainPoint): Double = js.native
  
  def equals(p: Point): Boolean = js.native
  
  def lerp(p: Point, t: Double): Point = js.native
  
  def magnitude(): Double = js.native
  
  def manhattanDistance(p: PlainPoint): Double = js.native
  
  def move(ref: String, distance: Double): this.type = js.native
  def move(ref: PlainPoint, distance: Double): this.type = js.native
  
  def normalize(length: Double): this.type = js.native
  
  def offset(): this.type = js.native
  def offset(dx: Double): this.type = js.native
  def offset(dx: Double, dy: Double): this.type = js.native
  def offset(dx: Unit, dy: Double): this.type = js.native
  def offset(p: PlainPoint): this.type = js.native
  
  def reflection(ref: String): Point = js.native
  def reflection(ref: PlainPoint): Point = js.native
  
  def rotate(origin: String, angle: Double): this.type = js.native
  def rotate(origin: PlainPoint, angle: Double): this.type = js.native
  
  def round(): this.type = js.native
  def round(precision: Double): this.type = js.native
  
  def scale(sx: Double, sy: Double): this.type = js.native
  def scale(sx: Double, sy: Double, origin: String): this.type = js.native
  def scale(sx: Double, sy: Double, origin: PlainPoint): this.type = js.native
  
  def serialize(): String = js.native
  
  def snapToGrid(gx: Double): this.type = js.native
  def snapToGrid(gx: Double, gy: Double): this.type = js.native
  
  def squaredDistance(p: String): Double = js.native
  def squaredDistance(p: PlainPoint): Double = js.native
  
  def theta(p: String): Double = js.native
  def theta(p: PlainPoint): Double = js.native
  
  def toJSON(): PlainPoint = js.native
  
  def toPolar(): this.type = js.native
  def toPolar(origin: String): this.type = js.native
  def toPolar(origin: PlainPoint): this.type = js.native
  
  def translate(): this.type = js.native
  def translate(tx: Double): this.type = js.native
  def translate(tx: Double, ty: Double): this.type = js.native
  def translate(tx: Unit, ty: Double): this.type = js.native
  def translate(tx: PlainPoint): this.type = js.native
  
  def update(): this.type = js.native
  def update(x: Double): this.type = js.native
  def update(x: Double, y: Double): this.type = js.native
  def update(x: Unit, y: Double): this.type = js.native
  
  def vectorAngle(p: PlainPoint): Double = js.native
  
  /* CompleteClass */
  var x: Double = js.native
  
  /* CompleteClass */
  var y: Double = js.native
}
object Point {
  
  @JSImport("jointjs", "g.Point")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def fromPolar(distance: Double, angle: Double): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPolar")(distance.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[Point]
  @scala.inline
  def fromPolar(distance: Double, angle: Double, origin: String): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPolar")(distance.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Point]
  @scala.inline
  def fromPolar(distance: Double, angle: Double, origin: PlainPoint): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPolar")(distance.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Point]
  
  /* static member */
  @scala.inline
  def random(x1: Double, x2: Double, y1: Double, y2: Double): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("random")(x1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[Point]
}
