package typings.koaJoiRouter.mod

import typings.koa.mod.Context
import typings.koa.mod.Next
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Spec extends Config {
  var handler: Handler = js.native
  var method: String | js.Array[String] = js.native
  var path: String | RegExp = js.native
}

object Spec {
  @scala.inline
  def apply(handler: Handler, method: String | js.Array[String], path: String | RegExp): Spec = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Spec]
  }
  @scala.inline
  implicit class SpecOps[Self <: Spec] (val x: Self) extends AnyVal {
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
    def setHandlerFunction2(value: (/* ctx */ Context, /* next */ Next) => js.Any): Self = this.set("handler", js.Any.fromFunction2(value))
    @scala.inline
    def setHandler(value: Handler): Self = this.set("handler", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethodVarargs(value: String*): Self = this.set("method", js.Array(value :_*))
    @scala.inline
    def setMethod(value: String | js.Array[String]): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String | RegExp): Self = this.set("path", value.asInstanceOf[js.Any])
  }
  
}

