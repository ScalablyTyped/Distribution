package typings.maximMazurokGapiClientChromeuxreport.gapi.client.chromeuxreport

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Record extends js.Object {
  
  /** Key defines all of the unique querying parameters needed to look up a user experience record. */
  var key: js.UndefOr[Key] = js.native
  
  /**
    * Metrics is the map of user experience data available for the record defined in the key field. Metrics are keyed on the metric name. Allowed key values: ["first_contentful_paint",
    * "first_input_delay", "largest_contentful_paint", "cumulative_layout_shift"]
    */
  var metrics: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.chromeuxreport.gapi.client.chromeuxreport.Metric}
    */ typings.maximMazurokGapiClientChromeuxreport.maximMazurokGapiClientChromeuxreportStrings.Record with TopLevel[js.Any]
  ] = js.native
}
object Record {
  
  @scala.inline
  def apply(): Record = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Record]
  }
  
  @scala.inline
  implicit class RecordOps[Self <: Record] (val x: Self) extends AnyVal {
    
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
    def setKey(value: Key): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setMetrics(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.chromeuxreport.gapi.client.chromeuxreport.Metric}
      */ typings.maximMazurokGapiClientChromeuxreport.maximMazurokGapiClientChromeuxreportStrings.Record with TopLevel[js.Any]
    ): Self = this.set("metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetrics: Self = this.set("metrics", js.undefined)
  }
}
