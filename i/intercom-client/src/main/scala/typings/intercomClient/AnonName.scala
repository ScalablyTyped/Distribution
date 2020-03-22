package typings.intercomClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var id: String
  var name: String
  var `type`: String
}

object AnonName {
  @scala.inline
  def apply(id: String, name: String, `type`: String): AnonName = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonName]
  }
}

