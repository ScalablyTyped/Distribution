package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListTargetingOptionsResponse extends StObject {
  
  /**
    * A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListTargetingOptions` method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of targeting options. This list will be absent if empty.
    */
  var targetingOptions: js.UndefOr[js.Array[SchemaTargetingOption]] = js.undefined
}
object SchemaListTargetingOptionsResponse {
  
  inline def apply(): SchemaListTargetingOptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTargetingOptionsResponse]
  }
  
  extension [Self <: SchemaListTargetingOptionsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTargetingOptions(value: js.Array[SchemaTargetingOption]): Self = StObject.set(x, "targetingOptions", value.asInstanceOf[js.Any])
    
    inline def setTargetingOptionsUndefined: Self = StObject.set(x, "targetingOptions", js.undefined)
    
    inline def setTargetingOptionsVarargs(value: SchemaTargetingOption*): Self = StObject.set(x, "targetingOptions", js.Array(value*))
  }
}
