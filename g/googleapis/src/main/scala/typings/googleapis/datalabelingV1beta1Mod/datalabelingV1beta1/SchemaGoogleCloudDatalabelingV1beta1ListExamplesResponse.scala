package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1ListExamplesResponse extends StObject {
  
  /**
    * The list of examples to return.
    */
  var examples: js.UndefOr[js.Array[SchemaGoogleCloudDatalabelingV1beta1Example]] = js.undefined
  
  /**
    * A token to retrieve next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1ListExamplesResponse {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1ListExamplesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1ListExamplesResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1ListExamplesResponse](x: Self) {
    
    inline def setExamples(value: js.Array[SchemaGoogleCloudDatalabelingV1beta1Example]): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
    
    inline def setExamplesUndefined: Self = StObject.set(x, "examples", js.undefined)
    
    inline def setExamplesVarargs(value: SchemaGoogleCloudDatalabelingV1beta1Example*): Self = StObject.set(x, "examples", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
