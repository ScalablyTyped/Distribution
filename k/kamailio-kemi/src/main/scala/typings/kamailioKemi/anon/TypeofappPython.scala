package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofappPython extends js.Object {
  def exec(method: String): Double
  def exec_p1(method: String, p1: String): Double
}

object TypeofappPython {
  @scala.inline
  def apply(exec: String => Double, exec_p1: (String, String) => Double): TypeofappPython = {
    val __obj = js.Dynamic.literal(exec = js.Any.fromFunction1(exec), exec_p1 = js.Any.fromFunction2(exec_p1))
    __obj.asInstanceOf[TypeofappPython]
  }
}

