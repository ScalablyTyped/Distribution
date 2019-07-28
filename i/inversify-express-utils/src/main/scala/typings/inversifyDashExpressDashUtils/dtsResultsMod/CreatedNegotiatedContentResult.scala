package typings.inversifyDashExpressDashUtils.dtsResultsMod

import typings.inversifyDashExpressDashUtils.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController
import typings.inversifyDashExpressDashUtils.dtsResultsCreatedNegotiatedContentResultMod.default
import typings.node.urlMod.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils/dts/results", "CreatedNegotiatedContentResult")
@js.native
class CreatedNegotiatedContentResult[T] protected () extends default[T] {
  def this(location: String, content: T, apiController: BaseHttpController) = this()
  def this(location: URL, content: T, apiController: BaseHttpController) = this()
}

