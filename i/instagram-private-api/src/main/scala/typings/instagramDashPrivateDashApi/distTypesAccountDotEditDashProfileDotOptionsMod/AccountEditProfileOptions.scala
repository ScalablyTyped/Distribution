package typings.instagramDashPrivateDashApi.distTypesAccountDotEditDashProfileDotOptionsMod

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
    val __obj = js.Dynamic.literal(biography = biography, email = email, external_url = external_url, first_name = first_name, gender = gender, phone_number = phone_number, username = username)
  
    __obj.asInstanceOf[AccountEditProfileOptions]
  }
}

