package typings
package graphqlDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Locations extends js.Object {
  var locations: js.Array[Anon_Column]
  var message: java.lang.String
  var path: js.Array[java.lang.String]
}

object Anon_Locations {
  @scala.inline
  def apply(locations: js.Array[Anon_Column], message: java.lang.String, path: js.Array[java.lang.String]): Anon_Locations = {
    val __obj = js.Dynamic.literal(locations = locations, message = message, path = path)
  
    __obj.asInstanceOf[Anon_Locations]
  }
}

