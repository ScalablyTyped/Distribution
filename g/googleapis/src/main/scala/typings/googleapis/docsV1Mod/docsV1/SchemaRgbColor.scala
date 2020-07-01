package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An RGB color.
  */
@js.native
trait SchemaRgbColor extends js.Object {
  /**
    * The blue component of the color, from 0.0 to 1.0.
    */
  var blue: js.UndefOr[Double] = js.native
  /**
    * The green component of the color, from 0.0 to 1.0.
    */
  var green: js.UndefOr[Double] = js.native
  /**
    * The red component of the color, from 0.0 to 1.0.
    */
  var red: js.UndefOr[Double] = js.native
}

object SchemaRgbColor {
  @scala.inline
  def apply(
    blue: js.UndefOr[Double] = js.undefined,
    green: js.UndefOr[Double] = js.undefined,
    red: js.UndefOr[Double] = js.undefined
  ): SchemaRgbColor = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blue)) __obj.updateDynamic("blue")(blue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(green)) __obj.updateDynamic("green")(green.get.asInstanceOf[js.Any])
    if (!js.isUndefined(red)) __obj.updateDynamic("red")(red.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRgbColor]
  }
}

