package typings.kosCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PayloadParam extends js.Object {
  var payload: Param
}

object PayloadParam {
  @scala.inline
  def apply(payload: Param): PayloadParam = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayloadParam]
  }
}

