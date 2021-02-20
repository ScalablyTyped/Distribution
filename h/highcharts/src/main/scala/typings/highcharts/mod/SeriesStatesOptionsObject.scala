package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeriesStatesOptionsObject extends StObject {
  
  /**
    * (Highstock) Options for the hovered series. These settings override the
    * normal state options when a series is moused over or touched.
    */
  var hover: js.UndefOr[SeriesStatesHoverOptionsObject] = js.native
  
  /**
    * (Highstock) The opposite state of a hover for series.
    */
  var inactive: js.UndefOr[SeriesStatesInactiveOptionsObject] = js.native
  
  /**
    * (Highstock) The normal state of a series, or for point items in column,
    * pie and similar series. Currently only used for setting animation when
    * returning to normal state from hover.
    */
  var normal: js.UndefOr[SeriesStatesNormalOptionsObject] = js.native
  
  /**
    * (Highstock) Specific options for point in selected states, after being
    * selected by allowPointSelect or programmatically.
    */
  var select: js.UndefOr[SeriesStatesSelectOptionsObject] = js.native
}
object SeriesStatesOptionsObject {
  
  @scala.inline
  def apply(): SeriesStatesOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesStatesOptionsObject]
  }
  
  @scala.inline
  implicit class SeriesStatesOptionsObjectMutableBuilder[Self <: SeriesStatesOptionsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHover(value: SeriesStatesHoverOptionsObject): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    @scala.inline
    def setInactive(value: SeriesStatesInactiveOptionsObject): Self = StObject.set(x, "inactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInactiveUndefined: Self = StObject.set(x, "inactive", js.undefined)
    
    @scala.inline
    def setNormal(value: SeriesStatesNormalOptionsObject): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalUndefined: Self = StObject.set(x, "normal", js.undefined)
    
    @scala.inline
    def setSelect(value: SeriesStatesSelectOptionsObject): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
  }
}
