package typings.iron.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HMacResult extends js.Object {
  var digest: String
  var salt: String
}

object HMacResult {
  @scala.inline
  def apply(digest: String, salt: String): HMacResult = {
    val __obj = js.Dynamic.literal(digest = digest.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
    __obj.asInstanceOf[HMacResult]
  }
}

