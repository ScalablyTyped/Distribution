package typings.jointjs.mod.g

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jointjs", "g.Curve")
@js.native
class Curve protected () extends _PathObjectUnit {
  def this(curve: Curve) = this()
  def this(p1: String, p2: String, p3: String, p4: String) = this()
  def this(p1: String, p2: String, p3: String, p4: PlainPoint) = this()
  def this(p1: String, p2: String, p3: PlainPoint, p4: String) = this()
  def this(p1: String, p2: String, p3: PlainPoint, p4: PlainPoint) = this()
  def this(p1: String, p2: PlainPoint, p3: String, p4: String) = this()
  def this(p1: String, p2: PlainPoint, p3: String, p4: PlainPoint) = this()
  def this(p1: String, p2: PlainPoint, p3: PlainPoint, p4: String) = this()
  def this(p1: String, p2: PlainPoint, p3: PlainPoint, p4: PlainPoint) = this()
  def this(p1: PlainPoint, p2: String, p3: String, p4: String) = this()
  def this(p1: PlainPoint, p2: String, p3: String, p4: PlainPoint) = this()
  def this(p1: PlainPoint, p2: String, p3: PlainPoint, p4: String) = this()
  def this(p1: PlainPoint, p2: String, p3: PlainPoint, p4: PlainPoint) = this()
  def this(p1: PlainPoint, p2: PlainPoint, p3: String, p4: String) = this()
  def this(p1: PlainPoint, p2: PlainPoint, p3: String, p4: PlainPoint) = this()
  def this(p1: PlainPoint, p2: PlainPoint, p3: PlainPoint, p4: String) = this()
  def this(p1: PlainPoint, p2: PlainPoint, p3: PlainPoint, p4: PlainPoint) = this()
  var controlPoint1: Point = js.native
  var controlPoint2: Point = js.native
  var end: Point = js.native
  var start: Point = js.native
  def bbox(): Rect = js.native
  def closestPoint(p: PlainPoint): Point = js.native
  def closestPoint(p: PlainPoint, opt: SubdivisionsOpt): Point = js.native
  def closestPointLength(p: PlainPoint): Double = js.native
  def closestPointLength(p: PlainPoint, opt: SubdivisionsOpt): Double = js.native
  def closestPointNormalizedLength(p: PlainPoint): Double = js.native
  def closestPointNormalizedLength(p: PlainPoint, opt: SubdivisionsOpt): Double = js.native
  def closestPointT(p: PlainPoint): Double = js.native
  def closestPointT(p: PlainPoint, opt: SubdivisionsOpt): Double = js.native
  def closestPointTangent(p: PlainPoint): Line | Null = js.native
  def closestPointTangent(p: PlainPoint, opt: SubdivisionsOpt): Line | Null = js.native
  def containsPoint(p: PlainPoint): Boolean = js.native
  def containsPoint(p: PlainPoint, opt: SubdivisionsOpt): Boolean = js.native
  def divide(t: Double): js.Tuple2[Curve, Curve] = js.native
  def divideAt(ratio: Double): js.Tuple2[Curve, Curve] = js.native
  def divideAt(ratio: Double, opt: SubdivisionsOpt): js.Tuple2[Curve, Curve] = js.native
  def divideAtLength(length: Double): js.Tuple2[Curve, Curve] = js.native
  def divideAtLength(length: Double, opt: SubdivisionsOpt): js.Tuple2[Curve, Curve] = js.native
  def divideAtT(t: Double): js.Tuple2[Curve, Curve] = js.native
   // alias to `divideAtT`
  def endpointDistance(): Double = js.native
  def equals(c: Curve): Boolean = js.native
  def getSkeletonPoints(t: Double): js.Tuple5[Point, Point, Point, Point, Point] = js.native
  def getSubdivisions(): js.Array[Curve] = js.native
  def getSubdivisions(opt: PrecisionOpt): js.Array[Curve] = js.native
  def isDifferentiable(): Boolean = js.native
  def length(): Double = js.native
  def length(opt: SubdivisionsOpt): Double = js.native
  def lengthAtT(t: Double): Double = js.native
  def lengthAtT(t: Double, opt: PrecisionOpt): Double = js.native
  def pointAt(ratio: Double): Point = js.native
  def pointAt(ratio: Double, opt: SubdivisionsOpt): Point = js.native
  def pointAtLength(length: Double): Point = js.native
  def pointAtLength(length: Double, opt: SubdivisionsOpt): Point = js.native
  def pointAtT(t: Double): Point = js.native
  def scale(sx: Double, sy: Double): this.type = js.native
  def scale(sx: Double, sy: Double, origin: String): this.type = js.native
  def scale(sx: Double, sy: Double, origin: PlainPoint): this.type = js.native
  def tAt(ratio: Double): Double = js.native
  def tAt(ratio: Double, opt: SubdivisionsOpt): Double = js.native
  def tAtLength(length: Double): Double = js.native
  def tAtLength(length: Double, opt: SubdivisionsOpt): Double = js.native
  def tangentAt(ratio: Double): Line | Null = js.native
  def tangentAt(ratio: Double, opt: SubdivisionsOpt): Line | Null = js.native
  def tangentAtLength(length: Double): Line | Null = js.native
  def tangentAtLength(length: Double, opt: SubdivisionsOpt): Line | Null = js.native
  def tangentAtT(t: Double): Line | Null = js.native
  def toPoints(): js.Array[Point] = js.native
  def toPoints(opt: SubdivisionsOpt): js.Array[Point] = js.native
  def toPolyline(): Polyline = js.native
  def toPolyline(opt: SubdivisionsOpt): Polyline = js.native
  def translate(): this.type = js.native
  def translate(tx: js.UndefOr[scala.Nothing], ty: Double): this.type = js.native
  def translate(tx: Double): this.type = js.native
  def translate(tx: Double, ty: Double): this.type = js.native
  def translate(tx: PlainPoint): this.type = js.native
}

/* static members */
@JSImport("jointjs", "g.Curve")
@js.native
object Curve extends js.Object {
  def throughPoints(points: js.Array[PlainPoint]): js.Array[Curve] = js.native
}

