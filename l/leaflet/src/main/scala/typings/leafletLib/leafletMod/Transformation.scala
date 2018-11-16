package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Transformation")
@js.native
class Transformation protected () extends js.Object {
  def this(a: scala.Double, b: scala.Double, c: scala.Double, d: scala.Double) = this()
  def transform(point: Point): Point = js.native
  def transform(point: Point, scale: scala.Double): Point = js.native
  def untransform(point: Point): Point = js.native
  def untransform(point: Point, scale: scala.Double): Point = js.native
}

