package typings.jqueryMmenu.JQueryMmenu

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
    openingInterval: js.UndefOr[Double] = js.undefined,
    panelNodetype: String = null,
    transitionDuration: js.UndefOr[Double] = js.undefined
  ): Configurations = {
    val __obj = js.Dynamic.literal()
    if (classNames != null) __obj.updateDynamic("classNames")(classNames.asInstanceOf[js.Any])
    if (!js.isUndefined(clone)) __obj.updateDynamic("clone")(clone.get.asInstanceOf[js.Any])
    if (!js.isUndefined(openingInterval)) __obj.updateDynamic("openingInterval")(openingInterval.get.asInstanceOf[js.Any])
    if (panelNodetype != null) __obj.updateDynamic("panelNodetype")(panelNodetype.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionDuration)) __obj.updateDynamic("transitionDuration")(transitionDuration.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configurations]
  }
}

