package typings
package harDashFormatLib.harDashFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostData extends js.Object {
  /**  A comment provided by the user or the application */
  var comment: js.UndefOr[java.lang.String] = js.undefined
  /** Mime type of posted data. */
  var mimeType: java.lang.String
  /**
    * List of posted parameters (in case of URL encoded parameters).
    *
    * _`text` and `params` fields are mutually exclusive._
    */
  var params: js.Array[Param]
  /**
    * Plain text posted data
    *
    * _`params` and `text` fields are mutually exclusive._
    */
  var text: java.lang.String
}

object PostData {
  @scala.inline
  def apply(
    mimeType: java.lang.String,
    params: js.Array[Param],
    text: java.lang.String,
    comment: java.lang.String = null
  ): PostData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mimeType")(mimeType)
    __obj.updateDynamic("params")(params)
    __obj.updateDynamic("text")(text)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    __obj.asInstanceOf[PostData]
  }
}

