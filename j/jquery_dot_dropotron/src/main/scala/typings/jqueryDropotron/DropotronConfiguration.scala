package typings.jqueryDropotron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropotronConfiguration extends StObject {
  
  /**
    * @summary IE Offset X.
    */
  var IEOffsetX: Double
  
  /**
    * @summary IE Offset Y.
    */
  var IEOffsetY: Double
  
  /**
    * @summary Alignment ("left", "center", "right").
    */
  var alignment: String
  
  /**
    * @summary Base Z-Index.
    */
  var baseZIndex: Double
  
  /**
    * @summary If true and detach = true, leave original menu intact.
    */
  var cloneOnDetach: Boolean
  
  /**
    * @summary Detach second level menus (prevents parent style bleed).
    */
  var detach: Boolean
  
  /**
    * @summary Easing mode ("swing", "linear").
    */
  var easing: String
  
  /**
    * @summary Expansion mode ("hover" or "click").
    */
  var expandMode: String
  
  /**
    * @summary Global offset Y.
    */
  var globalOffsetY: Double
  
  /**
    * @summary Hide delay (in ms; 0 disables).
    */
  var hideDelay: Double
  
  /**
    * @summary Hover delay (in ms).
    */
  var hoverDelay: Double
  
  /**
    * @summary Menu class (assigned to every <ul>).
    */
  var menuClass: String
  
  /**
    * @summary Menu mode ("instant", "fade", "slide", "zoom").
    */
  var mode: String
  
  /**
    * @summary If true and mode = "fade", prevents top-level opener fade.
    */
  var noOpenerFade: Boolean
  
  /**
    * @summary Submenu offset X.
    */
  var offsetX: Double
  
  /**
    * @summary Submenu offset Y.
    */
  var offsetY: Double
  
  /**
    * @summary Active opener class.
    */
  var openerActiveClass: String
  
  /**
    * @summary Opener class.
    */
  var openerClass: String
  
  /**
    * @summary Parent jQuery object.
    */
  var selectorParent: JQuery
  
  /**
    * @summary Menu speed ("fast", "slow", or ms).
    */
  var speed: String
  
  /**
    * @summary Submenu class prefix.
    */
  var submenuClassPrefix: String
}
object DropotronConfiguration {
  
  inline def apply(
    IEOffsetX: Double,
    IEOffsetY: Double,
    alignment: String,
    baseZIndex: Double,
    cloneOnDetach: Boolean,
    detach: Boolean,
    easing: String,
    expandMode: String,
    globalOffsetY: Double,
    hideDelay: Double,
    hoverDelay: Double,
    menuClass: String,
    mode: String,
    noOpenerFade: Boolean,
    offsetX: Double,
    offsetY: Double,
    openerActiveClass: String,
    openerClass: String,
    selectorParent: JQuery,
    speed: String,
    submenuClassPrefix: String
  ): DropotronConfiguration = {
    val __obj = js.Dynamic.literal(IEOffsetX = IEOffsetX.asInstanceOf[js.Any], IEOffsetY = IEOffsetY.asInstanceOf[js.Any], alignment = alignment.asInstanceOf[js.Any], baseZIndex = baseZIndex.asInstanceOf[js.Any], cloneOnDetach = cloneOnDetach.asInstanceOf[js.Any], detach = detach.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], expandMode = expandMode.asInstanceOf[js.Any], globalOffsetY = globalOffsetY.asInstanceOf[js.Any], hideDelay = hideDelay.asInstanceOf[js.Any], hoverDelay = hoverDelay.asInstanceOf[js.Any], menuClass = menuClass.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], noOpenerFade = noOpenerFade.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], openerActiveClass = openerActiveClass.asInstanceOf[js.Any], openerClass = openerClass.asInstanceOf[js.Any], selectorParent = selectorParent.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], submenuClassPrefix = submenuClassPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropotronConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DropotronConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAlignment(value: String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setBaseZIndex(value: Double): Self = StObject.set(x, "baseZIndex", value.asInstanceOf[js.Any])
    
    inline def setCloneOnDetach(value: Boolean): Self = StObject.set(x, "cloneOnDetach", value.asInstanceOf[js.Any])
    
    inline def setDetach(value: Boolean): Self = StObject.set(x, "detach", value.asInstanceOf[js.Any])
    
    inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setExpandMode(value: String): Self = StObject.set(x, "expandMode", value.asInstanceOf[js.Any])
    
    inline def setGlobalOffsetY(value: Double): Self = StObject.set(x, "globalOffsetY", value.asInstanceOf[js.Any])
    
    inline def setHideDelay(value: Double): Self = StObject.set(x, "hideDelay", value.asInstanceOf[js.Any])
    
    inline def setHoverDelay(value: Double): Self = StObject.set(x, "hoverDelay", value.asInstanceOf[js.Any])
    
    inline def setIEOffsetX(value: Double): Self = StObject.set(x, "IEOffsetX", value.asInstanceOf[js.Any])
    
    inline def setIEOffsetY(value: Double): Self = StObject.set(x, "IEOffsetY", value.asInstanceOf[js.Any])
    
    inline def setMenuClass(value: String): Self = StObject.set(x, "menuClass", value.asInstanceOf[js.Any])
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setNoOpenerFade(value: Boolean): Self = StObject.set(x, "noOpenerFade", value.asInstanceOf[js.Any])
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setOpenerActiveClass(value: String): Self = StObject.set(x, "openerActiveClass", value.asInstanceOf[js.Any])
    
    inline def setOpenerClass(value: String): Self = StObject.set(x, "openerClass", value.asInstanceOf[js.Any])
    
    inline def setSelectorParent(value: JQuery): Self = StObject.set(x, "selectorParent", value.asInstanceOf[js.Any])
    
    inline def setSpeed(value: String): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    inline def setSubmenuClassPrefix(value: String): Self = StObject.set(x, "submenuClassPrefix", value.asInstanceOf[js.Any])
  }
}
