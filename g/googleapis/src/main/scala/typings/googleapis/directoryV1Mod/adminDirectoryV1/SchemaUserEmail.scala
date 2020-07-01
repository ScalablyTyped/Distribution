package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for an email.
  */
@js.native
trait SchemaUserEmail extends js.Object {
  /**
    * Email id of the user.
    */
  var address: js.UndefOr[String] = js.native
  /**
    * Custom Type.
    */
  var customType: js.UndefOr[String] = js.native
  /**
    * If this is user&#39;s primary email. Only one entry could be marked as
    * primary.
    */
  var primary: js.UndefOr[Boolean] = js.native
  /**
    * Each entry can have a type which indicates standard types of that entry.
    * For example email could be of home, work etc. In addition to the standard
    * type, an entry can have a custom type and can take any value Such types
    * should have the CUSTOM value as type and also have a customType value.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaUserEmail {
  @scala.inline
  def apply(
    address: String = null,
    customType: String = null,
    primary: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null
  ): SchemaUserEmail = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (customType != null) __obj.updateDynamic("customType")(customType.asInstanceOf[js.Any])
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUserEmail]
  }
}

