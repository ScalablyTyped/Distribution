package typings.atHapiJoi.atHapiJoiMod

import typings.atHapiJoi.atHapiJoiNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HierarchySeparatorOptions extends js.Object {
  /**
    * overrides the default `.` hierarchy separator. Set to false to treat the key as a literal value.
    *
    * @default '.'
    */
  var separator: js.UndefOr[String | `false`] = js.undefined
}

object HierarchySeparatorOptions {
  @scala.inline
  def apply(separator: String | `false` = null): HierarchySeparatorOptions = {
    val __obj = js.Dynamic.literal()
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    __obj.asInstanceOf[HierarchySeparatorOptions]
  }
}

