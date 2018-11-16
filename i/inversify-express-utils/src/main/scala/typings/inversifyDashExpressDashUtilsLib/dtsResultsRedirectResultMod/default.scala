package typings
package inversifyDashExpressDashUtilsLib.dtsResultsRedirectResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils/dts/results/RedirectResult", JSImport.Default)
@js.native
class default protected () extends RedirectResult {
  def this(location: java.lang.String, apiController: inversifyDashExpressDashUtilsLib.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController) = this()
  def this(location: nodeLib.urlMod.URL, apiController: inversifyDashExpressDashUtilsLib.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController) = this()
  /* CompleteClass */
  override var apiController: js.Any = js.native
  /* CompleteClass */
  override var location: js.Any = js.native
  /* CompleteClass */
  override def executeAsync(): stdLib.Promise[inversifyDashExpressDashUtilsLib.dtsHttpResponseMessageMod.HttpResponseMessage] = js.native
}

