package typings.inversifyDashExpressDashUtils.dtsResultsExceptionResultMod

import typings.inversifyDashExpressDashUtils.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController
import typings.inversifyDashExpressDashUtils.dtsHttpResponseMessageMod.HttpResponseMessage
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils/dts/results/ExceptionResult", JSImport.Default)
@js.native
class default protected () extends ExceptionResult {
  def this(error: Error, apiController: BaseHttpController) = this()
  /* CompleteClass */
  override var apiController: js.Any = js.native
  /* CompleteClass */
  override var error: js.Any = js.native
  /* CompleteClass */
  override def executeAsync(): js.Promise[HttpResponseMessage] = js.native
}

