package typings.materialDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LoadingStrokeColor extends js.Object {
  var loadingStrokeColor: js.UndefOr[String] = js.undefined
  var strokeColor: js.UndefOr[String] = js.undefined
}

object Anon_LoadingStrokeColor {
  @scala.inline
  def apply(loadingStrokeColor: String = null, strokeColor: String = null): Anon_LoadingStrokeColor = {
    val __obj = js.Dynamic.literal()
    if (loadingStrokeColor != null) __obj.updateDynamic("loadingStrokeColor")(loadingStrokeColor)
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor)
    __obj.asInstanceOf[Anon_LoadingStrokeColor]
  }
}

