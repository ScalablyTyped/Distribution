package typings.mathjax.MathJax

import typings.mathjax.mathjaxStrings.CommonHTML
import typings.mathjax.mathjaxStrings.NativeMML
import typings.mathjax.mathjaxStrings.PlainSource
import typings.mathjax.mathjaxStrings.PreviewHTML
import typings.mathjax.mathjaxStrings.SVG
import typings.mathjax.mathjaxStrings.`HTML-CSS`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuSettings extends js.Object {
  var ALT: js.UndefOr[Boolean] = js.native
  var CMD: js.UndefOr[Boolean] = js.native
  /*These values indicate which keys must be pressed in order for math zoom to be triggered. For example, if CTRL
    * is set to true and zoom is "Click", then math will be zoomed only when the user control-clicks on mathematics
    * (i.e., clicks while holding down the CTRL key). If more than one is true, then all the indicated keys must be
    * pressed for the zoom to occur.
    */
  var CTRL: js.UndefOr[Boolean] = js.native
  var Shift: js.UndefOr[Boolean] = js.native
  /*This controls what contextual menu will be presented when a right click (on a PC) or CTRL-click (on the Mac)
    * occurs over a typeset equation. When set to "MathJax", the MathJax contextual menu will appear; when set to
    * "Browser", the browser’s contextual menu will be used. For example, in Internet Explorer with the MathPlayer
    * plugin, if this is set to "Browser", you will get the MathPlayer contextual menu rather than the MathJax menu.
    */
  var context: js.UndefOr[String] = js.native
  var mpContext: js.UndefOr[Boolean] = js.native
  var mpMouse: js.UndefOr[Boolean] = js.native
  val renderer: js.UndefOr[`HTML-CSS` | CommonHTML | PreviewHTML | NativeMML | SVG | PlainSource] = js.native
  /*This controls whether the “Show Source” menu item includes special class names that help MathJax to typeset
    * the mathematics that was produced by the TeX input jax. If these are included, then you can take the output
    * from “Show Source” and put it into a page that uses MathJax’s MathML input jax and expect to get the same
    * results as the original TeX. (Without this, there may be some spacing differences.)
    */
  var texHints: js.UndefOr[Boolean] = js.native
  /*This indicates when typeset mathematics should be zoomed. It can be set to "None", "Hover", "Click", or
    * "Double-Click" to set the zoom trigger.
    */
  var zoom: js.UndefOr[String] = js.native
  /*This is the zoom scaling factor, and it can be set to any of the values available in the Zoom Factor menu of
    * the Settings submenu of the contextual menu.
    */
  var zscale: js.UndefOr[String] = js.native
}

object MenuSettings {
  @scala.inline
  def apply(): MenuSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuSettings]
  }
  @scala.inline
  implicit class MenuSettingsOps[Self <: MenuSettings] (val x: Self) extends AnyVal {
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
    def setALT(value: Boolean): Self = this.set("ALT", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteALT: Self = this.set("ALT", js.undefined)
    @scala.inline
    def setCMD(value: Boolean): Self = this.set("CMD", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCMD: Self = this.set("CMD", js.undefined)
    @scala.inline
    def setCTRL(value: Boolean): Self = this.set("CTRL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCTRL: Self = this.set("CTRL", js.undefined)
    @scala.inline
    def setShift(value: Boolean): Self = this.set("Shift", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShift: Self = this.set("Shift", js.undefined)
    @scala.inline
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setMpContext(value: Boolean): Self = this.set("mpContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMpContext: Self = this.set("mpContext", js.undefined)
    @scala.inline
    def setMpMouse(value: Boolean): Self = this.set("mpMouse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMpMouse: Self = this.set("mpMouse", js.undefined)
    @scala.inline
    def setRenderer(value: `HTML-CSS` | CommonHTML | PreviewHTML | NativeMML | SVG | PlainSource): Self = this.set("renderer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
    @scala.inline
    def setTexHints(value: Boolean): Self = this.set("texHints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTexHints: Self = this.set("texHints", js.undefined)
    @scala.inline
    def setZoom(value: String): Self = this.set("zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
    @scala.inline
    def setZscale(value: String): Self = this.set("zscale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZscale: Self = this.set("zscale", js.undefined)
  }
  
}

