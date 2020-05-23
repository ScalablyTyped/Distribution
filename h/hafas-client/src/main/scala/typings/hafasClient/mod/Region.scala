package typings.hafasClient.mod

import typings.hafasClient.hafasClientStrings.region
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Region extends js.Object {
  var id: String
  var name: String
  var stations: js.Array[String]
  var `type`: region
}

object Region {
  @scala.inline
  def apply(id: String, name: String, stations: js.Array[String], `type`: region): Region = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stations = stations.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Region]
  }
}

