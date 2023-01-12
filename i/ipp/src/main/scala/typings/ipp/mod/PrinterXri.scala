package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrinterXri extends StObject {
  
  var `xri-authentication`: js.UndefOr[XriAuthentication] = js.undefined
  
  var `xri-security`: js.UndefOr[XriSecurity] = js.undefined
  
  var `xri-uri`: js.UndefOr[String] = js.undefined
}
object PrinterXri {
  
  inline def apply(): PrinterXri = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrinterXri]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrinterXri] (val x: Self) extends AnyVal {
    
    inline def `setXri-authentication`(value: XriAuthentication): Self = StObject.set(x, "xri-authentication", value.asInstanceOf[js.Any])
    
    inline def `setXri-authenticationUndefined`: Self = StObject.set(x, "xri-authentication", js.undefined)
    
    inline def `setXri-security`(value: XriSecurity): Self = StObject.set(x, "xri-security", value.asInstanceOf[js.Any])
    
    inline def `setXri-securityUndefined`: Self = StObject.set(x, "xri-security", js.undefined)
    
    inline def `setXri-uri`(value: String): Self = StObject.set(x, "xri-uri", value.asInstanceOf[js.Any])
    
    inline def `setXri-uriUndefined`: Self = StObject.set(x, "xri-uri", js.undefined)
  }
}
