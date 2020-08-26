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
  def apply(): SchemaOptionalColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOptionalColor]
  }
  @scala.inline
  implicit class SchemaOptionalColorOps[Self <: SchemaOptionalColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOpaqueColor(value: SchemaOpaqueColor): Self = this.set("opaqueColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpaqueColor: Self = this.set("opaqueColor", js.undefined)
  }
  
}

