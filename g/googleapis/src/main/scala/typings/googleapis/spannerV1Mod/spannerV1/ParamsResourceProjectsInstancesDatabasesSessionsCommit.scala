package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsInstancesDatabasesSessionsCommit
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCommitRequest] = js.undefined
  
  /**
    * Required. The session in which the transaction to be committed is running.
    */
  var session: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsInstancesDatabasesSessionsCommit {
  
  inline def apply(): ParamsResourceProjectsInstancesDatabasesSessionsCommit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsInstancesDatabasesSessionsCommit]
  }
  
  extension [Self <: ParamsResourceProjectsInstancesDatabasesSessionsCommit](x: Self) {
    
    inline def setRequestBody(value: SchemaCommitRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setSession(value: String): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
  }
}
