package typings.maximMazurokGapiClientComposer.gapi.client.composer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebServerConfig extends StObject {
  
  /**
    * Optional. Machine type on which Airflow web server is running. It has to be one of: composer-n1-webserver-2, composer-n1-webserver-4 or composer-n1-webserver-8. If not specified,
    * composer-n1-webserver-2 will be used. Value custom is returned only in response, if Airflow web server parameters were manually changed to a non-standard values.
    */
  var machineType: js.UndefOr[String] = js.undefined
}
object WebServerConfig {
  
  inline def apply(): WebServerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebServerConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebServerConfig] (val x: Self) extends AnyVal {
    
    inline def setMachineType(value: String): Self = StObject.set(x, "machineType", value.asInstanceOf[js.Any])
    
    inline def setMachineTypeUndefined: Self = StObject.set(x, "machineType", js.undefined)
  }
}
