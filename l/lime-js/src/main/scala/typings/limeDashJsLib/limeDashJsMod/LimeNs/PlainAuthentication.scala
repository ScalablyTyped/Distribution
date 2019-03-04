package typings
package limeDashJsLib.limeDashJsMod.LimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlainAuthentication extends Authentication {
  var password: java.lang.String
}

object PlainAuthentication {
  @scala.inline
  def apply(password: java.lang.String, scheme: java.lang.String): PlainAuthentication = {
    val __obj = js.Dynamic.literal(password = password, scheme = scheme)
  
    __obj.asInstanceOf[PlainAuthentication]
  }
}

