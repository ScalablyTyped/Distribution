package typings.inversifyExpressUtils

import typings.inversifyExpressUtils.badRequestErrorMessageResultMod.default
import typings.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
import typings.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage
import typings.node.urlMod.URL_
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resultsMod {
  
  @JSImport("inversify-express-utils/dts/results", "BadRequestErrorMessageResult")
  @js.native
  class BadRequestErrorMessageResult protected () extends default {
    def this(message: String, apiController: BaseHttpController) = this()
  }
  
  @JSImport("inversify-express-utils/dts/results", "BadRequestResult")
  @js.native
  class BadRequestResult protected ()
    extends typings.inversifyExpressUtils.badRequestResultMod.default {
    def this(apiController: BaseHttpController) = this()
  }
  
  @JSImport("inversify-express-utils/dts/results", "ConflictResult")
  @js.native
  class ConflictResult protected ()
    extends typings.inversifyExpressUtils.conflictResultMod.default {
    def this(apiController: BaseHttpController) = this()
  }
  
  @JSImport("inversify-express-utils/dts/results", "CreatedNegotiatedContentResult")
  @js.native
  class CreatedNegotiatedContentResult[T] protected ()
    extends typings.inversifyExpressUtils.createdNegotiatedContentResultMod.default[T] {
    def this(location: String, content: T, apiController: BaseHttpController) = this()
    def this(location: URL_, content: T, apiController: BaseHttpController) = this()
  }
  
  @JSImport("inversify-express-utils/dts/results", "ExceptionResult")
  @js.native
  class ExceptionResult protected ()
    extends typings.inversifyExpressUtils.exceptionResultMod.default {
    def this(error: Error, apiController: BaseHttpController) = this()
  }
  
  @JSImport("inversify-express-utils/dts/results", "InternalServerErrorResult")
  @js.native
  class InternalServerErrorResult protected ()
    extends typings.inversifyExpressUtils.internalServerErrorMod.default {
    def this(apiController: BaseHttpController) = this()
  }
  
  @JSImport("inversify-express-utils/dts/results", "JsonResult")
  @js.native
  class JsonResult protected ()
    extends typings.inversifyExpressUtils.jsonResultMod.default {
    def this(json: js.Any, statusCode: Double, apiController: BaseHttpController) = this()
  }
  
  @JSImport("inversify-express-utils/dts/results", "NotFoundResult")
  @js.native
  class NotFoundResult protected ()
    extends typings.inversifyExpressUtils.notFoundResultMod.default {
    def this(apiController: BaseHttpController) = this()
  }
  
  @JSImport("inversify-express-utils/dts/results", "OkNegotiatedContentResult")
  @js.native
  class OkNegotiatedContentResult[T] protected ()
    extends typings.inversifyExpressUtils.okNegotiatedContentResultMod.default[T] {
    def this(content: T, apiController: BaseHttpController) = this()
  }
  
  @JSImport("inversify-express-utils/dts/results", "OkResult")
  @js.native
  class OkResult protected ()
    extends typings.inversifyExpressUtils.okResultMod.default {
    def this(apiController: BaseHttpController) = this()
  }
  
  @JSImport("inversify-express-utils/dts/results", "RedirectResult")
  @js.native
  class RedirectResult protected ()
    extends typings.inversifyExpressUtils.redirectResultMod.default {
    def this(location: String, apiController: BaseHttpController) = this()
    def this(location: URL_, apiController: BaseHttpController) = this()
  }
  
  @JSImport("inversify-express-utils/dts/results", "ResponseMessageResult")
  @js.native
  class ResponseMessageResult protected ()
    extends typings.inversifyExpressUtils.responseMessageResultMod.default {
    def this(message: HttpResponseMessage, apiController: BaseHttpController) = this()
  }
  
  @JSImport("inversify-express-utils/dts/results", "StatusCodeResult")
  @js.native
  class StatusCodeResult protected ()
    extends typings.inversifyExpressUtils.statusCodeResultMod.default {
    def this(statusCode: Double, apiController: BaseHttpController) = this()
  }
}
