package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapControlsNavigator extends js.Object {
  var position: js.UndefOr[String] = js.undefined
}

object MapControlsNavigator {
  @scala.inline
  def apply(position: String = null): MapControlsNavigator = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[MapControlsNavigator]
  }
}

