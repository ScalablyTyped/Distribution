package typings.marko.markoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateOptions extends js.Object {
  var buffer: js.UndefOr[Boolean] = js.undefined
  var writeToDisk: js.UndefOr[Boolean] = js.undefined
}

object TemplateOptions {
  @scala.inline
  def apply(buffer: js.UndefOr[Boolean] = js.undefined, writeToDisk: js.UndefOr[Boolean] = js.undefined): TemplateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(buffer)) __obj.updateDynamic("buffer")(buffer.asInstanceOf[js.Any])
    if (!js.isUndefined(writeToDisk)) __obj.updateDynamic("writeToDisk")(writeToDisk.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateOptions]
  }
}

