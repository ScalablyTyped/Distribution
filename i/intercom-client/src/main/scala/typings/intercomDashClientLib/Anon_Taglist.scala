package typings
package intercomDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Taglist extends js.Object {
  var tags: js.Array[intercomDashClientLib.userMod.Tag]
  var `type`: intercomDashClientLib.intercomDashClientLibStrings.tagDOTlist
}

object Anon_Taglist {
  @scala.inline
  def apply(
    tags: js.Array[intercomDashClientLib.userMod.Tag],
    `type`: intercomDashClientLib.intercomDashClientLibStrings.tagDOTlist
  ): Anon_Taglist = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[Anon_Taglist]
  }
}

