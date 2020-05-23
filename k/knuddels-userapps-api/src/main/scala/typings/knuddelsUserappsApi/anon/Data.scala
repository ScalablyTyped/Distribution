package typings.knuddelsUserappsApi.anon

import typings.knuddelsUserappsApi.mod.KnuddelsEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: KnuddelsEvent
  var `type`: String
}

object Data {
  @scala.inline
  def apply(data: KnuddelsEvent, `type`: String): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

