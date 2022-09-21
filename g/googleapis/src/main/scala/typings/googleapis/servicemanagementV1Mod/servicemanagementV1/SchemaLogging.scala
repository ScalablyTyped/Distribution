package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLogging extends StObject {
  
  /**
    * Logging configurations for sending logs to the consumer project. There can be multiple consumer destinations, each one must have a different monitored resource type. A log can be used in at most one consumer destination.
    */
  var consumerDestinations: js.UndefOr[js.Array[SchemaLoggingDestination]] = js.undefined
  
  /**
    * Logging configurations for sending logs to the producer project. There can be multiple producer destinations, each one must have a different monitored resource type. A log can be used in at most one producer destination.
    */
  var producerDestinations: js.UndefOr[js.Array[SchemaLoggingDestination]] = js.undefined
}
object SchemaLogging {
  
  inline def apply(): SchemaLogging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLogging]
  }
  
  extension [Self <: SchemaLogging](x: Self) {
    
    inline def setConsumerDestinations(value: js.Array[SchemaLoggingDestination]): Self = StObject.set(x, "consumerDestinations", value.asInstanceOf[js.Any])
    
    inline def setConsumerDestinationsUndefined: Self = StObject.set(x, "consumerDestinations", js.undefined)
    
    inline def setConsumerDestinationsVarargs(value: SchemaLoggingDestination*): Self = StObject.set(x, "consumerDestinations", js.Array(value*))
    
    inline def setProducerDestinations(value: js.Array[SchemaLoggingDestination]): Self = StObject.set(x, "producerDestinations", value.asInstanceOf[js.Any])
    
    inline def setProducerDestinationsUndefined: Self = StObject.set(x, "producerDestinations", js.undefined)
    
    inline def setProducerDestinationsVarargs(value: SchemaLoggingDestination*): Self = StObject.set(x, "producerDestinations", js.Array(value*))
  }
}
