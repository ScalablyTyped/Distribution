package typings.jss.jssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateGenerateIdOptions extends js.Object {
  var minify: js.UndefOr[Boolean] = js.undefined
}

object CreateGenerateIdOptions {
  @scala.inline
  def apply(minify: js.UndefOr[Boolean] = js.undefined): CreateGenerateIdOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(minify)) __obj.updateDynamic("minify")(minify.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGenerateIdOptions]
  }
}

