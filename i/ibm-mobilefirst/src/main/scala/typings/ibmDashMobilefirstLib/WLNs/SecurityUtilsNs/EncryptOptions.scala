package typings
package ibmDashMobilefirstLib.WLNs.SecurityUtilsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptOptions extends js.Object {
  var key: java.lang.String
  var text: java.lang.String
}

object EncryptOptions {
  @scala.inline
  def apply(key: java.lang.String, text: java.lang.String): EncryptOptions = {
    val __obj = js.Dynamic.literal(key = key, text = text)
  
    __obj.asInstanceOf[EncryptOptions]
  }
}

