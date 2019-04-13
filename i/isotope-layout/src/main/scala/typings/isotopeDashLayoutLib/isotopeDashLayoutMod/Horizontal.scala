package typings
package isotopeDashLayoutLib.isotopeDashLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Horizontal extends js.Object {
  var verticalAligment: js.UndefOr[scala.Double] = js.undefined
}

object Horizontal {
  @scala.inline
  def apply(verticalAligment: scala.Int | scala.Double = null): Horizontal = {
    val __obj = js.Dynamic.literal()
    if (verticalAligment != null) __obj.updateDynamic("verticalAligment")(verticalAligment.asInstanceOf[js.Any])
    __obj.asInstanceOf[Horizontal]
  }
}

