package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofasync extends js.Object {
  def route(rn: java.lang.String, s: scala.Double): scala.Double
  def task_route(rn: java.lang.String): scala.Double
}

object Typeofasync {
  @scala.inline
  def apply(
    route: (java.lang.String, scala.Double) => scala.Double,
    task_route: java.lang.String => scala.Double
  ): Typeofasync = {
    val __obj = js.Dynamic.literal(route = js.Any.fromFunction2(route), task_route = js.Any.fromFunction1(task_route))
  
    __obj.asInstanceOf[Typeofasync]
  }
}

