package typings.googleapis.pubsubV1Mod.pubsubV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsSchemasValidatemessage
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the project in which to validate schemas. Format is `projects/{project-id\}`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaValidateMessageRequest] = js.undefined
}
object ParamsResourceProjectsSchemasValidatemessage {
  
  inline def apply(): ParamsResourceProjectsSchemasValidatemessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsSchemasValidatemessage]
  }
  
  extension [Self <: ParamsResourceProjectsSchemasValidatemessage](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaValidateMessageRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
