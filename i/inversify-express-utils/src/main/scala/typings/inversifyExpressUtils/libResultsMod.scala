package typings.inversifyExpressUtils

import typings.inversifyExpressUtils.libHttpResponseMessageMod.HttpResponseMessage
import typings.node.urlMod.URL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libResultsMod {
  
  @JSImport("inversify-express-utils/lib/results", "BadRequestErrorMessageResult")
  @js.native
  open class BadRequestErrorMessageResult protected ()
    extends typings.inversifyExpressUtils.libResultsBadRequestErrorMessageResultMod.BadRequestErrorMessageResult {
    def this(message: String) = this()
  }
  
  @JSImport("inversify-express-utils/lib/results", "BadRequestResult")
  @js.native
  open class BadRequestResult ()
    extends typings.inversifyExpressUtils.libResultsBadRequestResultMod.BadRequestResult
  
  @JSImport("inversify-express-utils/lib/results", "ConflictResult")
  @js.native
  open class ConflictResult ()
    extends typings.inversifyExpressUtils.libResultsConflictResultMod.ConflictResult
  
  @JSImport("inversify-express-utils/lib/results", "CreatedNegotiatedContentResult")
  @js.native
  open class CreatedNegotiatedContentResult[T] protected ()
    extends typings.inversifyExpressUtils.libResultsCreatedNegotiatedContentResultMod.CreatedNegotiatedContentResult[T] {
    def this(location: String, content: T) = this()
    def this(location: URL_, content: T) = this()
  }
  
  @JSImport("inversify-express-utils/lib/results", "ExceptionResult")
  @js.native
  open class ExceptionResult protected ()
    extends typings.inversifyExpressUtils.libResultsExceptionResultMod.ExceptionResult {
    def this(error: js.Error) = this()
  }
  
  @JSImport("inversify-express-utils/lib/results", "InternalServerErrorResult")
  @js.native
  open class InternalServerErrorResult ()
    extends typings.inversifyExpressUtils.libResultsInternalServerErrorMod.InternalServerErrorResult
  
  @JSImport("inversify-express-utils/lib/results", "JsonResult")
  @js.native
  open class JsonResult protected ()
    extends typings.inversifyExpressUtils.libResultsJsonResultMod.JsonResult {
    def this(json: Any, statusCode: Double) = this()
  }
  
  @JSImport("inversify-express-utils/lib/results", "NotFoundResult")
  @js.native
  open class NotFoundResult ()
    extends typings.inversifyExpressUtils.libResultsNotFoundResultMod.NotFoundResult
  
  @JSImport("inversify-express-utils/lib/results", "OkNegotiatedContentResult")
  @js.native
  open class OkNegotiatedContentResult[T] protected ()
    extends typings.inversifyExpressUtils.libResultsOkNegotiatedContentResultMod.OkNegotiatedContentResult[T] {
    def this(content: T) = this()
  }
  
  @JSImport("inversify-express-utils/lib/results", "OkResult")
  @js.native
  open class OkResult ()
    extends typings.inversifyExpressUtils.libResultsOkResultMod.OkResult
  
  @JSImport("inversify-express-utils/lib/results", "RedirectResult")
  @js.native
  open class RedirectResult protected ()
    extends typings.inversifyExpressUtils.libResultsRedirectResultMod.RedirectResult {
    def this(location: String) = this()
    def this(location: URL_) = this()
  }
  
  @JSImport("inversify-express-utils/lib/results", "ResponseMessageResult")
  @js.native
  open class ResponseMessageResult protected ()
    extends typings.inversifyExpressUtils.libResultsResponseMessageResultMod.ResponseMessageResult {
    def this(message: HttpResponseMessage) = this()
  }
  
  @JSImport("inversify-express-utils/lib/results", "StatusCodeResult")
  @js.native
  open class StatusCodeResult protected ()
    extends typings.inversifyExpressUtils.libResultsStatusCodeResultMod.StatusCodeResult {
    def this(statusCode: Double) = this()
  }
}
