package typings.inversifyDashExpressDashUtils.inversifyDashExpressDashUtilsMod

import typings.node.urlMod.URL
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils", "results")
@js.native
object resultsNs extends js.Object {
  @js.native
  class BadRequestErrorMessageResult protected ()
    extends typings.inversifyDashExpressDashUtils.dtsResultsMod.BadRequestErrorMessageResult {
    def this(
      message: String,
      apiController: typings.inversifyDashExpressDashUtils.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController
    ) = this()
  }
  
  @js.native
  class BadRequestResult protected ()
    extends typings.inversifyDashExpressDashUtils.dtsResultsMod.BadRequestResult {
    def this(apiController: typings.inversifyDashExpressDashUtils.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController) = this()
  }
  
  @js.native
  class ConflictResult protected ()
    extends typings.inversifyDashExpressDashUtils.dtsResultsMod.ConflictResult {
    def this(apiController: typings.inversifyDashExpressDashUtils.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController) = this()
  }
  
  @js.native
  class CreatedNegotiatedContentResult[T] protected ()
    extends typings.inversifyDashExpressDashUtils.dtsResultsMod.CreatedNegotiatedContentResult[T] {
    def this(
      location: String,
      content: T,
      apiController: typings.inversifyDashExpressDashUtils.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController
    ) = this()
    def this(
      location: URL,
      content: T,
      apiController: typings.inversifyDashExpressDashUtils.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController
    ) = this()
  }
  
  @js.native
  class ExceptionResult protected ()
    extends typings.inversifyDashExpressDashUtils.dtsResultsMod.ExceptionResult {
    def this(
      error: Error,
      apiController: typings.inversifyDashExpressDashUtils.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController
    ) = this()
  }
  
  @js.native
  class InternalServerErrorResult protected ()
    extends typings.inversifyDashExpressDashUtils.dtsResultsMod.InternalServerErrorResult {
    def this(apiController: typings.inversifyDashExpressDashUtils.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController) = this()
  }
  
  @js.native
  class JsonResult protected ()
    extends typings.inversifyDashExpressDashUtils.dtsResultsMod.JsonResult {
    def this(
      json: js.Any,
      statusCode: Double,
      apiController: typings.inversifyDashExpressDashUtils.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController
    ) = this()
  }
  
  @js.native
  class NotFoundResult protected ()
    extends typings.inversifyDashExpressDashUtils.dtsResultsMod.NotFoundResult {
    def this(apiController: typings.inversifyDashExpressDashUtils.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController) = this()
  }
  
  @js.native
  class OkNegotiatedContentResult[T] protected ()
    extends typings.inversifyDashExpressDashUtils.dtsResultsMod.OkNegotiatedContentResult[T] {
    def this(
      content: T,
      apiController: typings.inversifyDashExpressDashUtils.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController
    ) = this()
  }
  
  @js.native
  class OkResult protected ()
    extends typings.inversifyDashExpressDashUtils.dtsResultsMod.OkResult {
    def this(apiController: typings.inversifyDashExpressDashUtils.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController) = this()
  }
  
  @js.native
  class RedirectResult protected ()
    extends typings.inversifyDashExpressDashUtils.dtsResultsMod.RedirectResult {
    def this(
      location: String,
      apiController: typings.inversifyDashExpressDashUtils.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController
    ) = this()
    def this(
      location: URL,
      apiController: typings.inversifyDashExpressDashUtils.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController
    ) = this()
  }
  
  @js.native
  class ResponseMessageResult protected ()
    extends typings.inversifyDashExpressDashUtils.dtsResultsMod.ResponseMessageResult {
    def this(
      message: typings.inversifyDashExpressDashUtils.dtsHttpResponseMessageMod.HttpResponseMessage,
      apiController: typings.inversifyDashExpressDashUtils.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController
    ) = this()
  }
  
  @js.native
  class StatusCodeResult protected ()
    extends typings.inversifyDashExpressDashUtils.dtsResultsMod.StatusCodeResult {
    def this(
      statusCode: Double,
      apiController: typings.inversifyDashExpressDashUtils.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController
    ) = this()
  }
  
}

