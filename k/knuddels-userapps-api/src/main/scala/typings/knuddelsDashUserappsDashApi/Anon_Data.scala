package typings.knuddelsDashUserappsDashApi

import typings.knuddelsDashUserappsDashApi.knuddelsDashUserappsDashApiMod.KnuddelsEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: KnuddelsEvent
  var `type`: String
}

object Anon_Data {
  @scala.inline
  def apply(data: KnuddelsEvent, `type`: String): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Data]
  }
}

