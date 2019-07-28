package typings.ibmDashMobilefirst.WLNs.SecurityUtilsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptOptions extends js.Object {
  var key: String
  var text: String
}

object EncryptOptions {
  @scala.inline
  def apply(key: String, text: String): EncryptOptions = {
    val __obj = js.Dynamic.literal(key = key, text = text)
  
    __obj.asInstanceOf[EncryptOptions]
  }
}

