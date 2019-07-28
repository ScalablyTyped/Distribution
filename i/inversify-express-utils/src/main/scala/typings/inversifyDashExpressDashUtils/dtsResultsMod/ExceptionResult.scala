package typings.inversifyDashExpressDashUtils.dtsResultsMod

import typings.inversifyDashExpressDashUtils.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController
import typings.inversifyDashExpressDashUtils.dtsResultsExceptionResultMod.default
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils/dts/results", "ExceptionResult")
@js.native
class ExceptionResult protected () extends default {
  def this(error: Error, apiController: BaseHttpController) = this()
}

