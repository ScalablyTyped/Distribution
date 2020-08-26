package typings.jqueryMmenu.JQueryMmenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Configurations extends js.Object {
  /**
    * the CSS class names object
    */
  var classNames: js.UndefOr[ClassnamesConfigurations] = js.native
  /**
    * Whether or not the menu should be cloned (and the original menu kept intact).
    * Default: false
    */
  @JSName("clone")
  var clone_FConfigurations: js.UndefOr[Boolean] = js.native
  /**
    * The number of milliseconds between opening/closing the menu and panels,
    * needed to force CSS transitions.
    * Default: 25
    */
  var openingInterval: js.UndefOr[Double] = js.native
  /**
    * jQuery selector containing the node-type of panels.
    * Default: "div, ul, ol"
    */
  var panelNodetype: js.UndefOr[String] = js.native
  /**
    * The number of milliseconds used in the CSS transitions.
    * Default: 400 (The value should match the associated CSS value.)
    */
  var transitionDuration: js.UndefOr[Double] = js.native
}

object Configurations {
  @scala.inline
  def apply(): Configurations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Configurations]
  }
  @scala.inline
  implicit class ConfigurationsOps[Self <: Configurations] (val x: Self) extends AnyVal {
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
    def setClassNames(value: ClassnamesConfigurations): Self = this.set("classNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassNames: Self = this.set("classNames", js.undefined)
    @scala.inline
    def setClone(value: Boolean): Self = this.set("clone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClone: Self = this.set("clone", js.undefined)
    @scala.inline
    def setOpeningInterval(value: Double): Self = this.set("openingInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpeningInterval: Self = this.set("openingInterval", js.undefined)
    @scala.inline
    def setPanelNodetype(value: String): Self = this.set("panelNodetype", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePanelNodetype: Self = this.set("panelNodetype", js.undefined)
    @scala.inline
    def setTransitionDuration(value: Double): Self = this.set("transitionDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionDuration: Self = this.set("transitionDuration", js.undefined)
  }
  
}

