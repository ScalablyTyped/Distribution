package typings.inversifyExpressUtils.mod

import typings.node.urlMod.URL_
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("inversify-express-utils", "results")
@js.native
object results extends js.Object {
  
  @js.native
  class BadRequestErrorMessageResult protected ()
    extends typings.inversifyExpressUtils.resultsMod.BadRequestErrorMessageResult {
    def this(
      message: String,
      apiController: typings.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
    ) = this()
  }
  
  @js.native
  class BadRequestResult protected ()
    extends typings.inversifyExpressUtils.resultsMod.BadRequestResult {
    def this(apiController: typings.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController) = this()
  }
  
  @js.native
  class ConflictResult protected ()
    extends typings.inversifyExpressUtils.resultsMod.ConflictResult {
    def this(apiController: typings.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController) = this()
  }
  
  @js.native
  class CreatedNegotiatedContentResult[T] protected ()
    extends typings.inversifyExpressUtils.resultsMod.CreatedNegotiatedContentResult[T] {
    def this(
      location: String,
      content: T,
      apiController: typings.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
    ) = this()
    def this(
      location: URL_,
      content: T,
      apiController: typings.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
    ) = this()
  }
  
  @js.native
  class ExceptionResult protected ()
    extends typings.inversifyExpressUtils.resultsMod.ExceptionResult {
    def this(
      error: Error,
      apiController: typings.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
    ) = this()
  }
  
  @js.native
  class InternalServerErrorResult protected ()
    extends typings.inversifyExpressUtils.resultsMod.InternalServerErrorResult {
    def this(apiController: typings.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController) = this()
  }
  
  @js.native
  class JsonResult protected ()
    extends typings.inversifyExpressUtils.resultsMod.JsonResult {
    def this(
      json: js.Any,
      statusCode: Double,
      apiController: typings.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
    ) = this()
  }
  
  @js.native
  class NotFoundResult protected ()
    extends typings.inversifyExpressUtils.resultsMod.NotFoundResult {
    def this(apiController: typings.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController) = this()
  }
  
  @js.native
  class OkNegotiatedContentResult[T] protected ()
    extends typings.inversifyExpressUtils.resultsMod.OkNegotiatedContentResult[T] {
    def this(content: T, apiController: typings.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController) = this()
  }
  
  @js.native
  class OkResult protected ()
    extends typings.inversifyExpressUtils.resultsMod.OkResult {
    def this(apiController: typings.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController) = this()
  }
  
  @js.native
  class RedirectResult protected ()
    extends typings.inversifyExpressUtils.resultsMod.RedirectResult {
    def this(
      location: String,
      apiController: typings.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
    ) = this()
    def this(
      location: URL_,
      apiController: typings.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
    ) = this()
  }
  
  @js.native
  class ResponseMessageResult protected ()
    extends typings.inversifyExpressUtils.resultsMod.ResponseMessageResult {
    def this(
      message: typings.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage,
      apiController: typings.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
    ) = this()
  }
  
  @js.native
  class StatusCodeResult protected ()
    extends typings.inversifyExpressUtils.resultsMod.StatusCodeResult {
    def this(
      statusCode: Double,
      apiController: typings.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
    ) = this()
  }
}
