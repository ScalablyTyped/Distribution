package typings.googleapis.v1Dot1Mod.doubleclickbidmanagerV11

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceQueriesListqueries
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
}
object ParamsResourceQueriesListqueries {
  
  inline def apply(): ParamsResourceQueriesListqueries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceQueriesListqueries]
  }
  
  extension [Self <: ParamsResourceQueriesListqueries](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
