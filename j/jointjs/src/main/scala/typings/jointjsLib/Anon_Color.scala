package typings
package jointjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends js.Object {
  var color: java.lang.String
  var offset: java.lang.String
  var opacity: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Color {
  @scala.inline
  def apply(color: java.lang.String, offset: java.lang.String, opacity: scala.Int | scala.Double = null): Anon_Color = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("offset")(offset)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Color]
  }
}

