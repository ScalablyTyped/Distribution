package typings.maximMazurokGapiClientAppengine.gapi.client.appengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcAccessConnector extends StObject {
  
  /** The egress setting for the connector, controlling what traffic is diverted through it. */
  var egressSetting: js.UndefOr[String] = js.undefined
  
  /** Full Serverless VPC Access Connector name e.g. /projects/my-project/locations/us-central1/connectors/c1. */
  var name: js.UndefOr[String] = js.undefined
}
object VpcAccessConnector {
  
  inline def apply(): VpcAccessConnector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcAccessConnector]
  }
  
  extension [Self <: VpcAccessConnector](x: Self) {
    
    inline def setEgressSetting(value: String): Self = StObject.set(x, "egressSetting", value.asInstanceOf[js.Any])
    
    inline def setEgressSettingUndefined: Self = StObject.set(x, "egressSetting", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
