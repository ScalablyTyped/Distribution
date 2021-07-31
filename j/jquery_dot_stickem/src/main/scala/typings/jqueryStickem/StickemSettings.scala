package typings.jqueryStickem

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StickemSettings extends StObject {
  
  /**
    * selector for content container, sizes matched with `item`
    */
  var container: js.UndefOr[String] = js.undefined
  
  /**
    * css class used to apply when ending sticky
    */
  var endStickClass: js.UndefOr[String] = js.undefined
  
  /**
    * selector for element to make sticky
    */
  var item: js.UndefOr[String] = js.undefined
  
  /**
    * offset to use for the sticky element in the parent element
    */
  var offset: js.UndefOr[Double | String] = js.undefined
  
  /**
    * Callback to execute when in stick state
    */
  var onStick: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Callback to execute when getting out of stick state
    */
  var onUnstick: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * where to place sticky element
    */
  var start: js.UndefOr[Double | String] = js.undefined
  
  /**
    * css class used to apply
    */
  var stickClass: js.UndefOr[String] = js.undefined
}
object StickemSettings {
  
  @scala.inline
  def apply(): StickemSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StickemSettings]
  }
  
  @scala.inline
  implicit class StickemSettingsMutableBuilder[Self <: StickemSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setEndStickClass(value: String): Self = StObject.set(x, "endStickClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndStickClassUndefined: Self = StObject.set(x, "endStickClass", js.undefined)
    
    @scala.inline
    def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    @scala.inline
    def setOffset(value: Double | String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setOnStick(value: () => Unit): Self = StObject.set(x, "onStick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnStickUndefined: Self = StObject.set(x, "onStick", js.undefined)
    
    @scala.inline
    def setOnUnstick(value: () => Unit): Self = StObject.set(x, "onUnstick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnUnstickUndefined: Self = StObject.set(x, "onUnstick", js.undefined)
    
    @scala.inline
    def setStart(value: Double | String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setStickClass(value: String): Self = StObject.set(x, "stickClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStickClassUndefined: Self = StObject.set(x, "stickClass", js.undefined)
  }
}
