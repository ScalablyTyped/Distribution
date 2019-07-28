package typings.jointjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Blur extends js.Object {
  var blur: js.UndefOr[Double] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object Anon_Blur {
  @scala.inline
  def apply(
    blur: Int | Double = null,
    color: String = null,
    opacity: Int | Double = null,
    width: Int | Double = null
  ): Anon_Blur = {
    val __obj = js.Dynamic.literal()
    if (blur != null) __obj.updateDynamic("blur")(blur.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Blur]
  }
}

