package typings.googleapis.lifesciencesV2betaMod.lifesciencesV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsOperationsList
  extends StObject
     with StandardParameters {
  
  /**
    * A string for filtering Operations. The following filter fields are supported: * createTime: The time this job was created * events: The set of event (names) that have occurred while running the pipeline. The : operator can be used to determine if a particular event has occurred. * error: If the pipeline is running, this value is NULL. Once the pipeline finishes, the value is the standard Google error code. * labels.key or labels."key with space" where key is a label key. * done: If the pipeline is running, this value is false. Once the pipeline finishes, the value is true.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the operation's parent resource.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of results to return. The maximum value is 256.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The standard list page token.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsOperationsList {
  
  inline def apply(): ParamsResourceProjectsLocationsOperationsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsOperationsList]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsOperationsList](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
