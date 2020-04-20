package typings.instagramPrivateApi.directThreadBroadcastOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExistingThreadOptions extends js.Object {
  var threadIds: (js.Array[String | Double]) | String | Double
}

object ExistingThreadOptions {
  @scala.inline
  def apply(threadIds: (js.Array[String | Double]) | String | Double): ExistingThreadOptions = {
    val __obj = js.Dynamic.literal(threadIds = threadIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExistingThreadOptions]
  }
}

