package typings.inversifyExpressUtils

import typings.inversifyExpressUtils.libHttpResponseMessageMod.HttpResponseMessage
import typings.inversifyExpressUtils.libInterfacesMod.HttpContext
import typings.inversifyExpressUtils.libResultsMod.BadRequestErrorMessageResult
import typings.inversifyExpressUtils.libResultsMod.BadRequestResult
import typings.inversifyExpressUtils.libResultsMod.ConflictResult
import typings.inversifyExpressUtils.libResultsMod.CreatedNegotiatedContentResult
import typings.inversifyExpressUtils.libResultsMod.ExceptionResult
import typings.inversifyExpressUtils.libResultsMod.InternalServerErrorResult
import typings.inversifyExpressUtils.libResultsMod.JsonResult
import typings.inversifyExpressUtils.libResultsMod.NotFoundResult
import typings.inversifyExpressUtils.libResultsMod.OkNegotiatedContentResult
import typings.inversifyExpressUtils.libResultsMod.OkResult
import typings.inversifyExpressUtils.libResultsMod.RedirectResult
import typings.inversifyExpressUtils.libResultsMod.ResponseMessageResult
import typings.inversifyExpressUtils.libResultsMod.StatusCodeResult
import typings.node.urlMod.URL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBaseHttpControllerMod {
  
  @JSImport("inversify-express-utils/lib/base_http_controller", "BaseHttpController")
  @js.native
  open class BaseHttpController () extends StObject {
    
    /* protected */ def badRequest(): BadRequestResult = js.native
    /* protected */ def badRequest(message: String): BadRequestErrorMessageResult = js.native
    
    /* protected */ def conflict(): ConflictResult = js.native
    
    /* protected */ def created[T](location: String, content: T): CreatedNegotiatedContentResult[T] = js.native
    /* protected */ def created[T](location: URL_, content: T): CreatedNegotiatedContentResult[T] = js.native
    
    /* protected */ val httpContext: HttpContext = js.native
    
    /* protected */ def internalServerError(): InternalServerErrorResult = js.native
    /* protected */ def internalServerError(error: js.Error): ExceptionResult = js.native
    
    /* protected */ def json(content: Any): JsonResult = js.native
    /* protected */ def json(content: Any, statusCode: Double): JsonResult = js.native
    
    /* protected */ def notFound(): NotFoundResult = js.native
    
    /* protected */ def ok(): OkResult = js.native
    /* protected */ def ok[T](content: T): OkNegotiatedContentResult[T] = js.native
    
    /* protected */ def redirect(uri: String): RedirectResult = js.native
    /* protected */ def redirect(uri: URL_): RedirectResult = js.native
    
    /* protected */ def responseMessage(message: HttpResponseMessage): ResponseMessageResult = js.native
    
    /* protected */ def statusCode(statusCode: Double): StatusCodeResult = js.native
  }
}
