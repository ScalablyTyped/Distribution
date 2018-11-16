package typings
package inversifyDashExpressDashUtilsLib.dtsResultsOkNegotiatedContentResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils/dts/results/OkNegotiatedContentResult", JSImport.Default)
@js.native
class default[T] protected () extends OkNegotiatedContentResult[T] {
  def this(content: T, apiController: inversifyDashExpressDashUtilsLib.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController) = this()
  /* CompleteClass */
  override var apiController: js.Any = js.native
  /* CompleteClass */
  override var content: js.Any = js.native
  /* CompleteClass */
  override def executeAsync(): stdLib.Promise[inversifyDashExpressDashUtilsLib.dtsHttpResponseMessageMod.HttpResponseMessage] = js.native
}

