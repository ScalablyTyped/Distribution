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
  
  inline def apply(): StickemSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StickemSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StickemSettings] (val x: Self) extends AnyVal {
    
    inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setEndStickClass(value: String): Self = StObject.set(x, "endStickClass", value.asInstanceOf[js.Any])
    
    inline def setEndStickClassUndefined: Self = StObject.set(x, "endStickClass", js.undefined)
    
    inline def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setOffset(value: Double | String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOnStick(value: () => Unit): Self = StObject.set(x, "onStick", js.Any.fromFunction0(value))
    
    inline def setOnStickUndefined: Self = StObject.set(x, "onStick", js.undefined)
    
    inline def setOnUnstick(value: () => Unit): Self = StObject.set(x, "onUnstick", js.Any.fromFunction0(value))
    
    inline def setOnUnstickUndefined: Self = StObject.set(x, "onUnstick", js.undefined)
    
    inline def setStart(value: Double | String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setStickClass(value: String): Self = StObject.set(x, "stickClass", value.asInstanceOf[js.Any])
    
    inline def setStickClassUndefined: Self = StObject.set(x, "stickClass", js.undefined)
  }
}
