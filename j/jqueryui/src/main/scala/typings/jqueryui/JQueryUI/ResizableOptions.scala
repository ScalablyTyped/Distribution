package typings.jqueryui.JQueryUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Resizable //////////////////////////////////////////////////
@js.native
trait ResizableOptions extends ResizableEvents {
  var alsoResize: js.UndefOr[js.Any] = js.native
   // Selector, JQuery or Element
  var animate: js.UndefOr[Boolean] = js.native
  var animateDuration: js.UndefOr[js.Any] = js.native
   // number or string
  var animateEasing: js.UndefOr[String] = js.native
  var aspectRatio: js.UndefOr[js.Any] = js.native
   // boolean or number
  var autoHide: js.UndefOr[Boolean] = js.native
  var cancel: js.UndefOr[String] = js.native
  var containment: js.UndefOr[js.Any] = js.native
   // Selector, Element or string
  var delay: js.UndefOr[Double] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var distance: js.UndefOr[Double] = js.native
  var ghost: js.UndefOr[Boolean] = js.native
  var grid: js.UndefOr[js.Any] = js.native
  var handles: js.UndefOr[js.Any] = js.native
   // string or object
  var helper: js.UndefOr[String] = js.native
  var maxHeight: js.UndefOr[Double] = js.native
  var maxWidth: js.UndefOr[Double] = js.native
  var minHeight: js.UndefOr[Double] = js.native
  var minWidth: js.UndefOr[Double] = js.native
}

object ResizableOptions {
  @scala.inline
  def apply(): ResizableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResizableOptions]
  }
  @scala.inline
  implicit class ResizableOptionsOps[Self <: ResizableOptions] (val x: Self) extends AnyVal {
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
    def setAlsoResize(value: js.Any): Self = this.set("alsoResize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlsoResize: Self = this.set("alsoResize", js.undefined)
    @scala.inline
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    @scala.inline
    def setAnimateDuration(value: js.Any): Self = this.set("animateDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimateDuration: Self = this.set("animateDuration", js.undefined)
    @scala.inline
    def setAnimateEasing(value: String): Self = this.set("animateEasing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimateEasing: Self = this.set("animateEasing", js.undefined)
    @scala.inline
    def setAspectRatio(value: js.Any): Self = this.set("aspectRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAspectRatio: Self = this.set("aspectRatio", js.undefined)
    @scala.inline
    def setAutoHide(value: Boolean): Self = this.set("autoHide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoHide: Self = this.set("autoHide", js.undefined)
    @scala.inline
    def setCancel(value: String): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setContainment(value: js.Any): Self = this.set("containment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainment: Self = this.set("containment", js.undefined)
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistance: Self = this.set("distance", js.undefined)
    @scala.inline
    def setGhost(value: Boolean): Self = this.set("ghost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGhost: Self = this.set("ghost", js.undefined)
    @scala.inline
    def setGrid(value: js.Any): Self = this.set("grid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrid: Self = this.set("grid", js.undefined)
    @scala.inline
    def setHandles(value: js.Any): Self = this.set("handles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandles: Self = this.set("handles", js.undefined)
    @scala.inline
    def setHelper(value: String): Self = this.set("helper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHelper: Self = this.set("helper", js.undefined)
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setMinHeight(value: Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
  }
  
}

