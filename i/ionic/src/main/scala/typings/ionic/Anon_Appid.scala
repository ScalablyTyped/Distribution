package typings.ionic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Appid extends js.Object {
  var `app-id`: String
  var `channel-name`: String
  var `max-store`: String
  var `min-background-duration`: String
  var `update-api`: String
  var `update-method`: String
}

object Anon_Appid {
  @scala.inline
  def apply(
    `app-id`: String,
    `channel-name`: String,
    `max-store`: String,
    `min-background-duration`: String,
    `update-api`: String,
    `update-method`: String
  ): Anon_Appid = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("app-id")(`app-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("channel-name")(`channel-name`.asInstanceOf[js.Any])
    __obj.updateDynamic("max-store")(`max-store`.asInstanceOf[js.Any])
    __obj.updateDynamic("min-background-duration")(`min-background-duration`.asInstanceOf[js.Any])
    __obj.updateDynamic("update-api")(`update-api`.asInstanceOf[js.Any])
    __obj.updateDynamic("update-method")(`update-method`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Appid]
  }
}

