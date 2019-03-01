package typings
package markoLib.markoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateOptions extends js.Object {
  var buffer: js.UndefOr[scala.Boolean] = js.undefined
  var writeToDisk: js.UndefOr[scala.Boolean] = js.undefined
}

object TemplateOptions {
  @scala.inline
  def apply(
    buffer: js.UndefOr[scala.Boolean] = js.undefined,
    writeToDisk: js.UndefOr[scala.Boolean] = js.undefined
  ): TemplateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(buffer)) __obj.updateDynamic("buffer")(buffer)
    if (!js.isUndefined(writeToDisk)) __obj.updateDynamic("writeToDisk")(writeToDisk)
    __obj.asInstanceOf[TemplateOptions]
  }
}

