package typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMonitoring extends StObject {
  
  /**
    * Monitoring configurations for sending metrics to the consumer project. There can be multiple consumer destinations. A monitored resource type may appear in multiple monitoring destinations if different aggregations are needed for different sets of metrics associated with that monitored resource type. A monitored resource and metric pair may only be used once in the Monitoring configuration.
    */
  var consumerDestinations: js.UndefOr[js.Array[SchemaMonitoringDestination]] = js.undefined
  
  /**
    * Monitoring configurations for sending metrics to the producer project. There can be multiple producer destinations. A monitored resource type may appear in multiple monitoring destinations if different aggregations are needed for different sets of metrics associated with that monitored resource type. A monitored resource and metric pair may only be used once in the Monitoring configuration.
    */
  var producerDestinations: js.UndefOr[js.Array[SchemaMonitoringDestination]] = js.undefined
}
object SchemaMonitoring {
  
  inline def apply(): SchemaMonitoring = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMonitoring]
  }
  
  extension [Self <: SchemaMonitoring](x: Self) {
    
    inline def setConsumerDestinations(value: js.Array[SchemaMonitoringDestination]): Self = StObject.set(x, "consumerDestinations", value.asInstanceOf[js.Any])
    
    inline def setConsumerDestinationsUndefined: Self = StObject.set(x, "consumerDestinations", js.undefined)
    
    inline def setConsumerDestinationsVarargs(value: SchemaMonitoringDestination*): Self = StObject.set(x, "consumerDestinations", js.Array(value*))
    
    inline def setProducerDestinations(value: js.Array[SchemaMonitoringDestination]): Self = StObject.set(x, "producerDestinations", value.asInstanceOf[js.Any])
    
    inline def setProducerDestinationsUndefined: Self = StObject.set(x, "producerDestinations", js.undefined)
    
    inline def setProducerDestinationsVarargs(value: SchemaMonitoringDestination*): Self = StObject.set(x, "producerDestinations", js.Array(value*))
  }
}
