package typings.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for querying Drive activity.
  */
trait SchemaQueryDriveActivityResponse extends StObject {
  
  /**
    * List of activity requested.
    */
  var activities: js.UndefOr[js.Array[SchemaDriveActivity]] = js.undefined
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaQueryDriveActivityResponse {
  
  @scala.inline
  def apply(): SchemaQueryDriveActivityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryDriveActivityResponse]
  }
  
  @scala.inline
  implicit class SchemaQueryDriveActivityResponseMutableBuilder[Self <: SchemaQueryDriveActivityResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivities(value: js.Array[SchemaDriveActivity]): Self = StObject.set(x, "activities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivitiesUndefined: Self = StObject.set(x, "activities", js.undefined)
    
    @scala.inline
    def setActivitiesVarargs(value: SchemaDriveActivity*): Self = StObject.set(x, "activities", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
