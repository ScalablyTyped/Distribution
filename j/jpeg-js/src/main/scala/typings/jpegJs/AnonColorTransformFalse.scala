package typings.jpegJs

import typings.jpegJs.jpegJsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColorTransformFalse extends js.Object {
  var colorTransform: js.UndefOr[Boolean] = js.undefined
  var useTArray: js.UndefOr[`false`] = js.undefined
}

object AnonColorTransformFalse {
  @scala.inline
  def apply(colorTransform: js.UndefOr[Boolean] = js.undefined, useTArray: `false` = null): AnonColorTransformFalse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(colorTransform)) __obj.updateDynamic("colorTransform")(colorTransform.asInstanceOf[js.Any])
    if (useTArray != null) __obj.updateDynamic("useTArray")(useTArray.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColorTransformFalse]
  }
}

