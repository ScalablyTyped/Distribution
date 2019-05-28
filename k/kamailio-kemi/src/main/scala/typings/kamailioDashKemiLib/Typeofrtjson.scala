package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofrtjson extends js.Object {
  def init_routes(rdoc: java.lang.String): scala.Double
  def next_route(): scala.Double
  def push_routes(): scala.Double
  def update_branch(): scala.Double
}

object Typeofrtjson {
  @scala.inline
  def apply(
    init_routes: java.lang.String => scala.Double,
    next_route: () => scala.Double,
    push_routes: () => scala.Double,
    update_branch: () => scala.Double
  ): Typeofrtjson = {
    val __obj = js.Dynamic.literal(init_routes = js.Any.fromFunction1(init_routes), next_route = js.Any.fromFunction0(next_route), push_routes = js.Any.fromFunction0(push_routes), update_branch = js.Any.fromFunction0(update_branch))
  
    __obj.asInstanceOf[Typeofrtjson]
  }
}

