package typings
package jqueryDotDropotronLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropotronConfiguration extends js.Object {
  /**
    * @summary IE Offset X.
    * @type {number}
    */
  var IEOffsetX: scala.Double
  /**
    * @summary IE Offset Y.
    * @type {number}
    */
  var IEOffsetY: scala.Double
  /**
    * @summary Alignment ("left", "center", "right").
    * @type {string}
    */
  var alignment: java.lang.String
  /**
    * @summary Base Z-Index.
    * @type {number}
    */
  var baseZIndex: scala.Double
  /**
    * @summary If true and detach = true, leave original menu intact.
    * @type {boolean}
    */
  var cloneOnDetach: scala.Boolean
  /**
    * @summary Detach second level menus (prevents parent style bleed).
    * @type {boolean}
    */
  var detach: scala.Boolean
  /**
    * @summary Easing mode ("swing", "linear").
    * @type {string}
    */
  var easing: java.lang.String
  /**
    * @summary Expansion mode ("hover" or "click").
    * @type {string}
    */
  var expandMode: java.lang.String
  /**
    * @summary Global offset Y.
    * @type {number}
    */
  var globalOffsetY: scala.Double
  /**
    * @summary Hide delay (in ms; 0 disables).
    * @type {number}
    */
  var hideDelay: scala.Double
  /**
    * @summary Hover delay (in ms).
    * @type {number}
    */
  var hoverDelay: scala.Double
  /**
    * @summary Menu class (assigned to every <ul>).
    * @type {string}
    */
  var menuClass: java.lang.String
  /**
    * @summary Menu mode ("instant", "fade", "slide", "zoom").
    * @type {string}
    */
  var mode: java.lang.String
  /**
    * @summary If true and mode = "fade", prevents top-level opener fade.
    * @type {boolean}
    */
  var noOpenerFade: scala.Boolean
  /**
    * @summary Submenu offset X.
    * @type {number}
    */
  var offsetX: scala.Double
  /**
    * @summary Submenu offset Y.
    * @type {number}
    */
  var offsetY: scala.Double
  /**
    * @summary Active opener class.
    * @type {string}
    */
  var openerActiveClass: java.lang.String
  /**
    * @summary Opener class.
    * @type {string}
    */
  var openerClass: java.lang.String
  /**
    * @summary Parent jQuery object.
    * @type {JQuery}
    */
  var selectorParent: JQuery
  /**
    * @summary Menu speed ("fast", "slow", or ms).
    * @type {string}
    */
  var speed: java.lang.String
  /**
    * @summary Submenu class prefix.
    * @type {string}
    */
  var submenuClassPrefix: java.lang.String
}

