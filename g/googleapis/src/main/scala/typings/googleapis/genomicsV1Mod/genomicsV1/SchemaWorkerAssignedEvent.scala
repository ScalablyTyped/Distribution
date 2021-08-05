package typings.googleapis.genomicsV1Mod.genomicsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An event generated after a worker VM has been assigned to run the pipeline.
  */
trait SchemaWorkerAssignedEvent extends StObject {
  
  /**
    * The worker&#39;s instance name.
    */
  var instance: js.UndefOr[String] = js.undefined
  
  /**
    * The zone the worker is running in.
    */
  var zone: js.UndefOr[String] = js.undefined
}
object SchemaWorkerAssignedEvent {
  
  inline def apply(): SchemaWorkerAssignedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkerAssignedEvent]
  }
  
  extension [Self <: SchemaWorkerAssignedEvent](x: Self) {
    
    inline def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
