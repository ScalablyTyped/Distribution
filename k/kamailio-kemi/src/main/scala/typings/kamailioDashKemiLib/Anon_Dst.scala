package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dst extends js.Object {
  def evalx(dst: java.lang.String, fmt: java.lang.String): scala.Double
  def pv_var_to_xavp(varname: java.lang.String, xname: java.lang.String): scala.Double
  def pv_xavp_print(): scala.Double
  def pv_xavp_to_var(xname: java.lang.String): scala.Double
  def sbranch_append(): scala.Double
  def sbranch_reset(): scala.Double
  def sbranch_set_ruri(): scala.Double
  def xavp_params_explode(sparams: java.lang.String, sxname: java.lang.String): scala.Double
  def xavp_params_implode(sxname: java.lang.String, svname: java.lang.String): scala.Double
}

object Anon_Dst {
  @scala.inline
  def apply(
    evalx: (java.lang.String, java.lang.String) => scala.Double,
    pv_var_to_xavp: (java.lang.String, java.lang.String) => scala.Double,
    pv_xavp_print: () => scala.Double,
    pv_xavp_to_var: java.lang.String => scala.Double,
    sbranch_append: () => scala.Double,
    sbranch_reset: () => scala.Double,
    sbranch_set_ruri: () => scala.Double,
    xavp_params_explode: (java.lang.String, java.lang.String) => scala.Double,
    xavp_params_implode: (java.lang.String, java.lang.String) => scala.Double
  ): Anon_Dst = {
    val __obj = js.Dynamic.literal(evalx = js.Any.fromFunction2(evalx), pv_var_to_xavp = js.Any.fromFunction2(pv_var_to_xavp), pv_xavp_print = js.Any.fromFunction0(pv_xavp_print), pv_xavp_to_var = js.Any.fromFunction1(pv_xavp_to_var), sbranch_append = js.Any.fromFunction0(sbranch_append), sbranch_reset = js.Any.fromFunction0(sbranch_reset), sbranch_set_ruri = js.Any.fromFunction0(sbranch_set_ruri), xavp_params_explode = js.Any.fromFunction2(xavp_params_explode), xavp_params_implode = js.Any.fromFunction2(xavp_params_implode))
  
    __obj.asInstanceOf[Anon_Dst]
  }
}

