package typings.atHapiBoom.atHapiBoomMod.unauthorized

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MissingAuth extends js.Object {
  /**
    * Indicate whether the 401 unauthorized error is due to missing credentials (vs. invalid)
    */
  var isMissing: Boolean
}

object MissingAuth {
  @scala.inline
  def apply(isMissing: Boolean): MissingAuth = {
    val __obj = js.Dynamic.literal(isMissing = isMissing.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MissingAuth]
  }
}

