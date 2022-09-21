package typings.googleapis.composerV1Mod.composerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWebServerResource extends StObject {
  
  /**
    * Optional. CPU request and limit for Airflow web server.
    */
  var cpu: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. Memory (GB) request and limit for Airflow web server.
    */
  var memoryGb: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. Storage (GB) request and limit for Airflow web server.
    */
  var storageGb: js.UndefOr[Double | Null] = js.undefined
}
object SchemaWebServerResource {
  
  inline def apply(): SchemaWebServerResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWebServerResource]
  }
  
  extension [Self <: SchemaWebServerResource](x: Self) {
    
    inline def setCpu(value: Double): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
    
    inline def setCpuNull: Self = StObject.set(x, "cpu", null)
    
    inline def setCpuUndefined: Self = StObject.set(x, "cpu", js.undefined)
    
    inline def setMemoryGb(value: Double): Self = StObject.set(x, "memoryGb", value.asInstanceOf[js.Any])
    
    inline def setMemoryGbNull: Self = StObject.set(x, "memoryGb", null)
    
    inline def setMemoryGbUndefined: Self = StObject.set(x, "memoryGb", js.undefined)
    
    inline def setStorageGb(value: Double): Self = StObject.set(x, "storageGb", value.asInstanceOf[js.Any])
    
    inline def setStorageGbNull: Self = StObject.set(x, "storageGb", null)
    
    inline def setStorageGbUndefined: Self = StObject.set(x, "storageGb", js.undefined)
  }
}
