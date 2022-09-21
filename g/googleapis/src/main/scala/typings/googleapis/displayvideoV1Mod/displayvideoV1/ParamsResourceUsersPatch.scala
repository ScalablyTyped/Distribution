package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUsersPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaUser] = js.undefined
  
  /**
    * Required. The mask to control which fields to update.
    */
  var updateMask: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The unique ID of the user. Assigned by the system.
    */
  var userId: js.UndefOr[String] = js.undefined
}
object ParamsResourceUsersPatch {
  
  inline def apply(): ParamsResourceUsersPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersPatch]
  }
  
  extension [Self <: ParamsResourceUsersPatch](x: Self) {
    
    inline def setRequestBody(value: SchemaUser): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
