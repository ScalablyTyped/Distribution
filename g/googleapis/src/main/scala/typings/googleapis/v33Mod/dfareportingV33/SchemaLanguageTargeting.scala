package typings.googleapis.v33Mod.dfareportingV33

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
  def apply(): SchemaLanguageTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLanguageTargeting]
  }
  @scala.inline
  implicit class SchemaLanguageTargetingOps[Self <: SchemaLanguageTargeting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLanguagesVarargs(value: SchemaLanguage*): Self = this.set("languages", js.Array(value :_*))
    @scala.inline
    def setLanguages(value: js.Array[SchemaLanguage]): Self = this.set("languages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguages: Self = this.set("languages", js.undefined)
  }
  
}

