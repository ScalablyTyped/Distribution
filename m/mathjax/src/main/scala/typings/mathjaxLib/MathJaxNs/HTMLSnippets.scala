package typings
package mathjaxLib.MathJaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLSnippets extends js.Object {
  /*HTML that gives the download link for the STIX fonts only. (Used in place of fonts when the HTML-CSS option
    * for availableFonts only includes the STIX fonts.)
    */
  var STIXfonts: js.UndefOr[java.lang.String] = js.undefined
  /*HTML that gives the download link for the MathJax TeX fonts only. (Used in place of fonts when the HTML-CSS
    * option for availableFonts only includes the TeX fonts.)
    */
  var TeXfonts: js.UndefOr[java.lang.String] = js.undefined
  /*The HTML for the close box in the FontWarning message.*/
  var closeBox: js.UndefOr[java.lang.String] = js.undefined
  /*HTML that includes links to the MathJax and STIX font download pages.*/
  var fonts: js.UndefOr[java.lang.String] = js.undefined
  /*The HTML for a paragraph suggesting an upgrade to a more modern browser that supports web fonts.*/
  var webfonts: js.UndefOr[java.lang.String] = js.undefined
}

