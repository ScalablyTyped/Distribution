package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1AnnotationSpec extends StObject {
  
  /** Optional. User-provided description of the annotation specification. The description can be up to 10,000 characters long. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Required. The display name of the AnnotationSpec. Maximum of 64 characters. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. This is the integer index of the AnnotationSpec. The index for the whole AnnotationSpecSet is sequential starting from 0. For example, an AnnotationSpecSet with classes
    * `dog` and `cat`, might contain one AnnotationSpec with `{ display_name: "dog", index: 0 }` and one AnnotationSpec with `{ display_name: "cat", index: 1 }`. This is especially useful
    * for model training as it encodes the string labels into numeric values.
    */
  var index: js.UndefOr[Double] = js.undefined
}
object GoogleCloudDatalabelingV1beta1AnnotationSpec {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1AnnotationSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1AnnotationSpec]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1AnnotationSpecMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1AnnotationSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
  }
}
