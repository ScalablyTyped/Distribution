package typings.kamailioDashKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofrtjson extends js.Object {
  def init_routes(rdoc: String): Double
  def next_route(): Double
  def push_routes(): Double
  def update_branch(): Double
}

object Typeofrtjson {
  @scala.inline
  def apply(
    init_routes: String => Double,
    next_route: () => Double,
    push_routes: () => Double,
    update_branch: () => Double
  ): Typeofrtjson = {
    val __obj = js.Dynamic.literal(init_routes = js.Any.fromFunction1(init_routes), next_route = js.Any.fromFunction0(next_route), push_routes = js.Any.fromFunction0(push_routes), update_branch = js.Any.fromFunction0(update_branch))
  
    __obj.asInstanceOf[Typeofrtjson]
  }
}

