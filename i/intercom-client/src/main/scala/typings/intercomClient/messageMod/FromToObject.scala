package typings.intercomClient.messageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FromToObject extends js.Object {
  var id: String
  var `type`: String
}

object FromToObject {
  @scala.inline
  def apply(id: String, `type`: String): FromToObject = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromToObject]
  }
}

