package typings.jqueryui.JQueryUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Selectable //////////////////////////////////////////////////
trait SelectableOptions
  extends StObject
     with SelectableEvents {
  
  var autoRefresh: js.UndefOr[Boolean] = js.undefined
  
  var cancel: js.UndefOr[String] = js.undefined
  
  var delay: js.UndefOr[Double] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var distance: js.UndefOr[Double] = js.undefined
  
  var filter: js.UndefOr[String] = js.undefined
  
  var tolerance: js.UndefOr[String] = js.undefined
}
object SelectableOptions {
  
  @scala.inline
  def apply(): SelectableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectableOptions]
  }
  
  @scala.inline
  implicit class SelectableOptionsMutableBuilder[Self <: SelectableOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoRefresh(value: Boolean): Self = StObject.set(x, "autoRefresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoRefreshUndefined: Self = StObject.set(x, "autoRefresh", js.undefined)
    
    @scala.inline
    def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setTolerance(value: String): Self = StObject.set(x, "tolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToleranceUndefined: Self = StObject.set(x, "tolerance", js.undefined)
  }
}
