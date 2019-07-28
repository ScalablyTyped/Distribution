package typings.hat.hatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hat extends js.Object {
  @JSName("rack")
  var rack_Original: CreateRack = js.native
  def apply(): String = js.native
  def apply(bits: Double): String = js.native
  def apply(bits: Double, base: Double): String = js.native
  def rack(): Rack = js.native
  def rack(bits: Double): Rack = js.native
  def rack(bits: Double, base: Double): Rack = js.native
  def rack(bits: Double, base: Double, expandBy: Double): Rack = js.native
}

