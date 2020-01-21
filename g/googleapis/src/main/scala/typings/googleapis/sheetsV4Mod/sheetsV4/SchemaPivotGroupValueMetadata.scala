package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata about a value in a pivot grouping.
  */
@js.native
trait SchemaPivotGroupValueMetadata extends js.Object {
  /**
    * True if the data corresponding to the value is collapsed.
    */
  var collapsed: js.UndefOr[Boolean] = js.native
  /**
    * The calculated value the metadata corresponds to. (Note that formulaValue
    * is not valid,  because the values will be calculated.)
    */
  var value: js.UndefOr[SchemaExtendedValue] = js.native
}

object SchemaPivotGroupValueMetadata {
  @scala.inline
  def apply(collapsed: js.UndefOr[Boolean] = js.undefined, value: SchemaExtendedValue = null): SchemaPivotGroupValueMetadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPivotGroupValueMetadata]
  }
}

