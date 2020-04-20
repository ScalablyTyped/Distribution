package typings.ibmMobilefirst.WL.SecurityUtils

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
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptOptions]
  }
}

