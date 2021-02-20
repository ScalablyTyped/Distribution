package typings.ionic.definitionsMod

import typings.ionic.anon.Address
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DevAppDetails extends StObject {
  
  var channel: js.UndefOr[String] = js.native
  
  var commPort: Double = js.native
  
  var interfaces: js.Array[Address] = js.native
  
  var port: Double = js.native
}
object DevAppDetails {
  
  @scala.inline
  def apply(commPort: Double, interfaces: js.Array[Address], port: Double): DevAppDetails = {
    val __obj = js.Dynamic.literal(commPort = commPort.asInstanceOf[js.Any], interfaces = interfaces.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevAppDetails]
  }
  
  @scala.inline
  implicit class DevAppDetailsMutableBuilder[Self <: DevAppDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
    
    @scala.inline
    def setCommPort(value: Double): Self = StObject.set(x, "commPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterfaces(value: js.Array[Address]): Self = StObject.set(x, "interfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterfacesVarargs(value: Address*): Self = StObject.set(x, "interfaces", js.Array(value :_*))
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
  }
}
