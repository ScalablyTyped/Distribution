package typings
package inversifyDashExpressDashUtilsLib.dtsResultsJsonResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils/dts/results/JsonResult", JSImport.Default)
@js.native
class default protected () extends JsonResult {
  def this(json: js.Any, statusCode: scala.Double, apiController: inversifyDashExpressDashUtilsLib.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController) = this()
  /* CompleteClass */
  override var apiController: js.Any = js.native
  /* CompleteClass */
  override val json: js.Any = js.native
  /* CompleteClass */
  override val statusCode: scala.Double = js.native
  /* CompleteClass */
  override def executeAsync(): js.Promise[inversifyDashExpressDashUtilsLib.dtsHttpResponseMessageMod.HttpResponseMessage] = js.native
}

