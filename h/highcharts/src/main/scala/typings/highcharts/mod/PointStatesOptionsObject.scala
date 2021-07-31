package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointStatesOptionsObject extends StObject {
  
  /**
    * (Highcharts, Highstock) The hover state for a single point marker.
    */
  var hover: js.UndefOr[PointStatesHoverOptionsObject] = js.undefined
  
  /**
    * (Highcharts) The opposite state of a hover for a single point node.
    * Applied to all not connected nodes to the hovered one.
    */
  var inactive: js.UndefOr[PointStatesInactiveOptionsObject] = js.undefined
  
  /**
    * (Highcharts, Highstock) The normal state of a single point marker.
    * Currently only used for setting animation when returning to normal state
    * from hover.
    */
  var normal: js.UndefOr[PointStatesNormalOptionsObject] = js.undefined
  
  /**
    * (Highcharts, Highstock) The appearance of the point marker when selected.
    * In order to allow a point to be selected, set the
    * `series.allowPointSelect` option to true.
    */
  var select: js.UndefOr[PointStatesSelectOptionsObject] = js.undefined
}
object PointStatesOptionsObject {
  
  @scala.inline
  def apply(): PointStatesOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointStatesOptionsObject]
  }
  
  @scala.inline
  implicit class PointStatesOptionsObjectMutableBuilder[Self <: PointStatesOptionsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHover(value: PointStatesHoverOptionsObject): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    @scala.inline
    def setInactive(value: PointStatesInactiveOptionsObject): Self = StObject.set(x, "inactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInactiveUndefined: Self = StObject.set(x, "inactive", js.undefined)
    
    @scala.inline
    def setNormal(value: PointStatesNormalOptionsObject): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalUndefined: Self = StObject.set(x, "normal", js.undefined)
    
    @scala.inline
    def setSelect(value: PointStatesSelectOptionsObject): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
  }
}
