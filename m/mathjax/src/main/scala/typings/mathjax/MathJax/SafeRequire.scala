package typings.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SafeRequire extends js.Object {
  
  var HTML: js.UndefOr[Boolean] = js.native
  
  var action: js.UndefOr[Boolean] = js.native
  
  var amscd: js.UndefOr[Boolean] = js.native
  
  var amsmath: js.UndefOr[Boolean] = js.native
  
  var amssymbols: js.UndefOr[Boolean] = js.native
  
  var autobold: js.UndefOr[Boolean] = js.native
  
  var `autoload-all`: js.UndefOr[Boolean] = js.native
  
  var bbox: js.UndefOr[Boolean] = js.native
  
  var begingroup: js.UndefOr[Boolean] = js.native
  
  var boldsymbol: js.UndefOr[Boolean] = js.native
  
  var cancel: js.UndefOr[Boolean] = js.native
  
  var color: js.UndefOr[Boolean] = js.native
  
  var enclose: js.UndefOr[Boolean] = js.native
  
  var extpfeil: js.UndefOr[Boolean] = js.native
  
  var mathchoice: js.UndefOr[Boolean] = js.native
  
  var mhchem: js.UndefOr[Boolean] = js.native
  
  var newcommand: js.UndefOr[Boolean] = js.native
  
  var noErrors: js.UndefOr[Boolean] = js.native
  
  var noUndefined: js.UndefOr[Boolean] = js.native
  
  var unicode: js.UndefOr[Boolean] = js.native
  
  var verb: js.UndefOr[Boolean] = js.native
}
object SafeRequire {
  
  @scala.inline
  def apply(): SafeRequire = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SafeRequire]
  }
  
  @scala.inline
  implicit class SafeRequireOps[Self <: SafeRequire] (val x: Self) extends AnyVal {
    
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
    def setHTML(value: Boolean): Self = this.set("HTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHTML: Self = this.set("HTML", js.undefined)
    
    @scala.inline
    def setAction(value: Boolean): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setAmscd(value: Boolean): Self = this.set("amscd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmscd: Self = this.set("amscd", js.undefined)
    
    @scala.inline
    def setAmsmath(value: Boolean): Self = this.set("amsmath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmsmath: Self = this.set("amsmath", js.undefined)
    
    @scala.inline
    def setAmssymbols(value: Boolean): Self = this.set("amssymbols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmssymbols: Self = this.set("amssymbols", js.undefined)
    
    @scala.inline
    def setAutobold(value: Boolean): Self = this.set("autobold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutobold: Self = this.set("autobold", js.undefined)
    
    @scala.inline
    def `setAutoload-all`(value: Boolean): Self = this.set("autoload-all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAutoload-all`: Self = this.set("autoload-all", js.undefined)
    
    @scala.inline
    def setBbox(value: Boolean): Self = this.set("bbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBbox: Self = this.set("bbox", js.undefined)
    
    @scala.inline
    def setBegingroup(value: Boolean): Self = this.set("begingroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBegingroup: Self = this.set("begingroup", js.undefined)
    
    @scala.inline
    def setBoldsymbol(value: Boolean): Self = this.set("boldsymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoldsymbol: Self = this.set("boldsymbol", js.undefined)
    
    @scala.inline
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setColor(value: Boolean): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setEnclose(value: Boolean): Self = this.set("enclose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnclose: Self = this.set("enclose", js.undefined)
    
    @scala.inline
    def setExtpfeil(value: Boolean): Self = this.set("extpfeil", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtpfeil: Self = this.set("extpfeil", js.undefined)
    
    @scala.inline
    def setMathchoice(value: Boolean): Self = this.set("mathchoice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMathchoice: Self = this.set("mathchoice", js.undefined)
    
    @scala.inline
    def setMhchem(value: Boolean): Self = this.set("mhchem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMhchem: Self = this.set("mhchem", js.undefined)
    
    @scala.inline
    def setNewcommand(value: Boolean): Self = this.set("newcommand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewcommand: Self = this.set("newcommand", js.undefined)
    
    @scala.inline
    def setNoErrors(value: Boolean): Self = this.set("noErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoErrors: Self = this.set("noErrors", js.undefined)
    
    @scala.inline
    def setNoUndefined(value: Boolean): Self = this.set("noUndefined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoUndefined: Self = this.set("noUndefined", js.undefined)
    
    @scala.inline
    def setUnicode(value: Boolean): Self = this.set("unicode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnicode: Self = this.set("unicode", js.undefined)
    
    @scala.inline
    def setVerb(value: Boolean): Self = this.set("verb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerb: Self = this.set("verb", js.undefined)
  }
}
