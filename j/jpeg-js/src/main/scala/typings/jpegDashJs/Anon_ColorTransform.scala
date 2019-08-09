package typings.jpegDashJs

import typings.jpegDashJs.jpegDashJsNumbers.`true`
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
    val __obj = js.Dynamic.literal(useTArray = useTArray)
    if (!js.isUndefined(colorTransform)) __obj.updateDynamic("colorTransform")(colorTransform)
    __obj.asInstanceOf[Anon_ColorTransform]
  }
}

