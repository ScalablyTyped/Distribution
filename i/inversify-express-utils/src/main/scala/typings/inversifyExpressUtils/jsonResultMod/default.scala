package typings.inversifyExpressUtils.jsonResultMod

import typings.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
import typings.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils/dts/results/JsonResult", JSImport.Default)
@js.native
class default protected () extends JsonResult {
  def this(json: js.Any, statusCode: Double, apiController: BaseHttpController) = this()
  /* CompleteClass */
  override var apiController: js.Any = js.native
  /* CompleteClass */
  override val json: js.Any = js.native
  /* CompleteClass */
  override val statusCode: Double = js.native
  /* CompleteClass */
  override def executeAsync(): js.Promise[HttpResponseMessage] = js.native
}

