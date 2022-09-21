package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceMetadataColumnsList
  extends StObject
     with StandardParameters {
  
  /**
    * Report type. Allowed Values: 'ga'. Where 'ga' corresponds to the Core Reporting API
    */
  var reportType: js.UndefOr[String] = js.undefined
}
object ParamsResourceMetadataColumnsList {
  
  inline def apply(): ParamsResourceMetadataColumnsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMetadataColumnsList]
  }
  
  extension [Self <: ParamsResourceMetadataColumnsList](x: Self) {
    
    inline def setReportType(value: String): Self = StObject.set(x, "reportType", value.asInstanceOf[js.Any])
    
    inline def setReportTypeUndefined: Self = StObject.set(x, "reportType", js.undefined)
  }
}
