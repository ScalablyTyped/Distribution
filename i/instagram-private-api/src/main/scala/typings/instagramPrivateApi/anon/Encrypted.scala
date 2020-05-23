package typings.instagramPrivateApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Encrypted extends js.Object {
  var encrypted: String
  var time: String
}

object Encrypted {
  @scala.inline
  def apply(encrypted: String, time: String): Encrypted = {
    val __obj = js.Dynamic.literal(encrypted = encrypted.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encrypted]
  }
}

