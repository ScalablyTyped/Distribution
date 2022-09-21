package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsInstancesDatabasesSessionsExecutebatchdml
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaExecuteBatchDmlRequest] = js.undefined
  
  /**
    * Required. The session in which the DML statements should be performed.
    */
  var session: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsInstancesDatabasesSessionsExecutebatchdml {
  
  inline def apply(): ParamsResourceProjectsInstancesDatabasesSessionsExecutebatchdml = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsInstancesDatabasesSessionsExecutebatchdml]
  }
  
  extension [Self <: ParamsResourceProjectsInstancesDatabasesSessionsExecutebatchdml](x: Self) {
    
    inline def setRequestBody(value: SchemaExecuteBatchDmlRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setSession(value: String): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
  }
}
