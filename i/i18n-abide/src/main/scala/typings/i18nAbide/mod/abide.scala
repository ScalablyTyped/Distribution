package typings.i18nAbide.mod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("i18n-abide", "abide")
@js.native
object abide extends js.Object {
  def apply(): RequestHandler[ParamsDictionary] = js.native
  def apply(options: AbideOptions): RequestHandler[ParamsDictionary] = js.native
}

