package typings.inversifyExpressUtils.redirectResultMod

import typings.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
import typings.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils/dts/results/RedirectResult", JSImport.Default)
@js.native
class default protected () extends RedirectResult {
  def this(location: String, apiController: BaseHttpController) = this()
  def this(location: URL_, apiController: BaseHttpController) = this()
}

