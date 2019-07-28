package typings.leaflet.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Transformation")
@js.native
class Transformation protected () extends js.Object {
  def this(a: Double, b: Double, c: Double, d: Double) = this()
  def transform(point: Point): Point = js.native
  def transform(point: Point, scale: Double): Point = js.native
  def untransform(point: Point): Point = js.native
  def untransform(point: Point, scale: Double): Point = js.native
}

