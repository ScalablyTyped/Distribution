package typings.maximMazurokGapiClientComposer.gapi.client.composer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebServerResource extends StObject {
  
  /** Optional. CPU request and limit for Airflow web server. */
  var cpu: js.UndefOr[Double] = js.undefined
  
  /** Optional. Memory (GB) request and limit for Airflow web server. */
  var memoryGb: js.UndefOr[Double] = js.undefined
  
  /** Optional. Storage (GB) request and limit for Airflow web server. */
  var storageGb: js.UndefOr[Double] = js.undefined
}
object WebServerResource {
  
  inline def apply(): WebServerResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebServerResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebServerResource] (val x: Self) extends AnyVal {
    
    inline def setCpu(value: Double): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
    
    inline def setCpuUndefined: Self = StObject.set(x, "cpu", js.undefined)
    
    inline def setMemoryGb(value: Double): Self = StObject.set(x, "memoryGb", value.asInstanceOf[js.Any])
    
    inline def setMemoryGbUndefined: Self = StObject.set(x, "memoryGb", js.undefined)
    
    inline def setStorageGb(value: Double): Self = StObject.set(x, "storageGb", value.asInstanceOf[js.Any])
    
    inline def setStorageGbUndefined: Self = StObject.set(x, "storageGb", js.undefined)
  }
}
