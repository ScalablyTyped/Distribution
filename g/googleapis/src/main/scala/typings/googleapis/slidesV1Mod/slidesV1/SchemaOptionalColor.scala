package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A color that can either be fully opaque or fully transparent.
  */
@js.native
trait SchemaOptionalColor extends js.Object {
  /**
    * If set, this will be used as an opaque color. If unset, this represents a
    * transparent color.
    */
  var opaqueColor: js.UndefOr[SchemaOpaqueColor] = js.native
}

object SchemaOptionalColor {
  @scala.inline
  def apply(opaqueColor: SchemaOpaqueColor = null): SchemaOptionalColor = {
    val __obj = js.Dynamic.literal()
    if (opaqueColor != null) __obj.updateDynamic("opaqueColor")(opaqueColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOptionalColor]
  }
}

