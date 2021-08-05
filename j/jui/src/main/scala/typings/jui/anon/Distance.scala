package typings.jui.anon

import typings.jui.juiStrings.`bottom-left`
import typings.jui.juiStrings.`bottom-right`
import typings.jui.juiStrings.`top-lefet`
import typings.jui.juiStrings.`top-right`
import typings.jui.juiStrings.bottom
import typings.jui.juiStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Distance extends StObject {
  
  /**
    * @cfg {Integer} [distance=5]
    * Determines each margin value when there are multiple notice messages
    */
  var distance: js.UndefOr[Double] = js.undefined
  
  var event: js.UndefOr[js.Any] = js.undefined
  
  /**
    * @cfg {Integer} [hideDuration=500]
    * Determines the duration of an effect when a notice message disappears
    */
  var hideDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * @cfg {String} [hideEasing="linear"]
    * Determines an effect when a notice message disappears (see CSS3 specifications)
    */
  var hideEasing: js.UndefOr[String] = js.undefined
  
  /**
    * @cfg {Integer} [padding=12]
    * Determines the margin value of a notice message (the margin value may be in object form rather than a numeric value)
    */
  var padding: js.UndefOr[Double] = js.undefined
  
  /**
    * @cfg {"top"/"top-lefet"/"top-right"/"bottom"/"bottom-left"/"bottom-right"} [position="top-right"]
    * Designates the location where a notice message is added
    */
  var position: js.UndefOr[top | `top-lefet` | `top-right` | bottom | `bottom-left` | `bottom-right`] = js.undefined
  
  /**
    * @cfg {Integer} [showDuration=500]
    * Determines the duration of an effect when a notice message is shown
    */
  var showDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * @cfg {String} [showEasing="swing"]
    * Determines an effect when a notice message is shown (see CSS3 specifications)
    */
  var showEasing: js.UndefOr[String] = js.undefined
  
  /**
    * @cfg {Integer} [timeout=3000]
    * Determines the duration for which a notice message is displayed (the message does not disappear when the value is 0)
    */
  var timeout: js.UndefOr[Double] = js.undefined
  
  var tpl: js.UndefOr[js.Any] = js.undefined
}
object Distance {
  
  inline def apply(): Distance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Distance]
  }
  
  extension [Self <: Distance](x: Self) {
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    inline def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setHideDuration(value: Double): Self = StObject.set(x, "hideDuration", value.asInstanceOf[js.Any])
    
    inline def setHideDurationUndefined: Self = StObject.set(x, "hideDuration", js.undefined)
    
    inline def setHideEasing(value: String): Self = StObject.set(x, "hideEasing", value.asInstanceOf[js.Any])
    
    inline def setHideEasingUndefined: Self = StObject.set(x, "hideEasing", js.undefined)
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPosition(value: top | `top-lefet` | `top-right` | bottom | `bottom-left` | `bottom-right`): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setShowDuration(value: Double): Self = StObject.set(x, "showDuration", value.asInstanceOf[js.Any])
    
    inline def setShowDurationUndefined: Self = StObject.set(x, "showDuration", js.undefined)
    
    inline def setShowEasing(value: String): Self = StObject.set(x, "showEasing", value.asInstanceOf[js.Any])
    
    inline def setShowEasingUndefined: Self = StObject.set(x, "showEasing", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setTpl(value: js.Any): Self = StObject.set(x, "tpl", value.asInstanceOf[js.Any])
    
    inline def setTplUndefined: Self = StObject.set(x, "tpl", js.undefined)
  }
}
