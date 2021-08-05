package typings.jointjs.mod.g

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jointjs", "g.Ellipse")
@js.native
class Ellipse protected () extends StObject {
  def this(ellipse: Ellipse) = this()
  def this(center: String, a: Double, b: Double) = this()
  def this(center: PlainPoint, a: Double, b: Double) = this()
  
  var a: Double = js.native
  
  var b: Double = js.native
  
  def bbox(): Rect = js.native
  
  def center(): Point = js.native
  
  def containsPoint(p: PlainPoint): Boolean = js.native
  
  def equals(ellipse: Ellipse): Boolean = js.native
  
  def inflate(): this.type = js.native
  def inflate(dx: Double): this.type = js.native
  def inflate(dx: Double, dy: Double): this.type = js.native
  def inflate(dx: Unit, dy: Double): this.type = js.native
  
  def intersectionWithLine(l: Line): js.Array[Point] | Null = js.native
  
  def intersectionWithLineFromCenterToPoint(p: PlainPoint): Point = js.native
  def intersectionWithLineFromCenterToPoint(p: PlainPoint, angle: Double): Point = js.native
  
  def normalizedDistance(point: PlainPoint): Double = js.native
  
  def tangentTheta(p: PlainPoint): Double = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object Ellipse {
  
  @JSImport("jointjs", "g.Ellipse")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def fromRect(rect: PlainRect): Ellipse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRect")(rect.asInstanceOf[js.Any]).asInstanceOf[Ellipse]
}
