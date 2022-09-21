package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSdfdownloadtasksCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCreateSdfDownloadTaskRequest] = js.undefined
}
object ParamsResourceSdfdownloadtasksCreate {
  
  inline def apply(): ParamsResourceSdfdownloadtasksCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSdfdownloadtasksCreate]
  }
  
  extension [Self <: ParamsResourceSdfdownloadtasksCreate](x: Self) {
    
    inline def setRequestBody(value: SchemaCreateSdfDownloadTaskRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
