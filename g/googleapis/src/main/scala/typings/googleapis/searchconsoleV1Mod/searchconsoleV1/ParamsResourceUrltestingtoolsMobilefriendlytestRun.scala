package typings.googleapis.searchconsoleV1Mod.searchconsoleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUrltestingtoolsMobilefriendlytestRun
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaRunMobileFriendlyTestRequest] = js.undefined
}
object ParamsResourceUrltestingtoolsMobilefriendlytestRun {
  
  inline def apply(): ParamsResourceUrltestingtoolsMobilefriendlytestRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUrltestingtoolsMobilefriendlytestRun]
  }
  
  extension [Self <: ParamsResourceUrltestingtoolsMobilefriendlytestRun](x: Self) {
    
    inline def setRequestBody(value: SchemaRunMobileFriendlyTestRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
