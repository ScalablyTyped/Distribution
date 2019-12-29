package typings.jpegDashJs

import typings.jpegDashJs.jpegDashJsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorTransform extends js.Object {
  var colorTransform: js.UndefOr[Boolean] = js.undefined
  var useTArray: `true`
}

object Anon_ColorTransform {
  @scala.inline
  def apply(useTArray: `true`, colorTransform: js.UndefOr[Boolean] = js.undefined): Anon_ColorTransform = {
    val __obj = js.Dynamic.literal(useTArray = useTArray.asInstanceOf[js.Any])
    if (!js.isUndefined(colorTransform)) __obj.updateDynamic("colorTransform")(colorTransform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColorTransform]
  }
}

