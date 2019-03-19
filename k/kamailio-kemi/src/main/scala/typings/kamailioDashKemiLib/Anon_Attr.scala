package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attr extends js.Object {
  def uac_auth(): scala.Double
  def uac_reg_disable(attr: java.lang.String, `val`: java.lang.String): scala.Double
  def uac_reg_enable(attr: java.lang.String, `val`: java.lang.String): scala.Double
  def uac_reg_lookup(userid: java.lang.String, sdst: java.lang.String): scala.Double
  def uac_reg_refresh(l_uuid: java.lang.String): scala.Double
  def uac_reg_request_to(userid: java.lang.String, imode: scala.Double): scala.Double
  def uac_reg_status(sruuid: java.lang.String): scala.Double
  def uac_replace_from(pdsp: java.lang.String, puri: java.lang.String): scala.Double
  def uac_replace_from_uri(puri: java.lang.String): scala.Double
  def uac_replace_to(pdsp: java.lang.String, puri: java.lang.String): scala.Double
  def uac_replace_to_uri(puri: java.lang.String): scala.Double
  def uac_req_send(): scala.Double
  def uac_restore_from(): scala.Double
  def uac_restore_to(): scala.Double
}

object Anon_Attr {
  @scala.inline
  def apply(
    uac_auth: () => scala.Double,
    uac_reg_disable: (java.lang.String, java.lang.String) => scala.Double,
    uac_reg_enable: (java.lang.String, java.lang.String) => scala.Double,
    uac_reg_lookup: (java.lang.String, java.lang.String) => scala.Double,
    uac_reg_refresh: java.lang.String => scala.Double,
    uac_reg_request_to: (java.lang.String, scala.Double) => scala.Double,
    uac_reg_status: java.lang.String => scala.Double,
    uac_replace_from: (java.lang.String, java.lang.String) => scala.Double,
    uac_replace_from_uri: java.lang.String => scala.Double,
    uac_replace_to: (java.lang.String, java.lang.String) => scala.Double,
    uac_replace_to_uri: java.lang.String => scala.Double,
    uac_req_send: () => scala.Double,
    uac_restore_from: () => scala.Double,
    uac_restore_to: () => scala.Double
  ): Anon_Attr = {
    val __obj = js.Dynamic.literal(uac_auth = js.Any.fromFunction0(uac_auth), uac_reg_disable = js.Any.fromFunction2(uac_reg_disable), uac_reg_enable = js.Any.fromFunction2(uac_reg_enable), uac_reg_lookup = js.Any.fromFunction2(uac_reg_lookup), uac_reg_refresh = js.Any.fromFunction1(uac_reg_refresh), uac_reg_request_to = js.Any.fromFunction2(uac_reg_request_to), uac_reg_status = js.Any.fromFunction1(uac_reg_status), uac_replace_from = js.Any.fromFunction2(uac_replace_from), uac_replace_from_uri = js.Any.fromFunction1(uac_replace_from_uri), uac_replace_to = js.Any.fromFunction2(uac_replace_to), uac_replace_to_uri = js.Any.fromFunction1(uac_replace_to_uri), uac_req_send = js.Any.fromFunction0(uac_req_send), uac_restore_from = js.Any.fromFunction0(uac_restore_from), uac_restore_to = js.Any.fromFunction0(uac_restore_to))
  
    __obj.asInstanceOf[Anon_Attr]
  }
}

