package typings
package inversifyDashExpressDashUtilsLib.dtsResultsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils/dts/results", "CreatedNegotiatedContentResult")
@js.native
class CreatedNegotiatedContentResult[T] protected ()
  extends inversifyDashExpressDashUtilsLib.dtsResultsCreatedNegotiatedContentResultMod.default[T] {
  def this(location: java.lang.String, content: T, apiController: inversifyDashExpressDashUtilsLib.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController) = this()
  def this(location: nodeLib.urlMod.URL, content: T, apiController: inversifyDashExpressDashUtilsLib.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController) = this()
}

