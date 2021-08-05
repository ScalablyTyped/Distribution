package typings.googleapis.surveysV2Mod.surveysV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifications for the target audience of a survey run through the API.
  */
trait SchemaSurveyAudience extends StObject {
  
  /**
    * Optional list of age buckets to target. Supported age buckets are:
    * [&#39;18-24&#39;, &#39;25-34&#39;, &#39;35-44&#39;, &#39;45-54&#39;,
    * &#39;55-64&#39;, &#39;65+&#39;]
    */
  var ages: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Required country code that surveys should be targeted to. Accepts
    * standard ISO 3166-1 2 character language codes. For instance,
    * &#39;US&#39; for the United States, and &#39;GB&#39; for the United
    * Kingdom.
    */
  var country: js.UndefOr[String] = js.undefined
  
  /**
    * Country subdivision (states/provinces/etc) that surveys should be
    * targeted to. For all countries except GB, ISO-3166-2 subdivision code is
    * required (eg. &#39;US-OH&#39; for Ohio, United States). For GB, NUTS 1
    * statistical region codes for the United Kingdom is required (eg.
    * &#39;UK-UKC&#39; for North East England).
    */
  var countrySubdivision: js.UndefOr[String] = js.undefined
  
  /**
    * Optional gender to target.
    */
  var gender: js.UndefOr[String] = js.undefined
  
  /**
    * Language code that surveys should be targeted to. For instance,
    * &#39;en-US&#39;. Surveys may target bilingual users by specifying a list
    * of language codes (for example, &#39;de&#39; and &#39;en-US&#39;). In
    * that case, all languages will be used for targeting users but the survey
    * content (which is displayed) must match the first language listed.
    * Accepts standard BCP47 language codes. See specification.
    */
  var languages: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Online population source where the respondents are sampled from.
    */
  var populationSource: js.UndefOr[String] = js.undefined
}
object SchemaSurveyAudience {
  
  inline def apply(): SchemaSurveyAudience = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSurveyAudience]
  }
  
  extension [Self <: SchemaSurveyAudience](x: Self) {
    
    inline def setAges(value: js.Array[String]): Self = StObject.set(x, "ages", value.asInstanceOf[js.Any])
    
    inline def setAgesUndefined: Self = StObject.set(x, "ages", js.undefined)
    
    inline def setAgesVarargs(value: String*): Self = StObject.set(x, "ages", js.Array(value :_*))
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountrySubdivision(value: String): Self = StObject.set(x, "countrySubdivision", value.asInstanceOf[js.Any])
    
    inline def setCountrySubdivisionUndefined: Self = StObject.set(x, "countrySubdivision", js.undefined)
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setGender(value: String): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    inline def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
    
    inline def setLanguages(value: js.Array[String]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
    
    inline def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
    
    inline def setLanguagesVarargs(value: String*): Self = StObject.set(x, "languages", js.Array(value :_*))
    
    inline def setPopulationSource(value: String): Self = StObject.set(x, "populationSource", value.asInstanceOf[js.Any])
    
    inline def setPopulationSourceUndefined: Self = StObject.set(x, "populationSource", js.undefined)
  }
}
