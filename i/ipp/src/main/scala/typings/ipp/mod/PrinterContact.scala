package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrinterContact extends StObject {
  
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
  implicit class PrinterContactMutableBuilder[Self <: PrinterContact] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setContact-name`(value: String): Self = StObject.set(x, "contact-name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setContact-nameUndefined`: Self = StObject.set(x, "contact-name", js.undefined)
    
    @scala.inline
    def `setContact-uri`(value: String): Self = StObject.set(x, "contact-uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setContact-uriUndefined`: Self = StObject.set(x, "contact-uri", js.undefined)
    
    @scala.inline
    def `setContact-vcard`(value: js.Array[String]): Self = StObject.set(x, "contact-vcard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setContact-vcardUndefined`: Self = StObject.set(x, "contact-vcard", js.undefined)
    
    @scala.inline
    def `setContact-vcardVarargs`(value: String*): Self = StObject.set(x, "contact-vcard", js.Array(value :_*))
  }
}
