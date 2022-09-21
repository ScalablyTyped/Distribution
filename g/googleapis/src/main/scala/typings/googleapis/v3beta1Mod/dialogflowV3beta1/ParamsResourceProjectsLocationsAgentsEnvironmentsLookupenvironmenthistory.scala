package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsAgentsEnvironmentsLookupenvironmenthistory
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Resource name of the environment to look up the history for. Format: `projects//locations//agents//environments/`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of items to return in a single page. By default 100 and at most 1000.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The next_page_token value returned from a previous list request.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsAgentsEnvironmentsLookupenvironmenthistory {
  
  inline def apply(): ParamsResourceProjectsLocationsAgentsEnvironmentsLookupenvironmenthistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsAgentsEnvironmentsLookupenvironmenthistory]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsAgentsEnvironmentsLookupenvironmenthistory](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
