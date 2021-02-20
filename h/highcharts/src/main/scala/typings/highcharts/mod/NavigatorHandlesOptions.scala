package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigatorHandlesOptions extends StObject {
  
  /**
    * (Highstock, Gantt) The fill for the handle.
    */
  var backgroundColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highstock, Gantt) The stroke for the handle border and the stripes
    * inside.
    */
  var borderColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highstock, Gantt) Allows to enable/disable handles.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highstock, Gantt) Height for handles.
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock, Gantt) The width for the handle border and the stripes
    * inside.
    */
  var lineWidth: js.UndefOr[js.Object] = js.native
  
  /**
    * (Highstock, Gantt) Array to define shapes of handles. 0-index for left,
    * 1-index for right.
    *
    * Additionally, the URL to a graphic can be given on this form:
    * `url(graphic.png)`. Note that for the image to be applied to exported
    * charts, its URL needs to be accessible by the export server.
    *
    * Custom callbacks for symbol path generation can also be added to
    * `Highcharts.SVGRenderer.prototype.symbols`. The callback is then used by
    * its method name, as shown in the demo.
    */
  var symbols: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * (Highstock, Gantt) Width for handles.
    */
  var width: js.UndefOr[Double] = js.native
}
object NavigatorHandlesOptions {
  
  @scala.inline
  def apply(): NavigatorHandlesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigatorHandlesOptions]
  }
  
  @scala.inline
  implicit class NavigatorHandlesOptionsMutableBuilder[Self <: NavigatorHandlesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBorderColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setLineWidth(value: js.Object): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    @scala.inline
    def setSymbols(value: js.Array[String]): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolsUndefined: Self = StObject.set(x, "symbols", js.undefined)
    
    @scala.inline
    def setSymbolsVarargs(value: String*): Self = StObject.set(x, "symbols", js.Array(value :_*))
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
