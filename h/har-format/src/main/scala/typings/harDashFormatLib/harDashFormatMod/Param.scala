package typings
package harDashFormatLib.harDashFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Param extends js.Object {
  /**  A comment provided by the user or the application */
  var comment: js.UndefOr[java.lang.String] = js.undefined
  /** content type of a posted file. */
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  /** name of a posted file. */
  var fileName: js.UndefOr[java.lang.String] = js.undefined
  /** name of a posted parameter. */
  var name: java.lang.String
  /** value of a posted parameter or content of a posted file */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Param {
  @scala.inline
  def apply(
    name: java.lang.String,
    comment: java.lang.String = null,
    contentType: java.lang.String = null,
    fileName: java.lang.String = null,
    value: java.lang.String = null
  ): Param = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Param]
  }
}

