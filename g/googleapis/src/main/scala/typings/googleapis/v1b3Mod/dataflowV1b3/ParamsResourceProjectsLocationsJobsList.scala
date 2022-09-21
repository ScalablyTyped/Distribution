package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsJobsList
  extends StObject
     with StandardParameters {
  
  /**
    * The kind of filter to use.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains this job.
    */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * If there are many jobs, limit response to at most this many. The actual number of jobs returned will be the lesser of max_responses and an unspecified server-defined limit.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Set this to the 'next_page_token' field of a previous response to request additional results in a long list.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The project which owns the jobs.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * Deprecated. ListJobs always returns summaries now. Use GetJob for other JobViews.
    */
  var view: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsJobsList {
  
  inline def apply(): ParamsResourceProjectsLocationsJobsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsJobsList]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsJobsList](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
