package typings.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDriveActivity extends StObject {
  
  /**
    * Details on all actions in this activity.
    */
  var actions: js.UndefOr[js.Array[SchemaAction]] = js.undefined
  
  /**
    * All actor(s) responsible for the activity.
    */
  var actors: js.UndefOr[js.Array[SchemaActor]] = js.undefined
  
  /**
    * Key information about the primary action for this activity. This is either representative, or the most important, of all actions in the activity, according to the ConsolidationStrategy in the request.
    */
  var primaryActionDetail: js.UndefOr[SchemaActionDetail] = js.undefined
  
  /**
    * All Google Drive objects this activity is about (e.g. file, folder, drive). This represents the state of the target immediately after the actions occurred.
    */
  var targets: js.UndefOr[js.Array[SchemaTarget]] = js.undefined
  
  /**
    * The activity occurred over this time range.
    */
  var timeRange: js.UndefOr[SchemaTimeRange] = js.undefined
  
  /**
    * The activity occurred at this specific time.
    */
  var timestamp: js.UndefOr[String | Null] = js.undefined
}
object SchemaDriveActivity {
  
  inline def apply(): SchemaDriveActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDriveActivity]
  }
  
  extension [Self <: SchemaDriveActivity](x: Self) {
    
    inline def setActions(value: js.Array[SchemaAction]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: SchemaAction*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setActors(value: js.Array[SchemaActor]): Self = StObject.set(x, "actors", value.asInstanceOf[js.Any])
    
    inline def setActorsUndefined: Self = StObject.set(x, "actors", js.undefined)
    
    inline def setActorsVarargs(value: SchemaActor*): Self = StObject.set(x, "actors", js.Array(value*))
    
    inline def setPrimaryActionDetail(value: SchemaActionDetail): Self = StObject.set(x, "primaryActionDetail", value.asInstanceOf[js.Any])
    
    inline def setPrimaryActionDetailUndefined: Self = StObject.set(x, "primaryActionDetail", js.undefined)
    
    inline def setTargets(value: js.Array[SchemaTarget]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
    
    inline def setTargetsVarargs(value: SchemaTarget*): Self = StObject.set(x, "targets", js.Array(value*))
    
    inline def setTimeRange(value: SchemaTimeRange): Self = StObject.set(x, "timeRange", value.asInstanceOf[js.Any])
    
    inline def setTimeRangeUndefined: Self = StObject.set(x, "timeRange", js.undefined)
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampNull: Self = StObject.set(x, "timestamp", null)
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
