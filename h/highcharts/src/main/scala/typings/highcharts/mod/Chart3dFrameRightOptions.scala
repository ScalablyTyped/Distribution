package typings.highcharts.mod

import typings.highcharts.highchartsStrings.auto
import typings.highcharts.highchartsStrings.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Chart3dFrameRightOptions extends StObject {
  
  /**
    * (Highcharts) The color of the panel.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  
  /**
    * (Highcharts) The thickness of the panel.
    */
  var size: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts) Whether to display the frame. Possible values are `true`,
    * `false`, `"auto"` to display only the frames behind the data, and
    * `"default"` to display faces behind the data based on the axis layout,
    * ignoring the point of view.
    */
  var visible: js.UndefOr[auto | default | Boolean] = js.undefined
}
object Chart3dFrameRightOptions {
  
  inline def apply(): Chart3dFrameRightOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Chart3dFrameRightOptions]
  }
  
  extension [Self <: Chart3dFrameRightOptions](x: Self) {
    
    inline def setColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setVisible(value: auto | default | Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
