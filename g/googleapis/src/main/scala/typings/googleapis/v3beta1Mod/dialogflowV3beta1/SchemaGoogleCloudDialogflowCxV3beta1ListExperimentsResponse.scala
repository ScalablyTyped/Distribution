package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1ListExperimentsResponse extends StObject {
  
  /**
    * The list of experiments. There will be a maximum number of items returned based on the page_size field in the request. The list may in some cases be empty or contain fewer entries than page_size even if this isn't the last page.
    */
  var experiments: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3beta1Experiment]] = js.undefined
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1ListExperimentsResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1ListExperimentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1ListExperimentsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1ListExperimentsResponse](x: Self) {
    
    inline def setExperiments(value: js.Array[SchemaGoogleCloudDialogflowCxV3beta1Experiment]): Self = StObject.set(x, "experiments", value.asInstanceOf[js.Any])
    
    inline def setExperimentsUndefined: Self = StObject.set(x, "experiments", js.undefined)
    
    inline def setExperimentsVarargs(value: SchemaGoogleCloudDialogflowCxV3beta1Experiment*): Self = StObject.set(x, "experiments", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
