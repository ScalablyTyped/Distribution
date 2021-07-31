package typings.mathjax.MathJax

import typings.mathjax.mathjaxStrings.CommonHTML
import typings.mathjax.mathjaxStrings.NativeMML
import typings.mathjax.mathjaxStrings.PlainSource
import typings.mathjax.mathjaxStrings.PreviewHTML
import typings.mathjax.mathjaxStrings.SVG
import typings.mathjax.mathjaxStrings.`HTML-CSS`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuSettings extends StObject {
  
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
  def apply(): MenuSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuSettings]
  }
  
  @scala.inline
  implicit class MenuSettingsMutableBuilder[Self <: MenuSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setALT(value: Boolean): Self = StObject.set(x, "ALT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setALTUndefined: Self = StObject.set(x, "ALT", js.undefined)
    
    @scala.inline
    def setCMD(value: Boolean): Self = StObject.set(x, "CMD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCMDUndefined: Self = StObject.set(x, "CMD", js.undefined)
    
    @scala.inline
    def setCTRL(value: Boolean): Self = StObject.set(x, "CTRL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCTRLUndefined: Self = StObject.set(x, "CTRL", js.undefined)
    
    @scala.inline
    def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setMpContext(value: Boolean): Self = StObject.set(x, "mpContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMpContextUndefined: Self = StObject.set(x, "mpContext", js.undefined)
    
    @scala.inline
    def setMpMouse(value: Boolean): Self = StObject.set(x, "mpMouse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMpMouseUndefined: Self = StObject.set(x, "mpMouse", js.undefined)
    
    @scala.inline
    def setRenderer(value: `HTML-CSS` | CommonHTML | PreviewHTML | NativeMML | SVG | PlainSource): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    @scala.inline
    def setShift(value: Boolean): Self = StObject.set(x, "Shift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShiftUndefined: Self = StObject.set(x, "Shift", js.undefined)
    
    @scala.inline
    def setTexHints(value: Boolean): Self = StObject.set(x, "texHints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTexHintsUndefined: Self = StObject.set(x, "texHints", js.undefined)
    
    @scala.inline
    def setZoom(value: String): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    
    @scala.inline
    def setZscale(value: String): Self = StObject.set(x, "zscale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZscaleUndefined: Self = StObject.set(x, "zscale", js.undefined)
  }
}
