package typings.maximMazurokGapiClientChromeuxreport.gapi.client.chromeuxreport

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Metric extends js.Object {
  
  /** The histogram of user experiences for a metric. The histogram will have at least one bin and the densities of all bins will add up to ~1. */
  var histogram: js.UndefOr[js.Array[Bin]] = js.native
  
  /** Common useful percentiles of the Metric. The value type for the percentiles will be the same as the value types given for the Histogram bins. */
  var percentiles: js.UndefOr[Percentiles] = js.native
}
object Metric {
  
  @scala.inline
  def apply(): Metric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Metric]
  }
  
  @scala.inline
  implicit class MetricOps[Self <: Metric] (val x: Self) extends AnyVal {
    
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
    def setHistogramVarargs(value: Bin*): Self = this.set("histogram", js.Array(value :_*))
    
    @scala.inline
    def setHistogram(value: js.Array[Bin]): Self = this.set("histogram", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistogram: Self = this.set("histogram", js.undefined)
    
    @scala.inline
    def setPercentiles(value: Percentiles): Self = this.set("percentiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePercentiles: Self = this.set("percentiles", js.undefined)
  }
}
