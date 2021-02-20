package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An annotation record.
  */
@js.native
trait SchemaAnnotation extends StObject {
  
  /**
    * Details of the source.
    */
  var annotationSource: js.UndefOr[SchemaAnnotationSource] = js.native
  
  /**
    * Annnotations for images, e.g., bounding polygons.
    */
  var imageAnnotation: js.UndefOr[SchemaImageAnnotation] = js.native
  
  /**
    * Output only. Resource name of the Annotation, of the form
    * `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/annotationStores/{annotation_store_id}/annotations/{annotation_id}`.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Annotations for resource, e.g., classification tags.
    */
  var resourceAnnotation: js.UndefOr[SchemaResourceAnnotation] = js.native
  
  /**
    * Annotations for sentitive texts, e.g., range of such texts.
    */
  var textAnnotation: js.UndefOr[SchemaSensitiveTextAnnotation] = js.native
}
object SchemaAnnotation {
  
  @scala.inline
  def apply(): SchemaAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnnotation]
  }
  
  @scala.inline
  implicit class SchemaAnnotationMutableBuilder[Self <: SchemaAnnotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotationSource(value: SchemaAnnotationSource): Self = StObject.set(x, "annotationSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationSourceUndefined: Self = StObject.set(x, "annotationSource", js.undefined)
    
    @scala.inline
    def setImageAnnotation(value: SchemaImageAnnotation): Self = StObject.set(x, "imageAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageAnnotationUndefined: Self = StObject.set(x, "imageAnnotation", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setResourceAnnotation(value: SchemaResourceAnnotation): Self = StObject.set(x, "resourceAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceAnnotationUndefined: Self = StObject.set(x, "resourceAnnotation", js.undefined)
    
    @scala.inline
    def setTextAnnotation(value: SchemaSensitiveTextAnnotation): Self = StObject.set(x, "textAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAnnotationUndefined: Self = StObject.set(x, "textAnnotation", js.undefined)
  }
}
