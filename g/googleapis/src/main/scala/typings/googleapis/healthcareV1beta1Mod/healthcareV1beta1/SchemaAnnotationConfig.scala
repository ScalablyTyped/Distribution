package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAnnotationConfig extends StObject {
  
  /**
    * The name of the annotation store, in the form `projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}/annotationStores/{annotation_store_id\}`). * The destination annotation store must be in the same project as the source data. De-identifying data across multiple projects is not supported. * The destination annotation store must exist when using DeidentifyDicomStore or DeidentifyFhirStore. DeidentifyDataset automatically creates the destination annotation store.
    */
  var annotationStoreName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If set to true, the sensitive texts are included in SensitiveTextAnnotation of Annotation.
    */
  var storeQuote: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaAnnotationConfig {
  
  inline def apply(): SchemaAnnotationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnnotationConfig]
  }
  
  extension [Self <: SchemaAnnotationConfig](x: Self) {
    
    inline def setAnnotationStoreName(value: String): Self = StObject.set(x, "annotationStoreName", value.asInstanceOf[js.Any])
    
    inline def setAnnotationStoreNameNull: Self = StObject.set(x, "annotationStoreName", null)
    
    inline def setAnnotationStoreNameUndefined: Self = StObject.set(x, "annotationStoreName", js.undefined)
    
    inline def setStoreQuote(value: Boolean): Self = StObject.set(x, "storeQuote", value.asInstanceOf[js.Any])
    
    inline def setStoreQuoteNull: Self = StObject.set(x, "storeQuote", null)
    
    inline def setStoreQuoteUndefined: Self = StObject.set(x, "storeQuote", js.undefined)
  }
}
