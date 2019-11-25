package typings.jqueryui.JQueryUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightEffect extends js.Object {
  var color: js.UndefOr[String] = js.undefined
}

object HighlightEffect {
  @scala.inline
  def apply(color: String = null): HighlightEffect = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightEffect]
  }
}

