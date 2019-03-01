package typings
package materialDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LoadingStrokeColor extends js.Object {
  var loadingStrokeColor: js.UndefOr[java.lang.String] = js.undefined
  var strokeColor: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_LoadingStrokeColor {
  @scala.inline
  def apply(loadingStrokeColor: java.lang.String = null, strokeColor: java.lang.String = null): Anon_LoadingStrokeColor = {
    val __obj = js.Dynamic.literal()
    if (loadingStrokeColor != null) __obj.updateDynamic("loadingStrokeColor")(loadingStrokeColor)
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor)
    __obj.asInstanceOf[Anon_LoadingStrokeColor]
  }
}

