package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProgressTimeseries extends StObject {
  
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
  implicit class ProgressTimeseriesMutableBuilder[Self <: ProgressTimeseries] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentProgress(value: Double): Self = StObject.set(x, "currentProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentProgressUndefined: Self = StObject.set(x, "currentProgress", js.undefined)
    
    @scala.inline
    def setDataPoints(value: js.Array[Point]): Self = StObject.set(x, "dataPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataPointsUndefined: Self = StObject.set(x, "dataPoints", js.undefined)
    
    @scala.inline
    def setDataPointsVarargs(value: Point*): Self = StObject.set(x, "dataPoints", js.Array(value :_*))
  }
}
