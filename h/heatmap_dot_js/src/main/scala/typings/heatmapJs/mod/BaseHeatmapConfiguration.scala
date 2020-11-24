package typings.heatmapJs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseHeatmapConfiguration[V /* <: String */] extends js.Object {
  
  /**
    * A background color string in form of hexcode, color name, or rgb(a)
    */
  var backgroundColor: js.UndefOr[String] = js.native
  
  /**
    * The blur factor that will be applied to all datapoints. The higher the
    * blur factor is, the smoother the gradients will be
    * Default value: 0.85
    */
  var blur: js.UndefOr[Double] = js.native
  
  /**
    * An object that represents the gradient.
    * Syntax: {[key: number in range [0,1]]: color}
    */
  var gradient: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * The maximal opacity the highest value in the heatmap will have. (will be
    * overridden if opacity set)
    * Default value: 0.6
    */
  var maxOpacity: js.UndefOr[Double] = js.native
  
  /**
    * The minimum opacity the lowest value in the heatmap will have (will be
    * overridden if opacity set)
    */
  var minOpacity: js.UndefOr[Double] = js.native
  
  /**
    * Pass a callback to receive extrema change updates. Useful for DOM
    * legends.
    */
  var onExtremaChange: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * A global opacity for the whole heatmap. This overrides maxOpacity and
    * minOpacity if set
    * Default value: 0.6
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /**
    * The radius each datapoint will have (if not specified on the datapoint
    * itself)
    */
  var radius: js.UndefOr[Double] = js.native
  
  /**
    * Scales the radius based on map zoom.
    */
  var scaleRadius: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicate whether the heatmap should use a global extrema or a local
    * extrema (the maximum and minimum of the currently displayed viewport)
    */
  var useLocalExtrema: js.UndefOr[Boolean] = js.native
  
  /**
    * The property name of the value/weight in a datapoint
    * Default value: 'value'
    */
  var valueField: js.UndefOr[V] = js.native
}
object BaseHeatmapConfiguration {
  
  @scala.inline
  def apply[V /* <: String */](): BaseHeatmapConfiguration[V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseHeatmapConfiguration[V]]
  }
  
  @scala.inline
  implicit class BaseHeatmapConfigurationOps[Self <: BaseHeatmapConfiguration[_], V /* <: String */] (val x: Self with BaseHeatmapConfiguration[V]) extends AnyVal {
    
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBlur(value: Double): Self = this.set("blur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlur: Self = this.set("blur", js.undefined)
    
    @scala.inline
    def setGradient(value: StringDictionary[String]): Self = this.set("gradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGradient: Self = this.set("gradient", js.undefined)
    
    @scala.inline
    def setMaxOpacity(value: Double): Self = this.set("maxOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxOpacity: Self = this.set("maxOpacity", js.undefined)
    
    @scala.inline
    def setMinOpacity(value: Double): Self = this.set("minOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinOpacity: Self = this.set("minOpacity", js.undefined)
    
    @scala.inline
    def setOnExtremaChange(value: () => Unit): Self = this.set("onExtremaChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnExtremaChange: Self = this.set("onExtremaChange", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    
    @scala.inline
    def setScaleRadius(value: Boolean): Self = this.set("scaleRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleRadius: Self = this.set("scaleRadius", js.undefined)
    
    @scala.inline
    def setUseLocalExtrema(value: Boolean): Self = this.set("useLocalExtrema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseLocalExtrema: Self = this.set("useLocalExtrema", js.undefined)
    
    @scala.inline
    def setValueField(value: V): Self = this.set("valueField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueField: Self = this.set("valueField", js.undefined)
  }
}
