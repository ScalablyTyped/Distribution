package typings.instagramPrivateApi.directThreadBroadcastOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateThreadOptions extends js.Object {
  var userIds: (js.Array[String | Double]) | String | Double
}

object CreateThreadOptions {
  @scala.inline
  def apply(userIds: (js.Array[String | Double]) | String | Double): CreateThreadOptions = {
    val __obj = js.Dynamic.literal(userIds = userIds.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateThreadOptions]
  }
}

