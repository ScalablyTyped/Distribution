package typings.inversifyDashExpressDashUtils.dtsBaseUnderscoreHttpUnderscoreControllerMod

import typings.inversifyDashExpressDashUtils.dtsHttpResponseMessageMod.HttpResponseMessage
import typings.inversifyDashExpressDashUtils.dtsInterfacesMod.interfacesNs.HttpContext
import typings.inversifyDashExpressDashUtils.dtsResultsMod.BadRequestErrorMessageResult
import typings.inversifyDashExpressDashUtils.dtsResultsMod.BadRequestResult
import typings.inversifyDashExpressDashUtils.dtsResultsMod.ConflictResult
import typings.inversifyDashExpressDashUtils.dtsResultsMod.CreatedNegotiatedContentResult
import typings.inversifyDashExpressDashUtils.dtsResultsMod.ExceptionResult
import typings.inversifyDashExpressDashUtils.dtsResultsMod.InternalServerErrorResult
import typings.inversifyDashExpressDashUtils.dtsResultsMod.JsonResult
import typings.inversifyDashExpressDashUtils.dtsResultsMod.NotFoundResult
import typings.inversifyDashExpressDashUtils.dtsResultsMod.OkNegotiatedContentResult
import typings.inversifyDashExpressDashUtils.dtsResultsMod.OkResult
import typings.inversifyDashExpressDashUtils.dtsResultsMod.RedirectResult
import typings.inversifyDashExpressDashUtils.dtsResultsMod.ResponseMessageResult
import typings.inversifyDashExpressDashUtils.dtsResultsMod.StatusCodeResult
import typings.node.urlMod.URL
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils/dts/base_http_controller", "BaseHttpController")
@js.native
class BaseHttpController () extends js.Object {
  val httpContext: HttpContext = js.native
  /* protected */ def badRequest(): BadRequestResult = js.native
  /* protected */ def badRequest(message: String): BadRequestErrorMessageResult = js.native
  /* protected */ def conflict(): ConflictResult = js.native
  /* protected */ def created[T](location: String, content: T): CreatedNegotiatedContentResult[T] = js.native
  /* protected */ def created[T](location: URL, content: T): CreatedNegotiatedContentResult[T] = js.native
  /* protected */ def internalServerError(): InternalServerErrorResult = js.native
  /* protected */ def internalServerError(error: Error): ExceptionResult = js.native
  /* protected */ def json(content: js.Any): JsonResult = js.native
  /* protected */ def json(content: js.Any, statusCode: Double): JsonResult = js.native
  /* protected */ def notFound(): NotFoundResult = js.native
  /* protected */ def ok(): OkResult = js.native
  /* protected */ def ok[T](content: T): OkNegotiatedContentResult[T] = js.native
  /* protected */ def redirect(uri: String): RedirectResult = js.native
  /* protected */ def redirect(uri: URL): RedirectResult = js.native
  /* protected */ def responseMessage(message: HttpResponseMessage): ResponseMessageResult = js.native
  /* protected */ def statusCode(statusCode: Double): StatusCodeResult = js.native
}

