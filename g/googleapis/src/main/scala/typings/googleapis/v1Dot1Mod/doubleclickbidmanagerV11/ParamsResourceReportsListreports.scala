package typings.googleapis.v1Dot1Mod.doubleclickbidmanagerV11

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceReportsListreports
  extends StObject
     with StandardParameters {
  
  /**
    * Maximum number of results per page. Must be between 1 and 100. Defaults to 100 if unspecified.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional pagination token.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Query ID with which the reports are associated.
    */
  var queryId: js.UndefOr[String] = js.undefined
}
object ParamsResourceReportsListreports {
  
  inline def apply(): ParamsResourceReportsListreports = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceReportsListreports]
  }
  
  extension [Self <: ParamsResourceReportsListreports](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setQueryId(value: String): Self = StObject.set(x, "queryId", value.asInstanceOf[js.Any])
    
    inline def setQueryIdUndefined: Self = StObject.set(x, "queryId", js.undefined)
  }
}
