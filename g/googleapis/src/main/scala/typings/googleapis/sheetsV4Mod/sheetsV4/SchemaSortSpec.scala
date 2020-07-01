package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A sort order associated with a specific column or row.
  */
@js.native
trait SchemaSortSpec extends js.Object {
  /**
    * The dimension the sort should be applied to.
    */
  var dimensionIndex: js.UndefOr[Double] = js.native
  /**
    * The order data should be sorted.
    */
  var sortOrder: js.UndefOr[String] = js.native
}

object SchemaSortSpec {
  @scala.inline
  def apply(dimensionIndex: js.UndefOr[Double] = js.undefined, sortOrder: String = null): SchemaSortSpec = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dimensionIndex)) __obj.updateDynamic("dimensionIndex")(dimensionIndex.get.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSortSpec]
  }
}

