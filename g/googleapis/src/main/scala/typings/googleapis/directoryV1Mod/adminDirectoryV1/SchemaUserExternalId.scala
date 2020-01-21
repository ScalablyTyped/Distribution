package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for an externalId entry.
  */
@js.native
trait SchemaUserExternalId extends js.Object {
  /**
    * Custom type.
    */
  var customType: js.UndefOr[String] = js.native
  /**
    * The type of the Id.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The value of the id.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaUserExternalId {
  @scala.inline
  def apply(customType: String = null, `type`: String = null, value: String = null): SchemaUserExternalId = {
    val __obj = js.Dynamic.literal()
    if (customType != null) __obj.updateDynamic("customType")(customType.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUserExternalId]
  }
}

