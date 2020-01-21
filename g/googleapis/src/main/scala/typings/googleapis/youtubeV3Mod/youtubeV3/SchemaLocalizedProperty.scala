package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLocalizedProperty extends js.Object {
  var default: js.UndefOr[String] = js.native
  /**
    * The language of the default property.
    */
  var defaultLanguage: js.UndefOr[SchemaLanguageTag] = js.native
  var localized: js.UndefOr[js.Array[SchemaLocalizedString]] = js.native
}

object SchemaLocalizedProperty {
  @scala.inline
  def apply(
    default: String = null,
    defaultLanguage: SchemaLanguageTag = null,
    localized: js.Array[SchemaLocalizedString] = null
  ): SchemaLocalizedProperty = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (defaultLanguage != null) __obj.updateDynamic("defaultLanguage")(defaultLanguage.asInstanceOf[js.Any])
    if (localized != null) __obj.updateDynamic("localized")(localized.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLocalizedProperty]
  }
}

