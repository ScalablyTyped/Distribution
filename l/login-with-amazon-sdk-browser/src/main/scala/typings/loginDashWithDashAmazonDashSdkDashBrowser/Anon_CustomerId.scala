package typings.loginDashWithDashAmazonDashSdkDashBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CustomerId extends js.Object {
  /**
    * An identifier that uniquely identifies the logged-in user for this caller. Only present if the `profile` or `profile:user_id` scopes are requested and granted.
    */
  var CustomerId: String
  /**
    * The customer's name. Only present if the `profile` scope is requested and granted.
    */
  var Name: String
  /**
    * The postal code of the customer's primary address. Only present if the `postal_code` scope is requested and granted.
    */
  var PostalCode: String
  /**
    * The primary email address for the customer. Only present if the `profile` scope is requested and granted.
    */
  var PrimaryEmail: String
}

object Anon_CustomerId {
  @scala.inline
  def apply(CustomerId: String, Name: String, PostalCode: String, PrimaryEmail: String): Anon_CustomerId = {
    val __obj = js.Dynamic.literal(CustomerId = CustomerId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PostalCode = PostalCode.asInstanceOf[js.Any], PrimaryEmail = PrimaryEmail.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CustomerId]
  }
}

