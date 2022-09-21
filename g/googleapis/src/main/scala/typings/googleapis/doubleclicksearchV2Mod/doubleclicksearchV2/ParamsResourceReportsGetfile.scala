package typings.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceReportsGetfile
  extends StObject
     with StandardParameters {
  
  /**
    * The index of the report fragment to download.
    */
  var reportFragment: js.UndefOr[Double] = js.undefined
  
  /**
    * ID of the report.
    */
  var reportId: js.UndefOr[String] = js.undefined
}
object ParamsResourceReportsGetfile {
  
  inline def apply(): ParamsResourceReportsGetfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceReportsGetfile]
  }
  
  extension [Self <: ParamsResourceReportsGetfile](x: Self) {
    
    inline def setReportFragment(value: Double): Self = StObject.set(x, "reportFragment", value.asInstanceOf[js.Any])
    
    inline def setReportFragmentUndefined: Self = StObject.set(x, "reportFragment", js.undefined)
    
    inline def setReportId(value: String): Self = StObject.set(x, "reportId", value.asInstanceOf[js.Any])
    
    inline def setReportIdUndefined: Self = StObject.set(x, "reportId", js.undefined)
  }
}
