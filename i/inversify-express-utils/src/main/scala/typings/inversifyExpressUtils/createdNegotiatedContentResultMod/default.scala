package typings.inversifyExpressUtils.createdNegotiatedContentResultMod

import typings.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
import typings.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils/dts/results/CreatedNegotiatedContentResult", JSImport.Default)
@js.native
class default[T] protected () extends CreatedNegotiatedContentResult[T] {
  def this(location: String, content: T, apiController: BaseHttpController) = this()
  def this(location: URL_, content: T, apiController: BaseHttpController) = this()
}

