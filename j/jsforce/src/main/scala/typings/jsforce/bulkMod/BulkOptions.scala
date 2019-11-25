package typings.jsforce.bulkMod

import typings.jsforce.jsforceStrings.Parallel
import typings.jsforce.jsforceStrings.Serial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BulkOptions extends js.Object {
  var concurrencyMode: js.UndefOr[Serial | Parallel] = js.undefined
  var extIdField: String
}

object BulkOptions {
  @scala.inline
  def apply(extIdField: String, concurrencyMode: Serial | Parallel = null): BulkOptions = {
    val __obj = js.Dynamic.literal(extIdField = extIdField.asInstanceOf[js.Any])
    if (concurrencyMode != null) __obj.updateDynamic("concurrencyMode")(concurrencyMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkOptions]
  }
}

