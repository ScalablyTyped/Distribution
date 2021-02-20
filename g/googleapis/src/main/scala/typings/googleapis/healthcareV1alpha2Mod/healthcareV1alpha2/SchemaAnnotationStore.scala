package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An Annotation store that can store annotation resources such as labels and
  * tags for text, image and audio.
  */
@js.native
trait SchemaAnnotationStore extends StObject {
  
  /**
    * User-supplied key-value pairs used to organize Annotation stores.  Label
    * keys must be between 1 and 63 characters long, have a UTF-8 encoding of
    * maximum 128 bytes, and must conform to the following PCRE regular
    * expression: \p{Ll}\p{Lo}{0,62}  Label values are optional, must be
    * between 1 and 63 characters long, have a UTF-8 encoding of maximum 128
    * bytes, and must conform to the following PCRE regular expression:
    * [\p{Ll}\p{Lo}\p{N}_-]{0,63}  No more than 64 labels can be associated
    * with a given store.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Output only. Resource name of the Annotation store, of the form
    * `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/annotationStores/{annotation_store_id}`.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaAnnotationStore {
  
  @scala.inline
  def apply(): SchemaAnnotationStore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnnotationStore]
  }
  
  @scala.inline
  implicit class SchemaAnnotationStoreMutableBuilder[Self <: SchemaAnnotationStore] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
