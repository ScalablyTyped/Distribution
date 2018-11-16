package typings
package jqueryDotMmenuLib.JQueryMmenuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Configurations extends js.Object {
  /**
           * the CSS class names object
           */
  var classNames: js.UndefOr[ClassnamesConfigurations] = js.undefined
  /**
           * Whether or not the menu should be cloned (and the original menu kept intact).
           * Default: false
           */
  @JSName("clone")
  var clone_FConfigurations: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * The number of milliseconds between opening/closing the menu and panels,
           * needed to force CSS transitions.
           * Default: 25
           */
  var openingInterval: js.UndefOr[scala.Double] = js.undefined
  /**
           * jQuery selector containing the node-type of panels.
           * Default: "div, ul, ol"
           */
  var panelNodetype: js.UndefOr[java.lang.String] = js.undefined
  /**
           * The number of milliseconds used in the CSS transitions.
           * Default: 400 (The value should match the associated CSS value.)
           */
  var transitionDuration: js.UndefOr[scala.Double] = js.undefined
}

