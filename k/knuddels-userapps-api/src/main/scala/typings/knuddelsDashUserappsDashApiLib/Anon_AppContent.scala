package typings
package knuddelsDashUserappsDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AppContent extends js.Object {
  var appContent: knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.AppContent
  var user: knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.User
}

object Anon_AppContent {
  @scala.inline
  def apply(
    appContent: knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.AppContent,
    user: knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.User
  ): Anon_AppContent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("appContent")(appContent)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[Anon_AppContent]
  }
}

