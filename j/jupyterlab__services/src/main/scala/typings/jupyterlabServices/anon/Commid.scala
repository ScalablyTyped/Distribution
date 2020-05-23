package typings.jupyterlabServices.anon

import typings.luminoCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Commid extends js.Object {
  var comm_id: String
  var data: JSONObject
}

object Commid {
  @scala.inline
  def apply(comm_id: String, data: JSONObject): Commid = {
    val __obj = js.Dynamic.literal(comm_id = comm_id.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commid]
  }
}

