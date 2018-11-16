package typings
package mathjaxLib.MathJaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MenuSettings extends js.Object {
  var ALT: js.UndefOr[scala.Boolean] = js.undefined
  var CMD: js.UndefOr[scala.Boolean] = js.undefined
  /*These values indicate which keys must be pressed in order for math zoom to be triggered. For example, if CTRL
          * is set to true and zoom is "Click", then math will be zoomed only when the user control-clicks on mathematics
          * (i.e., clicks while holding down the CTRL key). If more than one is true, then all the indicated keys must be
          * pressed for the zoom to occur.
          */
  var CTRL: js.UndefOr[scala.Boolean] = js.undefined
  var Shift: js.UndefOr[scala.Boolean] = js.undefined
  /*This controls what contextual menu will be presented when a right click (on a PC) or CTRL-click (on the Mac)
          * occurs over a typeset equation. When set to "MathJax", the MathJax contextual menu will appear; when set to
          * "Browser", the browser’s contextual menu will be used. For example, in Internet Explorer with the MathPlayer
          * plugin, if this is set to "Browser", you will get the MathPlayer contextual menu rather than the MathJax menu.
          */
  var context: js.UndefOr[java.lang.String] = js.undefined
  var mpContext: js.UndefOr[scala.Boolean] = js.undefined
  var mpMouse: js.UndefOr[scala.Boolean] = js.undefined
  /*This controls whether the “Show Source” menu item includes special class names that help MathJax to typeset
          * the mathematics that was produced by the TeX input jax. If these are included, then you can take the output
          * from “Show Source” and put it into a page that uses MathJax’s MathML input jax and expect to get the same
          * results as the original TeX. (Without this, there may be some spacing differences.)
          */
  var texHints: js.UndefOr[scala.Boolean] = js.undefined
  /*This indicates when typeset mathematics should be zoomed. It can be set to "None", "Hover", "Click", or
          * "Double-Click" to set the zoom trigger.
          */
  var zoom: js.UndefOr[java.lang.String] = js.undefined
  /*This is the zoom scaling factor, and it can be set to any of the values available in the Zoom Factor menu of
          * the Settings submenu of the contextual menu.
          */
  var zscale: js.UndefOr[java.lang.String] = js.undefined
}

