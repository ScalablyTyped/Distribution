package typings
package limeDashJsLib.limeDashJsMod.LimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyAuthentication extends Authentication {
  var key: java.lang.String
}

object KeyAuthentication {
  @scala.inline
  def apply(key: java.lang.String, scheme: java.lang.String): KeyAuthentication = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("scheme")(scheme)
    __obj.asInstanceOf[KeyAuthentication]
  }
}

