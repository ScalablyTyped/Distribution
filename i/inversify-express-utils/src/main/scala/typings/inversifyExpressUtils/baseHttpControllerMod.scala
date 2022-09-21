package typings.inversifyExpressUtils

import typings.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage
import typings.inversifyExpressUtils.interfacesMod.HttpContext
import typings.inversifyExpressUtils.resultsMod.BadRequestErrorMessageResult
import typings.inversifyExpressUtils.resultsMod.BadRequestResult
import typings.inversifyExpressUtils.resultsMod.ConflictResult
import typings.inversifyExpressUtils.resultsMod.CreatedNegotiatedContentResult
import typings.inversifyExpressUtils.resultsMod.ExceptionResult
import typings.inversifyExpressUtils.resultsMod.InternalServerErrorResult
import typings.inversifyExpressUtils.resultsMod.JsonResult
import typings.inversifyExpressUtils.resultsMod.NotFoundResult
import typings.inversifyExpressUtils.resultsMod.OkNegotiatedContentResult
import typings.inversifyExpressUtils.resultsMod.OkResult
import typings.inversifyExpressUtils.resultsMod.RedirectResult
import typings.inversifyExpressUtils.resultsMod.ResponseMessageResult
import typings.inversifyExpressUtils.resultsMod.StatusCodeResult
import typings.node.urlMod.URL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseHttpControllerMod {
  
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
