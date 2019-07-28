package typings.inversifyDashExpressDashUtils.dtsResultsMod

import typings.inversifyDashExpressDashUtils.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController
import typings.inversifyDashExpressDashUtils.dtsResultsRedirectResultMod.default
import typings.node.urlMod.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils/dts/results", "RedirectResult")
@js.native
class RedirectResult protected () extends default {
  def this(location: String, apiController: BaseHttpController) = this()
  def this(location: URL, apiController: BaseHttpController) = this()
}

