package typings
package hatLib.hatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hat extends js.Object {
  @JSName("rack")
  var rack_Original: CreateRack = js.native
  def apply(): java.lang.String = js.native
  def apply(bits: scala.Double): java.lang.String = js.native
  def apply(bits: scala.Double, base: scala.Double): java.lang.String = js.native
  def rack(): Rack = js.native
  def rack(bits: scala.Double): Rack = js.native
  def rack(bits: scala.Double, base: scala.Double): Rack = js.native
  def rack(bits: scala.Double, base: scala.Double, expandBy: scala.Double): Rack = js.native
}

