package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata type for the operation returned by UpdateInstance.
  */
trait SchemaUpdateInstanceMetadata extends StObject {
  
  /**
    * The time at which this operation was cancelled. If set, this operation is
    * in the process of undoing itself (which is guaranteed to succeed) and
    * cannot be cancelled again.
    */
  var cancelTime: js.UndefOr[String] = js.undefined
  
  /**
    * The time at which this operation failed or was completed successfully.
    */
  var endTime: js.UndefOr[String] = js.undefined
  
  /**
    * The desired end state of the update.
    */
  var instance: js.UndefOr[SchemaInstance] = js.undefined
  
  /**
    * The time at which UpdateInstance request was received.
    */
  var startTime: js.UndefOr[String] = js.undefined
}
object SchemaUpdateInstanceMetadata {
  
  inline def apply(): SchemaUpdateInstanceMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateInstanceMetadata]
  }
  
  extension [Self <: SchemaUpdateInstanceMetadata](x: Self) {
    
    inline def setCancelTime(value: String): Self = StObject.set(x, "cancelTime", value.asInstanceOf[js.Any])
    
    inline def setCancelTimeUndefined: Self = StObject.set(x, "cancelTime", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setInstance(value: SchemaInstance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
