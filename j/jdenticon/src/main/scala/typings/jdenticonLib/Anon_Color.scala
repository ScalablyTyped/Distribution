package typings
package jdenticonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends js.Object {
  var color: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var grayscale: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object Anon_Color {
  @scala.inline
  def apply(color: js.Array[scala.Double] = null, grayscale: js.Array[scala.Double] = null): Anon_Color = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (grayscale != null) __obj.updateDynamic("grayscale")(grayscale)
    __obj.asInstanceOf[Anon_Color]
  }
}

