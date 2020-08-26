package typings.jointjs.mod.g

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jointjs", "g.Line")
@js.native
class Line () extends _PathObjectUnit {
  def this(line: Line) = this()
  def this(p1: String, p2: String) = this()
  def this(p1: String, p2: PlainPoint) = this()
  def this(p1: PlainPoint, p2: String) = this()
  def this(p1: PlainPoint, p2: PlainPoint) = this()
  var end: Point = js.native
  var start: Point = js.native
  def angle(): Double = js.native
  def bbox(): Rect = js.native
  def bearing(): CardinalDirection = js.native
  def closestPoint(p: String): Point = js.native
  def closestPoint(p: PlainPoint): Point = js.native
  def closestPointLength(p: String): Double = js.native
  def closestPointLength(p: PlainPoint): Double = js.native
  def closestPointNormalizedLength(p: String): Double = js.native
  def closestPointNormalizedLength(p: PlainPoint): Double = js.native
  def closestPointTangent(p: String): Line | Null = js.native
  def closestPointTangent(p: PlainPoint): Line | Null = js.native
  def containsPoint(p: PlainPoint): Boolean = js.native
  def divideAt(t: Double): js.Tuple2[Line, Line] = js.native
  def divideAtLength(length: Double): js.Tuple2[Line, Line] = js.native
  def equals(line: Line): Boolean = js.native
  def intersect(ellipse: Ellipse): js.Array[Point] | Null = js.native
  def intersect(line: Line): Point | Null = js.native
  def intersect(path: Path): js.Array[Point] | Null = js.native
  def intersect(path: Path, opt: SegmentSubdivisionsOpt): js.Array[Point] | Null = js.native
  def intersect(polyline: Polyline): js.Array[Point] | Null = js.native
   // Backwards compatibility, should return an array
  def intersect(rect: Rect): js.Array[Point] | Null = js.native
  def intersectionWithLine(l: Line): js.Array[Point] | Null = js.native
  def isDifferentiable(): Boolean = js.native
  def length(): Double = js.native
  def midpoint(): Point = js.native
  def parallel(): Line = js.native
  def pointAt(t: Double): Point = js.native
  def pointAtLength(length: Double): Point = js.native
  def pointOffset(p: String): Double = js.native
  def pointOffset(p: PlainPoint): Double = js.native
  def rotate(origin: PlainPoint, angle: Double): this.type = js.native
  def round(): this.type = js.native
  def round(precision: Double): this.type = js.native
  def scale(sx: Double, sy: Double): this.type = js.native
  def scale(sx: Double, sy: Double, origin: PlainPoint): this.type = js.native
  def serialize(): String = js.native
  def setLength(length: Double): this.type = js.native
  def squaredLength(): Double = js.native
  def tangentAt(t: Double): Line | Null = js.native
  def tangentAtLength(length: Double): Line | Null = js.native
  def translate(): this.type = js.native
  def translate(tx: js.UndefOr[scala.Nothing], ty: Double): this.type = js.native
  def translate(tx: Double): this.type = js.native
  def translate(tx: Double, ty: Double): this.type = js.native
  def translate(tx: PlainPoint): this.type = js.native
  def vector(): Point = js.native
}

