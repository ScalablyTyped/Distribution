package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrinterContact extends js.Object {
  
  var `contact-name`: js.UndefOr[String] = js.native
  
  var `contact-uri`: js.UndefOr[String] = js.native
  
  var `contact-vcard`: js.UndefOr[js.Array[String]] = js.native
}
object PrinterContact {
  
  @scala.inline
  def apply(): PrinterContact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrinterContact]
  }
  
  @scala.inline
  implicit class PrinterContactOps[Self <: PrinterContact] (val x: Self) extends AnyVal {
    
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
    def `setContact-name`(value: String): Self = this.set("contact-name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteContact-name`: Self = this.set("contact-name", js.undefined)
    
    @scala.inline
    def `setContact-uri`(value: String): Self = this.set("contact-uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteContact-uri`: Self = this.set("contact-uri", js.undefined)
    
    @scala.inline
    def `setContact-vcardVarargs`(value: String*): Self = this.set("contact-vcard", js.Array(value :_*))
    
    @scala.inline
    def `setContact-vcard`(value: js.Array[String]): Self = this.set("contact-vcard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteContact-vcard`: Self = this.set("contact-vcard", js.undefined)
  }
}
