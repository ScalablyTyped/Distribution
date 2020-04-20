package typings.intercomClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAppApiKey extends js.Object {
  var appApiKey: String
  var appId: String
}

object AnonAppApiKey {
  @scala.inline
  def apply(appApiKey: String, appId: String): AnonAppApiKey = {
    val __obj = js.Dynamic.literal(appApiKey = appApiKey.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAppApiKey]
  }
}

