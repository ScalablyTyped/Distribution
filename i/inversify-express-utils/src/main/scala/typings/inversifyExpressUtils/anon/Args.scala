package typings.inversifyExpressUtils.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Args extends js.Object {
  var args: js.UndefOr[js.Array[String]] = js.native
  var route: String = js.native
}

object Args {
  @scala.inline
  def apply(route: String): Args = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
  @scala.inline
  implicit class ArgsOps[Self <: Args] (val x: Self) extends AnyVal {
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
    def setRoute(value: String): Self = this.set("route", value.asInstanceOf[js.Any])
    @scala.inline
    def setArgsVarargs(value: String*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[String]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
  }
  
}

