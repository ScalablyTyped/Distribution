package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProgressTimeseries extends js.Object {
  
  /** The current progress of the component, in the range [0,1]. */
  var currentProgress: js.UndefOr[Double] = js.native
  
  /** History of progress for the component. Points are sorted by time. */
  var dataPoints: js.UndefOr[js.Array[Point]] = js.native
}
object ProgressTimeseries {
  
  @scala.inline
  def apply(): ProgressTimeseries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressTimeseries]
  }
  
  @scala.inline
  implicit class ProgressTimeseriesOps[Self <: ProgressTimeseries] (val x: Self) extends AnyVal {
    
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
    def setCurrentProgress(value: Double): Self = this.set("currentProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentProgress: Self = this.set("currentProgress", js.undefined)
    
    @scala.inline
    def setDataPointsVarargs(value: Point*): Self = this.set("dataPoints", js.Array(value :_*))
    
    @scala.inline
    def setDataPoints(value: js.Array[Point]): Self = this.set("dataPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataPoints: Self = this.set("dataPoints", js.undefined)
  }
}
