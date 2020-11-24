package typings.maximMazurokGapiClientAdmob.gapi.client.admob

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportRow extends js.Object {
  
  /** Map of dimension values in a row, with keys as enum name of the dimensions. */
  var dimensionValues: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.admob.gapi.client.admob.ReportRowDimensionValue}
    */ typings.maximMazurokGapiClientAdmob.maximMazurokGapiClientAdmobStrings.ReportRow with TopLevel[js.Any]
  ] = js.native
  
  /** Map of metric values in a row, with keys as enum name of the metrics. If a metric being requested has no value returned, the map will not include it. */
  var metricValues: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.admob.gapi.client.admob.ReportRowMetricValue}
    */ typings.maximMazurokGapiClientAdmob.maximMazurokGapiClientAdmobStrings.ReportRow with TopLevel[js.Any]
  ] = js.native
}
object ReportRow {
  
  @scala.inline
  def apply(): ReportRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportRow]
  }
  
  @scala.inline
  implicit class ReportRowOps[Self <: ReportRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDimensionValues(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.admob.gapi.client.admob.ReportRowDimensionValue}
      */ typings.maximMazurokGapiClientAdmob.maximMazurokGapiClientAdmobStrings.ReportRow with TopLevel[js.Any]
    ): Self = this.set("dimensionValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensionValues: Self = this.set("dimensionValues", js.undefined)
    
    @scala.inline
    def setMetricValues(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.admob.gapi.client.admob.ReportRowMetricValue}
      */ typings.maximMazurokGapiClientAdmob.maximMazurokGapiClientAdmobStrings.ReportRow with TopLevel[js.Any]
    ): Self = this.set("metricValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricValues: Self = this.set("metricValues", js.undefined)
  }
}
