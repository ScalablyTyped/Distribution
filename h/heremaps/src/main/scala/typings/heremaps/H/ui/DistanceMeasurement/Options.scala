package typings.heremaps.H.ui.DistanceMeasurement

import typings.heremaps.H.map.Icon
import typings.heremaps.H.map.SpatialStyle
import typings.heremaps.H.ui.LayoutAlignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @property alignment {H.ui.LayoutAlignment=} - the layout alignment which should be applied to this control, default is H.ui.LayoutAlignment.RIGHT_BOTTOM
  * @property startIcon {H.map.Icon=} - the icon to use for the first measurement point
  * @property stopoverIcon {H.map.Icon=} - the icon to use for the intermediate measurement points
  * @property endIcon {H.map.Icon=} - the icon to use for the last measurement point
  * @property splitIcon {H.map.Icon=} - the icon to use for indicating position under pointer over the line where new point will be created once user clicks
  * @property lineStyle {(H.map.SpatialStyle | H.map.SpatialStyle.Options)} - the style to use for connecting lines of the measurement points
  * @property distanceFormatter {function(number)=} - Optional function used for formatting a distance. By default distance measurement tool will do the formatting according to the
  * specified measurement unit (see H.ui.UI.Options#unitSystem)
  */
@js.native
trait Options extends js.Object {
  
  var alignment: js.UndefOr[LayoutAlignment] = js.native
  
  var distanceFormatter: js.UndefOr[js.Function1[/* n */ Double, Unit]] = js.native
  
  var endIcon: js.UndefOr[Icon] = js.native
  
  var lineStyle: SpatialStyle | typings.heremaps.H.map.SpatialStyle.Options = js.native
  
  var splitIcon: js.UndefOr[Icon] = js.native
  
  var startIcon: js.UndefOr[Icon] = js.native
  
  var stopoverIcon: js.UndefOr[Icon] = js.native
}
object Options {
  
  @scala.inline
  def apply(lineStyle: SpatialStyle | typings.heremaps.H.map.SpatialStyle.Options): Options = {
    val __obj = js.Dynamic.literal(lineStyle = lineStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setLineStyle(value: SpatialStyle | typings.heremaps.H.map.SpatialStyle.Options): Self = this.set("lineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignment(value: LayoutAlignment): Self = this.set("alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignment: Self = this.set("alignment", js.undefined)
    
    @scala.inline
    def setDistanceFormatter(value: /* n */ Double => Unit): Self = this.set("distanceFormatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDistanceFormatter: Self = this.set("distanceFormatter", js.undefined)
    
    @scala.inline
    def setEndIcon(value: Icon): Self = this.set("endIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndIcon: Self = this.set("endIcon", js.undefined)
    
    @scala.inline
    def setSplitIcon(value: Icon): Self = this.set("splitIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSplitIcon: Self = this.set("splitIcon", js.undefined)
    
    @scala.inline
    def setStartIcon(value: Icon): Self = this.set("startIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartIcon: Self = this.set("startIcon", js.undefined)
    
    @scala.inline
    def setStopoverIcon(value: Icon): Self = this.set("stopoverIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopoverIcon: Self = this.set("stopoverIcon", js.undefined)
  }
}
