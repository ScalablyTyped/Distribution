package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeriesEventsOptionsObject extends js.Object {
  
  /**
    * (Highcharts, Highstock, Gantt) Fires after the series has finished its
    * initial animation, or in case animation is disabled, immediately as the
    * series is displayed.
    */
  var afterAnimate: js.UndefOr[SeriesAfterAnimateCallbackFunction] = js.native
  
  /**
    * (Highstock) Fires when the checkbox next to the series' name in the
    * legend is clicked. One parameter, `event`, is passed to the function. The
    * state of the checkbox is found by `event.checked`. The checked item is
    * found by `event.item`. Return `false` to prevent the default action which
    * is to toggle the select state of the series.
    */
  var checkboxClick: js.UndefOr[js.Function | SeriesCheckboxClickCallbackFunction] = js.native
  
  /**
    * (Highstock) Fires when the series is clicked. One parameter, `event`, is
    * passed to the function, containing common event information.
    * Additionally, `event.point` holds a pointer to the nearest point on the
    * graph.
    */
  var click: js.UndefOr[SeriesClickCallbackFunction] = js.native
  
  /**
    * (Highstock) Fires when the series is hidden after chart generation time,
    * either by clicking the legend item or by calling `.hide()`.
    */
  var hide: js.UndefOr[SeriesHideCallbackFunction] = js.native
  
  /**
    * (Highstock) Fires when the legend item belonging to the series is
    * clicked. One parameter, `event`, is passed to the function. The default
    * action is to toggle the visibility of the series. This can be prevented
    * by returning `false` or calling `event.preventDefault()`.
    */
  var legendItemClick: js.UndefOr[SeriesLegendItemClickCallbackFunction] = js.native
  
  /**
    * (Highstock) Fires when the mouse leaves the graph. One parameter,
    * `event`, is passed to the function, containing common event information.
    * If the stickyTracking option is true, `mouseOut` doesn't happen before
    * the mouse enters another graph or leaves the plot area.
    */
  var mouseOut: js.UndefOr[SeriesMouseOutCallbackFunction] = js.native
  
  /**
    * (Highstock) Fires when the mouse enters the graph. One parameter,
    * `event`, is passed to the function, containing common event information.
    */
  var mouseOver: js.UndefOr[SeriesMouseOverCallbackFunction] = js.native
  
  /**
    * (Highcharts) Fires on a request for change of root node for the tree,
    * before the update is made. An event object is passed to the function,
    * containing additional properties `newRootId`, `previousRootId`, `redraw`
    * and `trigger`.
    */
  var setRootNode: js.UndefOr[js.Function] = js.native
  
  /**
    * (Highstock) Fires when the series is shown after chart generation time,
    * either by clicking the legend item or by calling `.show()`.
    */
  var show: js.UndefOr[SeriesShowCallbackFunction] = js.native
}
object SeriesEventsOptionsObject {
  
  @scala.inline
  def apply(): SeriesEventsOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesEventsOptionsObject]
  }
  
  @scala.inline
  implicit class SeriesEventsOptionsObjectOps[Self <: SeriesEventsOptionsObject] (val x: Self) extends AnyVal {
    
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
    def setAfterAnimate(value: SeriesAfterAnimateCallbackFunction): Self = this.set("afterAnimate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterAnimate: Self = this.set("afterAnimate", js.undefined)
    
    @scala.inline
    def setCheckboxClick(value: js.Function | SeriesCheckboxClickCallbackFunction): Self = this.set("checkboxClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckboxClick: Self = this.set("checkboxClick", js.undefined)
    
    @scala.inline
    def setClick(value: SeriesClickCallbackFunction): Self = this.set("click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    
    @scala.inline
    def setHide(value: SeriesHideCallbackFunction): Self = this.set("hide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    
    @scala.inline
    def setLegendItemClick(value: SeriesLegendItemClickCallbackFunction): Self = this.set("legendItemClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegendItemClick: Self = this.set("legendItemClick", js.undefined)
    
    @scala.inline
    def setMouseOut(value: SeriesMouseOutCallbackFunction): Self = this.set("mouseOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouseOut: Self = this.set("mouseOut", js.undefined)
    
    @scala.inline
    def setMouseOver(value: SeriesMouseOverCallbackFunction): Self = this.set("mouseOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouseOver: Self = this.set("mouseOver", js.undefined)
    
    @scala.inline
    def setSetRootNode(value: js.Function): Self = this.set("setRootNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetRootNode: Self = this.set("setRootNode", js.undefined)
    
    @scala.inline
    def setShow(value: SeriesShowCallbackFunction): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
  }
}
