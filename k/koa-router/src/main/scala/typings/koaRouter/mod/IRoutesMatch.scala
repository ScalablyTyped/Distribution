package typings.koaRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRoutesMatch extends js.Object {
  var path: js.Array[Layer] = js.native
  var pathAndMethod: js.Array[Layer] = js.native
  var route: Boolean = js.native
}

object IRoutesMatch {
  @scala.inline
  def apply(path: js.Array[Layer], pathAndMethod: js.Array[Layer], route: Boolean): IRoutesMatch = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], pathAndMethod = pathAndMethod.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRoutesMatch]
  }
  @scala.inline
  implicit class IRoutesMatchOps[Self <: IRoutesMatch] (val x: Self) extends AnyVal {
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
    def setPathVarargs(value: Layer*): Self = this.set("path", js.Array(value :_*))
    @scala.inline
    def setPath(value: js.Array[Layer]): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathAndMethodVarargs(value: Layer*): Self = this.set("pathAndMethod", js.Array(value :_*))
    @scala.inline
    def setPathAndMethod(value: js.Array[Layer]): Self = this.set("pathAndMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoute(value: Boolean): Self = this.set("route", value.asInstanceOf[js.Any])
  }
  
}

