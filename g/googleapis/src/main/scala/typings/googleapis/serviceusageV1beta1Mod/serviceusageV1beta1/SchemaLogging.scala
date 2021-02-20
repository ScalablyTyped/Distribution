package typings.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Logging configuration of the service.  The following example shows how to
  * configure logs to be sent to the producer and consumer projects. In the
  * example, the `activity_history` log is sent to both the producer and
  * consumer projects, whereas the `purchase_history` log is only sent to the
  * producer project.      monitored_resources:     - type:
  * library.googleapis.com/branch       labels:       - key: /city description:
  * The city where the library branch is located in.       - key: /name
  * description: The name of the branch.     logs:     - name: activity_history
  * labels:       - key: /customer_id     - name: purchase_history     logging:
  * producer_destinations:       - monitored_resource:
  * library.googleapis.com/branch         logs:         - activity_history -
  * purchase_history       consumer_destinations:       - monitored_resource:
  * library.googleapis.com/branch         logs:         - activity_history
  */
@js.native
trait SchemaLogging extends StObject {
  
  /**
    * Logging configurations for sending logs to the consumer project. There
    * can be multiple consumer destinations, each one must have a different
    * monitored resource type. A log can be used in at most one consumer
    * destination.
    */
  var consumerDestinations: js.UndefOr[js.Array[SchemaLoggingDestination]] = js.native
  
  /**
    * Logging configurations for sending logs to the producer project. There
    * can be multiple producer destinations, each one must have a different
    * monitored resource type. A log can be used in at most one producer
    * destination.
    */
  var producerDestinations: js.UndefOr[js.Array[SchemaLoggingDestination]] = js.native
}
object SchemaLogging {
  
  @scala.inline
  def apply(): SchemaLogging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLogging]
  }
  
  @scala.inline
  implicit class SchemaLoggingMutableBuilder[Self <: SchemaLogging] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConsumerDestinations(value: js.Array[SchemaLoggingDestination]): Self = StObject.set(x, "consumerDestinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumerDestinationsUndefined: Self = StObject.set(x, "consumerDestinations", js.undefined)
    
    @scala.inline
    def setConsumerDestinationsVarargs(value: SchemaLoggingDestination*): Self = StObject.set(x, "consumerDestinations", js.Array(value :_*))
    
    @scala.inline
    def setProducerDestinations(value: js.Array[SchemaLoggingDestination]): Self = StObject.set(x, "producerDestinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProducerDestinationsUndefined: Self = StObject.set(x, "producerDestinations", js.undefined)
    
    @scala.inline
    def setProducerDestinationsVarargs(value: SchemaLoggingDestination*): Self = StObject.set(x, "producerDestinations", js.Array(value :_*))
  }
}
