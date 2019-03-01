package typings
package jsforceLib.bulkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BulkOptions extends js.Object {
  var concurrencyMode: js.UndefOr[jsforceLib.jsforceLibStrings.Serial | jsforceLib.jsforceLibStrings.Parallel] = js.undefined
  var extIdField: java.lang.String
}

object BulkOptions {
  @scala.inline
  def apply(
    extIdField: java.lang.String,
    concurrencyMode: jsforceLib.jsforceLibStrings.Serial | jsforceLib.jsforceLibStrings.Parallel = null
  ): BulkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("extIdField")(extIdField)
    if (concurrencyMode != null) __obj.updateDynamic("concurrencyMode")(concurrencyMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkOptions]
  }
}

