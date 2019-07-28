package typings.kamailioDashKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofapp_python3 extends js.Object {
  def exec(method: String): Double
  def exec_p1(method: String, p1: String): Double
}

object Typeofapp_python3 {
  @scala.inline
  def apply(exec: String => Double, exec_p1: (String, String) => Double): Typeofapp_python3 = {
    val __obj = js.Dynamic.literal(exec = js.Any.fromFunction1(exec), exec_p1 = js.Any.fromFunction2(exec_p1))
  
    __obj.asInstanceOf[Typeofapp_python3]
  }
}

