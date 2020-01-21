package typings.leaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Transformation")
@js.native
class Transformation protected () extends js.Object {
  def this(a: Double, b: Double, c: Double, d: Double) = this()
  def transform(point: Point_): Point_ = js.native
  def transform(point: Point_, scale: Double): Point_ = js.native
  def untransform(point: Point_): Point_ = js.native
  def untransform(point: Point_, scale: Double): Point_ = js.native
}

