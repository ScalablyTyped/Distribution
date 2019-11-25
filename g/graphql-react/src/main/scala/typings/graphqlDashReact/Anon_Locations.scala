package typings.graphqlDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Locations extends js.Object {
  var locations: js.Array[Anon_Column]
  var message: String
  var path: js.Array[String]
}

object Anon_Locations {
  @scala.inline
  def apply(locations: js.Array[Anon_Column], message: String, path: js.Array[String]): Anon_Locations = {
    val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Locations]
  }
}

