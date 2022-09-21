package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1ListInstructionsResponse extends StObject {
  
  /**
    * The list of Instructions to return.
    */
  var instructions: js.UndefOr[js.Array[SchemaGoogleCloudDatalabelingV1beta1Instruction]] = js.undefined
  
  /**
    * A token to retrieve next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1ListInstructionsResponse {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1ListInstructionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1ListInstructionsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1ListInstructionsResponse](x: Self) {
    
    inline def setInstructions(value: js.Array[SchemaGoogleCloudDatalabelingV1beta1Instruction]): Self = StObject.set(x, "instructions", value.asInstanceOf[js.Any])
    
    inline def setInstructionsUndefined: Self = StObject.set(x, "instructions", js.undefined)
    
    inline def setInstructionsVarargs(value: SchemaGoogleCloudDatalabelingV1beta1Instruction*): Self = StObject.set(x, "instructions", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
