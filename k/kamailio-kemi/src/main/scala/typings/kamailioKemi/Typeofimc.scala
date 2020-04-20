package typings.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofimc extends js.Object {
  def imc_manager(): Double
}

object Typeofimc {
  @scala.inline
  def apply(imc_manager: () => Double): Typeofimc = {
    val __obj = js.Dynamic.literal(imc_manager = js.Any.fromFunction0(imc_manager))
    __obj.asInstanceOf[Typeofimc]
  }
}

