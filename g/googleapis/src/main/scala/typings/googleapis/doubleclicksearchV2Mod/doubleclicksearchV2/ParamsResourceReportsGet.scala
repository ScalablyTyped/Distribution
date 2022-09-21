package typings.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceReportsGet
  extends StObject
     with StandardParameters {
  
  /**
    * ID of the report request being polled.
    */
  var reportId: js.UndefOr[String] = js.undefined
}
object ParamsResourceReportsGet {
  
  inline def apply(): ParamsResourceReportsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceReportsGet]
  }
  
  extension [Self <: ParamsResourceReportsGet](x: Self) {
    
    inline def setReportId(value: String): Self = StObject.set(x, "reportId", value.asInstanceOf[js.Any])
    
    inline def setReportIdUndefined: Self = StObject.set(x, "reportId", js.undefined)
  }
}
