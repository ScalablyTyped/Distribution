package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorAxisScrollbarOptions extends js.Object {
  
  /**
    * (Highstock) The background color of the scrollbar itself.
    */
  var barBackgroundColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highstock) The color of the scrollbar's border.
    */
  var barBorderColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highstock) The border rounding radius of the bar.
    */
  var barBorderRadius: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock) The width of the bar's border.
    */
  var barBorderWidth: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock) The color of the small arrow inside the scrollbar buttons.
    */
  var buttonArrowColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highstock) The color of scrollbar buttons.
    */
  var buttonBackgroundColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highstock) The color of the border of the scrollbar buttons.
    */
  var buttonBorderColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highstock) The corner radius of the scrollbar buttons.
    */
  var buttonBorderRadius: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock) The border width of the scrollbar buttons.
    */
  var buttonBorderWidth: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock) Enable or disable the scrollbar.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highstock) The height of the scrollbar. The height also applies to the
    * width of the scroll arrows so that they are always squares. Defaults to
    * 20 for touch devices and 14 for mouse devices.
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock) Whether to redraw the main chart as the scrollbar or the
    * navigator zoomed window is moved. Defaults to `true` for modern browsers
    * and `false` for legacy IE browsers as well as mobile devices.
    */
  var liveRedraw: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highstock) The margin between the scrollbar and its axis when the
    * scrollbar is applied directly to an axis.
    */
  var margin: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock) The minimum width of the scrollbar.
    */
  var minWidth: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock) The color of the small rifles in the middle of the scrollbar.
    */
  var rifleColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highstock) Whether to show or hide the scrollbar when the scrolled
    * content is zoomed out to it full extent.
    */
  var showFull: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highstock) The color of the track background.
    */
  var trackBackgroundColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highstock) The color of the border of the scrollbar track.
    */
  var trackBorderColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highstock) The corner radius of the border of the scrollbar track.
    */
  var trackBorderRadius: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock) The width of the border of the scrollbar track.
    */
  var trackBorderWidth: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock) The z index of the scrollbar group.
    */
  var zIndex: js.UndefOr[Double] = js.native
}
object ColorAxisScrollbarOptions {
  
  @scala.inline
  def apply(): ColorAxisScrollbarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorAxisScrollbarOptions]
  }
  
  @scala.inline
  implicit class ColorAxisScrollbarOptionsOps[Self <: ColorAxisScrollbarOptions] (val x: Self) extends AnyVal {
    
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
    def setBarBackgroundColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("barBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarBackgroundColor: Self = this.set("barBackgroundColor", js.undefined)
    
    @scala.inline
    def setBarBorderColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("barBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarBorderColor: Self = this.set("barBorderColor", js.undefined)
    
    @scala.inline
    def setBarBorderRadius(value: Double): Self = this.set("barBorderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarBorderRadius: Self = this.set("barBorderRadius", js.undefined)
    
    @scala.inline
    def setBarBorderWidth(value: Double): Self = this.set("barBorderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarBorderWidth: Self = this.set("barBorderWidth", js.undefined)
    
    @scala.inline
    def setButtonArrowColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("buttonArrowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonArrowColor: Self = this.set("buttonArrowColor", js.undefined)
    
    @scala.inline
    def setButtonBackgroundColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("buttonBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonBackgroundColor: Self = this.set("buttonBackgroundColor", js.undefined)
    
    @scala.inline
    def setButtonBorderColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("buttonBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonBorderColor: Self = this.set("buttonBorderColor", js.undefined)
    
    @scala.inline
    def setButtonBorderRadius(value: Double): Self = this.set("buttonBorderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonBorderRadius: Self = this.set("buttonBorderRadius", js.undefined)
    
    @scala.inline
    def setButtonBorderWidth(value: Double): Self = this.set("buttonBorderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonBorderWidth: Self = this.set("buttonBorderWidth", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setLiveRedraw(value: Boolean): Self = this.set("liveRedraw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLiveRedraw: Self = this.set("liveRedraw", js.undefined)
    
    @scala.inline
    def setMargin(value: Double): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    
    @scala.inline
    def setRifleColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("rifleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRifleColor: Self = this.set("rifleColor", js.undefined)
    
    @scala.inline
    def setShowFull(value: Boolean): Self = this.set("showFull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowFull: Self = this.set("showFull", js.undefined)
    
    @scala.inline
    def setTrackBackgroundColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("trackBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackBackgroundColor: Self = this.set("trackBackgroundColor", js.undefined)
    
    @scala.inline
    def setTrackBorderColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("trackBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackBorderColor: Self = this.set("trackBorderColor", js.undefined)
    
    @scala.inline
    def setTrackBorderRadius(value: Double): Self = this.set("trackBorderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackBorderRadius: Self = this.set("trackBorderRadius", js.undefined)
    
    @scala.inline
    def setTrackBorderWidth(value: Double): Self = this.set("trackBorderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackBorderWidth: Self = this.set("trackBorderWidth", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
}
