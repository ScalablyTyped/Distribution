package typings.googleapis.storagetransferV1Mod.storagetransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRunTransferJobRequest extends StObject {
  
  /**
    * Required. The ID of the Google Cloud project that owns the transfer job.
    */
  var projectId: js.UndefOr[String | Null] = js.undefined
}
object SchemaRunTransferJobRequest {
  
  inline def apply(): SchemaRunTransferJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRunTransferJobRequest]
  }
  
  extension [Self <: SchemaRunTransferJobRequest](x: Self) {
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdNull: Self = StObject.set(x, "projectId", null)
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
