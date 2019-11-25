package typings.atJupyterlabServices

import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommidData extends js.Object {
  var comm_id: String
  var data: JSONObject
}

object Anon_CommidData {
  @scala.inline
  def apply(comm_id: String, data: JSONObject): Anon_CommidData = {
    val __obj = js.Dynamic.literal(comm_id = comm_id.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CommidData]
  }
}

