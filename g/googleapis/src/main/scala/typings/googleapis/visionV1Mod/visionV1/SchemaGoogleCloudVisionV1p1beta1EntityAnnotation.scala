package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Set of detected entity features.
  */
trait SchemaGoogleCloudVisionV1p1beta1EntityAnnotation extends StObject {
  
  /**
    * Image region to which this entity belongs. Not produced for
    * `LABEL_DETECTION` features.
    */
  var boundingPoly: js.UndefOr[SchemaGoogleCloudVisionV1p1beta1BoundingPoly] = js.undefined
  
  /**
    * **Deprecated. Use `score` instead.** The accuracy of the entity detection
    * in an image. For example, for an image in which the &quot;Eiffel
    * Tower&quot; entity is detected, this field represents the confidence that
    * there is a tower in the query image. Range [0, 1].
    */
  var confidence: js.UndefOr[Double] = js.undefined
  
  /**
    * Entity textual description, expressed in its `locale` language.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The language code for the locale in which the entity textual
    * `description` is expressed.
    */
  var locale: js.UndefOr[String] = js.undefined
  
  /**
    * The location information for the detected entity. Multiple `LocationInfo`
    * elements can be present because one location may indicate the location of
    * the scene in the image, and another location may indicate the location of
    * the place where the image was taken. Location information is usually
    * present for landmarks.
    */
  var locations: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p1beta1LocationInfo]] = js.undefined
  
  /**
    * Opaque entity ID. Some IDs may be available in [Google Knowledge Graph
    * Search API](https://developers.google.com/knowledge-graph/).
    */
  var mid: js.UndefOr[String] = js.undefined
  
  /**
    * Some entities may have optional user-supplied `Property` (name/value)
    * fields, such a score or string that qualifies the entity.
    */
  var properties: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p1beta1Property]] = js.undefined
  
  /**
    * Overall score of the result. Range [0, 1].
    */
  var score: js.UndefOr[Double] = js.undefined
  
  /**
    * The relevancy of the ICA (Image Content Annotation) label to the image.
    * For example, the relevancy of &quot;tower&quot; is likely higher to an
    * image containing the detected &quot;Eiffel Tower&quot; than to an image
    * containing a detected distant towering building, even though the
    * confidence that there is a tower in each image may be the same. Range [0,
    * 1].
    */
  var topicality: js.UndefOr[Double] = js.undefined
}
object SchemaGoogleCloudVisionV1p1beta1EntityAnnotation {
  
  inline def apply(): SchemaGoogleCloudVisionV1p1beta1EntityAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1EntityAnnotation]
  }
  
  extension [Self <: SchemaGoogleCloudVisionV1p1beta1EntityAnnotation](x: Self) {
    
    inline def setBoundingPoly(value: SchemaGoogleCloudVisionV1p1beta1BoundingPoly): Self = StObject.set(x, "boundingPoly", value.asInstanceOf[js.Any])
    
    inline def setBoundingPolyUndefined: Self = StObject.set(x, "boundingPoly", js.undefined)
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setLocations(value: js.Array[SchemaGoogleCloudVisionV1p1beta1LocationInfo]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    inline def setLocationsVarargs(value: SchemaGoogleCloudVisionV1p1beta1LocationInfo*): Self = StObject.set(x, "locations", js.Array(value :_*))
    
    inline def setMid(value: String): Self = StObject.set(x, "mid", value.asInstanceOf[js.Any])
    
    inline def setMidUndefined: Self = StObject.set(x, "mid", js.undefined)
    
    inline def setProperties(value: js.Array[SchemaGoogleCloudVisionV1p1beta1Property]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPropertiesVarargs(value: SchemaGoogleCloudVisionV1p1beta1Property*): Self = StObject.set(x, "properties", js.Array(value :_*))
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
    
    inline def setTopicality(value: Double): Self = StObject.set(x, "topicality", value.asInstanceOf[js.Any])
    
    inline def setTopicalityUndefined: Self = StObject.set(x, "topicality", js.undefined)
  }
}
