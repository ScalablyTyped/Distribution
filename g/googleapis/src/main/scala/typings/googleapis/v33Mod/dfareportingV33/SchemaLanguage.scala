package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information about a language that can be targeted by ads.
  */
@js.native
trait SchemaLanguage extends js.Object {
  /**
    * Language ID of this language. This is the ID used for targeting and
    * generating reports.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#language&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Format of language code is an ISO 639 two-letter language code optionally
    * followed by an underscore followed by an ISO 3166 code. Examples are
    * &quot;en&quot; for English or &quot;zh_CN&quot; for Simplified Chinese.
    */
  var languageCode: js.UndefOr[String] = js.native
  /**
    * Name of this language.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaLanguage {
  @scala.inline
  def apply(): SchemaLanguage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLanguage]
  }
  @scala.inline
  implicit class SchemaLanguageOps[Self <: SchemaLanguage] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLanguageCode(value: String): Self = this.set("languageCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguageCode: Self = this.set("languageCode", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

