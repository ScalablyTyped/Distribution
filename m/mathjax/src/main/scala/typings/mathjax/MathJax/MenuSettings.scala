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

trait MenuSettings extends js.Object {
  var ALT: js.UndefOr[Boolean] = js.undefined
  var CMD: js.UndefOr[Boolean] = js.undefined
  /*These values indicate which keys must be pressed in order for math zoom to be triggered. For example, if CTRL
    * is set to true and zoom is "Click", then math will be zoomed only when the user control-clicks on mathematics
    * (i.e., clicks while holding down the CTRL key). If more than one is true, then all the indicated keys must be
    * pressed for the zoom to occur.
    */
  var CTRL: js.UndefOr[Boolean] = js.undefined
  var Shift: js.UndefOr[Boolean] = js.undefined
  /*This controls what contextual menu will be presented when a right click (on a PC) or CTRL-click (on the Mac)
    * occurs over a typeset equation. When set to "MathJax", the MathJax contextual menu will appear; when set to
    * "Browser", the browser’s contextual menu will be used. For example, in Internet Explorer with the MathPlayer
    * plugin, if this is set to "Browser", you will get the MathPlayer contextual menu rather than the MathJax menu.
    */
  var context: js.UndefOr[String] = js.undefined
  var mpContext: js.UndefOr[Boolean] = js.undefined
  var mpMouse: js.UndefOr[Boolean] = js.undefined
  val renderer: js.UndefOr[`HTML-CSS` | CommonHTML | PreviewHTML | NativeMML | SVG | PlainSource] = js.undefined
  /*This controls whether the “Show Source” menu item includes special class names that help MathJax to typeset
    * the mathematics that was produced by the TeX input jax. If these are included, then you can take the output
    * from “Show Source” and put it into a page that uses MathJax’s MathML input jax and expect to get the same
    * results as the original TeX. (Without this, there may be some spacing differences.)
    */
  var texHints: js.UndefOr[Boolean] = js.undefined
  /*This indicates when typeset mathematics should be zoomed. It can be set to "None", "Hover", "Click", or
    * "Double-Click" to set the zoom trigger.
    */
  var zoom: js.UndefOr[String] = js.undefined
  /*This is the zoom scaling factor, and it can be set to any of the values available in the Zoom Factor menu of
    * the Settings submenu of the contextual menu.
    */
  var zscale: js.UndefOr[String] = js.undefined
}

object MenuSettings {
  @scala.inline
  def apply(
    ALT: js.UndefOr[Boolean] = js.undefined,
    CMD: js.UndefOr[Boolean] = js.undefined,
    CTRL: js.UndefOr[Boolean] = js.undefined,
    Shift: js.UndefOr[Boolean] = js.undefined,
    context: String = null,
    mpContext: js.UndefOr[Boolean] = js.undefined,
    mpMouse: js.UndefOr[Boolean] = js.undefined,
    renderer: `HTML-CSS` | CommonHTML | PreviewHTML | NativeMML | SVG | PlainSource = null,
    texHints: js.UndefOr[Boolean] = js.undefined,
    zoom: String = null,
    zscale: String = null
  ): MenuSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ALT)) __obj.updateDynamic("ALT")(ALT.get.asInstanceOf[js.Any])
    if (!js.isUndefined(CMD)) __obj.updateDynamic("CMD")(CMD.get.asInstanceOf[js.Any])
    if (!js.isUndefined(CTRL)) __obj.updateDynamic("CTRL")(CTRL.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Shift)) __obj.updateDynamic("Shift")(Shift.get.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(mpContext)) __obj.updateDynamic("mpContext")(mpContext.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mpMouse)) __obj.updateDynamic("mpMouse")(mpMouse.get.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    if (!js.isUndefined(texHints)) __obj.updateDynamic("texHints")(texHints.get.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    if (zscale != null) __obj.updateDynamic("zscale")(zscale.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuSettings]
  }
}

