package typings.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceScriptsRun
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaExecutionRequest] = js.undefined
  
  /**
    * The script ID of the script to be executed. Find the script ID on the **Project settings** page under "IDs."
    */
  var scriptId: js.UndefOr[String] = js.undefined
}
object ParamsResourceScriptsRun {
  
  inline def apply(): ParamsResourceScriptsRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceScriptsRun]
  }
  
  extension [Self <: ParamsResourceScriptsRun](x: Self) {
    
    inline def setRequestBody(value: SchemaExecutionRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setScriptId(value: String): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
    
    inline def setScriptIdUndefined: Self = StObject.set(x, "scriptId", js.undefined)
  }
}
