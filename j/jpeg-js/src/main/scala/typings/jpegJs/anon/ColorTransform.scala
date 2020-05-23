package typings.jpegJs.anon

import typings.jpegJs.jpegJsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorTransform extends js.Object {
  var colorTransform: js.UndefOr[Boolean] = js.undefined
  var useTArray: `true`
}

object ColorTransform {
  @scala.inline
  def apply(useTArray: `true`, colorTransform: js.UndefOr[Boolean] = js.undefined): ColorTransform = {
    val __obj = js.Dynamic.literal(useTArray = useTArray.asInstanceOf[js.Any])
    if (!js.isUndefined(colorTransform)) __obj.updateDynamic("colorTransform")(colorTransform.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorTransform]
  }
}

