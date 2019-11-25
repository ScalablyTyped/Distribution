package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KmlAuthor extends js.Object {
  var email: String
  var name: String
  var uri: String
}

object KmlAuthor {
  @scala.inline
  def apply(email: String, name: String, uri: String): KmlAuthor = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KmlAuthor]
  }
}

