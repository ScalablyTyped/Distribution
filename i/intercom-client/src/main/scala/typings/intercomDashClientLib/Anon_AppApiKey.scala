package typings
package intercomDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AppApiKey extends js.Object {
  var appApiKey: java.lang.String
  var appId: java.lang.String
}

object Anon_AppApiKey {
  @scala.inline
  def apply(appApiKey: java.lang.String, appId: java.lang.String): Anon_AppApiKey = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("appApiKey")(appApiKey)
    __obj.updateDynamic("appId")(appId)
    __obj.asInstanceOf[Anon_AppApiKey]
  }
}

