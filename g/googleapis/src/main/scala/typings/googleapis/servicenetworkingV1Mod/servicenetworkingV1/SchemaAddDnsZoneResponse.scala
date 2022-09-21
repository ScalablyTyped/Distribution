package typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAddDnsZoneResponse extends StObject {
  
  /**
    * The DNS peering zone created in the consumer project.
    */
  var consumerPeeringZone: js.UndefOr[SchemaDnsZone] = js.undefined
  
  /**
    * The private DNS zone created in the shared producer host project.
    */
  var producerPrivateZone: js.UndefOr[SchemaDnsZone] = js.undefined
}
object SchemaAddDnsZoneResponse {
  
  inline def apply(): SchemaAddDnsZoneResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddDnsZoneResponse]
  }
  
  extension [Self <: SchemaAddDnsZoneResponse](x: Self) {
    
    inline def setConsumerPeeringZone(value: SchemaDnsZone): Self = StObject.set(x, "consumerPeeringZone", value.asInstanceOf[js.Any])
    
    inline def setConsumerPeeringZoneUndefined: Self = StObject.set(x, "consumerPeeringZone", js.undefined)
    
    inline def setProducerPrivateZone(value: SchemaDnsZone): Self = StObject.set(x, "producerPrivateZone", value.asInstanceOf[js.Any])
    
    inline def setProducerPrivateZoneUndefined: Self = StObject.set(x, "producerPrivateZone", js.undefined)
  }
}
