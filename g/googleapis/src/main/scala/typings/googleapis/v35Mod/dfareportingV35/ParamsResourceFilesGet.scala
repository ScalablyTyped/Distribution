package typings.googleapis.v35Mod.dfareportingV35

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFilesGet
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the report file.
    */
  var fileId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the report.
    */
  var reportId: js.UndefOr[String] = js.undefined
}
object ParamsResourceFilesGet {
  
  inline def apply(): ParamsResourceFilesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFilesGet]
  }
  
  extension [Self <: ParamsResourceFilesGet](x: Self) {
    
    inline def setFileId(value: String): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
    
    inline def setFileIdUndefined: Self = StObject.set(x, "fileId", js.undefined)
    
    inline def setReportId(value: String): Self = StObject.set(x, "reportId", value.asInstanceOf[js.Any])
    
    inline def setReportIdUndefined: Self = StObject.set(x, "reportId", js.undefined)
  }
}
