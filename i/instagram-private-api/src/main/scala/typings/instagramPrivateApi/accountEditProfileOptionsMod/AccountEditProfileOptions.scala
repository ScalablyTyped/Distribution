package typings.instagramPrivateApi.accountEditProfileOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountEditProfileOptions extends js.Object {
  var biography: String
  var email: String
  var external_url: String
  var first_name: String
  var gender: String
  var phone_number: String
  var username: String
}

object AccountEditProfileOptions {
  @scala.inline
  def apply(
    biography: String,
    email: String,
    external_url: String,
    first_name: String,
    gender: String,
    phone_number: String,
    username: String
  ): AccountEditProfileOptions = {
    val __obj = js.Dynamic.literal(biography = biography.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], external_url = external_url.asInstanceOf[js.Any], first_name = first_name.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any], phone_number = phone_number.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AccountEditProfileOptions]
  }
}

