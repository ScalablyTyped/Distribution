package typings.graphqlReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLocations extends js.Object {
  var locations: js.Array[AnonColumn]
  var message: String
  var path: js.Array[String]
}

object AnonLocations {
  @scala.inline
  def apply(locations: js.Array[AnonColumn], message: String, path: js.Array[String]): AnonLocations = {
    val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLocations]
  }
}

