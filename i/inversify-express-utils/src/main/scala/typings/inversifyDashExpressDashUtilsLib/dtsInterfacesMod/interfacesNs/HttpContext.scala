package typings
package inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpContext extends js.Object {
  var container: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify inversifyInterfaces.Container */ js.Any
  var request: expressLib.expressMod.eNs.Request
  var response: expressLib.expressMod.eNs.Response
  var user: Principal
}

object HttpContext {
  @scala.inline
  def apply(
    container: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify inversifyInterfaces.Container */ js.Any,
    request: expressLib.expressMod.eNs.Request,
    response: expressLib.expressMod.eNs.Response,
    user: Principal
  ): HttpContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("container")(container)
    __obj.updateDynamic("request")(request)
    __obj.updateDynamic("response")(response)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[HttpContext]
  }
}

