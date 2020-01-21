package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSortOptions extends js.Object {
  /**
    * Name of the operator corresponding to the field to sort on. The
    * corresponding property must be marked as sortable.
    */
  var operatorName: js.UndefOr[String] = js.native
  /**
    * Ascending is the default sort order
    */
  var sortOrder: js.UndefOr[String] = js.native
}

object SchemaSortOptions {
  @scala.inline
  def apply(operatorName: String = null, sortOrder: String = null): SchemaSortOptions = {
    val __obj = js.Dynamic.literal()
    if (operatorName != null) __obj.updateDynamic("operatorName")(operatorName.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSortOptions]
  }
}

