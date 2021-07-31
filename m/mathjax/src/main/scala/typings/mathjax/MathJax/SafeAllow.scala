package typings.mathjax.MathJax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SafeAllow extends StObject {
  
  /*When set to "safe" only URL’s with protocols that are listed in the safeProtocols property (see below) are
    * allowed as targets of href attributes or the \href macro. By default, these are http://, https://, and
    * file:// URL’s.
    */
  var URLs: js.UndefOr[String] = js.undefined
  
  /*When set to "safe", only class names that begin with MJX- and contain only letters, numbers, or the
    * characters -, _, or . are allowed.
    */
  var classes: js.UndefOr[String] = js.undefined
  
  /*When set to "safe", only ID’s that begin with MJX- and contain only letters, numbers, or the characters -, _,
    * or . are allowed.
    */
  var cssIDs: js.UndefOr[String] = js.undefined
  
  /*When set to "safe", MathJax will try to limit the font size to sizes between those given by the sizeMin and
    * sizeMax properties. These are .7 and 1.44 by default, which means sizes between \scriptsize and \large are
    * allowed. This also filters MathML fontsize, mathsize, and scriptminsize attributes, but here, "safe" acts as
    * "none", since they are given in sizes with units, and the actual size of the units is not determined at input
    * time (it is part of the output processing). In addition, the scriptlevel attribute is restricted to
    * non-negative values (so scripts can’t be made larger), and the scriptsizemultiplier is restricted to being
    * no larger than 1, and no less than .6.
    */
  var fontsize: js.UndefOr[String] = js.undefined
  
  /*When set to "safe", only the extensions listed in the safeRequire property (see below) are allowed to be
    * loaded by the \require{} macro.
    */
  var require: js.UndefOr[String] = js.undefined
  
  /*When set to "safe", only styles taken from a predefined set of styles are allowed to be given. These are
    * listed in the safeStyles property (see below).
    */
  var styles: js.UndefOr[String] = js.undefined
}
object SafeAllow {
  
  @scala.inline
  def apply(): SafeAllow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SafeAllow]
  }
  
  @scala.inline
  implicit class SafeAllowMutableBuilder[Self <: SafeAllow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClasses(value: String): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setCssIDs(value: String): Self = StObject.set(x, "cssIDs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssIDsUndefined: Self = StObject.set(x, "cssIDs", js.undefined)
    
    @scala.inline
    def setFontsize(value: String): Self = StObject.set(x, "fontsize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontsizeUndefined: Self = StObject.set(x, "fontsize", js.undefined)
    
    @scala.inline
    def setRequire(value: String): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireUndefined: Self = StObject.set(x, "require", js.undefined)
    
    @scala.inline
    def setStyles(value: String): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    @scala.inline
    def setURLs(value: String): Self = StObject.set(x, "URLs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setURLsUndefined: Self = StObject.set(x, "URLs", js.undefined)
  }
}
