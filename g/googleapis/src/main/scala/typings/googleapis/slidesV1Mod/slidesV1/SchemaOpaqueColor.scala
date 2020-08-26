package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A themeable solid color value.
  */
@js.native
trait SchemaOpaqueColor extends js.Object {
  /**
    * An opaque RGB color.
    */
  var rgbColor: js.UndefOr[SchemaRgbColor] = js.native
  /**
    * An opaque theme color.
    */
  var themeColor: js.UndefOr[String] = js.native
}

object SchemaOpaqueColor {
  @scala.inline
  def apply(): SchemaOpaqueColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOpaqueColor]
  }
  @scala.inline
  implicit class SchemaOpaqueColorOps[Self <: SchemaOpaqueColor] (val x: Self) extends AnyVal {
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
    def setRgbColor(value: SchemaRgbColor): Self = this.set("rgbColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRgbColor: Self = this.set("rgbColor", js.undefined)
    @scala.inline
    def setThemeColor(value: String): Self = this.set("themeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThemeColor: Self = this.set("themeColor", js.undefined)
  }
  
}

