package typings
package inversifyDashExpressDashUtilsLib.dtsResultsCreatedNegotiatedContentResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils/dts/results/CreatedNegotiatedContentResult", JSImport.Default)
@js.native
class default[T] protected () extends CreatedNegotiatedContentResult[T] {
  def this(location: java.lang.String, content: T, apiController: inversifyDashExpressDashUtilsLib.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController) = this()
  def this(location: nodeLib.urlMod.URL, content: T, apiController: inversifyDashExpressDashUtilsLib.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController) = this()
  /* CompleteClass */
  override var apiController: js.Any = js.native
  /* CompleteClass */
  override var content: js.Any = js.native
  /* CompleteClass */
  override var location: js.Any = js.native
  /* CompleteClass */
  override def executeAsync(): stdLib.Promise[inversifyDashExpressDashUtilsLib.dtsHttpResponseMessageMod.HttpResponseMessage] = js.native
}

