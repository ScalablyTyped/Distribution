package typings.instagramPrivateApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEncrypted extends js.Object {
  var encrypted: String
  var time: String
}

object AnonEncrypted {
  @scala.inline
  def apply(encrypted: String, time: String): AnonEncrypted = {
    val __obj = js.Dynamic.literal(encrypted = encrypted.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEncrypted]
  }
}

