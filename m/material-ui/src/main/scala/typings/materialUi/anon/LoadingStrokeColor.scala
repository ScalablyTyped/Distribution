package typings.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadingStrokeColor extends js.Object {
  var loadingStrokeColor: js.UndefOr[String] = js.undefined
  var strokeColor: js.UndefOr[String] = js.undefined
}

object LoadingStrokeColor {
  @scala.inline
  def apply(loadingStrokeColor: String = null, strokeColor: String = null): LoadingStrokeColor = {
    val __obj = js.Dynamic.literal()
    if (loadingStrokeColor != null) __obj.updateDynamic("loadingStrokeColor")(loadingStrokeColor.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadingStrokeColor]
  }
}

