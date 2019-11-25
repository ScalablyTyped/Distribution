package typings.htmlDashTruncate.htmlDashTruncateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TruncateOptions extends js.Object {
  /**
    * Omission symbol for truncated string, '...' by default.
    */
  var ellipsis: Boolean | String
  /**
    * Flag to specify if keep image tag, false by default.
    */
  var keepImageTag: Boolean
}

object TruncateOptions {
  @scala.inline
  def apply(ellipsis: Boolean | String, keepImageTag: Boolean): TruncateOptions = {
    val __obj = js.Dynamic.literal(ellipsis = ellipsis.asInstanceOf[js.Any], keepImageTag = keepImageTag.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TruncateOptions]
  }
}

