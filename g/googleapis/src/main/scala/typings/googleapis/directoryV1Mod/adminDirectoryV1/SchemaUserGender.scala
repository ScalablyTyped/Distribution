package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaUserGender extends js.Object {
  /**
    * AddressMeAs. A human-readable string containing the proper way to refer
    * to the profile owner by humans, for example &quot;he/him/his&quot; or
    * &quot;they/them/their&quot;.
    */
  var addressMeAs: js.UndefOr[String] = js.native
  /**
    * Custom gender.
    */
  var customGender: js.UndefOr[String] = js.native
  /**
    * Gender.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaUserGender {
  @scala.inline
  def apply(addressMeAs: String = null, customGender: String = null, `type`: String = null): SchemaUserGender = {
    val __obj = js.Dynamic.literal()
    if (addressMeAs != null) __obj.updateDynamic("addressMeAs")(addressMeAs.asInstanceOf[js.Any])
    if (customGender != null) __obj.updateDynamic("customGender")(customGender.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUserGender]
  }
}

