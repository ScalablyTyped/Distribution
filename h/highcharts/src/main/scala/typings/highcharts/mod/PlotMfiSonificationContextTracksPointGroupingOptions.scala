package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotMfiSonificationContextTracksPointGroupingOptions extends StObject {
  
  /**
    * (Highstock) The grouping algorithm, deciding which points to keep when
    * grouping a set of points together. By default `"minmax"` is used, which
    * keeps both the minimum and maximum points.
    *
    * The other algorithms will either keep the first point in the group (time
    * wise), last point, middle point, or both the first and the last point.
    *
    * The timing of the resulting point(s) is then adjusted to play evenly,
    * regardless of its original position within the group.
    */
  var algorithm: js.UndefOr[OptionsAlgorithmValue] = js.undefined
  
  /**
    * (Highstock) Whether or not to group points
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highstock) The size of each group in milliseconds. Audio events closer
    * than this are grouped together.
    */
  var groupTimespan: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) The data property for each point to compare when deciding
    * which points to keep in the group.
    *
    * By default it is "y", which means that if the `"minmax"` algorithm is
    * used, the two points the group with the lowest and highest `y` value will
    * be kept, and the others not played.
    */
  var prop: js.UndefOr[String] = js.undefined
}
object PlotMfiSonificationContextTracksPointGroupingOptions {
  
  inline def apply(): PlotMfiSonificationContextTracksPointGroupingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotMfiSonificationContextTracksPointGroupingOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotMfiSonificationContextTracksPointGroupingOptions] (val x: Self) extends AnyVal {
    
    inline def setAlgorithm(value: OptionsAlgorithmValue): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setGroupTimespan(value: Double): Self = StObject.set(x, "groupTimespan", value.asInstanceOf[js.Any])
    
    inline def setGroupTimespanUndefined: Self = StObject.set(x, "groupTimespan", js.undefined)
    
    inline def setProp(value: String): Self = StObject.set(x, "prop", value.asInstanceOf[js.Any])
    
    inline def setPropUndefined: Self = StObject.set(x, "prop", js.undefined)
  }
}
