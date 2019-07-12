package typings
package jsqubitsLib.jsqubitsMod.jsqubitsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Complex extends js.Object {
  def add(other: Complex): Complex = js.native
  def add(other: scala.Double): Complex = js.native
  def closeTo(other: Complex): scala.Double = js.native
  def conjugate(): Complex = js.native
  def eql(other: Complex): scala.Boolean = js.native
  def eql(other: scala.Double): scala.Boolean = js.native
  def format(): java.lang.String = js.native
  def format(options: jsqubitsLib.Anon_DecimalPlaces): java.lang.String = js.native
  def imaginary(): scala.Double | Complex = js.native
  def inspect(): java.lang.String = js.native
  def magnitude(): scala.Double = js.native
  def multiply(other: Complex): Complex = js.native
  def multiply(other: scala.Double): Complex = js.native
  def negate(): Complex = js.native
  def phase(): scala.Double = js.native
  def real(): scala.Double | Complex = js.native
  def subtract(other: Complex): Complex = js.native
  def subtract(other: scala.Double): Complex = js.native
}

