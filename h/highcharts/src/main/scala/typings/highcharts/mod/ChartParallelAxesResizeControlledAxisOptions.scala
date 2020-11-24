package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartParallelAxesResizeControlledAxisOptions extends js.Object {
  
  /**
    * (Highstock) Array of axes that should move out of the way of resizing
    * being done for the current axis. If not set, the next axis will be used.
    */
  var next: js.UndefOr[js.Array[Double | String]] = js.native
  
  /**
    * (Highstock) Array of axes that should move with the current axis while
    * resizing.
    */
  var prev: js.UndefOr[js.Array[Double | String]] = js.native
}
object ChartParallelAxesResizeControlledAxisOptions {
  
  @scala.inline
  def apply(): ChartParallelAxesResizeControlledAxisOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartParallelAxesResizeControlledAxisOptions]
  }
  
  @scala.inline
  implicit class ChartParallelAxesResizeControlledAxisOptionsOps[Self <: ChartParallelAxesResizeControlledAxisOptions] (val x: Self) extends AnyVal {
    
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
    def setNextVarargs(value: (Double | String)*): Self = this.set("next", js.Array(value :_*))
    
    @scala.inline
    def setNext(value: js.Array[Double | String]): Self = this.set("next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
    
    @scala.inline
    def setPrevVarargs(value: (Double | String)*): Self = this.set("prev", js.Array(value :_*))
    
    @scala.inline
    def setPrev(value: js.Array[Double | String]): Self = this.set("prev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrev: Self = this.set("prev", js.undefined)
  }
}
