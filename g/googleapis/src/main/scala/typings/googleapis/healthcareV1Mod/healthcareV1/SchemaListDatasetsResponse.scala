package typings.googleapis.healthcareV1Mod.healthcareV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListDatasetsResponse extends StObject {
  
  /**
    * The first page of datasets.
    */
  var datasets: js.UndefOr[js.Array[SchemaDataset]] = js.undefined
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListDatasetsResponse {
  
  inline def apply(): SchemaListDatasetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDatasetsResponse]
  }
  
  extension [Self <: SchemaListDatasetsResponse](x: Self) {
    
    inline def setDatasets(value: js.Array[SchemaDataset]): Self = StObject.set(x, "datasets", value.asInstanceOf[js.Any])
    
    inline def setDatasetsUndefined: Self = StObject.set(x, "datasets", js.undefined)
    
    inline def setDatasetsVarargs(value: SchemaDataset*): Self = StObject.set(x, "datasets", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
