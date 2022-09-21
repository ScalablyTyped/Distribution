package typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeleteConnectionRequest extends StObject {
  
  /**
    * Required. The network that the consumer is using to connect with services. Must be in the form of projects/{project\}/global/networks/{network\} {project\} is a project number, as in '12345' {network\} is a network name.
    */
  var consumerNetwork: js.UndefOr[String | Null] = js.undefined
}
object SchemaDeleteConnectionRequest {
  
  inline def apply(): SchemaDeleteConnectionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteConnectionRequest]
  }
  
  extension [Self <: SchemaDeleteConnectionRequest](x: Self) {
    
    inline def setConsumerNetwork(value: String): Self = StObject.set(x, "consumerNetwork", value.asInstanceOf[js.Any])
    
    inline def setConsumerNetworkNull: Self = StObject.set(x, "consumerNetwork", null)
    
    inline def setConsumerNetworkUndefined: Self = StObject.set(x, "consumerNetwork", js.undefined)
  }
}
