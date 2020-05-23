package typings.kurentoClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var description: String
  var errorCode: Double
  var `type`: String
}

object Error {
  @scala.inline
  def apply(description: String, errorCode: Double, `type`: String): Error = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], errorCode = errorCode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
}

