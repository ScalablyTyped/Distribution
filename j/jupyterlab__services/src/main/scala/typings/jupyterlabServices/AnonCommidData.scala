package typings.jupyterlabServices

import typings.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCommidData extends js.Object {
  var comm_id: String
  var data: JSONObject
}

object AnonCommidData {
  @scala.inline
  def apply(comm_id: String, data: JSONObject): AnonCommidData = {
    val __obj = js.Dynamic.literal(comm_id = comm_id.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCommidData]
  }
}

