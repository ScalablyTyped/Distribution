package typings.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLSnippets extends js.Object {
  
  /*HTML that gives the download link for the STIX fonts only. (Used in place of fonts when the HTML-CSS option
    * for availableFonts only includes the STIX fonts.)
    */
  var STIXfonts: js.UndefOr[String] = js.native
  
  /*HTML that gives the download link for the MathJax TeX fonts only. (Used in place of fonts when the HTML-CSS
    * option for availableFonts only includes the TeX fonts.)
    */
  var TeXfonts: js.UndefOr[String] = js.native
  
  /*The HTML for the close box in the FontWarning message.*/
  var closeBox: js.UndefOr[String] = js.native
  
  /*HTML that includes links to the MathJax and STIX font download pages.*/
  var fonts: js.UndefOr[String] = js.native
  
  /*The HTML for a paragraph suggesting an upgrade to a more modern browser that supports web fonts.*/
  var webfonts: js.UndefOr[String] = js.native
}
object HTMLSnippets {
  
  @scala.inline
  def apply(): HTMLSnippets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTMLSnippets]
  }
  
  @scala.inline
  implicit class HTMLSnippetsOps[Self <: HTMLSnippets] (val x: Self) extends AnyVal {
    
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
    def setSTIXfonts(value: String): Self = this.set("STIXfonts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSTIXfonts: Self = this.set("STIXfonts", js.undefined)
    
    @scala.inline
    def setTeXfonts(value: String): Self = this.set("TeXfonts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeXfonts: Self = this.set("TeXfonts", js.undefined)
    
    @scala.inline
    def setCloseBox(value: String): Self = this.set("closeBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseBox: Self = this.set("closeBox", js.undefined)
    
    @scala.inline
    def setFonts(value: String): Self = this.set("fonts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFonts: Self = this.set("fonts", js.undefined)
    
    @scala.inline
    def setWebfonts(value: String): Self = this.set("webfonts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebfonts: Self = this.set("webfonts", js.undefined)
  }
}
