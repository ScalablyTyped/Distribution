package typings
package inversifyDashExpressDashUtilsLib.dtsResultsResponseMessageResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils/dts/results/ResponseMessageResult", JSImport.Default)
@js.native
class default protected () extends ResponseMessageResult {
  def this(message: inversifyDashExpressDashUtilsLib.dtsHttpResponseMessageMod.HttpResponseMessage, apiController: inversifyDashExpressDashUtilsLib.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController) = this()
  /* CompleteClass */
  override var apiController: js.Any = js.native
  /* CompleteClass */
  override var message: js.Any = js.native
  /* CompleteClass */
  override def executeAsync(): js.Promise[inversifyDashExpressDashUtilsLib.dtsHttpResponseMessageMod.HttpResponseMessage] = js.native
}

