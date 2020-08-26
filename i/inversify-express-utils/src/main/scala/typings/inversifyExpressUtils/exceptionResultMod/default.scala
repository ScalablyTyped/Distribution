package typings.inversifyExpressUtils.exceptionResultMod

import typings.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils/dts/results/ExceptionResult", JSImport.Default)
@js.native
class default protected () extends ExceptionResult {
  def this(error: Error, apiController: BaseHttpController) = this()
}

