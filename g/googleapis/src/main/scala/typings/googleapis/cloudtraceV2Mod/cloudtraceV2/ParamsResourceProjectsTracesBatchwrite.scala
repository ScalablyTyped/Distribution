package typings.googleapis.cloudtraceV2Mod.cloudtraceV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsTracesBatchwrite
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the project where the spans belong. The format is `projects/[PROJECT_ID]`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaBatchWriteSpansRequest] = js.undefined
}
object ParamsResourceProjectsTracesBatchwrite {
  
  inline def apply(): ParamsResourceProjectsTracesBatchwrite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsTracesBatchwrite]
  }
  
  extension [Self <: ParamsResourceProjectsTracesBatchwrite](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaBatchWriteSpansRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
