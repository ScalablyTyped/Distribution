package typings.atGrpcGrpcDashJs.buildSrcCallDashStreamMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteObject extends js.Object {
  var flags: js.UndefOr[Double] = js.undefined
  var message: Buffer
}

object WriteObject {
  @scala.inline
  def apply(message: Buffer, flags: Int | Double = null): WriteObject = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteObject]
  }
}

