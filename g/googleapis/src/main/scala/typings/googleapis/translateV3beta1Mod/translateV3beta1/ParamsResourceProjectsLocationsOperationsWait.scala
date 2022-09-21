package typings.googleapis.translateV3beta1Mod.translateV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsOperationsWait
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the operation resource to wait on.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaWaitOperationRequest] = js.undefined
}
object ParamsResourceProjectsLocationsOperationsWait {
  
  inline def apply(): ParamsResourceProjectsLocationsOperationsWait = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsOperationsWait]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsOperationsWait](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaWaitOperationRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
