package typings.googleapis.vmmigrationV1Mod.vmmigrationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReplicationCycle extends StObject {
  
  /**
    * The current progress in percentage of this cycle.
    */
  var progressPercent: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The time the replication cycle has started.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaReplicationCycle {
  
  inline def apply(): SchemaReplicationCycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReplicationCycle]
  }
  
  extension [Self <: SchemaReplicationCycle](x: Self) {
    
    inline def setProgressPercent(value: Double): Self = StObject.set(x, "progressPercent", value.asInstanceOf[js.Any])
    
    inline def setProgressPercentNull: Self = StObject.set(x, "progressPercent", null)
    
    inline def setProgressPercentUndefined: Self = StObject.set(x, "progressPercent", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
