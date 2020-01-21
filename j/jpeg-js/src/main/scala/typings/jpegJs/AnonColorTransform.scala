package typings.jpegJs

import typings.jpegJs.jpegJsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColorTransform extends js.Object {
  var colorTransform: js.UndefOr[Boolean] = js.undefined
  var useTArray: `true`
}

object AnonColorTransform {
  @scala.inline
  def apply(useTArray: `true`, colorTransform: js.UndefOr[Boolean] = js.undefined): AnonColorTransform = {
    val __obj = js.Dynamic.literal(useTArray = useTArray.asInstanceOf[js.Any])
    if (!js.isUndefined(colorTransform)) __obj.updateDynamic("colorTransform")(colorTransform.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColorTransform]
  }
}

