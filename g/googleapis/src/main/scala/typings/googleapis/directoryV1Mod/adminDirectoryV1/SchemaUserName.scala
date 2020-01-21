package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for name of a user in Directory API.
  */
@js.native
trait SchemaUserName extends js.Object {
  /**
    * Last Name
    */
  var familyName: js.UndefOr[String] = js.native
  /**
    * Full Name
    */
  var fullName: js.UndefOr[String] = js.native
  /**
    * First Name
    */
  var givenName: js.UndefOr[String] = js.native
}

object SchemaUserName {
  @scala.inline
  def apply(familyName: String = null, fullName: String = null, givenName: String = null): SchemaUserName = {
    val __obj = js.Dynamic.literal()
    if (familyName != null) __obj.updateDynamic("familyName")(familyName.asInstanceOf[js.Any])
    if (fullName != null) __obj.updateDynamic("fullName")(fullName.asInstanceOf[js.Any])
    if (givenName != null) __obj.updateDynamic("givenName")(givenName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUserName]
  }
}

