package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The border styling properties of the TableBorderCell.
  */
@js.native
trait SchemaTableBorderProperties extends js.Object {
  /**
    * The dash style of the border.
    */
  var dashStyle: js.UndefOr[String] = js.native
  /**
    * The fill of the table border.
    */
  var tableBorderFill: js.UndefOr[SchemaTableBorderFill] = js.native
  /**
    * The thickness of the border.
    */
  var weight: js.UndefOr[SchemaDimension] = js.native
}

object SchemaTableBorderProperties {
  @scala.inline
  def apply(
    dashStyle: String = null,
    tableBorderFill: SchemaTableBorderFill = null,
    weight: SchemaDimension = null
  ): SchemaTableBorderProperties = {
    val __obj = js.Dynamic.literal()
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (tableBorderFill != null) __obj.updateDynamic("tableBorderFill")(tableBorderFill.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTableBorderProperties]
  }
}

