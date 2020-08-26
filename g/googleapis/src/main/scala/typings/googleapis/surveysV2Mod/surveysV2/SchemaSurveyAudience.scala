package typings.googleapis.surveysV2Mod.surveysV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifications for the target audience of a survey run through the API.
  */
@js.native
trait SchemaSurveyAudience extends js.Object {
  /**
    * Optional list of age buckets to target. Supported age buckets are:
    * [&#39;18-24&#39;, &#39;25-34&#39;, &#39;35-44&#39;, &#39;45-54&#39;,
    * &#39;55-64&#39;, &#39;65+&#39;]
    */
  var ages: js.UndefOr[js.Array[String]] = js.native
  /**
    * Required country code that surveys should be targeted to. Accepts
    * standard ISO 3166-1 2 character language codes. For instance,
    * &#39;US&#39; for the United States, and &#39;GB&#39; for the United
    * Kingdom.
    */
  var country: js.UndefOr[String] = js.native
  /**
    * Country subdivision (states/provinces/etc) that surveys should be
    * targeted to. For all countries except GB, ISO-3166-2 subdivision code is
    * required (eg. &#39;US-OH&#39; for Ohio, United States). For GB, NUTS 1
    * statistical region codes for the United Kingdom is required (eg.
    * &#39;UK-UKC&#39; for North East England).
    */
  var countrySubdivision: js.UndefOr[String] = js.native
  /**
    * Optional gender to target.
    */
  var gender: js.UndefOr[String] = js.native
  /**
    * Language code that surveys should be targeted to. For instance,
    * &#39;en-US&#39;. Surveys may target bilingual users by specifying a list
    * of language codes (for example, &#39;de&#39; and &#39;en-US&#39;). In
    * that case, all languages will be used for targeting users but the survey
    * content (which is displayed) must match the first language listed.
    * Accepts standard BCP47 language codes. See specification.
    */
  var languages: js.UndefOr[js.Array[String]] = js.native
  /**
    * Online population source where the respondents are sampled from.
    */
  var populationSource: js.UndefOr[String] = js.native
}

object SchemaSurveyAudience {
  @scala.inline
  def apply(): SchemaSurveyAudience = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSurveyAudience]
  }
  @scala.inline
  implicit class SchemaSurveyAudienceOps[Self <: SchemaSurveyAudience] (val x: Self) extends AnyVal {
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
    def setAgesVarargs(value: String*): Self = this.set("ages", js.Array(value :_*))
    @scala.inline
    def setAges(value: js.Array[String]): Self = this.set("ages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAges: Self = this.set("ages", js.undefined)
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    @scala.inline
    def setCountrySubdivision(value: String): Self = this.set("countrySubdivision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountrySubdivision: Self = this.set("countrySubdivision", js.undefined)
    @scala.inline
    def setGender(value: String): Self = this.set("gender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGender: Self = this.set("gender", js.undefined)
    @scala.inline
    def setLanguagesVarargs(value: String*): Self = this.set("languages", js.Array(value :_*))
    @scala.inline
    def setLanguages(value: js.Array[String]): Self = this.set("languages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguages: Self = this.set("languages", js.undefined)
    @scala.inline
    def setPopulationSource(value: String): Self = this.set("populationSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopulationSource: Self = this.set("populationSource", js.undefined)
  }
  
}

