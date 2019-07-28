package typings.jqueryDotDropotron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropotronConfiguration extends js.Object {
  /**
    * @summary IE Offset X.
    * @type {number}
    */
  var IEOffsetX: Double
  /**
    * @summary IE Offset Y.
    * @type {number}
    */
  var IEOffsetY: Double
  /**
    * @summary Alignment ("left", "center", "right").
    * @type {string}
    */
  var alignment: String
  /**
    * @summary Base Z-Index.
    * @type {number}
    */
  var baseZIndex: Double
  /**
    * @summary If true and detach = true, leave original menu intact.
    * @type {boolean}
    */
  var cloneOnDetach: Boolean
  /**
    * @summary Detach second level menus (prevents parent style bleed).
    * @type {boolean}
    */
  var detach: Boolean
  /**
    * @summary Easing mode ("swing", "linear").
    * @type {string}
    */
  var easing: String
  /**
    * @summary Expansion mode ("hover" or "click").
    * @type {string}
    */
  var expandMode: String
  /**
    * @summary Global offset Y.
    * @type {number}
    */
  var globalOffsetY: Double
  /**
    * @summary Hide delay (in ms; 0 disables).
    * @type {number}
    */
  var hideDelay: Double
  /**
    * @summary Hover delay (in ms).
    * @type {number}
    */
  var hoverDelay: Double
  /**
    * @summary Menu class (assigned to every <ul>).
    * @type {string}
    */
  var menuClass: String
  /**
    * @summary Menu mode ("instant", "fade", "slide", "zoom").
    * @type {string}
    */
  var mode: String
  /**
    * @summary If true and mode = "fade", prevents top-level opener fade.
    * @type {boolean}
    */
  var noOpenerFade: Boolean
  /**
    * @summary Submenu offset X.
    * @type {number}
    */
  var offsetX: Double
  /**
    * @summary Submenu offset Y.
    * @type {number}
    */
  var offsetY: Double
  /**
    * @summary Active opener class.
    * @type {string}
    */
  var openerActiveClass: String
  /**
    * @summary Opener class.
    * @type {string}
    */
  var openerClass: String
  /**
    * @summary Parent jQuery object.
    * @type {JQuery}
    */
  var selectorParent: JQuery
  /**
    * @summary Menu speed ("fast", "slow", or ms).
    * @type {string}
    */
  var speed: String
  /**
    * @summary Submenu class prefix.
    * @type {string}
    */
  var submenuClassPrefix: String
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
    val __obj = js.Dynamic.literal(IEOffsetX = IEOffsetX, IEOffsetY = IEOffsetY, alignment = alignment, baseZIndex = baseZIndex, cloneOnDetach = cloneOnDetach, detach = detach, easing = easing, expandMode = expandMode, globalOffsetY = globalOffsetY, hideDelay = hideDelay, hoverDelay = hoverDelay, menuClass = menuClass, mode = mode, noOpenerFade = noOpenerFade, offsetX = offsetX, offsetY = offsetY, openerActiveClass = openerActiveClass, openerClass = openerClass, selectorParent = selectorParent, speed = speed, submenuClassPrefix = submenuClassPrefix)
  
    __obj.asInstanceOf[DropotronConfiguration]
  }
}

