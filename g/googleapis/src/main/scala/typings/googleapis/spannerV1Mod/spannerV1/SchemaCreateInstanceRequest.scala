package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request for CreateInstance.
  */
trait SchemaCreateInstanceRequest extends StObject {
  
  /**
    * Required. The instance to create.  The name may be omitted, but if
    * specified must be `&lt;parent&gt;/instances/&lt;instance_id&gt;`.
    */
  var instance: js.UndefOr[SchemaInstance] = js.undefined
  
  /**
    * Required. The ID of the instance to create.  Valid identifiers are of the
    * form `a-z*[a-z0-9]` and must be between 6 and 30 characters in length.
    */
  var instanceId: js.UndefOr[String] = js.undefined
}
object SchemaCreateInstanceRequest {
  
  inline def apply(): SchemaCreateInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateInstanceRequest]
  }
  
  extension [Self <: SchemaCreateInstanceRequest](x: Self) {
    
    inline def setInstance(value: SchemaInstance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
  }
}
