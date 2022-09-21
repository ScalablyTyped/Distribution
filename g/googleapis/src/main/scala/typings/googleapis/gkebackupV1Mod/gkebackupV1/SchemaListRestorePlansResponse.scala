package typings.googleapis.gkebackupV1Mod.gkebackupV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListRestorePlansResponse extends StObject {
  
  /**
    * A token which may be sent as page_token in a subsequent `ListRestorePlans` call to retrieve the next page of results. If this field is omitted or empty, then there are no more results to return.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of RestorePlans matching the given criteria.
    */
  var restorePlans: js.UndefOr[js.Array[SchemaRestorePlan]] = js.undefined
  
  /**
    * Locations that could not be reached.
    */
  var unreachable: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaListRestorePlansResponse {
  
  inline def apply(): SchemaListRestorePlansResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListRestorePlansResponse]
  }
  
  extension [Self <: SchemaListRestorePlansResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setRestorePlans(value: js.Array[SchemaRestorePlan]): Self = StObject.set(x, "restorePlans", value.asInstanceOf[js.Any])
    
    inline def setRestorePlansUndefined: Self = StObject.set(x, "restorePlans", js.undefined)
    
    inline def setRestorePlansVarargs(value: SchemaRestorePlan*): Self = StObject.set(x, "restorePlans", js.Array(value*))
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableNull: Self = StObject.set(x, "unreachable", null)
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value*))
  }
}
