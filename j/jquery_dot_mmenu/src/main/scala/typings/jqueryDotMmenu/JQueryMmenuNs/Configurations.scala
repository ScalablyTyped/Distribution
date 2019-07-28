package typings.jqueryDotMmenu.JQueryMmenuNs

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
  var clone_FConfigurations: js.UndefOr[Boolean] = js.undefined
  /**
    * The number of milliseconds between opening/closing the menu and panels,
    * needed to force CSS transitions.
    * Default: 25
    */
  var openingInterval: js.UndefOr[Double] = js.undefined
  /**
    * jQuery selector containing the node-type of panels.
    * Default: "div, ul, ol"
    */
  var panelNodetype: js.UndefOr[String] = js.undefined
  /**
    * The number of milliseconds used in the CSS transitions.
    * Default: 400 (The value should match the associated CSS value.)
    */
  var transitionDuration: js.UndefOr[Double] = js.undefined
}

object Configurations {
  @scala.inline
  def apply(
    classNames: ClassnamesConfigurations = null,
    clone: js.UndefOr[Boolean] = js.undefined,
    openingInterval: Int | Double = null,
    panelNodetype: String = null,
    transitionDuration: Int | Double = null
  ): Configurations = {
    val __obj = js.Dynamic.literal()
    if (classNames != null) __obj.updateDynamic("classNames")(classNames)
    if (!js.isUndefined(clone)) __obj.updateDynamic("clone")(clone)
    if (openingInterval != null) __obj.updateDynamic("openingInterval")(openingInterval.asInstanceOf[js.Any])
    if (panelNodetype != null) __obj.updateDynamic("panelNodetype")(panelNodetype)
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configurations]
  }
}

