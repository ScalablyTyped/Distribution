package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBlobsBatchupdate
  extends StObject
     with StandardParameters {
  
  /**
    * The instance of the execution system to operate against. A server may support multiple instances of the execution system (with their own workers, storage, caches, etc.). The server MAY require use of this field to select between them in an implementation-defined fashion, otherwise it can be omitted.
    */
  var instanceName: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsRequest] = js.undefined
}
object ParamsResourceBlobsBatchupdate {
  
  inline def apply(): ParamsResourceBlobsBatchupdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBlobsBatchupdate]
  }
  
  extension [Self <: ParamsResourceBlobsBatchupdate](x: Self) {
    
    inline def setInstanceName(value: String): Self = StObject.set(x, "instanceName", value.asInstanceOf[js.Any])
    
    inline def setInstanceNameUndefined: Self = StObject.set(x, "instanceName", js.undefined)
    
    inline def setRequestBody(value: SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
