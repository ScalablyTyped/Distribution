package typings.hat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hat extends js.Object {
  
  def apply(): String = js.native
  def apply(bits: js.UndefOr[scala.Nothing], base: Double): String = js.native
  def apply(bits: Double): String = js.native
  def apply(bits: Double, base: Double): String = js.native
  
  def rack(): Rack = js.native
  def rack(bits: js.UndefOr[scala.Nothing], base: js.UndefOr[scala.Nothing], expandBy: Double): Rack = js.native
  def rack(bits: js.UndefOr[scala.Nothing], base: Double): Rack = js.native
  def rack(bits: js.UndefOr[scala.Nothing], base: Double, expandBy: Double): Rack = js.native
  def rack(bits: Double): Rack = js.native
  def rack(bits: Double, base: js.UndefOr[scala.Nothing], expandBy: Double): Rack = js.native
  def rack(bits: Double, base: Double): Rack = js.native
  def rack(bits: Double, base: Double, expandBy: Double): Rack = js.native
  @JSName("rack")
  var rack_Original: CreateRack = js.native
}
