package typings.googleapis.dfareportingV4Mod.dfareportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceReportsFilesGet
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the report file.
    */
  var fileId: js.UndefOr[String] = js.undefined
  
  /**
    * The Campaign Manager 360 user profile ID.
    */
  var profileId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the report.
    */
  var reportId: js.UndefOr[String] = js.undefined
}
object ParamsResourceReportsFilesGet {
  
  inline def apply(): ParamsResourceReportsFilesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceReportsFilesGet]
  }
  
  extension [Self <: ParamsResourceReportsFilesGet](x: Self) {
    
    inline def setFileId(value: String): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
    
    inline def setFileIdUndefined: Self = StObject.set(x, "fileId", js.undefined)
    
    inline def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    inline def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
    
    inline def setReportId(value: String): Self = StObject.set(x, "reportId", value.asInstanceOf[js.Any])
    
    inline def setReportIdUndefined: Self = StObject.set(x, "reportId", js.undefined)
  }
}
