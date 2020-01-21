package typings.kikBrowser

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
    val __obj = js.Dynamic.literal(firstName = firstName.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any], pic = pic.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KikUser]
  }
}

