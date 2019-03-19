package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Addrstr extends js.Object {
  def defunct_gw(defunct_period: scala.Double): scala.Double
  def from_any_gw(): scala.Double
  def from_any_gw_addr(addr_str: java.lang.String, transport: scala.Double): scala.Double
  def from_gw(lcr_id: scala.Double): scala.Double
  def from_gw_addr(lcr_id: scala.Double, addr_str: java.lang.String, transport: scala.Double): scala.Double
  def inactivate_gw(): scala.Double
  def load_gws(lcr_id: scala.Double): scala.Double
  def load_gws_furi(lcr_id: scala.Double, ruri_user: java.lang.String, from_uri: java.lang.String): scala.Double
  def load_gws_ruser(lcr_id: scala.Double, ruri_user: java.lang.String): scala.Double
  def next_gw(): scala.Double
  def to_any_gw(): scala.Double
  def to_any_gw_addr(addr_str: java.lang.String, transport: scala.Double): scala.Double
  def to_gw(lcr_id: scala.Double): scala.Double
  def to_gw_addr(lcr_id: scala.Double, addr_str: java.lang.String, transport: scala.Double): scala.Double
}

object Anon_Addrstr {
  @scala.inline
  def apply(
    defunct_gw: scala.Double => scala.Double,
    from_any_gw: () => scala.Double,
    from_any_gw_addr: (java.lang.String, scala.Double) => scala.Double,
    from_gw: scala.Double => scala.Double,
    from_gw_addr: (scala.Double, java.lang.String, scala.Double) => scala.Double,
    inactivate_gw: () => scala.Double,
    load_gws: scala.Double => scala.Double,
    load_gws_furi: (scala.Double, java.lang.String, java.lang.String) => scala.Double,
    load_gws_ruser: (scala.Double, java.lang.String) => scala.Double,
    next_gw: () => scala.Double,
    to_any_gw: () => scala.Double,
    to_any_gw_addr: (java.lang.String, scala.Double) => scala.Double,
    to_gw: scala.Double => scala.Double,
    to_gw_addr: (scala.Double, java.lang.String, scala.Double) => scala.Double
  ): Anon_Addrstr = {
    val __obj = js.Dynamic.literal(defunct_gw = js.Any.fromFunction1(defunct_gw), from_any_gw = js.Any.fromFunction0(from_any_gw), from_any_gw_addr = js.Any.fromFunction2(from_any_gw_addr), from_gw = js.Any.fromFunction1(from_gw), from_gw_addr = js.Any.fromFunction3(from_gw_addr), inactivate_gw = js.Any.fromFunction0(inactivate_gw), load_gws = js.Any.fromFunction1(load_gws), load_gws_furi = js.Any.fromFunction3(load_gws_furi), load_gws_ruser = js.Any.fromFunction2(load_gws_ruser), next_gw = js.Any.fromFunction0(next_gw), to_any_gw = js.Any.fromFunction0(to_any_gw), to_any_gw_addr = js.Any.fromFunction2(to_any_gw_addr), to_gw = js.Any.fromFunction1(to_gw), to_gw_addr = js.Any.fromFunction3(to_gw_addr))
  
    __obj.asInstanceOf[Anon_Addrstr]
  }
}

