package typings.googleapis.vmmigrationV1alpha1Mod.vmmigrationV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReplicatingStep extends StObject {
  
  /**
    * The source disks replication rate for the last 30 minutes in bytes per second.
    */
  var lastThirtyMinutesAverageBytesPerSecond: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The source disks replication rate for the last 2 minutes in bytes per second.
    */
  var lastTwoMinutesAverageBytesPerSecond: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Replicated bytes in the step.
    */
  var replicatedBytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Total bytes to be handled in the step.
    */
  var totalBytes: js.UndefOr[String | Null] = js.undefined
}
object SchemaReplicatingStep {
  
  inline def apply(): SchemaReplicatingStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReplicatingStep]
  }
  
  extension [Self <: SchemaReplicatingStep](x: Self) {
    
    inline def setLastThirtyMinutesAverageBytesPerSecond(value: String): Self = StObject.set(x, "lastThirtyMinutesAverageBytesPerSecond", value.asInstanceOf[js.Any])
    
    inline def setLastThirtyMinutesAverageBytesPerSecondNull: Self = StObject.set(x, "lastThirtyMinutesAverageBytesPerSecond", null)
    
    inline def setLastThirtyMinutesAverageBytesPerSecondUndefined: Self = StObject.set(x, "lastThirtyMinutesAverageBytesPerSecond", js.undefined)
    
    inline def setLastTwoMinutesAverageBytesPerSecond(value: String): Self = StObject.set(x, "lastTwoMinutesAverageBytesPerSecond", value.asInstanceOf[js.Any])
    
    inline def setLastTwoMinutesAverageBytesPerSecondNull: Self = StObject.set(x, "lastTwoMinutesAverageBytesPerSecond", null)
    
    inline def setLastTwoMinutesAverageBytesPerSecondUndefined: Self = StObject.set(x, "lastTwoMinutesAverageBytesPerSecond", js.undefined)
    
    inline def setReplicatedBytes(value: String): Self = StObject.set(x, "replicatedBytes", value.asInstanceOf[js.Any])
    
    inline def setReplicatedBytesNull: Self = StObject.set(x, "replicatedBytes", null)
    
    inline def setReplicatedBytesUndefined: Self = StObject.set(x, "replicatedBytes", js.undefined)
    
    inline def setTotalBytes(value: String): Self = StObject.set(x, "totalBytes", value.asInstanceOf[js.Any])
    
    inline def setTotalBytesNull: Self = StObject.set(x, "totalBytes", null)
    
    inline def setTotalBytesUndefined: Self = StObject.set(x, "totalBytes", js.undefined)
  }
}
