package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofpipelimit extends js.Object {
  def pl_check(pipeid: String): Double
  def pl_check_limit(pipeid: String, alg: String, limit: Double): Double
  def pl_drop(): Double
  def pl_drop_range(rmin: Double, rmax: Double): Double
  def pl_drop_retry(rafter: Double): Double
}

object Typeofpipelimit {
  @scala.inline
  def apply(
    pl_check: String => Double,
    pl_check_limit: (String, String, Double) => Double,
    pl_drop: () => Double,
    pl_drop_range: (Double, Double) => Double,
    pl_drop_retry: Double => Double
  ): Typeofpipelimit = {
    val __obj = js.Dynamic.literal(pl_check = js.Any.fromFunction1(pl_check), pl_check_limit = js.Any.fromFunction3(pl_check_limit), pl_drop = js.Any.fromFunction0(pl_drop), pl_drop_range = js.Any.fromFunction2(pl_drop_range), pl_drop_retry = js.Any.fromFunction1(pl_drop_retry))
    __obj.asInstanceOf[Typeofpipelimit]
  }
}

