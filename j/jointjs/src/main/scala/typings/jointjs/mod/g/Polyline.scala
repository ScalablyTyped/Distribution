package typings.jointjs.mod.g

import typings.jointjs.anon.Threshold
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jointjs", "g.Polyline")
@js.native
// getter
class Polyline () extends StObject {
  def this(points: js.Array[Point]) = this()
  def this(svgString: String) = this()
  
  def bbox(): Rect | Null = js.native
  
  def closestPoint(p: String): Point | Null = js.native
  def closestPoint(p: PlainPoint): Point | Null = js.native
  
  def closestPointLength(p: String): Double = js.native
  def closestPointLength(p: PlainPoint): Double = js.native
  
  def closestPointNormalizedLength(p: String): Double = js.native
  def closestPointNormalizedLength(p: PlainPoint): Double = js.native
  
  def closestPointTangent(p: String): Line | Null = js.native
  def closestPointTangent(p: PlainPoint): Line | Null = js.native
  
  def containsPoint(p: PlainPoint): Boolean = js.native
  
  def convexHull(): Polyline = js.native
  
  // getter
  var end: Point | Null = js.native
  
  def equals(p: Polyline): Boolean = js.native
  
  def intersectionWithLine(l: Line): js.Array[Point] | Null = js.native
  
  def isDifferentiable(): Boolean = js.native
  
  def length(): Double = js.native
  
  def pointAt(ratio: Double): Point | Null = js.native
  
  def pointAtLength(length: Double): Point | Null = js.native
  
  var points: js.Array[Point] = js.native
  
  def scale(sx: Double, sy: Double): this.type = js.native
  def scale(sx: Double, sy: Double, origin: String): this.type = js.native
  def scale(sx: Double, sy: Double, origin: PlainPoint): this.type = js.native
  
  def serialize(): String = js.native
  
  def simplify(): this.type = js.native
  def simplify(opt: Threshold): this.type = js.native
  
  var start: Point | Null = js.native
  
  def tangentAt(ratio: Double): Line | Null = js.native
  
  def tangentAtLength(length: Double): Line | Null = js.native
  
  def translate(): this.type = js.native
  def translate(tx: Double): this.type = js.native
  def translate(tx: Double, ty: Double): this.type = js.native
  def translate(tx: Unit, ty: Double): this.type = js.native
  def translate(tx: PlainPoint): this.type = js.native
}
object Polyline {
  
  @JSImport("jointjs", "g.Polyline")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def parse(svgString: String): Polyline = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(svgString.asInstanceOf[js.Any]).asInstanceOf[Polyline]
}
