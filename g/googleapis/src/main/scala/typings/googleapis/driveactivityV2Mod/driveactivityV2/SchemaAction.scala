package typings.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAction extends StObject {
  
  /**
    * The actor responsible for this action (or empty if all actors are responsible).
    */
  var actor: js.UndefOr[SchemaActor] = js.undefined
  
  /**
    * The type and detailed information about the action.
    */
  var detail: js.UndefOr[SchemaActionDetail] = js.undefined
  
  /**
    * The target this action affects (or empty if affecting all targets). This represents the state of the target immediately after this action occurred.
    */
  var target: js.UndefOr[SchemaTarget] = js.undefined
  
  /**
    * The action occurred over this time range.
    */
  var timeRange: js.UndefOr[SchemaTimeRange] = js.undefined
  
  /**
    * The action occurred at this specific time.
    */
  var timestamp: js.UndefOr[String | Null] = js.undefined
}
object SchemaAction {
  
  inline def apply(): SchemaAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAction]
  }
  
  extension [Self <: SchemaAction](x: Self) {
    
    inline def setActor(value: SchemaActor): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setActorUndefined: Self = StObject.set(x, "actor", js.undefined)
    
    inline def setDetail(value: SchemaActionDetail): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setTarget(value: SchemaTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTimeRange(value: SchemaTimeRange): Self = StObject.set(x, "timeRange", value.asInstanceOf[js.Any])
    
    inline def setTimeRangeUndefined: Self = StObject.set(x, "timeRange", js.undefined)
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampNull: Self = StObject.set(x, "timestamp", null)
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
