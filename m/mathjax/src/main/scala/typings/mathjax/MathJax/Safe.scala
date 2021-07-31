package typings.mathjax.MathJax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Safe extends StObject {
  
  /*This block contains the flags that control what the Safe extension will allow, and what it will block. The
    * flags can be set to "all", "none", or "safe". When set to "all", no filtering is done for these values (this
    * gives MathJax’s default behavior). When set to "none", these values are always filtered out. When set to
    * "safe", then only some values are allowed.
    */
  var allow: js.UndefOr[SafeAllow] = js.undefined
  
  /*This is an object that lists the protocols that can be used in href attributes and the \href macro when URLs
    * is set to "safe" above.
    * Note that if a protocol doesn’t appear in the list, it is assumed to be false, so technically, javascript need
    * not have been listed, but it is given to make it explicit that it should not be allowed.
    */
  var safeProtocols: js.UndefOr[SafeProtocols] = js.undefined
  
  /*This is an object that lists the TeX extensions that can be loaded via the \require{} macro when require is
    * set to "safe" in the allowed property above.
    * These configuration options give you a lot of control over what actions MathJax is allowed to take. It is also
    * possible override the individual filtering functions in order to customize the filtering even further, should
    * that be needed. See the code for the details of the function names and their definitions.
    */
  var safeRequire: js.UndefOr[SafeRequire] = js.undefined
  
  /*This is an object that lists the style properties that can be used in MathML style attributes and the \style
    * and \bbox macros when styles is set to "safe" in the allowed property above.
    * Any style property that doesn’t appear on this list is not allowed to be entered and will be removed (silently)
    * from the style definition.
    */
  var safeStyles: js.UndefOr[SafeStyles] = js.undefined
  
  /*This is the maximum font size (in em’s) that the TeX input jax will allow when fontsize is set to "safe" above.
    * The default is the size of \large. Values larger than this are set to this value.
    */
  var sizeMax: js.UndefOr[Double] = js.undefined
  
  /*This is the minimum font size (in em’s) that the TeX input jax will allow when fontsize is set to "safe" above.
    * The default is the size of \scriptsize. Values less than this are set to this value.
    */
  var sizeMin: js.UndefOr[Double] = js.undefined
}
object Safe {
  
  @scala.inline
  def apply(): Safe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Safe]
  }
  
  @scala.inline
  implicit class SafeMutableBuilder[Self <: Safe] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllow(value: SafeAllow): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowUndefined: Self = StObject.set(x, "allow", js.undefined)
    
    @scala.inline
    def setSafeProtocols(value: SafeProtocols): Self = StObject.set(x, "safeProtocols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafeProtocolsUndefined: Self = StObject.set(x, "safeProtocols", js.undefined)
    
    @scala.inline
    def setSafeRequire(value: SafeRequire): Self = StObject.set(x, "safeRequire", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafeRequireUndefined: Self = StObject.set(x, "safeRequire", js.undefined)
    
    @scala.inline
    def setSafeStyles(value: SafeStyles): Self = StObject.set(x, "safeStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafeStylesUndefined: Self = StObject.set(x, "safeStyles", js.undefined)
    
    @scala.inline
    def setSizeMax(value: Double): Self = StObject.set(x, "sizeMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeMaxUndefined: Self = StObject.set(x, "sizeMax", js.undefined)
    
    @scala.inline
    def setSizeMin(value: Double): Self = StObject.set(x, "sizeMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeMinUndefined: Self = StObject.set(x, "sizeMin", js.undefined)
  }
}
