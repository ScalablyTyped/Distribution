package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An annotation record.
  */
trait SchemaAnnotation extends StObject {
  
  /**
    * Details of the source.
    */
  var annotationSource: js.UndefOr[SchemaAnnotationSource] = js.undefined
  
  /**
    * Annnotations for images, e.g., bounding polygons.
    */
  var imageAnnotation: js.UndefOr[SchemaImageAnnotation] = js.undefined
  
  /**
    * Output only. Resource name of the Annotation, of the form
    * `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/annotationStores/{annotation_store_id}/annotations/{annotation_id}`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Annotations for resource, e.g., classification tags.
    */
  var resourceAnnotation: js.UndefOr[SchemaResourceAnnotation] = js.undefined
  
  /**
    * Annotations for sentitive texts, e.g., range of such texts.
    */
  var textAnnotation: js.UndefOr[SchemaSensitiveTextAnnotation] = js.undefined
}
object SchemaAnnotation {
  
  inline def apply(): SchemaAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnnotation]
  }
  
  extension [Self <: SchemaAnnotation](x: Self) {
    
    inline def setAnnotationSource(value: SchemaAnnotationSource): Self = StObject.set(x, "annotationSource", value.asInstanceOf[js.Any])
    
    inline def setAnnotationSourceUndefined: Self = StObject.set(x, "annotationSource", js.undefined)
    
    inline def setImageAnnotation(value: SchemaImageAnnotation): Self = StObject.set(x, "imageAnnotation", value.asInstanceOf[js.Any])
    
    inline def setImageAnnotationUndefined: Self = StObject.set(x, "imageAnnotation", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResourceAnnotation(value: SchemaResourceAnnotation): Self = StObject.set(x, "resourceAnnotation", value.asInstanceOf[js.Any])
    
    inline def setResourceAnnotationUndefined: Self = StObject.set(x, "resourceAnnotation", js.undefined)
    
    inline def setTextAnnotation(value: SchemaSensitiveTextAnnotation): Self = StObject.set(x, "textAnnotation", value.asInstanceOf[js.Any])
    
    inline def setTextAnnotationUndefined: Self = StObject.set(x, "textAnnotation", js.undefined)
  }
}
