package typings.googlemaps.googleNs.mapsNs

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
    val __obj = js.Dynamic.literal(email = email, name = name, uri = uri)
  
    __obj.asInstanceOf[KmlAuthor]
  }
}

