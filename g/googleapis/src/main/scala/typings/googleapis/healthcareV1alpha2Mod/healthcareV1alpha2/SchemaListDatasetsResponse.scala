package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Lists the available datasets.
  */
trait SchemaListDatasetsResponse extends StObject {
  
  /**
    * The first page of datasets.
    */
  var datasets: js.UndefOr[js.Array[SchemaDataset]] = js.undefined
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListDatasetsResponse {
  
  inline def apply(): SchemaListDatasetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDatasetsResponse]
  }
  
  extension [Self <: SchemaListDatasetsResponse](x: Self) {
    
    inline def setDatasets(value: js.Array[SchemaDataset]): Self = StObject.set(x, "datasets", value.asInstanceOf[js.Any])
    
    inline def setDatasetsUndefined: Self = StObject.set(x, "datasets", js.undefined)
    
    inline def setDatasetsVarargs(value: SchemaDataset*): Self = StObject.set(x, "datasets", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
