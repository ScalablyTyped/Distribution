package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A solid color fill. The page or page element is filled entirely with the
  * specified color value.  If any field is unset, its value may be inherited
  * from a parent placeholder if it exists.
  */
@js.native
trait SchemaSolidFill extends js.Object {
  /**
    * The fraction of this `color` that should be applied to the pixel. That
    * is, the final pixel color is defined by the equation:    pixel color =
    * alpha * (color) + (1.0 - alpha) * (background color)  This means that a
    * value of 1.0 corresponds to a solid color, whereas a value of 0.0
    * corresponds to a completely transparent color.
    */
  var alpha: js.UndefOr[Double] = js.native
  /**
    * The color value of the solid fill.
    */
  var color: js.UndefOr[SchemaOpaqueColor] = js.native
}

object SchemaSolidFill {
  @scala.inline
  def apply(alpha: Int | Double = null, color: SchemaOpaqueColor = null): SchemaSolidFill = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSolidFill]
  }
}

