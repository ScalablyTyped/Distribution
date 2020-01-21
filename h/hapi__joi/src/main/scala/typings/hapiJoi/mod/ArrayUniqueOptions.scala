package typings.hapiJoi.mod

import typings.hapiJoi.hapiJoiBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayUniqueOptions extends HierarchySeparatorOptions {
  /**
    * if true, undefined values for the dot notation string comparator will not cause the array to fail on uniqueness.
    *
    * @default false
    */
  var ignoreUndefined: js.UndefOr[Boolean] = js.undefined
}

object ArrayUniqueOptions {
  @scala.inline
  def apply(ignoreUndefined: js.UndefOr[Boolean] = js.undefined, separator: String | `false` = null): ArrayUniqueOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreUndefined)) __obj.updateDynamic("ignoreUndefined")(ignoreUndefined.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayUniqueOptions]
  }
}

