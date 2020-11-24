package typings.highcharts.mod

import typings.highcharts.anon.PartialAnimationOptionsOb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LegendNavigationOptions extends js.Object {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The color for the active up or
    * down arrow in the legend page navigation.
    */
  var activeColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) How to animate the pages when
    * navigating up or down. A value of `true` applies the default navigation
    * given in the `chart.animation` option. Additional options can be given as
    * an object containing values for easing and duration.
    */
  var animation: js.UndefOr[Boolean | PartialAnimationOptionsOb] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The pixel size of the up and
    * down arrows in the legend paging navigation.
    */
  var arrowSize: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to enable the legend
    * navigation. In most cases, disabling the navigation results in an
    * unwanted overflow.
    *
    * See also the adapt chart to legend plugin for a solution to extend the
    * chart height to make room for the legend, optionally in exported charts
    * only.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The color of the inactive up or
    * down arrow in the legend page navigation. .
    */
  var inactiveColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Text styles for the legend page
    * navigation.
    */
  var style: js.UndefOr[CSSObject] = js.native
}
object LegendNavigationOptions {
  
  @scala.inline
  def apply(): LegendNavigationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendNavigationOptions]
  }
  
  @scala.inline
  implicit class LegendNavigationOptionsOps[Self <: LegendNavigationOptions] (val x: Self) extends AnyVal {
    
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
    def setActiveColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("activeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveColor: Self = this.set("activeColor", js.undefined)
    
    @scala.inline
    def setAnimation(value: Boolean | PartialAnimationOptionsOb): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setArrowSize(value: Double): Self = this.set("arrowSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowSize: Self = this.set("arrowSize", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setInactiveColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("inactiveColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInactiveColor: Self = this.set("inactiveColor", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSObject): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
