package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKid extends js.Object {
  var kid: String
}

object AnonKid {
  @scala.inline
  def apply(kid: String): AnonKid = {
    val __obj = js.Dynamic.literal(kid = kid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonKid]
  }
}

