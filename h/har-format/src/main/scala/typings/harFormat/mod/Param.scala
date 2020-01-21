package typings.harFormat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Param extends js.Object {
  /**  A comment provided by the user or the application */
  var comment: js.UndefOr[String] = js.undefined
  /** content type of a posted file. */
  var contentType: js.UndefOr[String] = js.undefined
  /** name of a posted file. */
  var fileName: js.UndefOr[String] = js.undefined
  /** name of a posted parameter. */
  var name: String
  /** value of a posted parameter or content of a posted file */
  var value: js.UndefOr[String] = js.undefined
}

object Param {
  @scala.inline
  def apply(
    name: String,
    comment: String = null,
    contentType: String = null,
    fileName: String = null,
    value: String = null
  ): Param = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Param]
  }
}

