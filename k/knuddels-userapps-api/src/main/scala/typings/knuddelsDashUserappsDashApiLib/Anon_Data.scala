package typings
package knuddelsDashUserappsDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.KnuddelsEvent
  var `type`: java.lang.String
}

object Anon_Data {
  @scala.inline
  def apply(
    data: knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.KnuddelsEvent,
    `type`: java.lang.String
  ): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Data]
  }
}

