package typings.googleapis.v35Mod.dfareportingV35

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceReportsRun
  extends StObject
     with StandardParameters {
  
  /**
    * The Campaign Manager 360 user profile ID.
    */
  var profileId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the report.
    */
  var reportId: js.UndefOr[String] = js.undefined
  
  /**
    * If set and true, tries to run the report synchronously.
    */
  var synchronous: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceReportsRun {
  
  inline def apply(): ParamsResourceReportsRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceReportsRun]
  }
  
  extension [Self <: ParamsResourceReportsRun](x: Self) {
    
    inline def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    inline def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
    
    inline def setReportId(value: String): Self = StObject.set(x, "reportId", value.asInstanceOf[js.Any])
    
    inline def setReportIdUndefined: Self = StObject.set(x, "reportId", js.undefined)
    
    inline def setSynchronous(value: Boolean): Self = StObject.set(x, "synchronous", value.asInstanceOf[js.Any])
    
    inline def setSynchronousUndefined: Self = StObject.set(x, "synchronous", js.undefined)
  }
}
