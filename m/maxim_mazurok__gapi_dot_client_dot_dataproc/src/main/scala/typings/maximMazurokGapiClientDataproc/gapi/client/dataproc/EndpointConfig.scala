package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndpointConfig extends StObject {
  
  /** Optional. If true, enable http access to specific ports on the cluster from external sources. Defaults to false. */
  var enableHttpPortAccess: js.UndefOr[Boolean] = js.undefined
  
  /** Output only. The map of port descriptions to URLs. Will only be populated if enable_http_port_access is true. */
  var httpPorts: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDataproc.maximMazurokGapiClientDataprocStrings.EndpointConfig & TopLevel[js.Any]
  ] = js.undefined
}
object EndpointConfig {
  
  inline def apply(): EndpointConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointConfig]
  }
  
  extension [Self <: EndpointConfig](x: Self) {
    
    inline def setEnableHttpPortAccess(value: Boolean): Self = StObject.set(x, "enableHttpPortAccess", value.asInstanceOf[js.Any])
    
    inline def setEnableHttpPortAccessUndefined: Self = StObject.set(x, "enableHttpPortAccess", js.undefined)
    
    inline def setHttpPorts(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDataproc.maximMazurokGapiClientDataprocStrings.EndpointConfig & TopLevel[js.Any]
    ): Self = StObject.set(x, "httpPorts", value.asInstanceOf[js.Any])
    
    inline def setHttpPortsUndefined: Self = StObject.set(x, "httpPorts", js.undefined)
  }
}
