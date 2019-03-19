package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlgLimit extends js.Object {
  def pl_check(pipeid: java.lang.String): scala.Double
  def pl_check_limit(pipeid: java.lang.String, alg: java.lang.String, limit: scala.Double): scala.Double
  def pl_drop(): scala.Double
  def pl_drop_range(rmin: scala.Double, rmax: scala.Double): scala.Double
  def pl_drop_retry(rafter: scala.Double): scala.Double
}

object Anon_AlgLimit {
  @scala.inline
  def apply(
    pl_check: java.lang.String => scala.Double,
    pl_check_limit: (java.lang.String, java.lang.String, scala.Double) => scala.Double,
    pl_drop: () => scala.Double,
    pl_drop_range: (scala.Double, scala.Double) => scala.Double,
    pl_drop_retry: scala.Double => scala.Double
  ): Anon_AlgLimit = {
    val __obj = js.Dynamic.literal(pl_check = js.Any.fromFunction1(pl_check), pl_check_limit = js.Any.fromFunction3(pl_check_limit), pl_drop = js.Any.fromFunction0(pl_drop), pl_drop_range = js.Any.fromFunction2(pl_drop_range), pl_drop_retry = js.Any.fromFunction1(pl_drop_retry))
  
    __obj.asInstanceOf[Anon_AlgLimit]
  }
}

