package typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Set of detected objects with bounding boxes.
  */
trait SchemaGoogleCloudVisionV1p2beta1LocalizedObjectAnnotation extends StObject {
  
  /**
    * Image region to which this object belongs. This must be populated.
    */
  var boundingPoly: js.UndefOr[SchemaGoogleCloudVisionV1p2beta1BoundingPoly] = js.undefined
  
  /**
    * The BCP-47 language code, such as &quot;en-US&quot; or
    * &quot;sr-Latn&quot;. For more information, see
    * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
    */
  var languageCode: js.UndefOr[String] = js.undefined
  
  /**
    * Object ID that should align with EntityAnnotation mid.
    */
  var mid: js.UndefOr[String] = js.undefined
  
  /**
    * Object name, expressed in its `language_code` language.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Score of the result. Range [0, 1].
    */
  var score: js.UndefOr[Double] = js.undefined
}
object SchemaGoogleCloudVisionV1p2beta1LocalizedObjectAnnotation {
  
  inline def apply(): SchemaGoogleCloudVisionV1p2beta1LocalizedObjectAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p2beta1LocalizedObjectAnnotation]
  }
  
  extension [Self <: SchemaGoogleCloudVisionV1p2beta1LocalizedObjectAnnotation](x: Self) {
    
    inline def setBoundingPoly(value: SchemaGoogleCloudVisionV1p2beta1BoundingPoly): Self = StObject.set(x, "boundingPoly", value.asInstanceOf[js.Any])
    
    inline def setBoundingPolyUndefined: Self = StObject.set(x, "boundingPoly", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setMid(value: String): Self = StObject.set(x, "mid", value.asInstanceOf[js.Any])
    
    inline def setMidUndefined: Self = StObject.set(x, "mid", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
  }
}
