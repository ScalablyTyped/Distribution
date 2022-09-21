package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2betaAudience extends StObject {
  
  /**
    * The age groups of the audience. Strongly encouraged to use the standard values: "newborn" (up to 3 months old), "infant" (3–12 months old), "toddler" (1–5 years old), "kids" (5–13 years old), "adult" (typically teens or older). At most 5 values are allowed. Each value must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center property [age_group](https://support.google.com/merchants/answer/6324463). Schema.org property [Product.audience.suggestedMinAge](https://schema.org/suggestedMinAge) and [Product.audience.suggestedMaxAge](https://schema.org/suggestedMaxAge).
    */
  var ageGroups: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The genders of the audience. Strongly encouraged to use the standard values: "male", "female", "unisex". At most 5 values are allowed. Each value must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center property [gender](https://support.google.com/merchants/answer/6324479). Schema.org property [Product.audience.suggestedGender](https://schema.org/suggestedGender).
    */
  var genders: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2betaAudience {
  
  inline def apply(): SchemaGoogleCloudRetailV2betaAudience = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2betaAudience]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2betaAudience](x: Self) {
    
    inline def setAgeGroups(value: js.Array[String]): Self = StObject.set(x, "ageGroups", value.asInstanceOf[js.Any])
    
    inline def setAgeGroupsNull: Self = StObject.set(x, "ageGroups", null)
    
    inline def setAgeGroupsUndefined: Self = StObject.set(x, "ageGroups", js.undefined)
    
    inline def setAgeGroupsVarargs(value: String*): Self = StObject.set(x, "ageGroups", js.Array(value*))
    
    inline def setGenders(value: js.Array[String]): Self = StObject.set(x, "genders", value.asInstanceOf[js.Any])
    
    inline def setGendersNull: Self = StObject.set(x, "genders", null)
    
    inline def setGendersUndefined: Self = StObject.set(x, "genders", js.undefined)
    
    inline def setGendersVarargs(value: String*): Self = StObject.set(x, "genders", js.Array(value*))
  }
}
