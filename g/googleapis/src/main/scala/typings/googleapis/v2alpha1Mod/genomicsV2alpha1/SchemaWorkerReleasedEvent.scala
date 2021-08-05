package typings.googleapis.v2alpha1Mod.genomicsV2alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An event generated when the worker VM that was assigned to the pipeline has
  * been released (deleted).
  */
trait SchemaWorkerReleasedEvent extends StObject {
  
  /**
    * The worker&#39;s instance name.
    */
  var instance: js.UndefOr[String] = js.undefined
  
  /**
    * The zone the worker was running in.
    */
  var zone: js.UndefOr[String] = js.undefined
}
object SchemaWorkerReleasedEvent {
  
  inline def apply(): SchemaWorkerReleasedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkerReleasedEvent]
  }
  
  extension [Self <: SchemaWorkerReleasedEvent](x: Self) {
    
    inline def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
