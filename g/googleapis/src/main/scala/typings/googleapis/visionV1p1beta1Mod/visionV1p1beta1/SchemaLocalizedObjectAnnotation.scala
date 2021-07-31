package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Set of detected objects with bounding boxes.
  */
trait SchemaLocalizedObjectAnnotation extends StObject {
  
  /**
    * Image region to which this object belongs. This must be populated.
    */
  var boundingPoly: js.UndefOr[SchemaBoundingPoly] = js.undefined
  
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
object SchemaLocalizedObjectAnnotation {
  
  @scala.inline
  def apply(): SchemaLocalizedObjectAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocalizedObjectAnnotation]
  }
  
  @scala.inline
  implicit class SchemaLocalizedObjectAnnotationMutableBuilder[Self <: SchemaLocalizedObjectAnnotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundingPoly(value: SchemaBoundingPoly): Self = StObject.set(x, "boundingPoly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundingPolyUndefined: Self = StObject.set(x, "boundingPoly", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    @scala.inline
    def setMid(value: String): Self = StObject.set(x, "mid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMidUndefined: Self = StObject.set(x, "mid", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
  }
}
