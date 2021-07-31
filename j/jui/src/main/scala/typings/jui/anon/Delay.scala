package typings.jui.anon

import typings.jui.juiStrings.bottom
import typings.jui.juiStrings.center
import typings.jui.juiStrings.left
import typings.jui.juiStrings.right
import typings.jui.juiStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Delay extends StObject {
  
  /**
    * @cfg {"left"/"right"/"center"} [align="left"]
    * Determines the alignment state inside a tooltip
    */
  var align: js.UndefOr[left | right | center] = js.undefined
  
  /**
    * @cfg {String} [color="black"]
    * Determines the color of a tooltip
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * @cfg {Integer} [delay=0]
    * Determines the event time when a tooltip is shown
    */
  var delay: js.UndefOr[Double] = js.undefined
  
  var event: js.UndefOr[js.Any] = js.undefined
  
  /**
    * @cfg {String} [hideType="mouseout"]
    * Determines the type of event that hides a tooltip
    */
  var hideType: js.UndefOr[String] = js.undefined
  
  /**
    * @cfg {"top"/"bottom"/"left"/"right"} [position="top"]
    * Determines the location where a tooltip is shown
    */
  var position: js.UndefOr[top | bottom | left | right] = js.undefined
  
  /**
    * @cfg {String} [showType="mouseover"]
    * Determines the type of event that triggers a tooltip
    */
  var showType: js.UndefOr[String] = js.undefined
  
  /**
    * @cfg {String} [title=""]
    * Sets the content of a tooltip (referring to the title properties in markup)
    */
  var title: js.UndefOr[String] = js.undefined
  
  var tpl: js.UndefOr[js.Any] = js.undefined
  
  /**
    * @cfg {Integer} [width=150]
    * Determines the horizontal size of a tooltip
    */
  var width: js.UndefOr[Double] = js.undefined
}
object Delay {
  
  @scala.inline
  def apply(): Delay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Delay]
  }
  
  @scala.inline
  implicit class DelayMutableBuilder[Self <: Delay] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: left | right | center): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    @scala.inline
    def setHideType(value: String): Self = StObject.set(x, "hideType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideTypeUndefined: Self = StObject.set(x, "hideType", js.undefined)
    
    @scala.inline
    def setPosition(value: top | bottom | left | right): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setShowType(value: String): Self = StObject.set(x, "showType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowTypeUndefined: Self = StObject.set(x, "showType", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTpl(value: js.Any): Self = StObject.set(x, "tpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTplUndefined: Self = StObject.set(x, "tpl", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
