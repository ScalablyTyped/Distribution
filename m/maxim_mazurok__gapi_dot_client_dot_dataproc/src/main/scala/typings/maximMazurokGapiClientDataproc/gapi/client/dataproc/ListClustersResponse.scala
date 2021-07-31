package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListClustersResponse extends StObject {
  
  /** Output only. The clusters in the project. */
  var clusters: js.UndefOr[js.Array[Cluster]] = js.undefined
  
  /**
    * Output only. This token is included in the response if there are more results to fetch. To fetch additional results, provide this value as the page_token in a subsequent
    * ListClustersRequest.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListClustersResponse {
  
  @scala.inline
  def apply(): ListClustersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListClustersResponse]
  }
  
  @scala.inline
  implicit class ListClustersResponseMutableBuilder[Self <: ListClustersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusters(value: js.Array[Cluster]): Self = StObject.set(x, "clusters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClustersUndefined: Self = StObject.set(x, "clusters", js.undefined)
    
    @scala.inline
    def setClustersVarargs(value: Cluster*): Self = StObject.set(x, "clusters", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
