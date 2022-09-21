package typings.googleapis.fcmV1Mod.fcmV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsMessagesSend
  extends StObject
     with StandardParameters {
  
  /**
    * Required. It contains the Firebase project id (i.e. the unique identifier for your Firebase project), in the format of `projects/{project_id\}`. For legacy support, the numeric project number with no padding is also supported in the format of `projects/{project_number\}`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSendMessageRequest] = js.undefined
}
object ParamsResourceProjectsMessagesSend {
  
  inline def apply(): ParamsResourceProjectsMessagesSend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsMessagesSend]
  }
  
  extension [Self <: ParamsResourceProjectsMessagesSend](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaSendMessageRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
