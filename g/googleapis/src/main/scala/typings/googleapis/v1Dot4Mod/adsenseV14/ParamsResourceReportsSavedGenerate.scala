package typings.googleapis.v1Dot4Mod.adsenseV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceReportsSavedGenerate
  extends StObject
     with StandardParameters {
  
  /**
    * Optional locale to use for translating report output to a local language. Defaults to "en_US" if not specified.
    */
  var locale: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of rows of report data to return.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * The saved report to retrieve.
    */
  var savedReportId: js.UndefOr[String] = js.undefined
  
  /**
    * Index of the first row of report data to return.
    */
  var startIndex: js.UndefOr[Double] = js.undefined
}
object ParamsResourceReportsSavedGenerate {
  
  inline def apply(): ParamsResourceReportsSavedGenerate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceReportsSavedGenerate]
  }
  
  extension [Self <: ParamsResourceReportsSavedGenerate](x: Self) {
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setSavedReportId(value: String): Self = StObject.set(x, "savedReportId", value.asInstanceOf[js.Any])
    
    inline def setSavedReportIdUndefined: Self = StObject.set(x, "savedReportId", js.undefined)
    
    inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
  }
}
