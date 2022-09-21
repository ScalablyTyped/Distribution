package typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBilling extends StObject {
  
  /**
    * Billing configurations for sending metrics to the consumer project. There can be multiple consumer destinations per service, each one must have a different monitored resource type. A metric can be used in at most one consumer destination.
    */
  var consumerDestinations: js.UndefOr[js.Array[SchemaBillingDestination]] = js.undefined
}
object SchemaBilling {
  
  inline def apply(): SchemaBilling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBilling]
  }
  
  extension [Self <: SchemaBilling](x: Self) {
    
    inline def setConsumerDestinations(value: js.Array[SchemaBillingDestination]): Self = StObject.set(x, "consumerDestinations", value.asInstanceOf[js.Any])
    
    inline def setConsumerDestinationsUndefined: Self = StObject.set(x, "consumerDestinations", js.undefined)
    
    inline def setConsumerDestinationsVarargs(value: SchemaBillingDestination*): Self = StObject.set(x, "consumerDestinations", js.Array(value*))
  }
}
