package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAnnotationStore extends StObject {
  
  /**
    * Optional. User-supplied key-value pairs used to organize Annotation stores. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: \p{Ll\}\p{Lo\}{0,62\} Label values must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: [\p{Ll\}\p{Lo\}\p{N\}_-]{0,63\} No more than 64 labels can be associated with a given store.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Resource name of the Annotation store, of the form `projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}/annotationStores/{annotation_store_id\}`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaAnnotationStore {
  
  inline def apply(): SchemaAnnotationStore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnnotationStore]
  }
  
  extension [Self <: SchemaAnnotationStore](x: Self) {
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
