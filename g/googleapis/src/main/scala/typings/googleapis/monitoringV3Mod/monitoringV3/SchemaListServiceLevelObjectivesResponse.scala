package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListServiceLevelObjectivesResponse extends StObject {
  
  /**
    * If there are more results than have been returned, then this field is set to a non-empty value. To see the additional results, use that value as page_token in the next call to this method.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ServiceLevelObjectives matching the specified filter.
    */
  var serviceLevelObjectives: js.UndefOr[js.Array[SchemaServiceLevelObjective]] = js.undefined
}
object SchemaListServiceLevelObjectivesResponse {
  
  inline def apply(): SchemaListServiceLevelObjectivesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListServiceLevelObjectivesResponse]
  }
  
  extension [Self <: SchemaListServiceLevelObjectivesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setServiceLevelObjectives(value: js.Array[SchemaServiceLevelObjective]): Self = StObject.set(x, "serviceLevelObjectives", value.asInstanceOf[js.Any])
    
    inline def setServiceLevelObjectivesUndefined: Self = StObject.set(x, "serviceLevelObjectives", js.undefined)
    
    inline def setServiceLevelObjectivesVarargs(value: SchemaServiceLevelObjective*): Self = StObject.set(x, "serviceLevelObjectives", js.Array(value*))
  }
}
