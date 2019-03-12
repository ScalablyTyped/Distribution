package typings
package inversifyDashExpressDashUtilsLib.inversifyDashExpressDashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils", "results")
@js.native
object resultsNs extends js.Object {
  @js.native
  class BadRequestErrorMessageResult protected ()
    extends inversifyDashExpressDashUtilsLib.dtsResultsMod.BadRequestErrorMessageResult {
    def this(message: java.lang.String, apiController: inversifyDashExpressDashUtilsLib.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController) = this()
  }
  
  @js.native
  class BadRequestResult protected ()
    extends inversifyDashExpressDashUtilsLib.dtsResultsMod.BadRequestResult {
    def this(apiController: inversifyDashExpressDashUtilsLib.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController) = this()
  }
  
  @js.native
  class ConflictResult protected ()
    extends inversifyDashExpressDashUtilsLib.dtsResultsMod.ConflictResult {
    def this(apiController: inversifyDashExpressDashUtilsLib.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController) = this()
  }
  
  @js.native
  class CreatedNegotiatedContentResult[T] protected ()
    extends inversifyDashExpressDashUtilsLib.dtsResultsMod.CreatedNegotiatedContentResult[T] {
    def this(location: java.lang.String, content: T, apiController: inversifyDashExpressDashUtilsLib.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController) = this()
    def this(location: nodeLib.urlMod.URL, content: T, apiController: inversifyDashExpressDashUtilsLib.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController) = this()
  }
  
  @js.native
  class ExceptionResult protected ()
    extends inversifyDashExpressDashUtilsLib.dtsResultsMod.ExceptionResult {
    def this(error: stdLib.Error, apiController: inversifyDashExpressDashUtilsLib.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController) = this()
  }
  
  @js.native
  class InternalServerErrorResult protected ()
    extends inversifyDashExpressDashUtilsLib.dtsResultsMod.InternalServerErrorResult {
    def this(apiController: inversifyDashExpressDashUtilsLib.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController) = this()
  }
  
  @js.native
  class JsonResult protected ()
    extends inversifyDashExpressDashUtilsLib.dtsResultsMod.JsonResult {
    def this(json: js.Any, statusCode: scala.Double, apiController: inversifyDashExpressDashUtilsLib.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController) = this()
  }
  
  @js.native
  class NotFoundResult protected ()
    extends inversifyDashExpressDashUtilsLib.dtsResultsMod.NotFoundResult {
    def this(apiController: inversifyDashExpressDashUtilsLib.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController) = this()
  }
  
  @js.native
  class OkNegotiatedContentResult[T] protected ()
    extends inversifyDashExpressDashUtilsLib.dtsResultsMod.OkNegotiatedContentResult[T] {
    def this(content: T, apiController: inversifyDashExpressDashUtilsLib.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController) = this()
  }
  
  @js.native
  class OkResult protected ()
    extends inversifyDashExpressDashUtilsLib.dtsResultsMod.OkResult {
    def this(apiController: inversifyDashExpressDashUtilsLib.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController) = this()
  }
  
  @js.native
  class RedirectResult protected ()
    extends inversifyDashExpressDashUtilsLib.dtsResultsMod.RedirectResult {
    def this(location: java.lang.String, apiController: inversifyDashExpressDashUtilsLib.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController) = this()
    def this(location: nodeLib.urlMod.URL, apiController: inversifyDashExpressDashUtilsLib.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController) = this()
  }
  
  @js.native
  class ResponseMessageResult protected ()
    extends inversifyDashExpressDashUtilsLib.dtsResultsMod.ResponseMessageResult {
    def this(message: inversifyDashExpressDashUtilsLib.dtsHttpResponseMessageMod.HttpResponseMessage, apiController: inversifyDashExpressDashUtilsLib.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController) = this()
  }
  
  @js.native
  class StatusCodeResult protected ()
    extends inversifyDashExpressDashUtilsLib.dtsResultsMod.StatusCodeResult {
    def this(statusCode: scala.Double, apiController: inversifyDashExpressDashUtilsLib.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController) = this()
  }
  
}

