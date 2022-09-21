package typings.googleapis.lifesciencesV2betaMod.lifesciencesV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWorkerReleasedEvent extends StObject {
  
  /**
    * The worker's instance name.
    */
  var instance: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The zone the worker was running in.
    */
  var zone: js.UndefOr[String | Null] = js.undefined
}
object SchemaWorkerReleasedEvent {
  
  inline def apply(): SchemaWorkerReleasedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkerReleasedEvent]
  }
  
  extension [Self <: SchemaWorkerReleasedEvent](x: Self) {
    
    inline def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceNull: Self = StObject.set(x, "instance", null)
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneNull: Self = StObject.set(x, "zone", null)
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
