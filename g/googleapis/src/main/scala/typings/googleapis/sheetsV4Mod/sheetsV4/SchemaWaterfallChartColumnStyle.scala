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
  def apply(color: SchemaColor = null, label: String = null): SchemaWaterfallChartColumnStyle = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaWaterfallChartColumnStyle]
  }
}

