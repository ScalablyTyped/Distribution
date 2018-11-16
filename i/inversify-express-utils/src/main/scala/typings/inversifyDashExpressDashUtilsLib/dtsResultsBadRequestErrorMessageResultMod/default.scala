package typings
package inversifyDashExpressDashUtilsLib.dtsResultsBadRequestErrorMessageResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils/dts/results/BadRequestErrorMessageResult", JSImport.Default)
@js.native
class default protected () extends BadRequestErrorMessageResult {
  def this(message: java.lang.String, apiController: inversifyDashExpressDashUtilsLib.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController) = this()
  /* CompleteClass */
  override var apiController: js.Any = js.native
  /* CompleteClass */
  override var message: js.Any = js.native
  /* CompleteClass */
  override def executeAsync(): stdLib.Promise[inversifyDashExpressDashUtilsLib.dtsHttpResponseMessageMod.HttpResponseMessage] = js.native
}

