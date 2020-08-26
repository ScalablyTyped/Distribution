package typings.hapiCall.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Match[P, D] extends js.Object {
  var params: P = js.native
  var paramsArray: js.Array[String] = js.native
  var route: D = js.native
}

object Match {
  @scala.inline
  def apply[P, D](params: P, paramsArray: js.Array[String], route: D): Match[P, D] = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], paramsArray = paramsArray.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[Match[P, D]]
  }
  @scala.inline
  implicit class MatchOps[Self <: Match[_, _], P, D] (val x: Self with (Match[P, D])) extends AnyVal {
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
    def setParams(value: P): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def setParamsArrayVarargs(value: String*): Self = this.set("paramsArray", js.Array(value :_*))
    @scala.inline
    def setParamsArray(value: js.Array[String]): Self = this.set("paramsArray", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoute(value: D): Self = this.set("route", value.asInstanceOf[js.Any])
  }
  
}

