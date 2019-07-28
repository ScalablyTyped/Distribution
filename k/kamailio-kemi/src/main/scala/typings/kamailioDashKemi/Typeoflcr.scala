package typings.kamailioDashKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeoflcr extends js.Object {
  def defunct_gw(defunct_period: Double): Double
  def from_any_gw(): Double
  def from_any_gw_addr(addr_str: String, transport: Double): Double
  def from_gw(lcr_id: Double): Double
  def from_gw_addr(lcr_id: Double, addr_str: String, transport: Double): Double
  def inactivate_gw(): Double
  def load_gws(lcr_id: Double): Double
  def load_gws_furi(lcr_id: Double, ruri_user: String, from_uri: String): Double
  def load_gws_ruser(lcr_id: Double, ruri_user: String): Double
  def next_gw(): Double
  def to_any_gw(): Double
  def to_any_gw_addr(addr_str: String, transport: Double): Double
  def to_gw(lcr_id: Double): Double
  def to_gw_addr(lcr_id: Double, addr_str: String, transport: Double): Double
}

object Typeoflcr {
  @scala.inline
  def apply(
    defunct_gw: Double => Double,
    from_any_gw: () => Double,
    from_any_gw_addr: (String, Double) => Double,
    from_gw: Double => Double,
    from_gw_addr: (Double, String, Double) => Double,
    inactivate_gw: () => Double,
    load_gws: Double => Double,
    load_gws_furi: (Double, String, String) => Double,
    load_gws_ruser: (Double, String) => Double,
    next_gw: () => Double,
    to_any_gw: () => Double,
    to_any_gw_addr: (String, Double) => Double,
    to_gw: Double => Double,
    to_gw_addr: (Double, String, Double) => Double
  ): Typeoflcr = {
    val __obj = js.Dynamic.literal(defunct_gw = js.Any.fromFunction1(defunct_gw), from_any_gw = js.Any.fromFunction0(from_any_gw), from_any_gw_addr = js.Any.fromFunction2(from_any_gw_addr), from_gw = js.Any.fromFunction1(from_gw), from_gw_addr = js.Any.fromFunction3(from_gw_addr), inactivate_gw = js.Any.fromFunction0(inactivate_gw), load_gws = js.Any.fromFunction1(load_gws), load_gws_furi = js.Any.fromFunction3(load_gws_furi), load_gws_ruser = js.Any.fromFunction2(load_gws_ruser), next_gw = js.Any.fromFunction0(next_gw), to_any_gw = js.Any.fromFunction0(to_any_gw), to_any_gw_addr = js.Any.fromFunction2(to_any_gw_addr), to_gw = js.Any.fromFunction1(to_gw), to_gw_addr = js.Any.fromFunction3(to_gw_addr))
  
    __obj.asInstanceOf[Typeoflcr]
  }
}

