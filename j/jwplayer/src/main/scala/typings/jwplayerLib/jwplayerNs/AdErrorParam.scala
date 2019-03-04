package typings
package jwplayerLib.jwplayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdErrorParam extends js.Object {
  var message: java.lang.String
  var tag: java.lang.String
}

object AdErrorParam {
  @scala.inline
  def apply(message: java.lang.String, tag: java.lang.String): AdErrorParam = {
    val __obj = js.Dynamic.literal(message = message, tag = tag)
  
    __obj.asInstanceOf[AdErrorParam]
  }
}

