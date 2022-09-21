package typings.googleapis.v1managementMod.gamesManagementV1management

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceScoresResetmultipleforallplayers
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaScoresResetMultipleForAllRequest] = js.undefined
}
object ParamsResourceScoresResetmultipleforallplayers {
  
  inline def apply(): ParamsResourceScoresResetmultipleforallplayers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceScoresResetmultipleforallplayers]
  }
  
  extension [Self <: ParamsResourceScoresResetmultipleforallplayers](x: Self) {
    
    inline def setRequestBody(value: SchemaScoresResetMultipleForAllRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
