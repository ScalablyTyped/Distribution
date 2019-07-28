package typings.harDashFormat.harDashFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryString extends js.Object {
  /**  A comment provided by the user or the application */
  var comment: js.UndefOr[String] = js.undefined
  var name: String
  var value: String
}

object QueryString {
  @scala.inline
  def apply(name: String, value: String, comment: String = null): QueryString = {
    val __obj = js.Dynamic.literal(name = name, value = value)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    __obj.asInstanceOf[QueryString]
  }
}

