package typings.ionic.definitionsMod

import typings.ionic.anon.Address
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DevAppDetails extends StObject {
  
  var channel: js.UndefOr[String] = js.undefined
  
  var commPort: Double
  
  var interfaces: js.Array[Address]
  
  var port: Double
}
object DevAppDetails {
  
  inline def apply(commPort: Double, interfaces: js.Array[Address], port: Double): DevAppDetails = {
    val __obj = js.Dynamic.literal(commPort = commPort.asInstanceOf[js.Any], interfaces = interfaces.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevAppDetails]
  }
  
  extension [Self <: DevAppDetails](x: Self) {
    
    inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
    
    inline def setCommPort(value: Double): Self = StObject.set(x, "commPort", value.asInstanceOf[js.Any])
    
    inline def setInterfaces(value: js.Array[Address]): Self = StObject.set(x, "interfaces", value.asInstanceOf[js.Any])
    
    inline def setInterfacesVarargs(value: Address*): Self = StObject.set(x, "interfaces", js.Array(value :_*))
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
  }
}
