package typings.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single Drive activity comprising one or more Actions by one or more
  * Actors on one or more Targets. Some Action groupings occur spontaneously,
  * such as moving an item into a shared folder triggering a permission change.
  * Other groupings of related Actions, such as multiple Actors editing one
  * item or moving multiple files into a new folder, are controlled by the
  * selection of a ConsolidationStrategy in the QueryDriveActivityRequest.
  */
@js.native
trait SchemaDriveActivity extends StObject {
  
  /**
    * Details on all actions in this activity.
    */
  var actions: js.UndefOr[js.Array[SchemaAction]] = js.native
  
  /**
    * All actor(s) responsible for the activity.
    */
  var actors: js.UndefOr[js.Array[SchemaActor]] = js.native
  
  /**
    * Key information about the primary action for this activity. This is
    * either representative, or the most important, of all actions in the
    * activity, according to the ConsolidationStrategy in the request.
    */
  var primaryActionDetail: js.UndefOr[SchemaActionDetail] = js.native
  
  /**
    * All Drive objects this activity is about (e.g. file, folder, Team Drive).
    * This represents the state of the target immediately after the actions
    * occurred.
    */
  var targets: js.UndefOr[js.Array[SchemaTarget]] = js.native
  
  /**
    * The activity occurred over this time range.
    */
  var timeRange: js.UndefOr[SchemaTimeRange] = js.native
  
  /**
    * The activity occurred at this specific time.
    */
  var timestamp: js.UndefOr[String] = js.native
}
object SchemaDriveActivity {
  
  @scala.inline
  def apply(): SchemaDriveActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDriveActivity]
  }
  
  @scala.inline
  implicit class SchemaDriveActivityMutableBuilder[Self <: SchemaDriveActivity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: js.Array[SchemaAction]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    @scala.inline
    def setActionsVarargs(value: SchemaAction*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setActors(value: js.Array[SchemaActor]): Self = StObject.set(x, "actors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActorsUndefined: Self = StObject.set(x, "actors", js.undefined)
    
    @scala.inline
    def setActorsVarargs(value: SchemaActor*): Self = StObject.set(x, "actors", js.Array(value :_*))
    
    @scala.inline
    def setPrimaryActionDetail(value: SchemaActionDetail): Self = StObject.set(x, "primaryActionDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryActionDetailUndefined: Self = StObject.set(x, "primaryActionDetail", js.undefined)
    
    @scala.inline
    def setTargets(value: js.Array[SchemaTarget]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
    
    @scala.inline
    def setTargetsVarargs(value: SchemaTarget*): Self = StObject.set(x, "targets", js.Array(value :_*))
    
    @scala.inline
    def setTimeRange(value: SchemaTimeRange): Self = StObject.set(x, "timeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeRangeUndefined: Self = StObject.set(x, "timeRange", js.undefined)
    
    @scala.inline
    def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
