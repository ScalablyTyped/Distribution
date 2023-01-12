package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaneOptions extends StObject {
  
  /**
    * (Highcharts) An array of background items for the pane.
    */
  var background: js.UndefOr[js.Array[PaneBackgroundOptions]] = js.undefined
  
  /**
    * (Highcharts) The center of a polar chart or angular gauge, given as an
    * array of [x, y] positions. Positions can be given as integers that
    * transform to pixels, or as percentages of the plot area size.
    */
  var center: js.UndefOr[js.Array[String | Double]] = js.undefined
  
  /**
    * (Highcharts) The end angle of the polar X axis or gauge value axis, given
    * in degrees where 0 is north. Defaults to startAngle
    *
    * + 360.
    */
  var endAngle: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts) The inner size of the pane, either as a number defining
    * pixels, or a percentage defining a percentage of the pane's size.
    */
  var innerSize: js.UndefOr[Double | String] = js.undefined
  
  /**
    * (Highcharts) The size of the pane, either as a number defining pixels, or
    * a percentage defining a percentage of the available plot area (the
    * smallest of the plot height or plot width).
    */
  var size: js.UndefOr[Double | String] = js.undefined
  
  /**
    * (Highcharts) The start angle of the polar X axis or gauge axis, given in
    * degrees where 0 is north. Defaults to 0.
    */
  var startAngle: js.UndefOr[Double] = js.undefined
}
object PaneOptions {
  
  inline def apply(): PaneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaneOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaneOptions] (val x: Self) extends AnyVal {
    
    inline def setBackground(value: js.Array[PaneBackgroundOptions]): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setBackgroundVarargs(value: PaneBackgroundOptions*): Self = StObject.set(x, "background", js.Array(value*))
    
    inline def setCenter(value: js.Array[String | Double]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setCenterVarargs(value: (String | Double)*): Self = StObject.set(x, "center", js.Array(value*))
    
    inline def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
    
    inline def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
    
    inline def setInnerSize(value: Double | String): Self = StObject.set(x, "innerSize", value.asInstanceOf[js.Any])
    
    inline def setInnerSizeUndefined: Self = StObject.set(x, "innerSize", js.undefined)
    
    inline def setSize(value: Double | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    inline def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
  }
}
