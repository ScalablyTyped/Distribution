package typings.jointjs.mod.g

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Segment extends js.Object {
  
   // getter or directly assigned
  def bbox(): Rect | Null = js.native
  
  def closestPoint(p: Point): Point = js.native
  def closestPoint(p: Point, opt: SubdivisionsOpt): Point = js.native
  
  def closestPointLength(p: Point): Double = js.native
  def closestPointLength(p: Point, opt: SubdivisionsOpt): Double = js.native
  
  def closestPointNormalizedLength(p: Point): Double = js.native
  def closestPointNormalizedLength(p: Point, opt: SubdivisionsOpt): Double = js.native
  
  def closestPointT(p: Point): Double = js.native
  
  def closestPointTangent(p: Point): Line | Null = js.native
  
  def divideAt(ratio: Double): js.Tuple2[Segment, Segment] = js.native
  def divideAt(ratio: Double, opt: SubdivisionsOpt): js.Tuple2[Segment, Segment] = js.native
  
  def divideAtLength(length: Double): js.Tuple2[Segment, Segment] = js.native
  def divideAtLength(length: Double, opt: SubdivisionsOpt): js.Tuple2[Segment, Segment] = js.native
  
  def divideAtT(t: Double): js.Tuple2[Segment, Segment] = js.native
  
   // getter, `never` for Moveto
  var end: Point | Null = js.native
  
  def equals(segment: Segment): Boolean = js.native
  
  def getSubdivisions(): js.Array[Curve] = js.native
  
  def isDifferentiable(): Boolean = js.native
  
  var isSegment: Boolean = js.native
  
  var isSubpathStart: Boolean = js.native
  
  var isVisible: Boolean = js.native
  
  def length(): Double = js.native
  
  def lengthAtT(t: Double): Double = js.native
  def lengthAtT(t: Double, opt: PrecisionOpt): Double = js.native
  
  var nextSegment: Segment | Null = js.native
  
  def pointAt(ratio: Double): Point = js.native
  
  def pointAtLength(length: Double): Point = js.native
  
  def pointAtT(t: Double): Point = js.native
  
  var previousSegment: Segment | Null = js.native
  
  def scale(sx: Double, sy: Double): this.type = js.native
  def scale(sx: Double, sy: Double, origin: PlainPoint): this.type = js.native
  
  def serialize(): String = js.native
  
  var start: Point | Null | scala.Nothing = js.native
  
  var subpathStartSegment: Segment | Null = js.native
  
  def tangentAt(ratio: Double): Line | Null = js.native
  
  def tangentAtLength(length: Double): Line | Null = js.native
  
  def tangentAtT(t: Double): Line | Null = js.native
  
  def translate(): this.type = js.native
  def translate(tx: js.UndefOr[scala.Nothing], ty: Double): this.type = js.native
  def translate(tx: Double): this.type = js.native
  def translate(tx: Double, ty: Double): this.type = js.native
  def translate(tx: PlainPoint): this.type = js.native
  
  var `type`: SegmentType = js.native
}
