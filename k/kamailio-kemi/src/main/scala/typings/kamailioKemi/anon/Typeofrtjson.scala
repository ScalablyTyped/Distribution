package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofrtjson extends js.Object {
  def init_routes(rdoc: String): Double = js.native
  def next_route(): Double = js.native
  def push_routes(): Double = js.native
  def update_branch(): Double = js.native
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
  @scala.inline
  implicit class TypeofrtjsonOps[Self <: Typeofrtjson] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInit_routes(value: String => Double): Self = this.set("init_routes", js.Any.fromFunction1(value))
    @scala.inline
    def setNext_route(value: () => Double): Self = this.set("next_route", js.Any.fromFunction0(value))
    @scala.inline
    def setPush_routes(value: () => Double): Self = this.set("push_routes", js.Any.fromFunction0(value))
    @scala.inline
    def setUpdate_branch(value: () => Double): Self = this.set("update_branch", js.Any.fromFunction0(value))
  }
  
}

