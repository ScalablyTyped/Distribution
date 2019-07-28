package typings.kikDashBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KikUser extends js.Object {
  var firstName: String
  var fullName: String
  var lastName: String
  var pic: String
  var thumbnail: String
  var username: String
}

object KikUser {
  @scala.inline
  def apply(
    firstName: String,
    fullName: String,
    lastName: String,
    pic: String,
    thumbnail: String,
    username: String
  ): KikUser = {
    val __obj = js.Dynamic.literal(firstName = firstName, fullName = fullName, lastName = lastName, pic = pic, thumbnail = thumbnail, username = username)
  
    __obj.asInstanceOf[KikUser]
  }
}

