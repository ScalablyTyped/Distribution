package typings.jweixin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrMsg extends js.Object {
  var errMsg: String
}

object ErrMsg {
  @scala.inline
  def apply(errMsg: String): ErrMsg = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrMsg]
  }
}

