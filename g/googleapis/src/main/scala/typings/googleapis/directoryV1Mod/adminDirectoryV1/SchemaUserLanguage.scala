package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for a language entry.
  */
@js.native
trait SchemaUserLanguage extends js.Object {
  /**
    * Other language. User can provide own language name if there is no
    * corresponding Google III language code. If this is set LanguageCode
    * can&#39;t be set
    */
  var customLanguage: js.UndefOr[String] = js.native
  /**
    * Language Code. Should be used for storing Google III LanguageCode string
    * representation for language. Illegal values cause SchemaException.
    */
  var languageCode: js.UndefOr[String] = js.native
}

object SchemaUserLanguage {
  @scala.inline
  def apply(customLanguage: String = null, languageCode: String = null): SchemaUserLanguage = {
    val __obj = js.Dynamic.literal()
    if (customLanguage != null) __obj.updateDynamic("customLanguage")(customLanguage.asInstanceOf[js.Any])
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUserLanguage]
  }
}

