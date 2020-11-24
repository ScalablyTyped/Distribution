package typings.jqueryDropotron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropotronConfiguration extends js.Object {
  
  /**
    * @summary IE Offset X.
    * @type {number}
    */
  var IEOffsetX: Double = js.native
  
  /**
    * @summary IE Offset Y.
    * @type {number}
    */
  var IEOffsetY: Double = js.native
  
  /**
    * @summary Alignment ("left", "center", "right").
    * @type {string}
    */
  var alignment: String = js.native
  
  /**
    * @summary Base Z-Index.
    * @type {number}
    */
  var baseZIndex: Double = js.native
  
  /**
    * @summary If true and detach = true, leave original menu intact.
    * @type {boolean}
    */
  var cloneOnDetach: Boolean = js.native
  
  /**
    * @summary Detach second level menus (prevents parent style bleed).
    * @type {boolean}
    */
  var detach: Boolean = js.native
  
  /**
    * @summary Easing mode ("swing", "linear").
    * @type {string}
    */
  var easing: String = js.native
  
  /**
    * @summary Expansion mode ("hover" or "click").
    * @type {string}
    */
  var expandMode: String = js.native
  
  /**
    * @summary Global offset Y.
    * @type {number}
    */
  var globalOffsetY: Double = js.native
  
  /**
    * @summary Hide delay (in ms; 0 disables).
    * @type {number}
    */
  var hideDelay: Double = js.native
  
  /**
    * @summary Hover delay (in ms).
    * @type {number}
    */
  var hoverDelay: Double = js.native
  
  /**
    * @summary Menu class (assigned to every <ul>).
    * @type {string}
    */
  var menuClass: String = js.native
  
  /**
    * @summary Menu mode ("instant", "fade", "slide", "zoom").
    * @type {string}
    */
  var mode: String = js.native
  
  /**
    * @summary If true and mode = "fade", prevents top-level opener fade.
    * @type {boolean}
    */
  var noOpenerFade: Boolean = js.native
  
  /**
    * @summary Submenu offset X.
    * @type {number}
    */
  var offsetX: Double = js.native
  
  /**
    * @summary Submenu offset Y.
    * @type {number}
    */
  var offsetY: Double = js.native
  
  /**
    * @summary Active opener class.
    * @type {string}
    */
  var openerActiveClass: String = js.native
  
  /**
    * @summary Opener class.
    * @type {string}
    */
  var openerClass: String = js.native
  
  /**
    * @summary Parent jQuery object.
    * @type {JQuery}
    */
  var selectorParent: JQuery = js.native
  
  /**
    * @summary Menu speed ("fast", "slow", or ms).
    * @type {string}
    */
  var speed: String = js.native
  
  /**
    * @summary Submenu class prefix.
    * @type {string}
    */
  var submenuClassPrefix: String = js.native
}
object DropotronConfiguration {
  
  @scala.inline
  def apply(
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
  implicit class DropotronConfigurationOps[Self <: DropotronConfiguration] (val x: Self) extends AnyVal {
    
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
    def setIEOffsetX(value: Double): Self = this.set("IEOffsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIEOffsetY(value: Double): Self = this.set("IEOffsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignment(value: String): Self = this.set("alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseZIndex(value: Double): Self = this.set("baseZIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloneOnDetach(value: Boolean): Self = this.set("cloneOnDetach", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetach(value: Boolean): Self = this.set("detach", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasing(value: String): Self = this.set("easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandMode(value: String): Self = this.set("expandMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalOffsetY(value: Double): Self = this.set("globalOffsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideDelay(value: Double): Self = this.set("hideDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverDelay(value: Double): Self = this.set("hoverDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuClass(value: String): Self = this.set("menuClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoOpenerFade(value: Boolean): Self = this.set("noOpenerFade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetY(value: Double): Self = this.set("offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenerActiveClass(value: String): Self = this.set("openerActiveClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenerClass(value: String): Self = this.set("openerClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorParent(value: JQuery): Self = this.set("selectorParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeed(value: String): Self = this.set("speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmenuClassPrefix(value: String): Self = this.set("submenuClassPrefix", value.asInstanceOf[js.Any])
  }
}
