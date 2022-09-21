package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsInstancesDatabasesGetscans
  extends StObject
     with StandardParameters {
  
  /**
    * The upper bound for the time range to retrieve Scan data for.
    */
  var endTime: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The unique name of the scan containing the requested information, specific to the Database service implementing this interface.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * These fields restrict the Database-specific information returned in the `Scan.data` field. If a `View` is provided that does not include the `Scan.data` field, these are ignored. This range of time must be entirely contained within the defined time range of the targeted scan. The lower bound for the time range to retrieve Scan data for.
    */
  var startTime: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies which parts of the Scan should be returned in the response. Note, if left unspecified, the FULL view is assumed.
    */
  var view: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsInstancesDatabasesGetscans {
  
  inline def apply(): ParamsResourceProjectsInstancesDatabasesGetscans = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsInstancesDatabasesGetscans]
  }
  
  extension [Self <: ParamsResourceProjectsInstancesDatabasesGetscans](x: Self) {
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
