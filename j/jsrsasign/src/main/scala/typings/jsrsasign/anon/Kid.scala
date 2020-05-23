package typings.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Kid extends js.Object {
  var kid: String
}

object Kid {
  @scala.inline
  def apply(kid: String): Kid = {
    val __obj = js.Dynamic.literal(kid = kid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Kid]
  }
}

