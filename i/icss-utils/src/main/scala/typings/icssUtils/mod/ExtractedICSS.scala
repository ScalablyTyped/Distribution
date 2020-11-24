package typings.icssUtils.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtractedICSS extends js.Object {
  
  var icssExports: CSSExports = js.native
  
  var icssImports: CSSImports = js.native
}
object ExtractedICSS {
  
  @scala.inline
  def apply(icssExports: CSSExports, icssImports: CSSImports): ExtractedICSS = {
    val __obj = js.Dynamic.literal(icssExports = icssExports.asInstanceOf[js.Any], icssImports = icssImports.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtractedICSS]
  }
  
  @scala.inline
  implicit class ExtractedICSSOps[Self <: ExtractedICSS] (val x: Self) extends AnyVal {
    
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
    def setIcssExports(value: CSSExports): Self = this.set("icssExports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcssImports(value: CSSImports): Self = this.set("icssImports", value.asInstanceOf[js.Any])
  }
}
