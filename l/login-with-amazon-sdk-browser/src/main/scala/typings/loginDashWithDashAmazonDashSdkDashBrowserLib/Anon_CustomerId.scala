package typings
package loginDashWithDashAmazonDashSdkDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CustomerId extends js.Object {
  /**
    * An identifier that uniquely identifies the logged-in user for this caller. Only present if the `profile` or `profile:user_id` scopes are requested and granted.
    */
  var CustomerId: java.lang.String
  /**
    * The customer's name. Only present if the `profile` scope is requested and granted.
    */
  var Name: java.lang.String
  /**
    * The postal code of the customer's primary address. Only present if the `postal_code` scope is requested and granted.
    */
  var PostalCode: java.lang.String
  /**
    * The primary email address for the customer. Only present if the `profile` scope is requested and granted.
    */
  var PrimaryEmail: java.lang.String
}

object Anon_CustomerId {
  @scala.inline
  def apply(
    CustomerId: java.lang.String,
    Name: java.lang.String,
    PostalCode: java.lang.String,
    PrimaryEmail: java.lang.String
  ): Anon_CustomerId = {
    val __obj = js.Dynamic.literal(CustomerId = CustomerId, Name = Name, PostalCode = PostalCode, PrimaryEmail = PrimaryEmail)
  
    __obj.asInstanceOf[Anon_CustomerId]
  }
}

