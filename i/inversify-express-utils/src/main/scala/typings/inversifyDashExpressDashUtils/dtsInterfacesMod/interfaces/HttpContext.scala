package typings.inversifyDashExpressDashUtils.dtsInterfacesMod.interfaces

import typings.express.expressMod.Request
import typings.express.expressMod.Response
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.inversify.dtsInterfacesInterfacesMod.interfaces.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpContext extends js.Object {
  var container: Container
  var request: Request[ParamsDictionary]
  var response: Response
  var user: Principal
}

object HttpContext {
  @scala.inline
  def apply(container: Container, request: Request[ParamsDictionary], response: Response, user: Principal): HttpContext = {
    val __obj = js.Dynamic.literal(container = container, request = request, response = response, user = user)
  
    __obj.asInstanceOf[HttpContext]
  }
}

