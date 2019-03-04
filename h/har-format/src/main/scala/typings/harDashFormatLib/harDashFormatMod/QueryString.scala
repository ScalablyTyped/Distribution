package typings
package harDashFormatLib.harDashFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryString extends js.Object {
  /**  A comment provided by the user or the application */
  var comment: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var value: java.lang.String
}

object QueryString {
  @scala.inline
  def apply(name: java.lang.String, value: java.lang.String, comment: java.lang.String = null): QueryString = {
    val __obj = js.Dynamic.literal(name = name, value = value)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    __obj.asInstanceOf[QueryString]
  }
}

