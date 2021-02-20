package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Endpoint config for this cluster
  */
@js.native
trait SchemaEndpointConfig extends StObject {
  
  /**
    * Optional. If true, enable http access to specific ports on the cluster
    * from external sources. Defaults to false.
    */
  var enableHttpPortAccess: js.UndefOr[Boolean] = js.native
  
  /**
    * Output only. The map of port descriptions to URLs. Will only be populated
    * if enable_http_port_access is true.
    */
  var httpPorts: js.UndefOr[StringDictionary[String]] = js.native
}
object SchemaEndpointConfig {
  
  @scala.inline
  def apply(): SchemaEndpointConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEndpointConfig]
  }
  
  @scala.inline
  implicit class SchemaEndpointConfigMutableBuilder[Self <: SchemaEndpointConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableHttpPortAccess(value: Boolean): Self = StObject.set(x, "enableHttpPortAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableHttpPortAccessUndefined: Self = StObject.set(x, "enableHttpPortAccess", js.undefined)
    
    @scala.inline
    def setHttpPorts(value: StringDictionary[String]): Self = StObject.set(x, "httpPorts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpPortsUndefined: Self = StObject.set(x, "httpPorts", js.undefined)
  }
}
