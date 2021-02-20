package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The list of all clusters in a project.
  */
@js.native
trait SchemaListClustersResponse extends StObject {
  
  /**
    * Output only. The clusters in the project.
    */
  var clusters: js.UndefOr[js.Array[SchemaCluster]] = js.native
  
  /**
    * Output only. This token is included in the response if there are more
    * results to fetch. To fetch additional results, provide this value as the
    * page_token in a subsequent &lt;code&gt;ListClustersRequest&lt;/code&gt;.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaListClustersResponse {
  
  @scala.inline
  def apply(): SchemaListClustersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListClustersResponse]
  }
  
  @scala.inline
  implicit class SchemaListClustersResponseMutableBuilder[Self <: SchemaListClustersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusters(value: js.Array[SchemaCluster]): Self = StObject.set(x, "clusters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClustersUndefined: Self = StObject.set(x, "clusters", js.undefined)
    
    @scala.inline
    def setClustersVarargs(value: SchemaCluster*): Self = StObject.set(x, "clusters", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
