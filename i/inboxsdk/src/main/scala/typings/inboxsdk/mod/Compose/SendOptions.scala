package typings.inboxsdk.mod.Compose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendOptions extends js.Object {
  var sendAndArchive: js.UndefOr[Boolean] = js.undefined
}

object SendOptions {
  @scala.inline
  def apply(sendAndArchive: js.UndefOr[Boolean] = js.undefined): SendOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(sendAndArchive)) __obj.updateDynamic("sendAndArchive")(sendAndArchive.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendOptions]
  }
}

