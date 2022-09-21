package typings.googleapis.notebooksV1Mod.notebooksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListSchedulesResponse extends StObject {
  
  /**
    * Page token that can be used to continue listing from the last result in the next list call.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of returned instances.
    */
  var schedules: js.UndefOr[js.Array[SchemaSchedule]] = js.undefined
  
  /**
    * Schedules that could not be reached. For example: ['projects/{project_id\}/location/{location\}/schedules/monthly_digest', 'projects/{project_id\}/location/{location\}/schedules/weekly_sentiment']
    */
  var unreachable: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaListSchedulesResponse {
  
  inline def apply(): SchemaListSchedulesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListSchedulesResponse]
  }
  
  extension [Self <: SchemaListSchedulesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setSchedules(value: js.Array[SchemaSchedule]): Self = StObject.set(x, "schedules", value.asInstanceOf[js.Any])
    
    inline def setSchedulesUndefined: Self = StObject.set(x, "schedules", js.undefined)
    
    inline def setSchedulesVarargs(value: SchemaSchedule*): Self = StObject.set(x, "schedules", js.Array(value*))
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableNull: Self = StObject.set(x, "unreachable", null)
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value*))
  }
}
