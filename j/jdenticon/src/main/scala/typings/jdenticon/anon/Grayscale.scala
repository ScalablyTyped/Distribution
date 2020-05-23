package typings.jdenticon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Grayscale extends js.Object {
  /**
    * Specifies the saturation of originally colored shapes of an icon. The saturation is expressed as a
    * number in the range [0.0, 1.0].
    */
  var color: js.UndefOr[Double] = js.undefined
  /**
    * Specifies the saturation of originally grayscale shapes of an icon. The saturation is expressed as a
    * number in the range [0.0, 1.0].
    */
  var grayscale: js.UndefOr[Double] = js.undefined
}

object Grayscale {
  @scala.inline
  def apply(color: js.UndefOr[Double] = js.undefined, grayscale: js.UndefOr[Double] = js.undefined): Grayscale = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color.get.asInstanceOf[js.Any])
    if (!js.isUndefined(grayscale)) __obj.updateDynamic("grayscale")(grayscale.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Grayscale]
  }
}

