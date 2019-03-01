package typings
package jqueryuiLib.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightEffect extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
}

object HighlightEffect {
  @scala.inline
  def apply(color: java.lang.String = null): HighlightEffect = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    __obj.asInstanceOf[HighlightEffect]
  }
}

