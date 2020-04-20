package typings.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofjsonrpcs extends js.Object {
  def exec(scmd: String): Double
}

object Typeofjsonrpcs {
  @scala.inline
  def apply(exec: String => Double): Typeofjsonrpcs = {
    val __obj = js.Dynamic.literal(exec = js.Any.fromFunction1(exec))
    __obj.asInstanceOf[Typeofjsonrpcs]
  }
}

