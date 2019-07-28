package typings.intercomDashClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AppApiKey extends js.Object {
  var appApiKey: String
  var appId: String
}

object Anon_AppApiKey {
  @scala.inline
  def apply(appApiKey: String, appId: String): Anon_AppApiKey = {
    val __obj = js.Dynamic.literal(appApiKey = appApiKey, appId = appId)
  
    __obj.asInstanceOf[Anon_AppApiKey]
  }
}

