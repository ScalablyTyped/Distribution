package typings.inversifyDashExpressDashUtils

import typings.inversifyDashExpressDashUtils.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController
import typings.inversifyDashExpressDashUtils.dtsHttpResponseMessageMod.HttpResponseMessage
import typings.inversifyDashExpressDashUtils.dtsResultsBadRequestErrorMessageResultMod.default
import typings.node.urlMod.URL
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils/dts/results", JSImport.Namespace)
@js.native
object dtsResultsMod extends js.Object {
  @js.native
  class BadRequestErrorMessageResult protected () extends default {
    def this(message: String, apiController: BaseHttpController) = this()
  }
  
  @js.native
  class BadRequestResult protected ()
    extends typings.inversifyDashExpressDashUtils.dtsResultsBadRequestResultMod.default {
    def this(apiController: BaseHttpController) = this()
  }
  
  @js.native
  class ConflictResult protected ()
    extends typings.inversifyDashExpressDashUtils.dtsResultsConflictResultMod.default {
    def this(apiController: BaseHttpController) = this()
  }
  
  @js.native
  class CreatedNegotiatedContentResult[T] protected ()
    extends typings.inversifyDashExpressDashUtils.dtsResultsCreatedNegotiatedContentResultMod.default[T] {
    def this(location: String, content: T, apiController: BaseHttpController) = this()
    def this(location: URL, content: T, apiController: BaseHttpController) = this()
  }
  
  @js.native
  class ExceptionResult protected ()
    extends typings.inversifyDashExpressDashUtils.dtsResultsExceptionResultMod.default {
    def this(error: Error, apiController: BaseHttpController) = this()
  }
  
  @js.native
  class InternalServerErrorResult protected ()
    extends typings.inversifyDashExpressDashUtils.dtsResultsInternalServerErrorMod.default {
    def this(apiController: BaseHttpController) = this()
  }
  
  @js.native
  class JsonResult protected ()
    extends typings.inversifyDashExpressDashUtils.dtsResultsJsonResultMod.default {
    def this(json: js.Any, statusCode: Double, apiController: BaseHttpController) = this()
  }
  
  @js.native
  class NotFoundResult protected ()
    extends typings.inversifyDashExpressDashUtils.dtsResultsNotFoundResultMod.default {
    def this(apiController: BaseHttpController) = this()
  }
  
  @js.native
  class OkNegotiatedContentResult[T] protected ()
    extends typings.inversifyDashExpressDashUtils.dtsResultsOkNegotiatedContentResultMod.default[T] {
    def this(content: T, apiController: BaseHttpController) = this()
  }
  
  @js.native
  class OkResult protected ()
    extends typings.inversifyDashExpressDashUtils.dtsResultsOkResultMod.default {
    def this(apiController: BaseHttpController) = this()
  }
  
  @js.native
  class RedirectResult protected ()
    extends typings.inversifyDashExpressDashUtils.dtsResultsRedirectResultMod.default {
    def this(location: String, apiController: BaseHttpController) = this()
    def this(location: URL, apiController: BaseHttpController) = this()
  }
  
  @js.native
  class ResponseMessageResult protected ()
    extends typings.inversifyDashExpressDashUtils.dtsResultsResponseMessageResultMod.default {
    def this(message: HttpResponseMessage, apiController: BaseHttpController) = this()
  }
  
  @js.native
  class StatusCodeResult protected ()
    extends typings.inversifyDashExpressDashUtils.dtsResultsStatusCodeResultMod.default {
    def this(statusCode: Double, apiController: BaseHttpController) = this()
  }
  
}

