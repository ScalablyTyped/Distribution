package typings.googleapis.driveactivityV2Mod.driveactivityV2

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
trait SchemaDriveActivity extends js.Object {
  
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
  implicit class SchemaDriveActivityOps[Self <: SchemaDriveActivity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActionsVarargs(value: SchemaAction*): Self = this.set("actions", js.Array(value :_*))
    
    @scala.inline
    def setActions(value: js.Array[SchemaAction]): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    
    @scala.inline
    def setActorsVarargs(value: SchemaActor*): Self = this.set("actors", js.Array(value :_*))
    
    @scala.inline
    def setActors(value: js.Array[SchemaActor]): Self = this.set("actors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActors: Self = this.set("actors", js.undefined)
    
    @scala.inline
    def setPrimaryActionDetail(value: SchemaActionDetail): Self = this.set("primaryActionDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryActionDetail: Self = this.set("primaryActionDetail", js.undefined)
    
    @scala.inline
    def setTargetsVarargs(value: SchemaTarget*): Self = this.set("targets", js.Array(value :_*))
    
    @scala.inline
    def setTargets(value: js.Array[SchemaTarget]): Self = this.set("targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargets: Self = this.set("targets", js.undefined)
    
    @scala.inline
    def setTimeRange(value: SchemaTimeRange): Self = this.set("timeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeRange: Self = this.set("timeRange", js.undefined)
    
    @scala.inline
    def setTimestamp(value: String): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
  }
}
