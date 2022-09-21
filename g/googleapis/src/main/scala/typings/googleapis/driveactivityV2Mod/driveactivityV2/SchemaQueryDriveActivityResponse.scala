package typings.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaQueryDriveActivityResponse extends StObject {
  
  /**
    * List of activity requested.
    */
  var activities: js.UndefOr[js.Array[SchemaDriveActivity]] = js.undefined
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaQueryDriveActivityResponse {
  
  inline def apply(): SchemaQueryDriveActivityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryDriveActivityResponse]
  }
  
  extension [Self <: SchemaQueryDriveActivityResponse](x: Self) {
    
    inline def setActivities(value: js.Array[SchemaDriveActivity]): Self = StObject.set(x, "activities", value.asInstanceOf[js.Any])
    
    inline def setActivitiesUndefined: Self = StObject.set(x, "activities", js.undefined)
    
    inline def setActivitiesVarargs(value: SchemaDriveActivity*): Self = StObject.set(x, "activities", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
