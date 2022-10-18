package typings.kafkajs.mod

import typings.kafkajs.kafkajsStrings.adminDotconnect
import typings.kafkajs.kafkajsStrings.adminDotdisconnect
import typings.kafkajs.kafkajsStrings.adminDotnetworkDotrequest
import typings.kafkajs.kafkajsStrings.adminDotnetworkDotrequest_queue_size
import typings.kafkajs.kafkajsStrings.adminDotnetworkDotrequest_timeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdminEvents extends StObject {
  
  var CONNECT: adminDotconnect
  
  var DISCONNECT: adminDotdisconnect
  
  var REQUEST: adminDotnetworkDotrequest
  
  var REQUEST_QUEUE_SIZE: adminDotnetworkDotrequest_queue_size
  
  var REQUEST_TIMEOUT: adminDotnetworkDotrequest_timeout
}
object AdminEvents {
  
  inline def apply(): AdminEvents = {
    val __obj = js.Dynamic.literal(CONNECT = "admin.connect", DISCONNECT = "admin.disconnect", REQUEST = "admin.network.request", REQUEST_QUEUE_SIZE = "admin.network.request_queue_size", REQUEST_TIMEOUT = "admin.network.request_timeout")
    __obj.asInstanceOf[AdminEvents]
  }
  
  extension [Self <: AdminEvents](x: Self) {
    
    inline def setCONNECT(value: adminDotconnect): Self = StObject.set(x, "CONNECT", value.asInstanceOf[js.Any])
    
    inline def setDISCONNECT(value: adminDotdisconnect): Self = StObject.set(x, "DISCONNECT", value.asInstanceOf[js.Any])
    
    inline def setREQUEST(value: adminDotnetworkDotrequest): Self = StObject.set(x, "REQUEST", value.asInstanceOf[js.Any])
    
    inline def setREQUEST_QUEUE_SIZE(value: adminDotnetworkDotrequest_queue_size): Self = StObject.set(x, "REQUEST_QUEUE_SIZE", value.asInstanceOf[js.Any])
    
    inline def setREQUEST_TIMEOUT(value: adminDotnetworkDotrequest_timeout): Self = StObject.set(x, "REQUEST_TIMEOUT", value.asInstanceOf[js.Any])
  }
}
