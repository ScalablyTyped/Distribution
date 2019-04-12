package typings
package atHapiIronLib.atHapiIronMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HMacResult extends js.Object {
  var digest: java.lang.String
  var salt: java.lang.String
}

object HMacResult {
  @scala.inline
  def apply(digest: java.lang.String, salt: java.lang.String): HMacResult = {
    val __obj = js.Dynamic.literal(digest = digest, salt = salt)
  
    __obj.asInstanceOf[HMacResult]
  }
}

