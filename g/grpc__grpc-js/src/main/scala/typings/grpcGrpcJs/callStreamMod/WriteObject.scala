package typings.grpcGrpcJs.callStreamMod

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
  def apply(message: Buffer, flags: js.UndefOr[Double] = js.undefined): WriteObject = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (!js.isUndefined(flags)) __obj.updateDynamic("flags")(flags.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteObject]
  }
}

