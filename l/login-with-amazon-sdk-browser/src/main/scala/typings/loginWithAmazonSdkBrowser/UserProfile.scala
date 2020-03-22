package typings.loginWithAmazonSdkBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains profile information.
  */
/* Inlined std.Partial<{  CustomerId  :string,   Name  :string,   PostalCode  :string,   PrimaryEmail  :string}> */
trait UserProfile extends js.Object {
  var CustomerId: js.UndefOr[String] = js.undefined
  var Name: js.UndefOr[String] = js.undefined
  var PostalCode: js.UndefOr[String] = js.undefined
  var PrimaryEmail: js.UndefOr[String] = js.undefined
}

object UserProfile {
  @scala.inline
  def apply(
    CustomerId: String = null,
    Name: String = null,
    PostalCode: String = null,
    PrimaryEmail: String = null
  ): UserProfile = {
    val __obj = js.Dynamic.literal()
    if (CustomerId != null) __obj.updateDynamic("CustomerId")(CustomerId.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (PostalCode != null) __obj.updateDynamic("PostalCode")(PostalCode.asInstanceOf[js.Any])
    if (PrimaryEmail != null) __obj.updateDynamic("PrimaryEmail")(PrimaryEmail.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserProfile]
  }
}

