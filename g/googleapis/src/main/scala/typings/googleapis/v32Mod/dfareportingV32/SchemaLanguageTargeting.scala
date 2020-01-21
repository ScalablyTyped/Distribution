package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Language Targeting.
  */
@js.native
trait SchemaLanguageTargeting extends js.Object {
  /**
    * Languages that this ad targets. For each language only languageId is
    * required. The other fields are populated automatically when the ad is
    * inserted or updated.
    */
  var languages: js.UndefOr[js.Array[SchemaLanguage]] = js.native
}

object SchemaLanguageTargeting {
  @scala.inline
  def apply(languages: js.Array[SchemaLanguage] = null): SchemaLanguageTargeting = {
    val __obj = js.Dynamic.literal()
    if (languages != null) __obj.updateDynamic("languages")(languages.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLanguageTargeting]
  }
}

