package typings
package harDashFormatLib.harDashFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Header extends js.Object {
  /**  A comment provided by the user or the application */
  var comment: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var value: java.lang.String
}

object Header {
  @scala.inline
  def apply(name: java.lang.String, value: java.lang.String, comment: java.lang.String = null): Header = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("value")(value)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    __obj.asInstanceOf[Header]
  }
}

