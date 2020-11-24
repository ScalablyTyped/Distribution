package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrinterXri extends js.Object {
  
  var `xri-authentication`: js.UndefOr[XriAuthentication] = js.native
  
  var `xri-security`: js.UndefOr[XriSecurity] = js.native
  
  var `xri-uri`: js.UndefOr[String] = js.native
}
object PrinterXri {
  
  @scala.inline
  def apply(): PrinterXri = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrinterXri]
  }
  
  @scala.inline
  implicit class PrinterXriOps[Self <: PrinterXri] (val x: Self) extends AnyVal {
    
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
    def `setXri-authentication`(value: XriAuthentication): Self = this.set("xri-authentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteXri-authentication`: Self = this.set("xri-authentication", js.undefined)
    
    @scala.inline
    def `setXri-security`(value: XriSecurity): Self = this.set("xri-security", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteXri-security`: Self = this.set("xri-security", js.undefined)
    
    @scala.inline
    def `setXri-uri`(value: String): Self = this.set("xri-uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteXri-uri`: Self = this.set("xri-uri", js.undefined)
  }
}
