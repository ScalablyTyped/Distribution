package typings
package intercomDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Perpage extends js.Object {
  var per_page: js.UndefOr[scala.Double] = js.undefined
  var `type`: intercomDashClientLib.intercomDashClientLibStrings.user
}

object Anon_Perpage {
  @scala.inline
  def apply(
    `type`: intercomDashClientLib.intercomDashClientLibStrings.user,
    per_page: scala.Int | scala.Double = null
  ): Anon_Perpage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Perpage]
  }
}

