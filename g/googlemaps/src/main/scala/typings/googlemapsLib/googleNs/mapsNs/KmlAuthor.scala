package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KmlAuthor extends js.Object {
  var email: java.lang.String
  var name: java.lang.String
  var uri: java.lang.String
}

object KmlAuthor {
  @scala.inline
  def apply(email: java.lang.String, name: java.lang.String, uri: java.lang.String): KmlAuthor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("email")(email)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[KmlAuthor]
  }
}

