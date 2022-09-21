package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListManualTriggersResponse extends StObject {
  
  /**
    * The list of manual triggers. This list will be absent if empty.
    */
  var manualTriggers: js.UndefOr[js.Array[SchemaManualTrigger]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListManualTriggers` method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListManualTriggersResponse {
  
  inline def apply(): SchemaListManualTriggersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListManualTriggersResponse]
  }
  
  extension [Self <: SchemaListManualTriggersResponse](x: Self) {
    
    inline def setManualTriggers(value: js.Array[SchemaManualTrigger]): Self = StObject.set(x, "manualTriggers", value.asInstanceOf[js.Any])
    
    inline def setManualTriggersUndefined: Self = StObject.set(x, "manualTriggers", js.undefined)
    
    inline def setManualTriggersVarargs(value: SchemaManualTrigger*): Self = StObject.set(x, "manualTriggers", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
