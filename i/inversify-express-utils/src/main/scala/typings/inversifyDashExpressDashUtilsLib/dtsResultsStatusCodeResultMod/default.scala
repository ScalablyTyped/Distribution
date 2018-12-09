package typings
package inversifyDashExpressDashUtilsLib.dtsResultsStatusCodeResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils/dts/results/StatusCodeResult", JSImport.Default)
@js.native
class default protected () extends StatusCodeResult {
  def this(statusCode: scala.Double, apiController: inversifyDashExpressDashUtilsLib.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController) = this()
  /* CompleteClass */
  override var apiController: js.Any = js.native
  /* CompleteClass */
  override var statusCode: js.Any = js.native
  /* CompleteClass */
  override def executeAsync(): js.Promise[inversifyDashExpressDashUtilsLib.dtsHttpResponseMessageMod.HttpResponseMessage] = js.native
}

