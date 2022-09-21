package typings.googleapis.v1managementMod.gamesManagementV1management

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceEventsResetmultipleforallplayers
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaEventsResetMultipleForAllRequest] = js.undefined
}
object ParamsResourceEventsResetmultipleforallplayers {
  
  inline def apply(): ParamsResourceEventsResetmultipleforallplayers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEventsResetmultipleforallplayers]
  }
  
  extension [Self <: ParamsResourceEventsResetmultipleforallplayers](x: Self) {
    
    inline def setRequestBody(value: SchemaEventsResetMultipleForAllRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
