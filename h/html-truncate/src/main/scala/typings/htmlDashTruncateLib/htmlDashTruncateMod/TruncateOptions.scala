package typings
package htmlDashTruncateLib.htmlDashTruncateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TruncateOptions extends js.Object {
  /**
    * Omission symbol for truncated string, '...' by default.
    */
  var ellipsis: scala.Boolean | java.lang.String
  /**
    * Flag to specify if keep image tag, false by default.
    */
  var keepImageTag: scala.Boolean
}

object TruncateOptions {
  @scala.inline
  def apply(ellipsis: scala.Boolean | java.lang.String, keepImageTag: scala.Boolean): TruncateOptions = {
    val __obj = js.Dynamic.literal(ellipsis = ellipsis.asInstanceOf[js.Any], keepImageTag = keepImageTag)
  
    __obj.asInstanceOf[TruncateOptions]
  }
}

