package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Lists the available datasets.
  */
@js.native
trait SchemaListDatasetsResponse extends StObject {
  
  /**
    * The first page of datasets.
    */
  var datasets: js.UndefOr[js.Array[SchemaDataset]] = js.native
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaListDatasetsResponse {
  
  @scala.inline
  def apply(): SchemaListDatasetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDatasetsResponse]
  }
  
  @scala.inline
  implicit class SchemaListDatasetsResponseMutableBuilder[Self <: SchemaListDatasetsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatasets(value: js.Array[SchemaDataset]): Self = StObject.set(x, "datasets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetsUndefined: Self = StObject.set(x, "datasets", js.undefined)
    
    @scala.inline
    def setDatasetsVarargs(value: SchemaDataset*): Self = StObject.set(x, "datasets", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
