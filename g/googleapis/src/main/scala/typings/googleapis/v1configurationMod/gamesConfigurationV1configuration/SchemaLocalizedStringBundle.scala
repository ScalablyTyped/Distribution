package typings.googleapis.v1configurationMod.gamesConfigurationV1configuration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a localized string bundle resource.
  */
@js.native
trait SchemaLocalizedStringBundle extends js.Object {
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string gamesConfiguration#localizedStringBundle.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The locale strings.
    */
  var translations: js.UndefOr[js.Array[SchemaLocalizedString]] = js.native
}

object SchemaLocalizedStringBundle {
  @scala.inline
  def apply(kind: String = null, translations: js.Array[SchemaLocalizedString] = null): SchemaLocalizedStringBundle = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLocalizedStringBundle]
  }
}

