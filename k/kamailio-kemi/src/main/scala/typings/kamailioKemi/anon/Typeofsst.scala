package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofsst extends js.Object {
  def sst_check_min(flag: Double): Double
}

object Typeofsst {
  @scala.inline
  def apply(sst_check_min: Double => Double): Typeofsst = {
    val __obj = js.Dynamic.literal(sst_check_min = js.Any.fromFunction1(sst_check_min))
    __obj.asInstanceOf[Typeofsst]
  }
}

