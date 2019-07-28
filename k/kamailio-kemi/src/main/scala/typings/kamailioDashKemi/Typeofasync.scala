package typings.kamailioDashKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofasync extends js.Object {
  def route(rn: String, s: Double): Double
  def task_route(rn: String): Double
}

object Typeofasync {
  @scala.inline
  def apply(route: (String, Double) => Double, task_route: String => Double): Typeofasync = {
    val __obj = js.Dynamic.literal(route = js.Any.fromFunction2(route), task_route = js.Any.fromFunction1(task_route))
  
    __obj.asInstanceOf[Typeofasync]
  }
}

