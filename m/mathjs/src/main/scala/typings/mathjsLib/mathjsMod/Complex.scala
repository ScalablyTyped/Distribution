package typings
package mathjsLib.mathjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Complex extends _MathType {
  var im: scala.Double = js.native
  var re: scala.Double = js.native
  def compare(a: Complex, b: Complex): scala.Double = js.native
  def equals(other: Complex): scala.Boolean = js.native
  def format(): java.lang.String = js.native
  def format(precision: scala.Double): java.lang.String = js.native
  def fromJSON(json: js.Object): Complex = js.native
  def fromPolar(polar: js.Object): Complex = js.native
  def fromPolar(r: scala.Double, phi: scala.Double): Complex = js.native
  def toJSON(): js.Object = js.native
  def toPolar(): PolarCoordinates = js.native
}

