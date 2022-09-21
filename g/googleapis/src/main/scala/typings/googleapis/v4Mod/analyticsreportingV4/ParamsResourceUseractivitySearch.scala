package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUseractivitySearch
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSearchUserActivityRequest] = js.undefined
}
object ParamsResourceUseractivitySearch {
  
  inline def apply(): ParamsResourceUseractivitySearch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUseractivitySearch]
  }
  
  extension [Self <: ParamsResourceUseractivitySearch](x: Self) {
    
    inline def setRequestBody(value: SchemaSearchUserActivityRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
