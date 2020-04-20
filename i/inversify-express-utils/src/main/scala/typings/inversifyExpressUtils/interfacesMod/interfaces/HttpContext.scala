package typings.inversifyExpressUtils.interfacesMod.interfaces

import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.inversify.interfacesMod.interfaces.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpContext extends js.Object {
  var container: Container
  var request: Request_[ParamsDictionary, _, _, Query]
  var response: Response_[_]
  var user: Principal
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
}

