package typings.inversifyExpressUtils.interfacesMod.interfaces

import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.inversify.interfacesMod.interfaces.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpContext extends js.Object {
  var container: Container = js.native
  var request: Request_[ParamsDictionary, _, _, Query] = js.native
  var response: Response_[_] = js.native
  var user: Principal = js.native
}

object HttpContext {
  @scala.inline
  def apply(
    container: Container,
    request: Request_[ParamsDictionary, _, _, Query],
    response: Response_[_],
    user: Principal
  ): HttpContext = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpContext]
  }
  @scala.inline
  implicit class HttpContextOps[Self <: HttpContext] (val x: Self) extends AnyVal {
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
    def setContainer(value: Container): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: Request_[ParamsDictionary, _, _, Query]): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: Response_[_]): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: Principal): Self = this.set("user", value.asInstanceOf[js.Any])
  }
  
}

