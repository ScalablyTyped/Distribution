package typings
package inversifyDashExpressDashUtilsLib.dtsBaseUnderscoreHttpUnderscoreControllerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils/dts/base_http_controller", "BaseHttpController")
@js.native
class BaseHttpController () extends js.Object {
  val httpContext: inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.HttpContext = js.native
  /* protected */ def badRequest(): inversifyDashExpressDashUtilsLib.dtsResultsMod.BadRequestResult = js.native
  /* protected */ def badRequest(message: java.lang.String): inversifyDashExpressDashUtilsLib.dtsResultsMod.BadRequestErrorMessageResult = js.native
  /* protected */ def conflict(): inversifyDashExpressDashUtilsLib.dtsResultsMod.ConflictResult = js.native
  /* protected */ def created[T](location: java.lang.String, content: T): inversifyDashExpressDashUtilsLib.dtsResultsMod.CreatedNegotiatedContentResult[T] = js.native
  /* protected */ def created[T](location: nodeLib.urlMod.URL, content: T): inversifyDashExpressDashUtilsLib.dtsResultsMod.CreatedNegotiatedContentResult[T] = js.native
  /* protected */ def internalServerError(): inversifyDashExpressDashUtilsLib.dtsResultsMod.InternalServerErrorResult = js.native
  /* protected */ def internalServerError(error: nodeLib.Error): inversifyDashExpressDashUtilsLib.dtsResultsMod.ExceptionResult = js.native
  /* protected */ def json(content: js.Any): inversifyDashExpressDashUtilsLib.dtsResultsMod.JsonResult = js.native
  /* protected */ def json(content: js.Any, statusCode: scala.Double): inversifyDashExpressDashUtilsLib.dtsResultsMod.JsonResult = js.native
  /* protected */ def notFound(): inversifyDashExpressDashUtilsLib.dtsResultsMod.NotFoundResult = js.native
  /* protected */ def ok(): inversifyDashExpressDashUtilsLib.dtsResultsMod.OkResult = js.native
  /* protected */ def ok[T](content: T): inversifyDashExpressDashUtilsLib.dtsResultsMod.OkNegotiatedContentResult[T] = js.native
  /* protected */ def redirect(uri: java.lang.String): inversifyDashExpressDashUtilsLib.dtsResultsMod.RedirectResult = js.native
  /* protected */ def redirect(uri: nodeLib.urlMod.URL): inversifyDashExpressDashUtilsLib.dtsResultsMod.RedirectResult = js.native
  /* protected */ def responseMessage(message: inversifyDashExpressDashUtilsLib.dtsHttpResponseMessageMod.HttpResponseMessage): inversifyDashExpressDashUtilsLib.dtsResultsMod.ResponseMessageResult = js.native
  /* protected */ def statusCode(statusCode: scala.Double): inversifyDashExpressDashUtilsLib.dtsResultsMod.StatusCodeResult = js.native
}

