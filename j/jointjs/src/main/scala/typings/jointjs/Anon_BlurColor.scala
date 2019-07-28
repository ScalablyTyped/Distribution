package typings.jointjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlurColor extends js.Object {
  var blur: js.UndefOr[Double] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var dx: js.UndefOr[Double] = js.undefined
  var dy: js.UndefOr[Double] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
}

object Anon_BlurColor {
  @scala.inline
  def apply(
    blur: Int | Double = null,
    color: String = null,
    dx: Int | Double = null,
    dy: Int | Double = null,
    opacity: Int | Double = null
  ): Anon_BlurColor = {
    val __obj = js.Dynamic.literal()
    if (blur != null) __obj.updateDynamic("blur")(blur.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (dx != null) __obj.updateDynamic("dx")(dx.asInstanceOf[js.Any])
    if (dy != null) __obj.updateDynamic("dy")(dy.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BlurColor]
  }
}

