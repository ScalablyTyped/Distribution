package typings.googleapis.v1configurationMod.gamesConfigurationV1configuration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a localized string resource.
  */
@js.native
trait SchemaLocalizedString extends js.Object {
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string gamesConfiguration#localizedString.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The locale string.
    */
  var locale: js.UndefOr[String] = js.native
  /**
    * The string value.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaLocalizedString {
  @scala.inline
  def apply(kind: String = null, locale: String = null, value: String = null): SchemaLocalizedString = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLocalizedString]
  }
}

