package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Shared request options for all RPC methods.
  */
@js.native
trait SchemaRequestOptions extends js.Object {
  /**
    * Debug options of the request
    */
  var debugOptions: js.UndefOr[SchemaDebugOptions] = js.native
  /**
    * The BCP-47 language code, such as &quot;en-US&quot; or
    * &quot;sr-Latn&quot;. For more information, see
    * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier. For
    * translations.
    */
  var languageCode: js.UndefOr[String] = js.native
  /**
    * Id of the application created using SearchApplicationsService.
    */
  var searchApplicationId: js.UndefOr[String] = js.native
  /**
    * Current user&#39;s time zone id, such as &quot;America/Los_Angeles&quot;
    * or &quot;Australia/Sydney&quot;. These IDs are defined by [Unicode Common
    * Locale Data Repository (CLDR)](http://cldr.unicode.org/) project, and
    * currently available in the file
    * [timezone.xml](http://unicode.org/repos/cldr/trunk/common/bcp47/timezone.xml)
    */
  var timeZone: js.UndefOr[String] = js.native
}

object SchemaRequestOptions {
  @scala.inline
  def apply(): SchemaRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRequestOptions]
  }
  @scala.inline
  implicit class SchemaRequestOptionsOps[Self <: SchemaRequestOptions] (val x: Self) extends AnyVal {
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
    def setDebugOptions(value: SchemaDebugOptions): Self = this.set("debugOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebugOptions: Self = this.set("debugOptions", js.undefined)
    @scala.inline
    def setLanguageCode(value: String): Self = this.set("languageCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguageCode: Self = this.set("languageCode", js.undefined)
    @scala.inline
    def setSearchApplicationId(value: String): Self = this.set("searchApplicationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchApplicationId: Self = this.set("searchApplicationId", js.undefined)
    @scala.inline
    def setTimeZone(value: String): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
  }
  
}

