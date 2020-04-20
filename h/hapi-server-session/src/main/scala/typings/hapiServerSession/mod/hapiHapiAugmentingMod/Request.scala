package typings.hapiServerSession.mod.hapiHapiAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var session: js.Any
}

object Request {
  @scala.inline
  def apply(session: js.Any): Request = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
}

