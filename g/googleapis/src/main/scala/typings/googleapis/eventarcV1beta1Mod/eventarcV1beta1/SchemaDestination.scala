package typings.googleapis.eventarcV1beta1Mod.eventarcV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDestination extends StObject {
  
  /**
    * Cloud Run fully-managed service that receives the events. The service should be running in the same project as the trigger.
    */
  var cloudRunService: js.UndefOr[SchemaCloudRunService] = js.undefined
}
object SchemaDestination {
  
  inline def apply(): SchemaDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDestination]
  }
  
  extension [Self <: SchemaDestination](x: Self) {
    
    inline def setCloudRunService(value: SchemaCloudRunService): Self = StObject.set(x, "cloudRunService", value.asInstanceOf[js.Any])
    
    inline def setCloudRunServiceUndefined: Self = StObject.set(x, "cloudRunService", js.undefined)
  }
}
