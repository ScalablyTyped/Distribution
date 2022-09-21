package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrinterContact extends StObject {
  
  var `contact-name`: js.UndefOr[String] = js.undefined
  
  var `contact-uri`: js.UndefOr[String] = js.undefined
  
  var `contact-vcard`: js.UndefOr[js.Array[String]] = js.undefined
}
object PrinterContact {
  
  inline def apply(): PrinterContact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrinterContact]
  }
  
  extension [Self <: PrinterContact](x: Self) {
    
    inline def `setContact-name`(value: String): Self = StObject.set(x, "contact-name", value.asInstanceOf[js.Any])
    
    inline def `setContact-nameUndefined`: Self = StObject.set(x, "contact-name", js.undefined)
    
    inline def `setContact-uri`(value: String): Self = StObject.set(x, "contact-uri", value.asInstanceOf[js.Any])
    
    inline def `setContact-uriUndefined`: Self = StObject.set(x, "contact-uri", js.undefined)
    
    inline def `setContact-vcard`(value: js.Array[String]): Self = StObject.set(x, "contact-vcard", value.asInstanceOf[js.Any])
    
    inline def `setContact-vcardUndefined`: Self = StObject.set(x, "contact-vcard", js.undefined)
    
    inline def `setContact-vcardVarargs`(value: String*): Self = StObject.set(x, "contact-vcard", js.Array(value*))
  }
}
