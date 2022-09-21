package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsHistoriesList
  extends StObject
     with StandardParameters {
  
  /**
    * If set, only return histories with the given name. Optional.
    */
  var filterByName: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of Histories to fetch. Default value: 20. The server will use this default if the field is not set or has a value of 0. Any value greater than 100 will be treated as 100. Optional.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A continuation token to resume the query at the next item. Optional.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * A Project id. Required.
    */
  var projectId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsHistoriesList {
  
  inline def apply(): ParamsResourceProjectsHistoriesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsHistoriesList]
  }
  
  extension [Self <: ParamsResourceProjectsHistoriesList](x: Self) {
    
    inline def setFilterByName(value: String): Self = StObject.set(x, "filterByName", value.asInstanceOf[js.Any])
    
    inline def setFilterByNameUndefined: Self = StObject.set(x, "filterByName", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
