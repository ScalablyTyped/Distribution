package typings.materialUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLoadingStrokeColor extends js.Object {
  var loadingStrokeColor: js.UndefOr[String] = js.undefined
  var strokeColor: js.UndefOr[String] = js.undefined
}

object AnonLoadingStrokeColor {
  @scala.inline
  def apply(loadingStrokeColor: String = null, strokeColor: String = null): AnonLoadingStrokeColor = {
    val __obj = js.Dynamic.literal()
    if (loadingStrokeColor != null) __obj.updateDynamic("loadingStrokeColor")(loadingStrokeColor.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLoadingStrokeColor]
  }
}

