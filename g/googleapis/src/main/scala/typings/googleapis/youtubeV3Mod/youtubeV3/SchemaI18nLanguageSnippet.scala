package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Basic details about an i18n language, such as language code and
  * human-readable name.
  */
@js.native
trait SchemaI18nLanguageSnippet extends js.Object {
  /**
    * A short BCP-47 code that uniquely identifies a language.
    */
  var hl: js.UndefOr[String] = js.native
  /**
    * The human-readable name of the language in the language itself.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaI18nLanguageSnippet {
  @scala.inline
  def apply(hl: String = null, name: String = null): SchemaI18nLanguageSnippet = {
    val __obj = js.Dynamic.literal()
    if (hl != null) __obj.updateDynamic("hl")(hl.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaI18nLanguageSnippet]
  }
}

