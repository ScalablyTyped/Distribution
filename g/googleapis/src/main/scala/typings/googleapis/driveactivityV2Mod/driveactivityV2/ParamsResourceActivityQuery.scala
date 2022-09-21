package typings.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceActivityQuery
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaQueryDriveActivityRequest] = js.undefined
}
object ParamsResourceActivityQuery {
  
  inline def apply(): ParamsResourceActivityQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceActivityQuery]
  }
  
  extension [Self <: ParamsResourceActivityQuery](x: Self) {
    
    inline def setRequestBody(value: SchemaQueryDriveActivityRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
