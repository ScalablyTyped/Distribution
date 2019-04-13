package typings
package inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpContext extends js.Object {
  var container: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify inversifyInterfaces.Container */ js.Any
  var request: expressLib.expressMod.Request
  var response: expressLib.expressMod.Response
  var user: Principal
}

object HttpContext {
  @scala.inline
  def apply(
    container: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify inversifyInterfaces.Container */ js.Any,
    request: expressLib.expressMod.Request,
    response: expressLib.expressMod.Response,
    user: Principal
  ): HttpContext = {
    val __obj = js.Dynamic.literal(container = container, request = request, response = response, user = user)
  
    __obj.asInstanceOf[HttpContext]
  }
}

