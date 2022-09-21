package typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpdateConsumerConfigRequest extends StObject {
  
  /**
    * Required. The updated peering config.
    */
  var consumerConfig: js.UndefOr[SchemaConsumerConfig] = js.undefined
}
object SchemaUpdateConsumerConfigRequest {
  
  inline def apply(): SchemaUpdateConsumerConfigRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateConsumerConfigRequest]
  }
  
  extension [Self <: SchemaUpdateConsumerConfigRequest](x: Self) {
    
    inline def setConsumerConfig(value: SchemaConsumerConfig): Self = StObject.set(x, "consumerConfig", value.asInstanceOf[js.Any])
    
    inline def setConsumerConfigUndefined: Self = StObject.set(x, "consumerConfig", js.undefined)
  }
}
