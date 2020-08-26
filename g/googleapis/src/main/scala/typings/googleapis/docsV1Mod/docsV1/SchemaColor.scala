package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A solid color.
  */
@js.native
trait SchemaColor extends js.Object {
  /**
    * The RGB color value.
    */
  var rgbColor: js.UndefOr[SchemaRgbColor] = js.native
}

object SchemaColor {
  @scala.inline
  def apply(): SchemaColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaColor]
  }
  @scala.inline
  implicit class SchemaColorOps[Self <: SchemaColor] (val x: Self) extends AnyVal {
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
  }
  
}

