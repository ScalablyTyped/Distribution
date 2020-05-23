package typings.intercomClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppApiKey extends js.Object {
  var appApiKey: String
  var appId: String
}

object AppApiKey {
  @scala.inline
  def apply(appApiKey: String, appId: String): AppApiKey = {
    val __obj = js.Dynamic.literal(appApiKey = appApiKey.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppApiKey]
  }
}

