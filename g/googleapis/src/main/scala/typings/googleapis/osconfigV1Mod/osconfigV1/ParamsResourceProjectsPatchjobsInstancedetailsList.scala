package typings.googleapis.osconfigV1Mod.osconfigV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsPatchjobsInstancedetailsList
  extends StObject
     with StandardParameters {
  
  /**
    * A filter expression that filters results listed in the response. This field supports filtering results by instance zone, name, state, or `failure_reason`.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of instance details records to return. Default is 100.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A pagination token returned from a previous call that indicates where this listing should continue from.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The parent for the instances are in the form of `projects/x/patchJobs/x`.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsPatchjobsInstancedetailsList {
  
  inline def apply(): ParamsResourceProjectsPatchjobsInstancedetailsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsPatchjobsInstancedetailsList]
  }
  
  extension [Self <: ParamsResourceProjectsPatchjobsInstancedetailsList](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
