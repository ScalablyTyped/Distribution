package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFilesAnnotate
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaBatchAnnotateFilesRequest] = js.undefined
}
object ParamsResourceFilesAnnotate {
  
  inline def apply(): ParamsResourceFilesAnnotate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFilesAnnotate]
  }
  
  extension [Self <: ParamsResourceFilesAnnotate](x: Self) {
    
    inline def setRequestBody(value: SchemaBatchAnnotateFilesRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
