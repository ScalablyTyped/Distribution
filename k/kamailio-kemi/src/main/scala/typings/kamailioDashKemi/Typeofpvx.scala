package typings.kamailioDashKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofpvx extends js.Object {
  def evalx(dst: String, fmt: String): Double
  def pv_var_to_xavp(varname: String, xname: String): Double
  def pv_xavp_print(): Double
  def pv_xavp_to_var(xname: String): Double
  def sbranch_append(): Double
  def sbranch_reset(): Double
  def sbranch_set_ruri(): Double
  def xavp_params_explode(sparams: String, sxname: String): Double
  def xavp_params_implode(sxname: String, svname: String): Double
}

object Typeofpvx {
  @scala.inline
  def apply(
    evalx: (String, String) => Double,
    pv_var_to_xavp: (String, String) => Double,
    pv_xavp_print: () => Double,
    pv_xavp_to_var: String => Double,
    sbranch_append: () => Double,
    sbranch_reset: () => Double,
    sbranch_set_ruri: () => Double,
    xavp_params_explode: (String, String) => Double,
    xavp_params_implode: (String, String) => Double
  ): Typeofpvx = {
    val __obj = js.Dynamic.literal(evalx = js.Any.fromFunction2(evalx), pv_var_to_xavp = js.Any.fromFunction2(pv_var_to_xavp), pv_xavp_print = js.Any.fromFunction0(pv_xavp_print), pv_xavp_to_var = js.Any.fromFunction1(pv_xavp_to_var), sbranch_append = js.Any.fromFunction0(sbranch_append), sbranch_reset = js.Any.fromFunction0(sbranch_reset), sbranch_set_ruri = js.Any.fromFunction0(sbranch_set_ruri), xavp_params_explode = js.Any.fromFunction2(xavp_params_explode), xavp_params_implode = js.Any.fromFunction2(xavp_params_implode))
  
    __obj.asInstanceOf[Typeofpvx]
  }
}

