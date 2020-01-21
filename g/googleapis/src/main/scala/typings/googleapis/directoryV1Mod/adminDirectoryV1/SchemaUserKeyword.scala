package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for a keyword entry.
  */
@js.native
trait SchemaUserKeyword extends js.Object {
  /**
    * Custom Type.
    */
  var customType: js.UndefOr[String] = js.native
  /**
    * Each entry can have a type which indicates standard type of that entry.
    * For example, keyword could be of type occupation or outlook. In addition
    * to the standard type, an entry can have a custom type and can give it any
    * name. Such types should have the CUSTOM value as type and also have a
    * customType value.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Keyword.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaUserKeyword {
  @scala.inline
  def apply(customType: String = null, `type`: String = null, value: String = null): SchemaUserKeyword = {
    val __obj = js.Dynamic.literal()
    if (customType != null) __obj.updateDynamic("customType")(customType.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUserKeyword]
  }
}

