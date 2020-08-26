package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Styles for a waterfall chart column.
  */
@js.native
trait SchemaWaterfallChartColumnStyle extends js.Object {
  /**
    * The color of the column.
    */
  var color: js.UndefOr[SchemaColor] = js.native
  /**
    * The label of the column&#39;s legend.
    */
  var label: js.UndefOr[String] = js.native
}

object SchemaWaterfallChartColumnStyle {
  @scala.inline
  def apply(): SchemaWaterfallChartColumnStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWaterfallChartColumnStyle]
  }
  @scala.inline
  implicit class SchemaWaterfallChartColumnStyleOps[Self <: SchemaWaterfallChartColumnStyle] (val x: Self) extends AnyVal {
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
    def setColor(value: SchemaColor): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
  }
  
}

