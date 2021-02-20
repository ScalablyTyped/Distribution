package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1ListAnnotationSpecSetsResponse extends StObject {
  
  /** The list of annotation spec sets. */
  var annotationSpecSets: js.UndefOr[js.Array[GoogleCloudDatalabelingV1beta1AnnotationSpecSet]] = js.native
  
  /** A token to retrieve next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object GoogleCloudDatalabelingV1beta1ListAnnotationSpecSetsResponse {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1ListAnnotationSpecSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1ListAnnotationSpecSetsResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1ListAnnotationSpecSetsResponseMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1ListAnnotationSpecSetsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotationSpecSets(value: js.Array[GoogleCloudDatalabelingV1beta1AnnotationSpecSet]): Self = StObject.set(x, "annotationSpecSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationSpecSetsUndefined: Self = StObject.set(x, "annotationSpecSets", js.undefined)
    
    @scala.inline
    def setAnnotationSpecSetsVarargs(value: GoogleCloudDatalabelingV1beta1AnnotationSpecSet*): Self = StObject.set(x, "annotationSpecSets", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
