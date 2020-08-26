package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDatafeedTarget extends js.Object {
  /**
    * The country where the items in the feed will be included in the search
    * index, represented as a  CLDR territory code.
    */
  var country: js.UndefOr[String] = js.native
  /**
    * The list of destinations to exclude for this target (corresponds to
    * unchecked check boxes in Merchant Center).
    */
  var excludedDestinations: js.UndefOr[js.Array[String]] = js.native
  /**
    * The list of destinations to include for this target (corresponds to
    * checked check boxes in Merchant Center). Default destinations are always
    * included unless provided in the excluded_destination field.
    */
  var includedDestinations: js.UndefOr[js.Array[String]] = js.native
  /**
    * The two-letter ISO 639-1 language of the items in the feed. Must be a
    * valid language for targets[].country.
    */
  var language: js.UndefOr[String] = js.native
}

object SchemaDatafeedTarget {
  @scala.inline
  def apply(): SchemaDatafeedTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDatafeedTarget]
  }
  @scala.inline
  implicit class SchemaDatafeedTargetOps[Self <: SchemaDatafeedTarget] (val x: Self) extends AnyVal {
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
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    @scala.inline
    def setExcludedDestinationsVarargs(value: String*): Self = this.set("excludedDestinations", js.Array(value :_*))
    @scala.inline
    def setExcludedDestinations(value: js.Array[String]): Self = this.set("excludedDestinations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludedDestinations: Self = this.set("excludedDestinations", js.undefined)
    @scala.inline
    def setIncludedDestinationsVarargs(value: String*): Self = this.set("includedDestinations", js.Array(value :_*))
    @scala.inline
    def setIncludedDestinations(value: js.Array[String]): Self = this.set("includedDestinations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludedDestinations: Self = this.set("includedDestinations", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
  }
  
}

