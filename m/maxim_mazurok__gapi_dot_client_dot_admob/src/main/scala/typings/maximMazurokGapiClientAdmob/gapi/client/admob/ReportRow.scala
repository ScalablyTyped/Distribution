package typings.maximMazurokGapiClientAdmob.gapi.client.admob

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportRow extends StObject {
  
  /** Map of dimension values in a row, with keys as enum name of the dimensions. */
  var dimensionValues: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.admob.gapi.client.admob.ReportRowDimensionValue} */ js.Any
  ] = js.undefined
  
  /** Map of metric values in a row, with keys as enum name of the metrics. If a metric being requested has no value returned, the map will not include it. */
  var metricValues: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.admob.gapi.client.admob.ReportRowMetricValue} */ js.Any
  ] = js.undefined
}
object ReportRow {
  
  inline def apply(): ReportRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportRow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReportRow] (val x: Self) extends AnyVal {
    
    inline def setDimensionValues(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.admob.gapi.client.admob.ReportRowDimensionValue} */ js.Any
    ): Self = StObject.set(x, "dimensionValues", value.asInstanceOf[js.Any])
    
    inline def setDimensionValuesUndefined: Self = StObject.set(x, "dimensionValues", js.undefined)
    
    inline def setMetricValues(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.admob.gapi.client.admob.ReportRowMetricValue} */ js.Any
    ): Self = StObject.set(x, "metricValues", value.asInstanceOf[js.Any])
    
    inline def setMetricValuesUndefined: Self = StObject.set(x, "metricValues", js.undefined)
  }
}
