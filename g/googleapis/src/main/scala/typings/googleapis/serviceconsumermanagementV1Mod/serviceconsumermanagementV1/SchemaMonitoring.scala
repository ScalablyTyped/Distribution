package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Monitoring configuration of the service.  The example below shows how to
  * configure monitored resources and metrics for monitoring. In the example, a
  * monitored resource and two metrics are defined. The
  * `library.googleapis.com/book/returned_count` metric is sent to both
  * producer and consumer projects, whereas the
  * `library.googleapis.com/book/overdue_count` metric is only sent to the
  * consumer project.      monitored_resources:     - type:
  * library.googleapis.com/branch       labels:       - key: /city description:
  * The city where the library branch is located in.       - key: /name
  * description: The name of the branch.     metrics:     - name:
  * library.googleapis.com/book/returned_count       metric_kind: DELTA
  * value_type: INT64       labels:       - key: /customer_id     - name:
  * library.googleapis.com/book/overdue_count       metric_kind: GAUGE
  * value_type: INT64       labels:       - key: /customer_id     monitoring:
  * producer_destinations:       - monitored_resource:
  * library.googleapis.com/branch         metrics:         -
  * library.googleapis.com/book/returned_count       consumer_destinations: -
  * monitored_resource: library.googleapis.com/branch         metrics: -
  * library.googleapis.com/book/returned_count         -
  * library.googleapis.com/book/overdue_count
  */
trait SchemaMonitoring extends StObject {
  
  /**
    * Monitoring configurations for sending metrics to the consumer project.
    * There can be multiple consumer destinations. A monitored resouce type may
    * appear in multiple monitoring destinations if different aggregations are
    * needed for different sets of metrics associated with that monitored
    * resource type. A monitored resource and metric pair may only be used once
    * in the Monitoring configuration.
    */
  var consumerDestinations: js.UndefOr[js.Array[SchemaMonitoringDestination]] = js.undefined
  
  /**
    * Monitoring configurations for sending metrics to the producer project.
    * There can be multiple producer destinations. A monitored resouce type may
    * appear in multiple monitoring destinations if different aggregations are
    * needed for different sets of metrics associated with that monitored
    * resource type. A monitored resource and metric pair may only be used once
    * in the Monitoring configuration.
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
    
    inline def setConsumerDestinationsVarargs(value: SchemaMonitoringDestination*): Self = StObject.set(x, "consumerDestinations", js.Array(value :_*))
    
    inline def setProducerDestinations(value: js.Array[SchemaMonitoringDestination]): Self = StObject.set(x, "producerDestinations", value.asInstanceOf[js.Any])
    
    inline def setProducerDestinationsUndefined: Self = StObject.set(x, "producerDestinations", js.undefined)
    
    inline def setProducerDestinationsVarargs(value: SchemaMonitoringDestination*): Self = StObject.set(x, "producerDestinations", js.Array(value :_*))
  }
}
